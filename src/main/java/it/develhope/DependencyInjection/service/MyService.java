package it.develhope.DependencyInjection.service;

import it.develhope.DependencyInjection.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Drumstyle92
 * Class representing services
 */
@Service
public class MyService {
    /**
     * Instance variable of class MyComponent
     */
    private MyComponent myComponent;

    /**
     * @param myComponent Parameter of the instance variable of the MyComponent class
     * The constructor of the MyService class
     */
    @Autowired
    public MyService(MyComponent myComponent) {

    System.out.println("The MyService constructor has been called");

        this.myComponent = myComponent;
    }

    /**
     * @return Returns the method name of the instance of the MyComponent class
     * Method that connects the Myservice class with the MyComponet one.
     */
    public String getName(){

        System.out.println("MyService.getName() has been called");

        return myComponent.getMyComponentName();
    }

    /**
     * @return Returns the instance of the MyComponent class
     * encapsulation method
     */
    public MyComponent getMyComponent() {

        return myComponent;

    }

    /**
     * @param myComponent Instance parameter of the MyComponent class
     * encapsulation method
     */
    public void setMyComponent(MyComponent myComponent) {

        this.myComponent = myComponent;
    }
}
