package frc.robot.controllers.interfaces;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.button.Trigger;

public interface drivecontroller {

public double getYspeed();

public double getXspeed();

public Trigger isDriving();

public DoubleSupplier Yspeed();

}
