package com.heima.designpatterns.principles.openclose.impl;

import com.heima.designpatterns.principles.openclose.AbstractSkin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DongShaowei
 * @create: 2024-11-10 22:53
 * @description: 搜狗输入法
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SouGouInput {

    private AbstractSkin skin;


    public void display() {
        skin.display();
    }


}
