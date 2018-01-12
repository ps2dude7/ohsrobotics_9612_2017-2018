package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name = "UgandanBoiOp", group = "Linear Opmode")

public class ugandanBoiOp extends LinearOpMode {

    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException {
        float left;
        float right;
        float claw;
        float unclaw;
        boolean winch = false;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            left = gamepad1.left_stick_y;
            right = -(gamepad1.right_stick_y);
            claw = gamepad1.right_trigger;

            //drive
            hardware.leftDrive.setPower(left);
            hardware.leftDrive.setPower(right);

            //EMBRACE THE JANK
            if (gamepad1.right_bumper) {
                hardwareMap.armWinch.setPower(1);
            }
        }
    }
}
