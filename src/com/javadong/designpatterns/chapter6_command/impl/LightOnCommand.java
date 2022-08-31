package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.model.Light;

/**
 * @author DongShaowei
 * @description 打开点灯的命令
 * @date 2022/8/31 21:10
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
            this.light.on();
    }
}
