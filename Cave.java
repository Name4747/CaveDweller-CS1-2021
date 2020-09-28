
package cavedweller;

/**
 *
 * @author 684438
 */
public class Cave {
    double temp;
    int size;
    Bat battie;
    Caveman caveman;
    Key key;
    Food food;
    Door door;
    
    public Cave() {
        this.temp = Math.random() * 100;
        this.size = (int) (Math.random() * 10) + 6;
        //Instantiate
        this.food = new Food("Banana", (int)(Math.random() * this.size), (int) (Math.random() * this.size), 20);
        this.caveman = new Caveman("Gerng",(int) (Math.random() * this.size), (int) (Math.random() * this.size));
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
        
        //System.out.println(caveman.toString);
    }
    
    public String toString() {
        return ""+size;
    }
}
