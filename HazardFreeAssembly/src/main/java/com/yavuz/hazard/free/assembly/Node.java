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
public class Node {

    private Instruction instruction;
    private String label;
    private int index;

    public Node(String label, Instruction ins, int index) {
        this.instruction = ins;
        this.label = label;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Instruction:\n" + getInstruction().toString() + "\nLabel:\n" + label;
    }

    public boolean target(String reg) {
        switch (getInstruction().getType().getSyntax()) {
            case ArithLog:
                return (reg.equals(getInstruction().getRs()) || reg.equals(getInstruction().getRt()));
            case ArithLogI:
                return reg.equals(getInstruction().getRs());
            case LoadStore:
                if (getInstruction().getType().equals(InstructionType.LW)) {
                    return reg.equals(getInstruction().getRs());
                } else if (getInstruction().getType().equals(InstructionType.SW)) {
                    return (reg.equals(getInstruction().getRt()) || reg.equals(getInstruction().getRs()));
                }
                break;
            case Branch:
                return (reg.equals(getInstruction().getRt()) || reg.equals(getInstruction().getRs()));
            case NOP:
                return false;
            default:
                break;
        }

        return false;
    }

    public String current() {

        switch (getInstruction().getType().getSyntax()) {
            case ArithLog:
                return getInstruction().getRd();
            case ArithLogI:
                return getInstruction().getRt();
            case LoadStore:
                if (getInstruction().getType().equals(InstructionType.LW)) {
                    return getInstruction().getRt();
                }
                break;
            case Branch:
                return getInstruction().getRs();
            
            case NOP:
                return "NOP";
            default:
                break;
        }
        return "";
    }

    /**
     * @return the instruction
     */
    public Instruction getInstruction() {
        return instruction;
    }

    public int getIndex() {
        return index;
    }
    
    public void setIndex(int x) {
        this.index = x;
    }

}
