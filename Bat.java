
package cavedweller;

/**
 *
 * @author 684438
 */
public class Bat {
    //Fields
    private int damage, x, y;
    private boolean alive;
    //Constructor
    public Bat(int x, int y) {
        this.alive = true;
        this.damage = 50;
        this.x = x;
        this.y = y;
    }
    //Methods
    public void moveAround() {
        //increase/decrease x by random number
        x += (int) (Math.random()*5) - 2;
        //increase/decrease y by random number
        y += (int) (Math.random()*5) - 2;
    }
    
    public void bite(Caveman caveman) {
        int newHP = caveman.getHP() - damage;
        caveman.setHP(newHP);
    }
    //Accessors

    public int getDamage() {
        return damage;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
}
