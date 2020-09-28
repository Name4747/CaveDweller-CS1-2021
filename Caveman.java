
package cavedweller;

/**
 *
 * @author 684438
 */
public class Caveman {
    //Fields / Instance Variables
    private String name;
    private int hp, x, y;
    private boolean hasKey;
    
    //Constructor
    public Caveman(String name, int x, int y) {
        this.hp = 100;
        this.hasKey = false;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    
    //Methods
    public void speak() {
        System.out.println("Grr");
    }
    
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    public void moveUp() {
        //y tracks how far down
        y -= 1;
    }
    public void moveDown() {
        y += 1;
    }
    public void moveLeft() {
        x -= 1;
    }
    public void moveRight() {
        x += 1;
    }
    
    public void eat(Food food){
        hp += food.getHpChange();
    }
    //Accescors / getters & setters
    public int getHP() {
        return hp;
    }
    
    public void setHP(int hp) {
        if (hp <= 100 && hp >= 0) {
            this.hp = hp;
        }
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHasKey() {
        return hasKey;
    }
    
    
}
