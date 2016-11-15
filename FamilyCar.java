import java.awt.*;

/**
 * Created by William Ben Embarek on 14/11/2016.
 */
public class FamilyCar extends Vehicle{
    Point position = getPosition();
    public FamilyCar() {
        vehicleC = Color.blue;
        size = 1;
        speed = 1;
    }

    public void move() {
        direction = direction(direction, speed);
        if (direction == 1) {
            position.translate(this.speed,0);
        } else if (direction == 0) {
            position.translate(0,this.speed);
        } else if (direction == 3) {
            position.translate(-this.speed,0);
        } else if (direction == 2) {
            position.translate(0,-this.speed);
        }
    }

    public Color getColor() {
        return vehicleC;
    }
}
