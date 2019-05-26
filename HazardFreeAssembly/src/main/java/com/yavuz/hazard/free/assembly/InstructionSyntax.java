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

    
    // R - Type
    ArithLog("ArithLog"),
    DivMult("DivMult"),
    Shift("Shift"),
    ShiftV("ShiftV"),
    JumpR("JumpR"),
    MoveFrom("MoveFrom"),
    MoveTo("MoveTo"),
    
    
    // I Type
    ArithLogI("ArithLogI"),
    LoadI("LoadI"),
    Branch("Branch"),
    BranchZ("BranchZ"),
    LoadStore("LoadStore"),
    
    
    // J Type
    Jump("Jump"),
    Trap("Trap"),
   
    NOP("NOP"),
    
    
    Unknown("Unknown");

    private String syntaxName;

    private InstructionSyntax(String name) {
        this.syntaxName = name;
    }

}
