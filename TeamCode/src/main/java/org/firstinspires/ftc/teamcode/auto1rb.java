package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by ryaniscool on 1/12/18.
 */
@Autonomous(name = "auto1rb", group = "Autonomous")
@Disabled
public class auto1rb extends LinearOpMode {

    owoWhatsThis hardware = new owoWhatsThis();
    ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();
        // Lower arm
        hardware.jewelStick.setPosition(180);
        // Move forward
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            hardware.leftDrive.setTargetPosition(1);
            hardware.rightDrive.setTargetPosition(1);
            hardware.leftDrive.setPower(1);
            hardware.rightDrive.setPower(1);
        }
        runtime.reset();
        // Raise arm
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            hardware.jewelStick.setPosition(20);
        }
        runtime.reset();
        // Move forward
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            hardware.leftDrive.setTargetPosition(1);
            hardware.rightDrive.setTargetPosition(1);
            hardware.leftDrive.setPower(1);
            hardware.rightDrive.setPower(1);
        }
        runtime.reset();
        // Turn 90 degrees (janky)
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            hardware.leftDrive.setTargetPosition(2);
            hardware.rightDrive.setTargetPosition(2);
            hardware.leftDrive.setPower(1);
            hardware.rightDrive.setPower(-1);
        }
        runtime.reset();
        // Move forward
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            hardware.leftDrive.setTargetPosition(1);
            hardware.rightDrive.setTargetPosition(1);
            hardware.leftDrive.setPower(1);
            hardware.rightDrive.setPower(1);
        }
    }
}

