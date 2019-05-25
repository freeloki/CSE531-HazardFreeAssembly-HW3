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
public class Instruction {
    
    private InstructionType type;
    private String name;
    private String rd;
    private String rs;
    private String rt;
   
    public Instruction(InstructionType type,String rd, String rs, String rt) {
        this.type = type;
        this.name = type.getName();
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;  
    }
    
    
    
    @Override
    public String toString(){
        return "Type:"+ getType().getName() + "\nrd:" + getRd() + "\nrs:" + getRs() + "\nrt:" +getRt();
    }

    /**
     * @return the type
     */
    public InstructionType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(InstructionType type) {
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rd
     */
    public String getRd() {
        return rd;
    }

    /**
     * @param rd the rd to set
     */
    public void setRd(String rd) {
        this.rd = rd;
    }

    /**
     * @return the rs
     */
    public String getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(String rs) {
        this.rs = rs;
    }

    /**
     * @return the rt
     */
    public String getRt() {
        return rt;
    }

    /**
     * @param rt the rt to set
     */
    public void setRt(String rt) {
        this.rt = rt;
    }
    
    
    
}
