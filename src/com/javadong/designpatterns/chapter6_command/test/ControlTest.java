package com.javadong.designpatterns.chapter6_command.test;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.impl.GarageDoorOpenCommand;
import com.javadong.designpatterns.chapter6_command.impl.LightOnCommand;
import com.javadong.designpatterns.chapter6_command.model.GarageDoor;
import com.javadong.designpatterns.chapter6_command.model.Light;
import com.javadong.designpatterns.chapter6_command.model.SimpleRemoteControl;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/31 21:21
 */
public class ControlTest {

    @Test
    public void testRemoteControl() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command loc = new LightOnCommand(light);

        remoteControl.setCommand(loc);
        remoteControl.buttonPressed();
    }

    @Test
    public void testGarageControl() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);

        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonPressed();
    }
}
