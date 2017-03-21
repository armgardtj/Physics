package physics;



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
    private Double m1, m2, v1, v2, p1, p2, cl, cv;

    public Momentum() {
        m1 = m2 = v1 = v2 = null;
    }

    public Double getM1() {
        return m1;
    }

    public Double setM1(String s) {
        try {
            m1 = Double.parseDouble(s);
            return m1;
        } catch (NumberFormatException e){
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
        } catch (NumberFormatException e){
            return null;
        }
    }

    public Double getV1() {
        return v1;
    }

    public Double setV1(String s) {
        try {
            v1 = Double.parseDouble(s);
            return v1;
        } catch (NumberFormatException e){
            return null;
        }
    }

    public Double getV2() {
        return v2;
    }

    public Double setV2(String s) {
        try {
            v2 = Double.parseDouble(s);
            return v2;
        } catch (NumberFormatException e){
            return null;
        }
    }

    public Double getP1() {
        return p1;
    }

    public Double setP1(String s) {
        try {
            p1 = Double.parseDouble(s);
            return p1;
        } catch (NumberFormatException e){
            return null;
        }
    }

    public Double getP2() {
        return p2;
    }

    public Double setP2(String s) {
        try {
            p2 = Double.parseDouble(s);
            return p2;
        } catch (NumberFormatException e){
            return null;
        }
    }

    public Double getCl() {
        return cl;
    }

    public Double setCl(String s) {
        try {
            cl = Double.parseDouble(s);
            return cl;
        } catch (NumberFormatException e){
            return null;
        }
    }

    public Double getCv() {
        return cv;
    }

    public Double setCv(String s) {
        try {
            cv = Double.parseDouble(s);
            return cv;
        } catch (NumberFormatException e){
            return null;
        }
    }
}
