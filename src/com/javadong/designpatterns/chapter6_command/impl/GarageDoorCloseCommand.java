package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.model.GarageDoor;

/**
 * @author DongShaowei
 * @description 打开点灯的命令
 * @date 2022/8/31 21:10
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
            this.garageDoor.down();
    }

    @Override
    public void undo() {
        this.garageDoor.up();
    }
}
