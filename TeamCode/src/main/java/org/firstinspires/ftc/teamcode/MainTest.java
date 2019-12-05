
Autonomous(name="MainTest");
public class MainTest extends LinearOpMode {
HardwareRobot robot = new HardwareRobot();
MiveBot move = new MoveBot(robot);

@Override
public void runOpMode()
{
robot.init;

move.drive
waitForStart();
move.drive(move.motoPower(0.4), 1000);
  
}
  
}
