import GraphTypes.Graph;
import GraphTypes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.*;

public abstract class BaseGraph implements Graph {
    public static final int MAX_GRAPHS = 10;
    private static int numGraphs = 0;
    protected String type;
    protected double[] domain;
    protected String equation;
    public ArrayList<Double> points = new ArrayList<>();

    public BaseGraph(String t, String eq){
        if(numGraphs < MAX_GRAPHS) {
            numGraphs++;
            type = t;
            equation = eq;
            GraphDraw.graphs[GraphDraw.index] = this;
        }
        else
            throw new IllegalArgumentException("Exceeded Number of Graphs Possible, Please Delete or Redefine a Graph");
    }

    public BaseGraph(String t, String eq, double x1, double x2){
        this(t, eq);
        domain = new double[]{Math.min(x1, x2), Math.max(x1, x2)};
    }

    protected final void verifyGraph(){

        if(!(equation.contains("Y = ")) && !equation.equals("Defined by Points"))
            throw new IllegalArgumentException("Equation Must be in \"Y =\" format.");

        if(!Arrays.stream(GraphTypes.values()).map(Enum::name).anyMatch(type::equals))
            throw new IllegalArgumentException("Equation is not a valid type or is the incorrect type.");

        if(type.equals(GraphTypes.PARABOLIC.name()) && !equation.contains("^"))
            throw new IllegalArgumentException("Incorrect Type Specified.");
    }

    //public abstract void draw(Graphics g);

    public String toString(){
            return "Type of Graph is: "+ type + ", and the equation is: "+ equation + ", the Domain is" + (domain == null ? " undefined." : ": ["+domain[0] + ", " + domain[1] + "]");
    }


}
