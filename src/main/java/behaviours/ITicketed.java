package behaviours;

import people.Visitor;

public interface ITicketed {

    double deafaultPrice();

    double priceFor(Visitor visitor);
}
