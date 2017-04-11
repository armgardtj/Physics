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

    private double m1, m2, v1, v2, v1c, v2c, p1, p2, cl, cv, d, dc, xp1, xp2; //c means current (final?)

    public Momentum() {
        m1 = m2 = v1 = v2 = p1 = p2 = cl = cv = 0.0;
        xp1 = 0.0;
        xp2 = 900.0;
        //m1 = m2 = v1 = 1.0;
        //v2 = -1.0;

        m1 = m2 = 1.0;
        v1 = 2.0;
        //v2 = -4.0;
        d = dc = 8.0;
    }

    public int calcX1(int type) {
        Double x = 0.0;
        if (dc > 0) {
            x = v1 / (1000 / 100) + xp1;
        } else {
            if (m1 == 0)
                return 400;
            x = v1c / 10 + xp1;
        }
        xp1 = x;
        return x.intValue();
    }

    public int calcX2(int type) {
        Double x = 900.0;
        if (dc > 0) {
            x = v2 / 10 + xp2;
        } else {
            if (m2 == 0)
                return 500;
            x = v2c / 10 + xp2;
        }
        xp2 = x;
        return x.intValue();
    }

    public void distanceCalc(Double time, int type) {
        dc = d - Math.abs(v1 * time) - Math.abs(v2 * time);
        if (type == 3) {
            dc = 0.0;
        }
       //System.out.println(v1+" "+v2+" "+v1c+" "+v2c);
        //System.out.println(p1+" "+p2);
    }

    public void reset(int type) {
        if (type == 3) {
            xp1 = 400.0;
            xp2 = 500.0;
        } else {
            xp1 = 0.0;
            xp2 = 900.0;
        }
        
    }
    public void hardReset(){
        m1 = m2 = v1 = v2 = p1 = p2 = 0;
    }

    public boolean calculate(int type) {
        if (type < 1 || type > 3) {
            return false;
        }
        try {
            System.out.println(v1c+" "+v2c);
            System.out.println(dc+" "+p1+" "+p2);
            switch (type) {
                case 1:
                    v1c = ((m1 - m2) * v1 + 2 * m2 * v2) / (m1 + m2);
                    v2c = (2 * m1 * v1 - (m1 - m2) * v2) / (m1 + m2);
                    break;
                case 2:
                    v1c = v2c = v1 + v2;
                    break;
                case 3:
                    v1c = p1 / m1;
                    v2c = p1 / m2;
                    break;
            }
            if (dc > 0) {
                p1 = m1 * v1;
                p2 = m2 * v2;
            } else {
                if (type == 3) {
                    p1 = p2;
                } else {
                    p1 = m1 * v1c;
                    p2 = m2 * v2c;
                }
            }
            
            //cl = ((m1 * Math.abs(5-xp1 / 100)) + (m2 * Math.abs(5-xp2 / 100))) / (m1 * m2);
            cv = (p1 + p2) / (m1 + m2);
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

    public Double getCl() {
        return cl;
    }

    public Double getCv() {
        return cv;
    }
}
