package com.heima.designpatterns.principles.isolation.before;

/**
 * 安全门的接口
 */
public interface SafetyDoor {

    /**
     * 防盗
     */
    void antiTheft();

    /**
     * 防火
     */
    void fireProof();


    /**
     * 防水
     */
    void waterProof();

}
