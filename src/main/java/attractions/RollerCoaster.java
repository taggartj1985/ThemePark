package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() > 145 && visitor.getAge() > 12){
            return true;
        }else{
            return false;
        }
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > 200){
            return this.price * 2;
        }else{
            return this.price;
        }
    }
}
