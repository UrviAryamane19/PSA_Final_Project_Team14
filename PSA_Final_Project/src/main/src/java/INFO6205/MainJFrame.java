
package INFO6205;

import org.ini4j.*;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class MainJFrame {
	public static void main(String args[]) throws IOException {
		new MainJFrameHelper();
		while(!SimulationValues.start12)
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		    new SimulationValues();
			new DisplaySpreadHelper();
		Wini ini = new Wini(new File("..\\PSA_Final_Project\\src\\main\\config.ini"));
		int placeSize= ini.get("canvas","placeSize",int.class);
		int varSize = ini.get("canvas","varSize",int.class);


		DisplaySpreadHelper.displaySpreadHelper.spreadCanavas(false, 10,placeSize,varSize);
		DisplaySpreadHelper.displaySpreadHelper.spreadCanavas(true,50 , placeSize,varSize);
		int peopleCount= ini.get("canvas","peopleCount",int.class);

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
