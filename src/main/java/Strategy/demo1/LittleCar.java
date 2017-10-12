package Strategy.demo1;

import Strategy.demo1.color.Black;
import Strategy.demo1.speed.High;

public class LittleCar extends Car {

    public LittleCar(){
        this.color = new Black();
        this.speed = new High();
    }



}
