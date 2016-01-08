/**
 Namho An
 COSI 12b 
 PAO3 Part2
 3/5/2015
 */
import java.awt.*;
public class Vulture extends AbstractBird{
    private int directionFacing = 0;
    
    //Set the constructor
    public Vulture(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.BLACK);
    }
    
    //fly() moves the bird with each of set up behavior
    public void fly()
    {
        //this logic determines which way the bird is facing, and flies in that direction.
        //Then, it increments the direction. If the bird has last change in direction, start process over again.
        
        if (directionFacing == 0)
        {
            super.translateUp();
            ++directionFacing;
        } 
        else if (directionFacing == 1)
        {
            super.translateLeft();
            ++directionFacing;
        }
        else if (directionFacing == 2)
        {
            super.translateDown();
            ++directionFacing;
        } 
        else if (directionFacing == 3)
        {
            super.translateRight();
            directionFacing = 0;
        } 
        super.incrementFlown();
    }
}