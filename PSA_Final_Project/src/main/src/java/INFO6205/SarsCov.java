package INFO6205;


public class SarsCov {

    public double getK_factor() {
        return k_factor;
    }

    public double getR_factor() {
        return r_factor;
    }

    public String getVirusType() {
        return virusType;
    }

    public int getPeriodOfInfection() {
        return periodOfInfection;
    }

    public int getPerToDevSymp() {
        return PerToDevSymp;
    }

    public double getProbabilitySymp() {
        return ProbabilitySymp;
    }

    public double getFatality() {
        return fatality;
    }

    public double getVirusInfect() {
        return virusInfect;
    }

    public SarsCov(){
        k_factor= SimulationValues.k_factor;
        r_factor= SimulationValues.r_factor;
        virusType= SimulationValues.typeOfVirus;
        periodOfInfection= SimulationValues.infection;
        PerToDevSymp= SimulationValues.exposetime;
        ProbabilitySymp= SimulationValues.probTogetSym;
        fatality = SimulationValues.fatality;
        virusInfect = SimulationValues.infect;
    }

    public double k_factor;
    public double r_factor;
    public String virusType;
    public int periodOfInfection;
    public int PerToDevSymp;
    public double ProbabilitySymp;
    public double fatality;
    public double virusInfect;

}