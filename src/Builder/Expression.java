package Builder;

/**
 * Created on 24.10.2016
 * Class for expression.
 * It is product in this pattern example.
 *
 * @author Les
 * @version 9.5
 */
class Expression {

    private String expression;

    /**
     * Constructor for expression.
     * @param expression - built expression.
     */
    Expression(String expression){
        this.expression = expression;
    }

    /**
     * @return string representation of expression.
     */
    @Override
    public String toString() {
        return expression;
    }
}
