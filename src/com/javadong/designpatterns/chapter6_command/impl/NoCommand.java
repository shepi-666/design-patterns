package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.Command;

/**
 * @author DongShaowei
 * @description 无效指令，为插槽初始化所用
 * @date 2022/8/31 22:25
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }
}
