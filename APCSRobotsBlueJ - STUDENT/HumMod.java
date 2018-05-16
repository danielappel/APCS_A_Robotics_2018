/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;
/**
 *
 * @author danappel
 */
public class HumMod extends HummingbirdRobot {
    public HumMod(){
        super();
        //No instance variables to set
    }
    
    public void rotateMotor() {
        setMotorVelocity(1, 100);
    }
}
