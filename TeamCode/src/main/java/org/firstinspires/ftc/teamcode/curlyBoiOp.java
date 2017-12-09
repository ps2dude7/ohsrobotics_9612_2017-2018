package org.firstinspires.ftc.teamcode;

/**
 * hooooooooooooooooooooooooooooooooooooo
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="CurlyBoiOp", group ="Linear Opmode")

public class curlyBoiOp extends LinearOpMode {

    //Hardware mapping=
    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException {
        //init variables my name jeff
        float left;
        float right;
        float squish;
        float unsquish;
        boolean winch = false;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            //bind and init hardware mapping
            left        = gamepad1.left_stick_y;
            right       = -(gamepad1.right_stick_y);
            squish      = gamepad1.right_trigger;
            unsquish    = -(gamepad1.left_trigger);

            //drive
            hardware.leftDrive.setPower(left);
            hardware.rightDrive.setPower(right);

            //compression
            hardware.squishDrive1.setPower(squish);
            hardware.squishDrive2.setPower(squish);

            //decompression
            hardware.squishDrive1.setPower(unsquish);
            hardware.squishDrive2.setPower(unsquish);

            /**NOTE:
             *This looks highly janky but always embrace the jank
             *Also this is untested, so yea
             */
            if (gamepad1.right_bumper) {
                hardware.armWinch.setPower(1);
            }
            else if (gamepad1.left_bumper) {
                hardware.armWinch.setPower(-1);
            }

            //statuses
            telemetry.addData("ooo boi you a c u r l y  b o i","y e e t");
            telemetry.addData("STATUS ", "VALUES");
            telemetry.addData("left", "%.2f", left);
            telemetry.addData("right", "%.2f", right);
            telemetry.addData("winch", "%.2f", winch);
            telemetry.addData("squish", "%.2f", squish);
            telemetry.addData("unsquish", "%.2f", unsquish);
            telemetry.update();
        }
    }
}
