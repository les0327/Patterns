package Builder;

/**
 * Created on 24.10.2016
 * Class describe builder for complex expressions.
 *
 * @author Les
 * @version 9.5
 */
class ComplexBuilder extends Builder {


    /**
     * Build complex expression.
     */
    @Override
    Expression buildPart() {
        return new Expression("<complex expression>");
    }
}
