package core;

public abstract class Analysis {
    /**
     * The specie on which the analysis is defined
     */
    private Specie specie;

    public Analysis(Specie s) {
        specie = s;
    }

    /**
     * Name of the analysis
     *
     * @return the name of the analysis
     */
    public abstract String getName();

    public abstract Result newResult();

    public final Specie getSpecie() {
        return specie;
    }

    @Override
    public String toString() {
        return getName() + " for " + specie.getName();
    }

}
