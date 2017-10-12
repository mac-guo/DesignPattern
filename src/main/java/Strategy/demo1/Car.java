package Strategy.demo1;

import Strategy.demo1.color.CarColor;
import Strategy.demo1.speed.CarSpeed;

public abstract class Car {

    public CarColor color;
    public CarSpeed speed;

    public void drive(){
        System.out.println("all car can drive");
    }

    public void didi(){
        System.out.println("all car can didi~");
    }
}
