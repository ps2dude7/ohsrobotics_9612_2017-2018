package org.firstinspires.ftc.teamcode;

/**
 * Created by robotics on 12/14/17.
 *
 * THIS IS FOR STEM NIGHT DO NOT USE FOR ACTUAL FTC COMPETITION
 *
 * STEEEEEEEEEEEEEM NIGHTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import android.media.*;

public class miniBoi extends LinearOpMode {
    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException{
        //variables
        float left;
        float right;

        MediaPlayer mediaPlayer = MediaPlayer.create(R.raw.sound_file);

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {
            //controls the controller
            left    = gamepad1.left_stick_y;
            right   = -(gamepad1.right_stick_y);

            if(gamepad1.a) {
                mediaPlayer.start();
            }

            else {
                mediaPlayer.stop();
            }
            //controls the motors
            hardware.leftDrive.setPower(left);
            hardware.rightDrive.setPower(right);
        }
    }
}
