/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.Subsystems;

public class DriveWithJoystick extends Command {
  public DriveWithJoystick() {
    requires(Subsystems.driveTrain);
    requires(Subsystems.gyro);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    double deadband = 0.2;
    double y = Robot.oi.deadbandMod(Robot.oi.getThrottledY(), deadband);
    double x = Robot.oi.deadbandMod(Robot.oi.getThrottledX(), deadband);
    double z = Robot.oi.deadbandMod(Robot.oi.getThrottledZ(), deadband);
    Subsystems.driveTrain.drive(y, x, z, Subsystems.gyro.getYaw());
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
    end();
  }
}
