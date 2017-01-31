package physics;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;
import java.io.*;

/**
 * Momentum.java
 *
 * @author: Assignment #:
 *
 * Brief Program Description:
 *
 *
 */
public class Momentum {

    private enum mType {
        ELASTIC,
        INELASTIC,
        EXPLOSION
    }
    private mType type = mType.ELASTIC;
    private Double m1, m2, v1, v2, p1, p2;

    public Momentum() {
        m1 = m2 = v1 = v2 = null;
    }

//    public int calcX1(int t,  
//        enum c) {
//        if (t > 3000) {
//            int x = v1 * ((t - 3000) / 1000)
//            
//            
//        }
//        return -1;
//    }
//
//    public int calcX2(int t,  
//        enum c) {
//        return -1;
//    }

    public Double getM1() {
        return m1;
    }

    public Double setM1(String s) {
        try {
            m1 = Double.parseDouble(s);
            return m1;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double getM2() {
        return m2;
    }

    public Double setM2(String s) {
        try {
            m2 = Double.parseDouble(s);
            return m2;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double getV1() {
        return v1;
    }

    public Double setV1(String s) {
        try {
            v1 = Double.parseDouble(s);
            switch (type) {
                case EXPLOSION:
                    v1 = Math.abs(v1) * -1;
                    break;
                default:
                    v1 = Math.abs(v1);
            }
            return v1;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double getV2() {
        return v2;
    }

    public Double setV2(String s) {
        try {
            v2 = Double.parseDouble(s);
            switch (type) {
                case EXPLOSION:
                    v2 = Math.abs(v2);
                    break;
                default:
                    v2 = Math.abs(v2) * -1;
            }
            return v2;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
