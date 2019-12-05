package org.firstinspires.ftc.teamcode;
//driving
public class MoveBot{
HardwareRobot robot = null;

public Movement(HardwareRobot arobot){
robot = arobot;
}
  public double motorPower(double speed){
  double power = speed;
  return power;
  }
  public void drive (double power, double time) {
  robot.leftDrive.setPower(power);
  robot.rightDrive.serPower(power);
  sleep(time);
  }
}
