package com.javadong.designpatterns.chapter6_command;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.model.CeilingFan;

/**
 * @author DongShaowei
 * @description
 * @date 2022/9/1 10:12
 */
public abstract class CeilingFanCommand implements Command {
    protected CeilingFan fan;
    protected int prevSpeed;

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            fan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            fan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            fan.low();
        } else {
            fan.off();
        }
    }
}
