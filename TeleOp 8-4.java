package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

@TeleOp

public class AaliyaJoy extends LinearOpMode {

	// todo: write your code here




@TeleOp





	DcMotor backLeft;
	DcMotor backRight;
	DcMotor frontLeft;
	DcMotor frontRight;


@Override
	public void runOpMode() {
	

	backLeft = hardwareMap.get(DcMotor.class, "bl");
	backRight = hardwareMap.get(DcMotor.class, "br");
	frontLeft = hardwareMap.get(DcMotor.class, "fl");
	frontRight = hardwareMap.get(DcMotor.class, "fr");

	// motorLeft.setDirection(DcMotor.Direction.REVERSE);
	// Put initialization blocks here
	waitForStart();
	// Put run blocks here
	while (opModeIsActive()) {

	//test_motor.setPower(this.gamepad1.left_stick_y);

	float x = this.gamepad1.left_stick_x;
	float y = this.gamepad1.left_stick_y * -1;

		telemetry.addData("Status", "x: " + x + "y: " + y);
		telemetry.update();
		

		
		/*if(x <= 0 && y <= 0) 
		    frontLeft.setPower(0);
		    frontRight.setPower(0);
		    backLeft.setPower(0);
		    backRight.setPower(0);*/
		
		 
            frontLeft.setPower(x - y);
            frontRight.setPower(x + y);
            backLeft.setPower(-x - y);
            backRight.setPower(-x + y);
		
	
	}
}
}
	
            
