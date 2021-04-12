package INFO6205;

import java.util.TimerTask;


public class DemoHelper extends TimerTask{
	public DemoHelper(DisplaySpread displaySpread) {
		this.displaySpread = displaySpread;
		frequencyOriginal=0;
		frequencySimulator = 0;
	}
	
	@Override
	public void run() {
		if(count1) {
			frequencyOriginal++;
			if(frequencyOriginal%2==0) {
				frequencySimulator++;
				displaySpread.repaint();
				if(frequencySimulator>stopFrequency) endSim();
				DisplaySpreadHelper.displaySpreadHelper.refreshCanvasHelper();
				if(frequencySimulator%100==0) {
					DisplaySpreadHelper.updateConsole();
					DisplaySpreadHelper.displaySpreadHelper.spreadInfection(DisplaySpreadHelper.place1);
				}
			}
		}
	}
	public static void endSim() {
		count1 = false;
		end();
	}
	static void end()
	{
		System.exit(0);
	}

	static boolean count1 = false;
	public DisplaySpread displaySpread;
	public int frequencyOriginal;
	public static int frequencySimulator;
	public int stopFrequency=15000;

}
