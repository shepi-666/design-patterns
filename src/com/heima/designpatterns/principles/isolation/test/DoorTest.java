package com.heima.designpatterns.principles.isolation.test;

import com.heima.designpatterns.principles.isolation.before.SafetyDoor;
import com.heima.designpatterns.principles.isolation.before.impl.DoorA;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 22:20
 * @description:
 */
public class DoorTest {


    @Test
    public void testDoorA() {
        SafetyDoor door = new DoorA();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
