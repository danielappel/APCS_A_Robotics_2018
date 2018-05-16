/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

//Imports for hummingbird
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//imports for finch
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 *
 * @author danappel
 */
public class RobotDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FinchMod finch = new FinchMod();
        //HumMod hum = new HumMod();
        
        finch.turnLeft();
        //hum.rotateMotor();
        
    }
    
}
