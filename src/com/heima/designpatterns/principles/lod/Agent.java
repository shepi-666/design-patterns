package com.heima.designpatterns.principles.lod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DongShaowei
 * @create: 2024-11-19 22:09
 * @description: 经纪人公司
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {

    private Star star;

    private Fans fans;

    private Company company;


    /**
     * 和粉丝进行见面
     */
    public void meeting() {
        System.out.println(star.getName() + " is meeting with " + fans.getName());
    }

    /**
     * 和公司洽谈
     */
    public void business() {
        System.out.println(star.getName() + " is negotiating with  " + company.getName());
    }

}
