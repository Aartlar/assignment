package academy.everyonecodes.java.evaluation2.Exercise3;

public class Racecar {
    private int speed;
    private int damage;

    public Racecar(int speed, int damage) {
        this.speed = speed;
        this.damage = damage;
    }

    public Racecar() {
        this(2, 2);
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public short powerUp(String powerUp, int intensity) {
        if(powerUp.equals("speed")) {
            speed *= intensity;
        }

        if(powerUp.equals("damage")) {
            damage *= intensity;
        }
    }

}
