package ss4_class_object.bai_tap.fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    public int speed = 1;
    public boolean on = false;
    public String color = "blue";
    public double radius = 5;

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSLOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        String str = "";
        if (this.isOn()) {
            str += ("Fan is on \n" );
            str += ("Speed = " + getSpeed() + "\n");
        } else {
            str += ("Fan is off \n");
        }
        str += ("Color = " + getColor() + "\n");
        str += ("Radius = " + getRadius());
        return str;
    }
}
