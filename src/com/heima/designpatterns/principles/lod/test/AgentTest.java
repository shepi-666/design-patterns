package com.heima.designpatterns.principles.lod.test;

import com.heima.designpatterns.principles.lod.Agent;
import com.heima.designpatterns.principles.lod.Company;
import com.heima.designpatterns.principles.lod.Fans;
import com.heima.designpatterns.principles.lod.Star;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-19 22:14
 * @description: 迪米特法则测试类
 */
public class AgentTest {

    @Test
    public void testAgent() {
        Star star = new Star("Messi");
        Company eaSports = new Company("EA Sports");
        Fans bug8 = new Fans("bug8");

        Agent paris = new Agent(star, bug8, eaSports);
        paris.meeting();
        paris.business();

    }
}
