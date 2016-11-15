import java.awt.*;
import java.util.Random;

/**
 * Created by William Ben Embarek on 09/11/2016.
 */
public abstract class Vehicle {
    Random rand = new Random();
    private Point position = new Point(rand.nextInt((Simulation.TRACKWIDTH-1)+1)+1,rand.nextInt((Simulation.TRACKWIDTH-1)+1)+1);
    Color vehicleC;
    double size;
    int direction;
    int speed;
    double turnChance = 0.1;

    public Vehicle() {
    }

    public abstract void move();
    public Point getPosition()
    {
        return position;
    }
    public Color getColor() {
        return vehicleC;
    }

    public double getSize() {
        return size;
    }
    public int direction(int d, int speed) {
        if (getPosition().x <= Simulation.TRACKWIDTH + Simulation.INNERSIZE && getPosition().y <= Simulation.TRACKWIDTH - size) {
            if (direction == 1) {
                return 1;
            } else {
                if (Math.random() < turnChance) {
                    return 1;
                } else if (getPosition().y <= 0 + size) {
                    return 1;
                } else {
                    return 2;
                }
            }
        } else if (getPosition().x >= Simulation.TRACKSIZE - Simulation.TRACKWIDTH + size &&
                getPosition().y <= Simulation.TRACKWIDTH + Simulation.INNERSIZE) {
            if (direction == 0) {
                return 0;
            } else {
                if (Math.random() < turnChance) {
                    return 0;
                } else if (getPosition().x >= Simulation.TRACKSIZE - (size)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } else if (getPosition().x >= Simulation.TRACKSIZE - (Simulation.TRACKWIDTH + Simulation.INNERSIZE) &&
                getPosition().y >= Simulation.TRACKSIZE - Simulation.TRACKWIDTH + size) {
            if (direction == 3) {
                return 3;
            } else {
                if (Math.random() < turnChance) {
                    return 3;
                } else if (getPosition().y >= Simulation.TRACKSIZE - (size)) {
                    return 3;
                } else {
                    return 0;
                }
            }
        } else if(getPosition().x <= Simulation.TRACKWIDTH - size &&
                getPosition().y >= Simulation.TRACKSIZE - (Simulation.TRACKWIDTH + Simulation.INNERSIZE) ) {
            if (direction == 2) {
                return 2;
            } else {
                if (Math.random() < turnChance) {
                    return 2;
                } else if (getPosition().x <= 0  + (size)) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
        return d;
    }


}
