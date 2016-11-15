import java.awt.*;

/**
 * Created by William Ben Embarek on 14/11/2016.
 */
public class Truck extends Vehicle{
    Point position = getPosition();
    public Truck() {
        vehicleC = Color.black;
        size = 3;
        speed = 1;
       

    }

    public void move() {
    //	if (Math.random() < 0.1) {
    	//	speed = 1.1;
    	//}
        direction = direction(direction, speed);
        if (direction == 1) {
            position.setLocation(position.x+=speed, position.y);
        } else if (direction == 0) {
            position.setLocation(position.x, position.y+=speed);
        } else if (direction == 3) {
            position.setLocation(position.x-=speed, position.y);
        } else if (direction == 2) {
            position.setLocation(position.x, position.y-=speed);
        }
    }
}
