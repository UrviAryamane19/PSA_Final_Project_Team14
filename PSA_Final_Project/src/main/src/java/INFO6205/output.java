package INFO6205;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class output {
    public static void print()
    {
        List<Double> avgRfactor = new ArrayList<>();
        Random r = new Random();
        System.out.println("Days passed: "+DemoHelper.frequencySimulator/100);
        System.out.println("Infected: "+ DisplaySpreadHelper.numberOfInfected);

        int min = 1;
        int max = DisplaySpreadHelper.numberOfActiveCases;
        int randomNum = r.nextInt((max - min) + 1) + min;
        double d = randomNum * 1.0;

        System.out.println("Active Cases: "+ DisplaySpreadHelper.numberOfActiveCases);
        System.out.println("Immune people: "+(DisplaySpreadHelper.ImmuneCases- DisplaySpreadHelper.numberOfFatality));
        System.out.println("Total deaths : " + DisplaySpreadHelper.numberOfFatality);
        System.out.println("Infectors: " + randomNum);
        //avgRfactor.add(DisplaySpreadHelper.numberOfInfected/d);
        avgRfactor.add(DisplaySpreadHelper.numberOfActiveCases/d);

        if(DisplaySpreadHelper.numberOfActiveCases == 0) {
            double sum = 0.0;
            for (double i: avgRfactor) {
                sum += i;
            }
            double avg = sum / avgRfactor.size();
            System.out.println("R-Factor: " + avg);
            System.exit(0);
        }
        for(Double d1 : avgRfactor){
            System.out.println("daily r value: "+d1);
        }
        System.out.println("------------------------------");
    }
    public static double calSum(List<Double> list) {
        double sum = 0.0;
        for (double i: list) {
            sum += i;
        }
        return sum;
    }
}
