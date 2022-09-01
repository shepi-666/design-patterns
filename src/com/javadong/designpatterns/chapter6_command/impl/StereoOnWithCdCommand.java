package com.javadong.designpatterns.chapter6_command.impl;

import com.javadong.designpatterns.chapter6_command.Command;
import com.javadong.designpatterns.chapter6_command.model.Stereo;

/**
 * @author DongShaowei
 * @description CD音响
 * @date 2022/8/31 22:25
 */
public class StereoOnWithCdCommand implements Command {

    private Stereo stereo;


    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
