package Interfaces;

public interface IDisplayable {

    String displayItemInWindow(String label);
}

//1. Interfaces only contain a description of methods not their full implementations.
//2. Interfaces are implemented by classes and form a contract. If a class implements an interface it must use all of
//the interface methods.
//3. Classes can implements multiple interfaces.
//4.Better to implement multiple smaller interfaces than large less specific ones.

//SOLID - I - INTERFACE SEGREGATION
//No class should be forced to depend on methods it does not use so split interfaces into more specific ones.

