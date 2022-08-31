package com.javadong.designpatterns.chapter6_command.test;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.impl.GarageDoorOpenCommand;
import com.javadong.designpatterns.chapter6_command.impl.LightOffCommand;
import com.javadong.designpatterns.chapter6_command.impl.LightOnCommand;
import com.javadong.designpatterns.chapter6_command.impl.StereoOnWithCdCommand;
import com.javadong.designpatterns.chapter6_command.model.*;
import org.junit.Test;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * 替换List中的某一个元素
     */
    @Test
    public void testList() {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.set(0, "李四");
        list.forEach(System.out::println);
    }

    @Test
    public void testRemoteController() {
        RemoteControl control = new RemoteControl();
        Command loc = new LightOnCommand(new Light());
        Command doc = new GarageDoorOpenCommand(new GarageDoor());
        Command soc = new StereoOnWithCdCommand(new Stereo());

        control.setCommand(0, loc, null);
        control.setCommand(1, doc, null);
        control.setCommand(2, soc, null);

        System.out.println(control);

        control.onButtonPushed(2);

    }
}
