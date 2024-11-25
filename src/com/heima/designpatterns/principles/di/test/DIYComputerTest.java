package com.heima.designpatterns.principles.di.test;

import com.heima.designpatterns.principles.di.diy.CPU;
import com.heima.designpatterns.principles.di.diy.Computer;
import com.heima.designpatterns.principles.di.diy.HardDisk;
import com.heima.designpatterns.principles.di.diy.Memory;
import com.heima.designpatterns.principles.di.diy.impl.IntelCpu;
import com.heima.designpatterns.principles.di.diy.impl.KingstonMemory;
import com.heima.designpatterns.principles.di.diy.impl.XiJieHardDisk;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:47
 * @description:
 */
public class DIYComputerTest {

    @Test
    public void testDIYComputer(){
        HardDisk disk = new XiJieHardDisk();
        CPU cpu = new IntelCpu();
        Memory memory = new KingstonMemory();
        Computer c = new Computer(cpu, disk, memory);
        c.run();
    }
}
