package GraphTypes;

public interface Graph {

    /**
     * @param type accepts a String in the Specified Set (TBD)
     */

    public void setType(String type);

    /**
     * @param x1 accepts a Double less than x2 (if x1 greater than x2, then the two values are swapped), Inclusive.
     * @param x2 accepts a Double greater than x1 (if x2 less than x1, then the two values are swapped), Inclusive.
     */

    public void setDomain(double x1, double x2);

    /**
     * @param eq accepts a String in the format of the Equation type.
     */

    public void setEquation(String eq);

    /**
     * @return Returns the Type of Equation (String).
     */
    public String getType();

    public void evaluateExpression();

}