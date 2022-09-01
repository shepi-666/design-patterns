package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.CeilingFanCommand;
import com.javadong.designpatterns.chapter6_command.model.CeilingFan;

/**
 * @author DongShaowei
 * @description
 * @date 2022/9/1 10:02
 */
public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan fan) {
        this.fan = fan;
        this.prevSpeed = CeilingFan.OFF;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.low();
    }

}
