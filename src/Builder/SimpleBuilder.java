package Builder;

/**
 * Created on 24.10.2016
 * Class describe builder for simple expressions.
 *
 * @author Les
 * @version 9.5
 */
class SimpleBuilder extends Builder{


    /**
     * Build simple expression.
     */
    @Override
    Expression buildPart() {
       return new Expression("<simple expression>");
    }
}
