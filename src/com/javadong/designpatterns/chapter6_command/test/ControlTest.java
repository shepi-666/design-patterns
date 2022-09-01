package com.javadong.designpatterns.chapter6_command.test;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.impl.*;
import com.javadong.designpatterns.chapter6_command.model.*;
import org.junit.Test;

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
        control.undoButtonPushed();
    }


    /**
     * 测试风扇遥控器
     */
    @Test
    public void testFanControl() {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan fan = new CeilingFan("Living Room");

        Command mc = new CeilingFanMediumCommand(fan);
        Command lc = new CeilingFanLowCommand(fan);
        Command hc = new CeilingFanHighCommand(fan);
        Command off = new CeilingFanOffCommand(fan);


        remoteControl.setCommand(0, hc, off);
        remoteControl.setCommand(0, mc, off);
        remoteControl.setCommand(0, lc, off);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.undoButtonPushed();

    }

    /**
     * 测试宏命令
     */
    @Test
    public void testMacroCommand() {
        Light light = new Light();
        Stereo stereo = new Stereo();
        GarageDoor door = new GarageDoor();

        Command doorUp = new GarageDoorOpenCommand(door);
        Command stereoOn = new StereoOnWithCdCommand(stereo);
        Command lightOn = new LightOnCommand(light);

        List<Command> commandList = new ArrayList<>();
        commandList.add(doorUp);
        commandList.add(stereoOn);
        commandList.add(lightOn);

        Command partyOnMacro = new MacroCommand(commandList);

        RemoteControl control = new RemoteControl();
        control.setCommand(0, partyOnMacro, null);

        System.out.println(control);
        System.out.println("----- Pushing Macro on -----");
        control.onButtonPushed(0);
        System.out.println("----- Undo Macro -----");
        control.undoButtonPushed();

    }
}
