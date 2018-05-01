package Interfaces;

public interface IEatable {

    String sample();

}

//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//SOLID - D - DEPENDENCY INVERSION.

//We can use an our IEatable interface (abstraction) so our HotFood and our Perishable depend on an abstraction.
//Low-level modules can implement our abstraction. And our high-level componentS depends on the abstraction to
//know it can use any implementation. Making our code extendable. (Also following Open / Closed principle)

