package Strategy.demo1;

import Strategy.demo1.color.Red;
import Strategy.demo1.speed.Slow;

public class FireCar extends Car {

    public FireCar(){
        this.color = new Red();
        this.speed = new Slow();
    }



}
