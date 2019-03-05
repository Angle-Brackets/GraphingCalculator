import GraphTypes.*;
import java.util.function.*;
import java.util.Arrays;

public class Line extends BaseGraph {
    private double x1, y1, x2, y2; //Optional Points that can be used.


    public Line(){
        super(GraphTypes.LINEAR.name(), "Y = X");
    }

    public Line(String eq){
        super(GraphTypes.LINEAR.name(), eq);
    }

    public Line(String eq, double x1, double x2){
        super(GraphTypes.LINEAR.name(), eq, x1, x2);
    }

    public Line(double newX1, double newY1, double newX2, double newY2){
        super(GraphTypes.LINEAR.name(), "Defined by Points");
        x1 = newX1;
        y1 = newY1;
        x2 = newX2;
        y2 = newY2;
    }

    public void setType(String ty) {
        type = ty;
    }

    public void setDomain(double x1, double x2) {
        domain = new double[] {Math.min(x1, x2), Math.max(x1, x2)};
    }

    public void setEquation(String eq){
        equation = eq;
    }

    public String getType(){
        return GraphTypes.LINEAR.name();
    }

    public void evaluateExpression() {
        String expr = equation; //Backup of the original.
        double variable = 0.0;
        final String coefficient;
        final String yIntercept;
        Function<Double, Double> modVar;

        verifyGraph();

        if(type.equalsIgnoreCase(GraphTypes.LINEAR.name()) && equation.contains(GraphOperators.EXPONENT.getOperator()))
            throw new IllegalArgumentException("Incorrect Type Specified.");

        if(expr.equals("Defined by Points"))
            points.addAll(Arrays.asList(x1,y1,x2,y2));

        System.out.println(expr.split(GraphOperators.VARIABLE.getOperator())[1]);


        //modVar = x -> x*Double.parseDouble(coefficient)+Double.parseDouble(yIntercept);

    }


}
