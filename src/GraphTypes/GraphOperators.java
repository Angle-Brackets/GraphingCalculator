package GraphTypes;

public enum GraphOperators {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    SPACE(" "),
    EXPONENT("^"),
    SQUARE_ROOT("sqrt"),
    EQUALS("="),
    VARIABLE("X");

    private String operator;

    GraphOperators(String s){
        operator = s;
    }

    public String getOperator(){
        return operator;
    }
}
