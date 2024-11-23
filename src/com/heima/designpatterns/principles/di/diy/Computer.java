package com.heima.designpatterns.principles.di.old;

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

    private IntelCpu cpu;

    private XiJieHardDisk hardDisk;

    private KingstonMemory memory;

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
