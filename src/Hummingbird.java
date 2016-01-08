/**
 Namho An
 COSI 12b 
 PAO3 Part2
 3/5/2015
 */
import java.util.Random;
import java.awt.*;

//This class defines the behavior and state of a Hummingbird object
public class Hummingbird extends AbstractBird {
    int timesFlown = 0;
    
    //Set the constructor for Hummingbird constructor.
    public Hummingbird(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.MAGENTA);
    }
    
    //fly() moves the bird with certain behavior
    public void fly()
    {   
        //generate random coordinates within a range of (0,0) to (19,19) and fly to them. Using random object to make the move randomly
        Random randomNumber = new Random();
        int randomX = randomNumber.nextInt(19);
        int randomY = randomNumber.nextInt(19);
        super.setX(randomX);
        super.setY(randomY);
        //add to times flown
        super.incrementFlown();
    }
   
    
    
}