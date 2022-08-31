package com.javadong.designpatterns.chapter6_command.model;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.impl.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DongShaowei
 * @description 遥控器
 * @date 2022/8/31 22:20
 */
public class RemoteControl {

    private static final int SLOT_NUM = 7;

    /**
     * 打开按钮组
     */
    private List<Command> onCommand;

    /**
     * 关闭按钮组
     */
    private List<Command> offCommand;

    public RemoteControl() {
        onCommand = new ArrayList<>(SLOT_NUM);
        offCommand = new ArrayList<>(SLOT_NUM);

        for (int i = 0; i < SLOT_NUM; i++) {
            onCommand.add(new NoCommand());
            offCommand.add(new NoCommand());
        }
    }

    /**
     * 为插槽设置命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (onCommand != null) { this.onCommand.set(slot, onCommand); }
        if (offCommand != null) { this.offCommand.set(slot, offCommand); }
    }

    /**
     * 打开按钮按下
     * @param slot 插槽位置
     */
    public void onButtonPushed(int slot) {
        onCommand.get(slot).execute();
    }

    /**
     * 关闭按钮按下
     * @param slot 插槽位置
     */
    public void offButtonPushed(int slot) {
        offCommand.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n--------Remote Control---------\n");
        for (int i = 0; i < SLOT_NUM; i++) {
            builder.append(
                    "[slot " + i + "] " + onCommand.get(i).getClass().getSimpleName()
                    + "    " + offCommand.get(i).getClass().getSimpleName() + "\n"
            );
        }
        return builder.toString();
    }

}
