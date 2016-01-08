/**
 Namho An
 COSI 12b 
 PAO3 Part2
 3/5/2015
 */
import java.awt.*;

public class Cardinal extends AbstractBird implements AviaryConstants{
    public static int UP = 0;
    public static int DOWN = 1;
    private int flyingDirection = DOWN;
    
    //Set the constructor for Cardinal object
    public Cardinal(int x, int y)
    {
        super(x, y);
        super.incrementCreated();
        super.setColor(Color.RED);
    }
    
    //fly() moves the bird under certain behavior
    public void fly()
    {
        //If the bird is at the edges, it changes direction
        if (super.getY() == SIZE - 1)
        {
            flyingDirection = DOWN;
        }
        else if (super.getY() == 0 )
        {
            flyingDirection = UP;
        }
        
        //Gives the flying direction, and translate point accordingly
        if (flyingDirection == UP)
        {
            super.translateDown();
        } 
        else if (flyingDirection == DOWN)
        {
            super.translateUp();
        } 
        
        super.incrementFlown();
    }
}