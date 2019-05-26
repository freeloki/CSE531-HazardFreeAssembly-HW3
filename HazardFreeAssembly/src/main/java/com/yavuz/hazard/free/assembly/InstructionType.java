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
import static com.yavuz.hazard.free.assembly.InstructionEncodingType.J_TYPE;
import static com.yavuz.hazard.free.assembly.InstructionEncodingType.R_TYPE;
import static com.yavuz.hazard.free.assembly.InstructionEncodingType.UNKNOWN;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.BranchZ;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.DivMult;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.Jump;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.JumpR;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.LoadI;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.MoveFrom;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.MoveTo;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.Shift;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.ShiftV;
import static com.yavuz.hazard.free.assembly.InstructionSyntax.Trap;
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
    SLT("slt", R_TYPE, ArithLog),
    SLTU("sltu", R_TYPE, ArithLog),
    // load/store
    SW("sw", I_TYPE, LoadStore),// -> rt, imm(rs)
    SB("sb", I_TYPE, LoadStore),
    SH("sh", I_TYPE, LoadStore),
    LW("lw", I_TYPE, LoadStore), // -> rt, imm(rs)
    LB("lb", I_TYPE, LoadStore),
    LBU("lbu", I_TYPE, LoadStore),
    LH("lh", I_TYPE, LoadStore),
    LHU("lhu", I_TYPE, LoadStore),
    // branch -> rs, rt, label
    BNE("bne", I_TYPE, Branch),
    BEQ("beq", I_TYPE, Branch),
    BGTZ("bgtz", I_TYPE, BranchZ),
    BLEZ("blez", I_TYPE, BranchZ),
    J("j", J_TYPE, Jump),
    JAL("jal", J_TYPE, Jump),
    JR("jr", R_TYPE, JumpR),
    JALR("jalr", R_TYPE, JumpR),
    MFHI("mfhi", R_TYPE, MoveFrom),
    MFLO("mflo", R_TYPE, MoveFrom),
    MTHI("mthi", R_TYPE, MoveTo),
    MTLO("mtlo", R_TYPE, MoveTo),
    // immediate -> rt, rs, imm
    ADD_I("addi", I_TYPE, ArithLogI),
    ADD_IU("addiu", I_TYPE, ArithLogI),
    AND_I("andi", I_TYPE, ArithLogI),
    OR_I("ori", I_TYPE, ArithLogI),
    XOR_I("xori", I_TYPE, ArithLogI),
    SLTI("slti", R_TYPE, ArithLogI),
    SLTIU("sltiu", R_TYPE, ArithLogI),
    DIV("div", R_TYPE, DivMult),
    DIVU("divu", R_TYPE, DivMult),
    MULT("mult", R_TYPE, DivMult),
    MULTU("multu", R_TYPE, DivMult),
    SLL("sll", R_TYPE, Shift),
    SLLV("sllv", R_TYPE, ShiftV),
    SRA("sra", R_TYPE, Shift),
    SRAV("srav", R_TYPE, ShiftV),
    SRL("srl", R_TYPE, Shift),
    SRLV("srlv", R_TYPE, ShiftV),
    LHI("lhi", I_TYPE, LoadI),
    LHO("lho", I_TYPE, LoadI),
    NOP("NOP", InstructionEncodingType.UNKNOWN, InstructionSyntax.NOP),
    TRAP("trap", J_TYPE, Trap),
    UNKNOWN("unknown", InstructionEncodingType.UNKNOWN, Unknown);

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
            case "addu":
                temp = ADDU;
                break;
            case "addiu":
                temp = ADD_IU;
                break;
            case "and":
                temp = AND;
                break;

            case "andi":
                temp = AND_I;
                break;
            case "div":
                temp = DIV;
                break;
            case "divu":
                temp = DIVU;
                break;
            case "mult":
                temp = MULT;
                break;
            case "multu":
                temp = MULTU;
                break;
            case "nor":
                temp = NOR;
                break;
            case "or":
                temp = OR;
                break;
            case "ori":
                temp = OR_I;
                break;
            case "sll":
                temp = SLL;
                break;
            case "sllv":
                temp = SLLV;
                break;
            case "sra":
                temp = SRA;
                break;
            case "srav":
                temp = SRAV;
                break;

            case "srl":
                temp = SRL;
                break;
            case "srlv":
                temp = SRLV;
                break;

            case "sub":
                temp = SUB;
                break;
            case "subu":
                temp = SUBU;
                break;
            case "xor":
                temp = XOR;
                break;
            case "xori":
                temp = XOR_I;
                break;

            case "lhi":
                temp = LHI;
                break;
            case "lho":
                temp = LHO;
                break;

            case "slt":
                temp = SLT;
                break;
            case "sltu":
                temp = SLTU;
                break;

            case "slti":
                temp = SLTI;
                break;
            case "sltiu":
                temp = SLTIU;
                break;

            case "beq":
                temp = BEQ;
                break;
            case "bgtz":
                temp = BGTZ;
                break;

            case "blez":
                temp = BLEZ;
                break;
            case "j":
                temp = J;
                break;

            case "jal":
                temp = JAL;
                break;
            case "jalr":
                temp = JALR;
                break;

            case "jr":
                temp = JR;
                break;
            case "lb":
                temp = LB;
                break;

            case "lbu":
                temp = LBU;
                break;
            case "LH":
                temp = LH;
                break;

            case "lhu":
                temp = LHU;
                break;
            case "sb":
                temp = SB;
                break;

            case "sh":
                temp = SH;
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

            case "mfhi":
                temp = MFHI;
                break;
            case "mflo":
                temp = MFLO;
                break;

            case "mthi":
                temp = MTHI;
                break;
            case "mtlo":
                temp = MTLO;
                break;

            case "trap":
                temp = TRAP;
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
