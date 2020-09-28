
package cavedweller;

import java.util.Scanner;

/**
 *
 * @author 684438
 */
public class CaveDweller {

    public static void main(String[] args) {
        Cave cave = new Cave();
        System.out.println(cave.toString());
        
        Scanner kboard = new Scanner(System.in);
        
        String input = "";
        while (!input.equals("close")){
            input = kboard.nextLine();
            cave.handleInput(input);
        }
    }
    
}
