/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yavuz.hazard.free.assembly;

import static com.yavuz.hazard.free.assembly.InstructionSyntax.ArithLog;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.ArithLogI;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.Branch;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.LoadStore;
import static com.yavuz.hazard.free.assembly.InstructionEncodingType.I_TYPE;
import static com.yavuz.hazard.free.assembly.InstructionEncodingType.R_TYPE;
import static com.yavuz.hazard.free.assembly.InstructionEncodingType.UNKNOWN;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.Unknown;

/**
 *
 * @author codemania
 */
public enum InstructionType {

    // r-type  -> rd,rs,rt
    ADD("add", R_TYPE, ArithLog),
    ADDU("addu", R_TYPE, ArithLog),
    AND("and", R_TYPE, ArithLog),
    NOR("nor", R_TYPE, ArithLog),
    OR("or", R_TYPE, ArithLog),
    SUB("sub", R_TYPE, ArithLog),
    SUBU("subu", R_TYPE, ArithLog),
    XOR("xor", R_TYPE, ArithLog),
    
    
    
    
    
    
    
    
    
    // load/store
    SW("sw", I_TYPE, LoadStore), // -> rt, imm(rs)
    LW("lw", I_TYPE, LoadStore), // -> rt, imm(rs)
    
    
    
    // branch -> rs, rt, label
    BNE("bne", I_TYPE, Branch),
    
    
    
    // immediate -> rt, rs, imm
    ADD_I("addi", I_TYPE, ArithLogI),
    ADD_IU("addiu", I_TYPE, ArithLogI),
    AND_I("andi", I_TYPE, ArithLogI),
    OR_I("ori", I_TYPE, ArithLogI),
    XOR_I("x"
            + "ori", I_TYPE, ArithLogI),
    
    NOP("NOP", InstructionEncodingType.UNKNOWN,InstructionSyntax.NOP),
    UNKNOWN("unknown", InstructionEncodingType.UNKNOWN,Unknown);

    private String name;
    private InstructionEncodingType type;
    private InstructionSyntax syntax;

    private InstructionType(String name, InstructionEncodingType type, InstructionSyntax syntax) {
        this.name = name;
        this.type = type;
        this.syntax = syntax;
    }

    public String getName() {
        return this.name;
    }

    public InstructionEncodingType getType() {
        return this.type;
    }

    public InstructionSyntax getSyntax() {
        return this.syntax;
    }
    
    public static InstructionType getTypeByName(String name) {
        
        InstructionType temp;
        switch (name) {
            
            case "add":
                temp = ADD;
                break;
            case "sw":
                temp = SW;
                break;
            case "lw":
                temp = LW;
                break;
            case "bne":
                temp = BNE;
                break;
            case "addi":
                temp = ADD_I;
                break;
            case "ori":
                temp = OR_I;
                break;
            case "NOP":
                temp = NOP;
                break;
            default:
                temp = UNKNOWN;
        }
        
        return temp;
                
                
    }

}
