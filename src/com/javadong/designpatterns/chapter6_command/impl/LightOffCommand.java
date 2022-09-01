package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.model.Light;

/**
 * @author DongShaowei
 * @description 关闭点灯的命令
 * @date 2022/8/31 21:10
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
            this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
