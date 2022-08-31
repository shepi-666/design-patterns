package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.model.GarageDoor;
import com.javadong.designpatterns.chapter6_command.model.Light;

/**
 * @author DongShaowei
 * @description 打开点灯的命令
 * @date 2022/8/31 21:10
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
            this.garageDoor.up();
    }
}
