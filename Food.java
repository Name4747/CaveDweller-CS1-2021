
package cavedweller;

/**
 *
 * @author 684438
 */
public class Food {
    //Fields
    private String name;
    private int x, y, hpChange;
    private boolean eaten;
    //Constructor
    public Food(String name, int x, int y) {
        this.eaten = false;
        this.hpChange = 20;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //Methods
    public String toString() {
        return "";
    }
    //Accessors
    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHpChange() {
        return hpChange;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }
    
}
