package socialIsolationSimulator;
import java.nio.channels.NetworkChannel;
import java.util.ArrayList;
import java.util.List;


import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;

public class Infected {
	private ContinuousSpace<Object> space;
    private Grid<Object> grid;
    private int days_infected;
    
    private boolean symtomatic;
    public boolean hospitalized;
    
    public Hospital hospital;
    public Infected(ContinuousSpace<Object> space, Grid<Object> grid) {
    	this.space = space;
    	this.grid = grid;
    	this.days_infected = 0;
    	this.symtomatic = false;
    	this.hospitalized = false;
    	this.hospital = null;
    }
	
    public void infect() {
    	GridPoint pt = grid.getLocation(this);
    	List<Object> healthy = new ArrayList<Object>();
    	for(Object obj : grid.getObjectsAt(pt.getX(),pt.getY())) {
    		if(obj instanceof Healthy) {
    			healthy.add(obj);
    		}
    	}
    	if(healthy.size() > 0) {
    		for(Object obj : healthy) {
    			double random = Math.random();
    			if( random <= chance_to_infect && !((Healthy)obj).social_isolate) {
    				NdPoint spacePt = space.getLocation(obj);
    				Context<Object> context = ContextUtils.getContext(obj);
    				context.remove(obj);
    				Infected infected = new Infected(space, grid);
    				context.add(infected);
    				space.moveTo(infected,spacePt.getX(), spacePt.getY());
    				grid.moveTo(infected, pt.getX(), pt.getY());
    				Network<Object> net = (NetworkChannel<Object>)context.getProjection("infection network");
    				net.addEdge(this, infected);
    				
    			}
    		}
    	}
    }

}
