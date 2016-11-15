import java.awt.*;

/**
 * Created by William Ben Embarek on 14/11/2016.
 */
public class Bus extends Vehicle {
    Point position = getPosition();
    public Bus() {
        vehicleC = Color.red;
        size = 2;
        speed = 1;
    }

    public void move() {
        direction = direction(direction, speed);
        if (direction == 1) {
            position.translate(calcSpeed(),0);
        } else if (direction == 0) {
            position.translate(0,calcSpeed());
        } else if (direction == 3) {
            position.translate(-calcSpeed(),0);
        } else if (direction == 2) {
            position.translate(0,-calcSpeed());
        }
    }
    public int calcSpeed()
    {
        if (position.getY()<=Simulation.TRACKWIDTH)
        {
            return speed = 2;
        }
        else{
            return speed = 1;
        }
    }
  
    public Color getColor() {
        return vehicleC;
    }
}
