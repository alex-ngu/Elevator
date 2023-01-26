// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.ElevatorSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;
public class LiftDown extends CommandBase {

  private final ElevatorSubsystem elevator;
  private final double speed;


  public LiftDown(ElevatorSubsystem elevatorSub, double newSpeed) {
    speed = newSpeed;
    elevator = elevatorSub;
    addRequirements(elevator);
  }

  @Override
  public void initialize() {
    elevator.liftDown(speed);
  }

  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
