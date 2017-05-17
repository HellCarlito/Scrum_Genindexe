package core;

/**
 * The result from an analysis for a sample
 * Must be read twice, and validated
 * Here is the influence of 21 CFR Part 11
 */
public abstract class Result {
    private ResultStatus status;

    /**
     * Stores the expert interpretation of this result
     */
    private String interpretation = "not yet interpreted";

    /**
     * Stores the number of lectures for the result
     * Must be 2 for validating the result
     */
    private int readNumber;

    public final ResultStatus getStatus() {
        return status;
    }

    public void setStatus(ResultStatus value) {
        status = value;
    }

    public final String getInterpretation() {
        return interpretation;
    }

    /**
     * Changes the interpretation, when possible
     */
    public void setInterpretation(String inter) {
        if (status != ResultStatus.VALIDATED) interpretation = inter;
    }

    public final int getReadNumber() {
        return readNumber;
    }

    /**
     * Validates or not the result
     */
    public void validate(boolean yes) {
        if (readNumber == 1) {
            if (yes) status = ResultStatus.VALIDATED;
            else status = ResultStatus.UNREADABLE;
            readNumber++;
        }
    }

    /**
     * first read for the result
     * if readable, changes the interpretation
     * inter must be not null
     */
    public void firstRead(boolean readable, String inter) {
        if (readNumber == 0) {
            if (readable)
                if (inter != null) {
                    interpretation = inter;
                    status = ResultStatus.READABLE;
                } else
                    status = ResultStatus.UNREADABLE;
            readNumber++;
        }
    }

    @Override
    public String toString(){
        return getInterpretation();
    }

}
