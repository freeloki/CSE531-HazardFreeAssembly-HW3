/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yavuz.hazard.free.assembly;

/**
 *
 * @author codemania
 */
public enum Hazard {
    
    NONE("NONE"),
    CH("CH"),
    DH("DH");
    
    private String name;
    
    private Hazard(String name) {
        this.name = name;
    }
}
