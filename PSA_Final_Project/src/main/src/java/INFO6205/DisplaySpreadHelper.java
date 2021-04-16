package INFO6205;

import java.util.*;

/* this is class will be used to populate people and places */

public class DisplaySpreadHelper {

	public static void updateConsole() {
		output.print();
	}

	public DisplaySpreadHelper() {
		if(displaySpreadHelper ==null) displaySpreadHelper = this;
		DisplaySpreadHelper.canvasSize = 350;
		people = new HashSet<>();
		place = new ArrayList<>();
		place1 = new ArrayList<>();
		refreshCanvas();
	}

	public void populatePeople(int count) {
		Random r = new Random();
		r.setSeed(500);
		for(int i=0;i<count;i++) {
			PositionProvider place1 = place.get(r.nextInt(place.size()));
			PositionProvider place2 = nearPlace(DisplaySpreadHelper.place1,place1);
			Person people = new Person(place1,place2);
			DisplaySpreadHelper.people.add(people);
			((SetPosition)place1).people1.add(people);
		}
	}

	public void refreshCanvas()
	{
		matrix = new Position[canvasSize][canvasSize];
		for(int i = 0; i< canvasSize; i++) {
			for(int j = 0; j< canvasSize; j++) {
				matrix[i][j] = new Position(i,j);
			}
		}
	}


	public void initiateDisease() {
		int count = 0;
		for(Person p : people) {
			if(count >= people.size() || count==2) break;
			p.isSars = true;
			count++;
		}
		DisplaySpreadHelper.numberOfActiveCases = 2;
		DisplaySpreadHelper.numberOfInfected = 2;
	}
	
	public static PositionProvider nearPlace(List<PositionProvider> placesList, PositionProvider place1){
		Random r = new Random();
		if (SimulationValues.flag123) r.setSeed(500);
		PositionProvider place = placesList.get(0);
		int min1 = Integer.MAX_VALUE;
		for(PositionProvider p : placesList) {
			int sum = r.nextInt(220) + Position.getDistancePlace(p,place1);
			if(sum<min1) {
				min1 = sum;
				place = p;
			}
		}
		return place;
	}
	public void spreadCanavas(boolean isplace, int num, int placeSize, int varSize) {
		int t = 0;
		Random r = new Random();
		int set = 0;
		while(set<num && t<=num*5) {
			t++;
			int X = r.nextInt(canvasSize);
			int Y = r.nextInt(canvasSize);
			if (matrix[X][Y].place != null) continue;
			List<Position> positions = new ArrayList<>();
			if (isplace==true) {
				PositionProvider p = new SetPosition(positions);
				populatingCanvas(p, positions, placeSize, varSize, X, Y, true);
				if (positions.size() > 0) {
					DisplaySpreadHelper.place.add(p);
					set++;
				}
			}
			else if (isplace==false) {
					PositionProvider p1 = new AvailablePosition(positions);
					populatingCanvas(p1, positions, placeSize, varSize, X, Y, false);
					if (positions.size() > 0) {
						place1.add(p1);
						set++;

					}
				} }
		}

	public void refreshCanvasHelper() {
		for(Person people: people) {
			if(!people.hasResistance) people.refresh();
		}
	}

	public double populatingCanvas(PositionProvider place, List<Position> positions, int placeSize, int varSize, int r, int c, boolean isPlace) {
		Random r2 = new Random();
		if (SimulationValues.flag123) r2.setSeed(500);
		//(varSize*2)
		double h = r2.nextDouble()+(placeSize-varSize);
		//*(varSize*2)
		double wid = r2.nextDouble()+(placeSize-varSize);
		for(int i=0;i<h;i++) {
			if((i+r)>= canvasSize -2) break;
			for (int j=0;j<wid;j++) {
				if((j+c)>= canvasSize -2) break;
				Position tempPosition = matrix[r+i][c+j];
				if(tempPosition.place !=null) continue;
				tempPosition.isplace1 =isPlace;
				positions.add(tempPosition);
				tempPosition.place = place;
			}
		}
		return wid*h;
	}

	public void lockdownPlace(List<PositionProvider> places) {
		for(PositionProvider p : places) {
			p.checkLockdown =true;
		}
	}
	
	public void removeLockdown(List<PositionProvider> places) {
		for(PositionProvider p : places) {
			p.checkLockdown =false;
		}
	}
	
	public void spreadInfection(List<PositionProvider> places) {
		for (PositionProvider p : places) {
			List<Person> peopleinPlace2 = new ArrayList<>(p.people);
			for(int s =0;s <peopleinPlace2.size();s ++) {
				if (!peopleinPlace2.get(s ).isSars || peopleinPlace2.get(s ).State==true) continue;
				for(int v =0;v <peopleinPlace2.size();v ++) {
					if(s ==v  || peopleinPlace2.get(v ).isSars || peopleinPlace2.get(v ).State==true) continue;
					peopleinPlace2.get(v ).spreadDisease(peopleinPlace2.get(s));
				}
			}
		}
	}
	static List<PositionProvider> place;
	static List<PositionProvider> place1;
	static public DisplaySpreadHelper displaySpreadHelper;
	static Position[][] matrix;
	static Set<Person> people;
	static int canvasSize;
	static int numberOfFatality = 0;
	//static int numberOfTest = 0;
	static int numberOfPTest = 0;
	static int numberOfInfected = 0;
	static int numberOfActiveCases = 0;
	static int ImmuneCases = 0;
	static double infectors = 2;
	//static int numberOfQua = 0;
}
