// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.ElevatorSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;
public class Activity2 extends CommandBase {

  private final ElevatorSubsystem elevator;
  private final double speed;
  private int count;


  public Activity2(ElevatorSubsystem elevatorSub, double newSpeed) {
    count = 0;
    speed = newSpeed;
    elevator = elevatorSub;
    addRequirements(elevator);
  }

  @Override
  public void initialize() {
    elevator.setEncoder(0);
  }

  @Override
  public void execute() {
    
    switch(count){
      case 0:
      elevator.liftUp(speed);
      if(elevator.getEncoder() <= 20){
        elevator.stopped();
        count++;
      }
      break;
      case 1:
      elevator.liftDown(speed);
      if(elevator.getEncoder() >= -20){
        elevator.stopped();
        count++;
      }
      break;
      case 2:
      elevator.liftUp(speed);
      if(elevator.getEncoder() <= 20){
        elevator.stopped();
        count++;
      }
      break;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return count > 2;
  }
}

