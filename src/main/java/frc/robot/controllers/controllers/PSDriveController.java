package frc.robot.controllers.controllers;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.controllers.interfaces.drivecontroller;

public class PSDriveController implements drivecontroller {

public static Object getYspeed;
PS4Controller myPS4Controller = new PS4Controller(0);
private Trigger isdrivinTrigger;


    public PSDriveController(){
        isdrivinTrigger = new Trigger(isdrivingSupplier());
    }
    
    private BooleanSupplier isdrivingSupplier() {
        return () -> getYspeed() != 0;


    }


    @Override
    public double getYspeed() {
        return myPS4Controller.getLeftY();
    }
    @Override
    public double getXspeed() {
        return myPS4Controller.getLeftX();
    }
    @Override
    public Trigger isDriving() {
        return isdrivinTrigger;
    }
    @Override
    public DoubleSupplier Yspeed() {
        
        return null;
    }

    

}
