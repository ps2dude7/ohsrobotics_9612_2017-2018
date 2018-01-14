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

        float clawGrip1     = 140;
        float clawGrip2     = 140;
        float clawGrip3     = 40;
        float clawGrip4     = 40;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            left = gamepad1.left_stick_y;
            right = -(gamepad1.right_stick_y);


            //drive
            hardware.leftDrive.setPower(left);
            hardware.rightDrive.setPower(right);

            //EMBRACE THE JANK

            //winch
            if (gamepad2.right_bumper) {
                hardware.armWinch.setPower(1);
            } else if (gamepad2.left_bumper) {
                hardware.armWinch.setPower(-1);
            } else {
                hardware.armWinch.setPower(0);
            }

            //claws
            if (gamepad2.right_trigger >= 0.
                clawGrip1+=.1;
                clawGrip2+=.1;
                clawGrip3+=.1;
                clawGrip4+=.1;
                hardware.clawServo1.setPosition(clawGrip1);
                hardware.clawServo2.setPosition(clawGrip2);
                hardware.clawServo3.setPosition(clawGrip3);
                hardware.clawServo4.setPosition(clawGrip4);


            } else if (gamepad2.left_trigger >= 0.1) {
                clawGrip1-=.1;
                clawGrip2-=.1;
                clawGrip3-=.1;
                clawGrip4-=.1;
                hardware.clawServo1.setPosition(clawGrip1);
                hardware.clawServo2.setPosition(clawGrip2);
                hardware.clawServo3.setPosition(clawGrip3);
                hardware.clawServo4.setPosition(clawGrip4);
            }

            if (clawGrip1 < 40) {
                clawGrip1 = 40;
                clawGrip2 = 40;
            } else if (clawGrip1 > 140) {
                clawGrip1 = 140;
                clawGrip2 = 140;
            }

            if (clawGrip3 < 40) {
                clawGrip3 = 40;
                clawGrip4 = 40;
            } else if (clawGrip3 > 140) {
                clawGrip3 = 140;
                clawGrip4 = 140;
            }
            //relic motor
            if (gamepad1.right_bumper) {
                hardware.relicMotor.setPower(0.07);
            } else if (gamepad1.left_bumper) {
                hardware.relicMotor.setPower(-0.2);
            } else {
                hardware.relicMotor.setPower(0);
            }

            //relic claw
            if (gamepad1.right_trigger >= 0.1) {
                hardware.relicServo1.setPower(-1);
            } else if (gamepad1.left_trigger >= 0.1) {
                hardware.relicServo1.setPower(1);
            } else if (gamepad1.right_trigger <= 0.1 && gamepad1.left_trigger <= 0.1) {
                hardware.relicServo1.setPower(0);
            }
        }
    }
}
