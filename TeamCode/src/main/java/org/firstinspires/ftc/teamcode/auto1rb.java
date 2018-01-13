package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by ryaniscool on 1/12/18.
 */
@Autonomous(name = "auto1rb", group = "Autonomous")
public class auto1rb extends LinearOpMode {
    owoWhatsThis hardware = new owoWhatsThis();
    ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();
        // Lower arm
        hardware.jewelstick.setPosition(180);
        // Move forward
        hardware.leftDrive.setTargetPosition(1);
        hardware.rightDrive.setTargetPosition(1);
        hardware.leftDrive.setPower(1);
        hardware.rightDrive.setPower(1);
        // Raise arm
        hardware.jewelstick.setPosition(20);
        // Move forward
        hardware.leftDrive.setTargetPosition(1);
        hardware.rightDrive.setTargetPosition(1);
        hardware.leftDrive.setPower(1);
        hardware.rightDrive.setPower(1);
        // Turn 90 degrees (janky)
        hardware.leftDrive.setTargetPosition(2);
        hardware.rightDrive.setTargetPosition(2);
        hardware.leftDrive.setPower(1);
        hardware.rightDrive.setPower(-1);
        // Move forward
        hardware.leftDrive.setTargetPosition(1);
        hardware.rightDrive.setTargetPosition(1);
        hardware.leftDrive.setPower(1);
        hardware.rightDrive.setPower(1);

    }
}

