package it.develhope.DependencyInjection.component;

import org.springframework.stereotype.Component;

/**
 * @author Drumstyle92
 * Component class for the program.
 */
@Component
public class MyComponent {
    /**
     * Variable of the class it belongs to.
     */
    private String MyComponentName;

    /**
     * Constructor of the class it belongs to containing a message
     */
    public MyComponent() {

        System.out.println("The constructor of the MyComponent class has been called");

        MyComponentName = "Dino";

    }

    /**
     * @return Returns a message and the class variable.
     * encapsulation method
     */
    public String getMyComponentName() {

        System.out.println("MyComponent.getMyComponentName() has been called");

        return MyComponentName;
    }

    /**
     * @param myComponentName parameter of the instance of the class it belongs to.
     * encapsulation method
     */
    public void setMyComponentName(String myComponentName) {

        MyComponentName = myComponentName;
    }
}
