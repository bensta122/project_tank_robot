package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix6.mechanisms.swerve.utility.PhoenixPIDController;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.controllers.controllers.PSDriveController;
import frc.robot.controllers.controllers.XboxDriveController;

public class drivetrainSubsestem extends SubsystemBase {
  public final PSDriveController psControler = new PSDriveController();
  WPI_TalonSRX LeftFrontmotor ;
  WPI_TalonSRX LeftBackmotor ;
  WPI_TalonSRX RightFrontmotor ;
  WPI_TalonSRX RightBackmotor ;
  public Object driveCommand;
  public Object drive;
  /** Creates a new robotSubsystem. */
  public drivetrainSubsestem() {
    LeftFrontmotor = new WPI_TalonSRX(11);
    LeftBackmotor = new WPI_TalonSRX(12);
    RightFrontmotor = new WPI_TalonSRX(21);
    RightBackmotor = new WPI_TalonSRX(22);
  }
  public void drive(double speed){
    speed = psControler.getYspeed();
    LeftFrontmotor.set(speed * -1 + psControler.getXspeed());
    LeftBackmotor.set(speed * -1 + psControler.getXspeed());
    RightFrontmotor.set(speed * -1 - psControler.getXspeed());
    RightBackmotor.set(speed * -1 - psControler.getXspeed());
  }
  public Command driveCommand(double speed){
    return new RunCommand(() -> drive(speed), this);
  }
  public Command driveCommand(){
    return driveCommand(0);
  }
}
