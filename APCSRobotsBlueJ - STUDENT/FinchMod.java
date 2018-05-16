 

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 *
 * @author danappel
 */
public class FinchMod extends Finch {
    
    
    public FinchMod() {
        super();
        //No instance variables to set
    }
    
    public void turnLeft() {
        setWheelVelocities(-100, 100, 500);
        
    }
    
}
