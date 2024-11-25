package com.heima.designpatterns.principles.substitiution.after.impl;

import com.heima.designpatterns.principles.substitiution.after.Quadrilateral;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:00
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Quadrilateral {

    private double length;

    private double width;

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }
}
