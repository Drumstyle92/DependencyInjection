package it.develhope.DependencyInjection.controller;

import it.develhope.DependencyInjection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class with methods that invoke class instances of services and components
 */
@RestController
public class MyController {
    /**
     * Instance of class MyService
     */
    private MyService myService;

    /**
     * @param myService Parameter that gives the possibility to modify the instance of the MyService class
     * Constructor of the Mycontroller class
     */
    public MyController(MyService myService) {

        System.out.println("The MyController constructor has been called");

        this.myService = myService;
    }

    /**
     * @return returns a method name MyService
     * get method which retrieves a name.
     */
    @GetMapping("/getName")
    public String getName(){

        return myService.getName();
    }

    /**
     * @return returns a string that will be displayed as a response to the method.
     * Method of welcoming
     */
    @GetMapping("/")
    public String welcomeMessage(){

        return "Welcome visitor!";
    }

    /**
     * @return returns the variable of the MyService class.
     * encapsulation method
     */
    public MyService getMyService() {

        return myService;
    }

    /**
     * @param myService MyService instance parameter.
     * encapsulation method
     */
    public void setMyService(MyService myService) {

        this.myService = myService;
    }
}
