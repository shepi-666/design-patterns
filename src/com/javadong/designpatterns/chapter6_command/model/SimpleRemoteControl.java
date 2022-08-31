package com.javadong.designpatterns.chapter6_command.model;

import com.javadong.designpatterns.chapter6_command.Command;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/31 21:16
 */
public class SimpleRemoteControl {

    /**
     * 控制插槽
     */
    private Command slot;

    public SimpleRemoteControl() { }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }


}
