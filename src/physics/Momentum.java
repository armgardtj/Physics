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

    private Double m1, m2, v1, v2, v1c, v2c, p1, p2, p1c, p2c, cl, cv, d, dc, x1, x2; //c means current (final?)

    public Momentum() {
        m1 = m2 = v1 = v2 = p1 = p2 = cl = cv = null;
        //m1 = m2 = v1 = 1.0;
        //v2 = -1.0;
        d = dc = 8.0;
    }

    public int calcX1(double time, int type) {
        double x = 0.0;
        distanceCalc(time);
        if (type == 1) {
            if (dc > 0) {
            x = v1 * time*100;
            } else {
                x = v1c * time*100 + 500;
            }
        }
        return (int)(x);
    }

    public int calcX2(double time, int type) {
        double x = 0.0;
        if (type == 1) {
            if (dc > 0) {
            x = v2 * time*100;
            return (int) (900 + x);
            } else {
                x = v2c * time*100;
                return (int)(500+x);
            }
        }
        return 900;
    }

    public void distanceCalc(double time) {
        dc = d - Math.abs(v1 * time) - Math.abs(v2 * time);     
        
    }

    public boolean calculate() {
        try {
            p1 = m1 * v1;
            p2 = m2 * v2;
            cl = (m1 * d / 2 + m2 * d / 2) / (m1 * m2);
            cv = (p1 + p2) / (m1 + m2);
            v1c = 2 * m1 / (m1 + m2) * v1 - (m1 - m2) / (m1 + m2) * v2;
            v2c = (m1 - m2) / (m1 + m2) * v1 + 2 * m2 / (m1 + m2) * v2;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public Double getD() {
        return d;
    }

    public Double setD(String s) {
        try {
            d = Double.parseDouble(s);
            dc = d;
            return d;
        } catch (NumberFormatException e) {
            return null;
        }
    }

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
            v1 = Math.abs(v1);
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
            v2 = Math.abs(v2) * -1;
            return v2;
        } catch (NumberFormatException e) {
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
        } catch (NumberFormatException e) {
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
        } catch (NumberFormatException e) {
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
        } catch (NumberFormatException e) {
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
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
