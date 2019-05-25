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
public enum InstructionSyntax {

    ArithLog("ArithLog"),
    ArithLogI("ArithLogI"),
    
    Branch("Branch"),
    
    LoadStore("LoadStore"),
    
    
    NOP("NOP"),
    
    Unknown("Unknown");

    private String syntaxName;

    private InstructionSyntax(String name) {
        this.syntaxName = name;
    }

}
