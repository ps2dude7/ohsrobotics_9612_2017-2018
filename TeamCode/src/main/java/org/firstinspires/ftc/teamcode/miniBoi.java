package org.firstinspires.ftc.teamcode;

/**
 * Created by robotics on 12/14/17.
 *
 * THIS IS FOR STEM NIGHT DO NOT USE FOR ACTUAL FTC COMPETITION
 *
 * STEEEEEEEEEEEEEM NIGHTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="MiniBoi", group="Linear OpMode")

public class miniBoi extends LinearOpMode {
    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException{
        //variables
        float left;
        float right;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {
            //controls the controller
            left    = gamepad1.left_stick_y;
            right   = -(gamepad1.right_stick_y);

            //controls the motors
            hardware.leftDrive.setPower(left);
            hardware.rightDrive.setPower(right);

            if (gamepad1.right_bumper) {
                hardware.armWinch.setPower(1);
            } else if (gamepad1.left_bumper) {
                hardware.armWinch.setPower(-1);
            } else {
                hardware.armWinch.setPower(0);
            }
        }
    }
}
