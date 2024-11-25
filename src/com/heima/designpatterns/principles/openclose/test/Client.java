package com.heima.designpatterns.principles.openclose.test;

import com.heima.designpatterns.principles.openclose.AbstractSkin;
import com.heima.designpatterns.principles.openclose.impl.DefaultSpecificSkin;
import com.heima.designpatterns.principles.openclose.impl.SouGouInput;
import com.heima.designpatterns.principles.openclose.impl.Win10SpecificSkin;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-10 22:55
 * @description: 测试类
 */
public class Client {

    /**
     * 测试搜狗输入法
     */
    @Test
    public void testSouGou() {

        AbstractSkin skin = new Win10SpecificSkin();
        SouGouInput input = new SouGouInput(skin);
        input.display();

    }
}
