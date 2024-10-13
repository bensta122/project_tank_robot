package frc.robot.controllers.controllers;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.controllers.interfaces.drivecontroller;

public class XboxDriveController implements drivecontroller {

public static Object getYspeed;
XboxController myXboxController = new XboxController(0);
private Trigger isdrivinTrigger;


    public XboxDriveController(){
        isdrivinTrigger = new Trigger(isdrivingSupplier());
    }
    
    private BooleanSupplier isdrivingSupplier() {
        return () -> getYspeed() != 0;


    }


    @Override
    public double getYspeed() {
        return myXboxController.getLeftY();
    }
    @Override
    public double getXspeed() {
        return myXboxController.getLeftX();
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
