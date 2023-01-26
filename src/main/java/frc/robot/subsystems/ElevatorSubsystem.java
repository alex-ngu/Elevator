package frc.robot.subsystems;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;

public class ElevatorSubsystem extends SubsystemBase{
    CANSparkMax elevator;
    RelativeEncoder elevatorEnc;
    public ElevatorSubsystem(){
        elevator = new CANSparkMax(6, MotorType.kBrushless);
        elevatorEnc = elevator.getEncoder();
        };

    public void liftUp(double speed){
        elevator.set(speed);
    }

    public void liftDown(double speed){
        elevator.set(-speed);
    }

    public void stopped(){
        elevator.set(0);
    }


    public void setEncoder(int encoder){
        elevatorEnc.setPosition(encoder);
    }
    public double getEncoder(){
        return elevatorEnc.getPosition();
    }

    }
    
