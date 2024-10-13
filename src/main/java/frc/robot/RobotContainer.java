// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.controllers.controllers.PSDriveController;
import frc.robot.controllers.controllers.XboxDriveController;
import frc.robot.controllers.interfaces.drivecontroller;
import frc.robot.subsystems.drivetrainSubsestem;

public class RobotContainer {
  public final drivetrainSubsestem driverSubsestem = new drivetrainSubsestem();
  public final XboxDriveController robotController = new XboxDriveController();
  public final PSDriveController psControler = new PSDriveController();
  public RobotContainer() {
    robotController.isDriving().whileTrue(driverSubsestem.driveCommand(psControler.getYspeed()));
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
