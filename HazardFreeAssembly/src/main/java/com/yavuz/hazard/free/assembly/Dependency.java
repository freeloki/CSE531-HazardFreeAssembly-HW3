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
public class Dependency {
    
    private NodeIns first;
    private NodeIns second;
    private int distance;
    private Hazard hazard;

    public Dependency(NodeIns first, NodeIns second, int distance, Hazard hazard) {
        this.first = first;
        this.second = second;
        this.distance = distance;
        this.hazard = hazard;
    }

    /**
     * @return the first
     */
    public NodeIns getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodeIns first) {
        this.first = first;
    }

    /**
     * @return the second
     */
    public NodeIns getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(NodeIns second) {
        this.second = second;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @return the hazard
     */
    public Hazard getHazard() {
        return hazard;
    }

    /**
     * @param hazard the hazard to set
     */
    public void setHazard(Hazard hazard) {
        this.hazard = hazard;
    }
    
    
    
}
