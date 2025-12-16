package com.heima.designpatterns.pattern.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:32
 * @description: 抽象快餐类
 */
@Data
@AllArgsConstructor
public abstract class FastFood {

    /**
     * 抽象方法，获取价格
     */
    private float price;

    /**
     * 抽象方法，获取描述
     */
    private String desc;


    public abstract float cost();
}
