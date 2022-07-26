package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 8.40;}

    public double priceFor(Visitor visitor){
        if( visitor.getHeight() <= 200)
        {return defaultPrice();}
        else
        {return defaultPrice() * 2;}
    }

    public boolean isAllowedTo(Visitor visitor){
        if((visitor.getAge() > 12) && (visitor.getHeight() > 145))
        {return true;}
        else
        {return false;}
    }

}
