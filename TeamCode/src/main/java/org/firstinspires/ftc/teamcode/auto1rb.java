package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by ryaniscool on 1/12/18.
 */

public class auto1rb extends LinearOpMode{
    owoWhatsThis hardware = new owoWhatsThis();

    Servo juulstick = hardware.jewelstick;
    DcMotor leftDrive = hardware.leftDrive;
    DcMotor rightDrive = hardware.rightDrive;

    @Override
    public void runOpMode() throws InterruptedException {

        hardware.init(hardwareMap);
        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        waitForStart();

        while (opModeIsActive()) {
                // Lower arm
                juulstick.setPosition(180);
                // Move forward
                leftDrive.setTargetPosition(1);
                rightDrive.setTargetPosition(1);
                leftDrive.setPower(1);
                rightDrive.setPower(1);
                // Raise arm
                juulstick.setPosition(20);
                // Move forward
                leftDrive.setTargetPosition(1);
                rightDrive.setTargetPosition(1);
                leftDrive.setPower(1);
                rightDrive.setPower(1);
                // Turn 90 degrees (janky)
                leftDrive.setTargetPosition(2);
                rightDrive.setTargetPosition(2);
                leftDrive.setPower(1);
                rightDrive.setPower(-1);
                // Move forward
                leftDrive.setTargetPosition(1);
                rightDrive.setTargetPosition(1);
                leftDrive.setPower(1);
                rightDrive.setPower(1);


        }
    }
}
