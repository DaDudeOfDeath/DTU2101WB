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
            position.setLocation(position.x+=this.speed + 1, position.y);
        } else if (direction == 0) {
            position.setLocation(position.x, position.y+=this.speed);
        } else if (direction == 3) {
            position.setLocation(position.x-=this.speed, position.y);
        } else if (direction == 2) {
            position.setLocation(position.x, position.y-=this.speed);
        }
    }
  
    public Color getColor() {
        return vehicleC;
    }
}
