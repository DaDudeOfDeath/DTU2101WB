import java.awt.*;
import java.util.Random;

/**
 * Created by William Ben Embarek on 09/11/2016.
 */
public abstract class Vehicle {
    Random rand = new Random();
    private Point position = new Point(); // START POSITION
    Color vehicleC;
    double size;
    int direction;
    int speed;
    double turnChance = 0.1;
    boolean validLoc = false;

    public Vehicle() {
        position = setValidPosition();
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
        if (position.getX() <= Simulation.TRACKWIDTH + Simulation.INNERSIZE && position.getY() <= Simulation.TRACKWIDTH - size) {
            if (direction == 1) {
                return 1;
            } else {
                if (Math.random() < turnChance) {
                    return 1;
                } else if (position.getY() <= 0 + size) {
                    return 1;
                } else {
                    return 2;
                }
            }
        } else if (position.getX() >= Simulation.TRACKSIZE - Simulation.TRACKWIDTH + size &&
                position.getY() <= Simulation.TRACKWIDTH + Simulation.INNERSIZE) {
            if (direction == 0) {
                return 0;
            } else {
                if (Math.random() < turnChance) {
                    return 0;
                } else if (position.getX() >= Simulation.TRACKSIZE - size) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } else if (position.getX() >= Simulation.TRACKSIZE - (Simulation.TRACKWIDTH + Simulation.INNERSIZE) &&
                position.getY() >= Simulation.TRACKSIZE - Simulation.TRACKWIDTH + size) {
            if (direction == 3) {
                return 3;
            } else {
                if (Math.random() < turnChance) {
                    return 3;
                } else if (position.getY() >= Simulation.TRACKSIZE - size) {
                    return 3;
                } else {
                    return 0;
                }
            }
        } else if(position.getX() <= Simulation.TRACKWIDTH - size &&
                position.getY() >= Simulation.TRACKSIZE - (Simulation.TRACKWIDTH + Simulation.INNERSIZE) ) {
            if (direction == 2) {
                return 2;
            } else {
                if (Math.random() < turnChance) {
                    return 2;
                } else if (position.getX() <= 0 + size) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
        return d;
    }
    // SÆTTER START POSITION TIL RANDOM
    public Point setValidPosition() {
        while (validLoc == false) {
        /*    getPosition().setLocation((getSize()+ Math.random()*Simulation.TRACKSIZE-2*getSize()), (getSize()+Math.random()*Simulation.TRACKSIZE-2*getSize()  ));
            if (((getPosition().getX() <= Simulation.TRACKWIDTH - getSize()) ||
                    (getPosition().getX() >= 2*Simulation.TRACKWIDTH+getSize() && getPosition().getX() <= Simulation.TRACKSIZE-getSize())))
            {
                if ((getPosition().getY() <= Simulation.TRACKWIDTH - getSize()) ||
                        (getPosition().getY() >= 2*Simulation.TRACKWIDTH+getSize() && getPosition().getY() <= Simulation.TRACKSIZE-getSize()))
                {
                    validLoc = true;
                }
            }
        } */
            Point pos = getPosition();
            pos.setLocation(Math.random() * (Simulation.TRACKSIZE - getSize()), Math.random() * (Simulation.TRACKSIZE - getSize()));
            if (pos.getX() < getSize()+1 && pos.getY() < getSize() + 1) {
                pos.setLocation(getSize() + 1, getSize() + 1);
            } else if (pos.getX() > Simulation.TRACKWIDTH - (getSize()+1) && pos.getY() > Simulation.TRACKSIZE - (getSize() + 1)) {
                pos.setLocation((int) -getSize(), (int)-getSize());
            //} else if (pos.getY() < getSize()+1) {
            //    pos.translate(0, (int) size);
            //} else if (pos.getY() > Simulation.TRACKSIZE - (getSize()+1)) {
            //    pos.translate(0, (int) -size);
            } else {
                validLoc = true;
            }
        }
        return position;
    }
}