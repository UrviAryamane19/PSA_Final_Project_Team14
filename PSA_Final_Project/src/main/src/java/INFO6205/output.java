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
//        int min = 1;
//        int max = DisplaySpreadHelper.numberOfInfected;
        //int random = r.nextInt((max - min) + 1) + min;

        double start = 1;
        double end = DisplaySpreadHelper.numberOfInfected;
        double random = new Random().nextDouble();
        double result = start + (random * (end - start));

        System.out.println("Active Cases: "+ DisplaySpreadHelper.numberOfActiveCases);
        System.out.println("Immune people: "+(DisplaySpreadHelper.ImmuneCases- DisplaySpreadHelper.numberOfFatality));
        System.out.println("Total deaths : " + DisplaySpreadHelper.numberOfFatality);
        System.out.println("Infectors: " + (int)result);
        avgRfactor.add(DisplaySpreadHelper.numberOfInfected/result);

        if(DisplaySpreadHelper.numberOfActiveCases == 0) {
            double sum = calSum(avgRfactor);
            System.out.println("Sum : "+sum);
            double avg = sum / avgRfactor.size();
            System.out.println("R-Factor: " + avg);
        }
        for(Double d : avgRfactor){
            System.out.println("daily r value: "+d);
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
