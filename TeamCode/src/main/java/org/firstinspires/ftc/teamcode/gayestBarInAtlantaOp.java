package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name = "gayestBarInAtlantaOp", group = "Linear Opmode")

public class gayestBarInAtlantaOp extends LinearOpMode {

    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException {
        float left;
        float right;
        float clawGrip1 = 0;
        float clawGrip2 = 0;
        float clawGrip3 = 0;
        float clawGrip4 = 0;
        boolean winch = false;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            left = gamepad1.left_stick_y;
            right = -(gamepad1.right_stick_y);


            //drive
            hardware.leftDrive.setPower(left);
            hardware.rightDrive.setPower(right);

            //EMBRACE THE JANK
            if (gamepad2.right_bumper) {
                hardware.armWinch.setPower(1);
            } else if (gamepad2.left_bumper) {
                hardware.armWinch.setPower(-1);
            } else {
                hardware.armWinch.setPower(0);
            }

            if (gamepad2.right_trigger <= 0.1) {
                hardware.clawServo1.setPosition(clawGrip1++);
                hardware.clawServo2.setPosition(clawGrip2++);
                hardware.clawServo3.setPosition(-(clawGrip3++));
                hardware.clawServo4.setPosition(-(clawGrip4++));
            } else if (gamepad2.left_trigger <= 0.1) {
                hardware.clawServo1.setPosition(-(clawGrip1++));
                hardware.clawServo2.setPosition(-(clawGrip2++));
                hardware.clawServo3.setPosition(clawGrip3++);
                hardware.clawServo4.setPosition(clawGrip4++);
            } else {
                hardware.clawServo1.setPosition(clawGrip1);
                hardware.clawServo2.setPosition(clawGrip2);
                hardware.clawServo3.setPosition(clawGrip3);
                hardware.clawServo4.setPosition(clawGrip4);
            }
        }
    }
}
