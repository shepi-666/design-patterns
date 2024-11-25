package com.heima.designpatterns.principles.di.test;

import com.heima.designpatterns.principles.di.diy.HardDisk;
import com.heima.designpatterns.principles.di.old.Computer;
import com.heima.designpatterns.principles.di.old.IntelCpu;
import com.heima.designpatterns.principles.di.old.KingstonMemory;
import com.heima.designpatterns.principles.di.old.XiJieHardDisk;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:27
 * @description:
 */
public class TestComputer {

    /**
     * 测试电脑的类
     */
    @Test
    public void testComputer() {

        XiJieHardDisk disk = new XiJieHardDisk();
        KingstonMemory memory = new KingstonMemory();
        IntelCpu cpu = new IntelCpu();

        Computer computer = new Computer(cpu, disk, memory);
        computer.run();
    }
}
