/**
 Namho An
 COSI 12b 
 PAO3 Part2
 3/5/2015
 */
import java.awt.*;

//This interface shows methods that represents the condition of the bird. This interface is working with Aviary client program.
public interface Bird {
    public Color getColor();
    public Point getPosition();
    public void fly();
    public int getFlown();
    public int getCreated();
}