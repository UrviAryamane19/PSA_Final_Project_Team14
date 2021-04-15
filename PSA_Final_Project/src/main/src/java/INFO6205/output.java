package INFO6205;

public class output {
    public static void print()
    {
        Person p = new Person();
        System.out.println("Days passed: "+DemoHelper.frequencySimulator/100);
        System.out.println("Infected: "+ DisplaySpreadHelper.numberOfInfected);
        System.out.println("Active Cases: "+ DisplaySpreadHelper.numberOfActiveCases);
        System.out.println("Immune people: "+(DisplaySpreadHelper.ImmuneCases- DisplaySpreadHelper.numberOfFatality));
        System.out.println("Total deaths : " + DisplaySpreadHelper.numberOfFatality);
        System.out.println("Frontline Workers: "+ p.numberOfFrontlineWorkers());
        if(DisplaySpreadHelper.numberOfActiveCases == 0){
            //System.out.println("R-Factor: "+ );
        }
        System.out.println("------------------------------");
    }
}
