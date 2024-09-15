package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class AaliyaTeleOp extends LinearOpMode{




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

	backLeft.setDirection(DcMotor.Direction.REVERSE);
	frontLeft.setDirection(DcMotor.Direction.REVERSE);
	waitForStart();
	// Put run blocks here
	while (opModeIsActive()) {

	//test_motor.setPower(this.gamepad1.left_stick_y);

	float FB = gamepad1.right_stick_y;
	float LR = -gamepad1.right_stick_x;
	float RP = gamepad1.left_stick_x;

		
		
		// if(y >= 0.8 || y <= 1.0
		


	    
	    float leftFront = FB + LR + RP;
	    float rightFront = FB - RP - LR;
	    float leftBack = FB + RP - LR;
	    float rightBack = FB - RP + LR;
	    
	    backLeft.setPower(leftBack);
	    backRight.setPower(rightBack);
	    frontLeft.setPower(leftFront);
	    frontRight.setPower(rightFront);
	    
	    telemetry.addData("X", LR);
		telemetry.addData("Y", FB);
		telemetry.update();
}
}
}
