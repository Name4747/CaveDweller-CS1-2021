
package cavedweller;

/**
 *
 * @author 684438
 */
public class Cave {
    private double temp;
    private int size;
    private Bat bat1;
    private Bat bat2;
    private Caveman caveman;
    private Key key;
    private Food food1;
    private Food food2;
    private Door door;
    
    public Cave() {
        this.temp = Math.random() * 100;
        this.size = (int) (Math.random() * 2) + 4;
        //Instantiate
        this.food1 = new Food("Banana", (int)(Math.random() * this.size), (int) (Math.random() * this.size));
        this.caveman = new Caveman("Gerng",(int) (Math.random() * this.size), (int) (Math.random() * this.size));
        
        this.food2 = new Food("Cherry", (int)(Math.random() * this.size), (int) (Math.random() * this.size));
        this.bat1 = new Bat((int)(Math.random() * this.size), (int)(Math.random() * this.size));
        this.bat2 = new Bat((int)(Math.random() * this.size), (int)(Math.random() * this.size));
        this.door = new Door((int)(Math.random() * this.size), (int)(Math.random() * this.size));
        this.key = new Key((int)(Math.random() * this.size), (int)(Math.random() * this.size));
    }
    
    private void checkCollisions() {
        if (caveman.getX() == food1.getX() && caveman.getY() == food1.getY()) {
            caveman.eat(food1);
        }
        if (caveman.getX() == food2.getX() && caveman.getY() == food2.getY()) {
            caveman.eat(food2);
        }
        if (caveman.getX() == bat1.getX() && caveman.getY() == bat1.getY()) {
            bat1.bite(caveman);
        }
        if (caveman.getX() == bat2.getX() && caveman.getY() == bat2.getY()) {
            bat2.bite(caveman);
        }
        if (caveman.getX() == key.getX() && caveman.getY() == key.getY()) {
            caveman.pickUpKey();
        }
        if (caveman.getX() == door.getX() && caveman.getY() == door.getY()) {
            caveman.openDoor();
        }
    }
    
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
            caveman.moveUp();
        }
        else if (input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            caveman.moveLeft();
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            caveman.moveRight();
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        else {
            System.out.println("Input not recognised");
        }
        makeBatsMove();
        checkCollisions();
        System.out.println(caveman.toString());
    }
    
    private void makeBatsMove() {
        bat1.moveAround();
        bat2.moveAround();
    }
    
    public String toString() {
        return ""+size;
    }
}
