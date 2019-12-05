public class HarwareRobot {
public DcMotor leftDrive, rightDrive;

public HardwareRobot() {}

public void init(HardwareMap hwMap) {
leftDrive = hardwareMap.get(DcMotor.class, "left drive");
rightDrive = hardwareMap.get(DcMotor.class, "right drive");

leftDrive.setDirection(DcMotor.Direction.FORWARD);
rightDrive.setDirection(DcMotor.Direction.REVERSE);
}
}
