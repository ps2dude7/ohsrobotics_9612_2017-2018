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
        float clawGrip = 0;
        boolean winch = false;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            left = gamepad1.left_stick_y;
            right = -(gamepad1.right_stick_y);


            //drive
            hardware.leftDrive.setPower(left);
            hardware.leftDrive.setPower(right);

            //servos
            hardware.clawServo1.setPosition(clawGrip);
            hardware.clawServo2.setPosition(clawGrip);
            hardware.clawServo3.setPosition(clawGrip);
            hardware.clawServo4.setPosition(clawGrip);

            //EMBRACE THE JANK
            if (gamepad1.right_bumper) {
                hardware.armWinch.setPower(1);
            } else if (gamepad1.left_bumper) {
                hardware.armWinch.setPower(-1);
            } else if (gamepad1.right_trigger <= 0.05) {
                hardware.clawServo1.setPosition(clawGrip++);
                hardware.clawServo2.setPosition(clawGrip++);
                hardware.clawServo3.setPosition(-(clawGrip++));
                hardware.clawServo4.setPosition(-(clawGrip++));
            } else if (gamepad1.left_trigger <= 0.05) {
                hardware.clawServo1.setPosition(-(clawGrip++));
                hardware.clawServo2.setPosition(-(clawGrip++));
                hardware.clawServo3.setPosition(clawGrip++);
                hardware.clawServo4.setPosition(clawGrip++);
            }
        }
    }
}
