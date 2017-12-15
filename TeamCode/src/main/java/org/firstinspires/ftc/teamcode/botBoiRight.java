package org.firstinspires.ftc.teamcode;

/**
 * Created by robotics on 12/9/17.
 */

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="botBoiRight", group ="Autonomous")
@Disabled

public class botBoiRight extends LinearOpMode{
    owoWhatsThis hardware = new owoWhatsThis();

    @Override
    public void runOpMode() throws InterruptedException {
        float left;
        float right;

        hardware.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

        }
    }
}
