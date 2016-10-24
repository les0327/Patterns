package Builder;

/**
 * Created on 24.10.2016
 * Abstract class for builder
 *
 * @author Les
 * @version 9.5
 */
abstract class Builder {

    protected Expression expression;

    /**
     * Abstract method to build expression.
     */
    abstract Expression buildPart();
}
