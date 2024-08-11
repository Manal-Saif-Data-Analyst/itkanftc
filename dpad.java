public class gamepad extends LinearOpMode {

	DcMotor backLeft;
	DcMotor backRight;
	DcMotor frontLeft;
	DcMotor frontRight;

@Override
public void runOpMode() {
	backLeft = hardwareMap.get(DcMotor.class,"bl");
	backRight = hardwareMap.get(DcMotor.class,"br");
	frontLeft = hardwareMap.get(DcMotor.class,"fl");
	frontRight = hardwareMap.get(DcMotor.class,"fr");

	waitForStart();

		if(gamepad1.dpad_up) {
		   frontLeft.setPower(0.5);
		   frontRight.setPower(0.5);
		   backLeft.setPower(0.5);
		   backRight.setPower(0.5);
		   }
		else if(gamepad1.dpad_down) {
		   frontLeft.setPower(-0.5);
		   frontRight.setPower(-0.5);
		   backLeft.setPower(-0.5);
		   backRight.setPower(-0.5);
		   }
		else if(gamepad1.dpad_left) {
		   frontLeft.setPower(-0.5);
		   frontRight.setPower(0.5);
		   backLeft.setPower(0.5);
		   backRight.setPower(-0.5);
		   }
		else if(gamepad1.dpad_right) {
		   frontLeft.setPower(0.5);
		   frontRight.setPower(-0.5);
		   backLeft.setPower(-0.5);
		   backRight.setPower(0.5);
		   }
		else {
		   frontLeft.setPower(0);
		   frontRight.setPower(0);
		   backLeft.setPower(0);
		   backRight.setPower(0);


		
