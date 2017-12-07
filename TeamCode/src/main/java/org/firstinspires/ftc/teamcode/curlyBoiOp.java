package org.firstinspires.ftc.teamcode;

/**
 * hooooooooooooooooooooooooooooooooooooo
 * also edit hardware map for motors and shit
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="CurlyBoiOp", group ="Linear Opmode")

public class curlyBoiOp extends LinearOpMode {

    //Hardware mapping
    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException {
        //controller values
        float left;
        float right;
        //float pitch;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            //bind values
            left    = -(gamepad1.left_stick_y);
            right   = -(gamepad1.right_stick_y);
            //pitch = gamepad1.left_trigger;

            //init motors with opmode and hardware map
            hardware.leftRearDrive.setPower(left);
            hardware.leftFrontDrive.setPower(left);
            hardware.rightRearDrive.setPower(-(right));
            hardware.rightFrontDrive.setPower(right);
            //hardware.pitchArm.setPower(pitch);

            //statuses
            telemetry.addData("ooo boi you a c u r l y  b o i","");
            telemetry.addData("STATUS ", "VALUES");
            telemetry.addData("left", "%.2f", left);
            telemetry.addData("right", "%.2f", right);
            //telemetry.addData("pitch", "%.2f", pitch);
        }
    }
}
