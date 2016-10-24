package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 24.10.2016
 * Class describe someone that want to build expression.
 *
 * @author Les
 * @version 9.5
 */
class Director {

    private List<Builder> builders;

    /**
     * Constructor for director.
     * Init list of builders.
     */
    Director(){
        builders = new ArrayList<>();
    }

    /**
     * Add builder to directors list of builders.
     * @param builder - builder that we want to add ti list.
     */
    void add(Builder builder){
        builders.add(builder);
    }

    /**
     * Construct expressions.
     * @return - expressions.
     */
    ArrayList<Expression> construct(){
        ArrayList<Expression> list = new ArrayList<>();

        builders.forEach( builder -> {
            Expression e = builder.buildPart();

            System.out.println("Build " +  e.toString() + ".");

            list.add(builder.buildPart());
        });

        return list;
    }
}
