package com.heima.designpatterns.principles.substitiution.after.impl;

import com.heima.designpatterns.principles.substitiution.after.Quadrilateral;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 20:58
 * @description: 正方形
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Square implements Quadrilateral {

    private double side;



    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
