
package INFO6205;

import javax.swing.*;
import java.util.Timer;

public class MainJFrame {
	public static void main(String args[]) {
		new MainJFrameHelper();
		while(!SimulationValues.start12)
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		    new SimulationValues();
			new DisplaySpreadHelper();
		DisplaySpreadHelper.displaySpreadHelper.spreadCanavas(false, 10,5,1);
		DisplaySpreadHelper.displaySpreadHelper.spreadCanavas(true,50 , 5,1 );
		int peopleCount=1000;
		DisplaySpreadHelper.displaySpreadHelper.populatePeople(peopleCount);
		DisplaySpreadHelper.displaySpreadHelper.initiateDisease();

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DisplaySpread c = new DisplaySpread();
        jFrame.add(c);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        if (SimulationValues.showGUI) jFrame.setVisible(true);

		DemoHelper s = new DemoHelper(c);
		new Timer().schedule(s, 10, 15);
	}
}
