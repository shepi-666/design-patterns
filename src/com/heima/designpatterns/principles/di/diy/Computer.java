package com.heima.designpatterns.principles.di.diy;

import com.heima.designpatterns.principles.di.old.IntelCpu;
import com.heima.designpatterns.principles.di.old.KingstonMemory;
import com.heima.designpatterns.principles.di.old.XiJieHardDisk;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:24
 * @description: computer class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    private CPU cpu;

    private HardDisk hardDisk;

    private Memory memory;

    /**
     * method to run computer
     */
    public void run() {
        System.out.println("the computer is running");
        String data = hardDisk.get();
        System.out.println("get data from hard disk: " + data);

        cpu.run();

        memory.save();

    }

}
