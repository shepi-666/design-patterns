package com.heima.designpatterns.principles.isolation.test;

import com.heima.designpatterns.principles.isolation.after.impl.DoorB;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 22:31
 * @description:
 */
public class NewDoorTest {

    @Test
    public void testNewDoor() {
        DoorB doorB = new DoorB();
        doorB.antiTheft();
        doorB.waterproof();
    }
}
