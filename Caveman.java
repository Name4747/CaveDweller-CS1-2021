
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
        this.hp += food.getHpChange();
        food.setEaten(true);
        System.out.println("Me eat"+food.getName());
    }
    
    public void pickUpKey() {
        hasKey = true;
        System.out.println("You picked up the key!");
    }
    
    public void openDoor() {
        if (hasKey == true) {
            System.out.println("You open the door with the key, Caveman Escaped!");
            System.exit(0);
        }
        else {
            System.out.println("You found the door, but you dont have the key.");
        }
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

    public boolean HasKey() {
        return hasKey;
    }
    
    
}
