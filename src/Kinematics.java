/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

/**
 *
 * @author John
 */
public class Kinematics {

    private Double x, x0, y, y0, xmin, ymin, xmax, ymax, vx, vx0, vy, vy0, ax, ay, t;

    public Kinematics() {
        x = x0 = y = y0 = xmin = ymin = xmax = ymax = vx = vx0 = vy = vy0 = ax = ay = t = null;
//        x = y = t = 1.0;
//        x0 = y0 = vx0 = vy0 = 0.0;
//        vx = vy = ax = ay = 2.0;
//
        x = t = 2.0;
        vx = vx0 = vy0 = 1.0;
        y = x0 = y0 = ax = 0.0;
        vy = ay = -1.0;
    }

    public int calcX(double time, KinematicsGUI k) {
        if (verify(k)) {
            double n = x0 + vx0 * time + 1 / 2.0 * ax * Math.pow(time, 2);
            return (int) (n * 900 / (xmax - xmin));
        }
        return -1;
    }

    public int calcY(double time, KinematicsGUI k) {
        if (verify(k)) {
            double n = y0 + vy0 * time + 1 / 2.0 * ay * Math.pow(time, 2);
            return (int) (800 - (n * 800 / (ymax - ymin)));
        }
        return -1;
    }

    public boolean verify(KinematicsGUI k) {
        if (k.getVarCalc()) {
            varCalc(k);
        }
        try {
            double txmin = x0;
            double txmax = x0;
            double tymin = y0;
            double tymax = y0;
            for (double i = 0; i < t; i+=.001) {
                double varx = x0 + vx0 * i + 1 / 2.0 * ax * Math.pow(i, 2);
                double vary = y0 + vy0 * i + 1 / 2.0 * ay * Math.pow(i, 2);
                if (varx < txmin) {
                    txmin = varx;
                }
                if (varx > txmax) {
                    txmax = varx;
                }
                if (vary < tymin) {
                    tymin = vary;
                }
                if (vary > tymax) {
                    tymax = vary;
                }
            }
            xmin = txmin;
            xmax = txmax;
            ymin = tymin;
            ymax = tymax;
            //System.out.println(xmin + "\n" + xmax + "\n" + ymin + "\n" + ymax + "\n");
        } catch (NullPointerException e) {
            return false;

        }
        try {
            if (x != x0 + vx0 * t + 1 / 2.0 * ax * Math.pow(t, 2) || Math.pow(vx, 2) != Math.pow(vx0, 2) + 2.0 * ax * (x - x0)) {
                return false;
            }
        } catch (NullPointerException e) {
            return false;
        }
        try {
            if (y != y0 + vy0 * t + 1 / 2.0 * ay * Math.pow(t, 2) || Math.pow(vy, 2) != Math.pow(vy0, 2) + 2.0 * ay * (y - y0)) {
                return false;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public void varCalc(KinematicsGUI k) {
        if (ax != null && ax == 0) {
            if (vx == null) {
                vx = vx0;
                k.setjTextField6(vx);
            } else {
                vx0 = vx;
                k.setjTextField3(vx0);
            }
        } else {
            try {
                vx = ax * t + vx0;
                k.setjTextField6(vx);
            } catch (NullPointerException e) {
            }
            try {
                vx0 = vx - ax * t;
                k.setjTextField3(vx0);
            } catch (NullPointerException e) {
            }
        }
        if (vx != null && vx == 0 && ax != null && ax != 0) {
            if (x == null) {
                x = x0;
                k.setjTextField1(x);
            } else {
                x0 = x;
            }
        } else {
            try {
                x = vx * t + x0;
                k.setjTextField1(x);
            } catch (NullPointerException e) {
            }
            try {
                x0 = x - vx * t;
            } catch (NullPointerException e) {
            }
        }
        if (ay != null && ay == 0) {
            if (vy == null) {
                vy = vy0;
                k.setjTextField5(vy);
            } else {
                vy0 = vy;
            }
        } else {
            try {
                vy = ay * t + vy0;
                k.setjTextField5(vy);
            } catch (NullPointerException e) {
            }
            try {
                vy0 = vy - ay * t;
            } catch (NullPointerException e) {
            }
        }
        if (vy != null && vy == 0 && ay != null && ay != 0) {
            if (y == null) {
                y = y0;
                k.setjTextField2(y);
            } else {
                y0 = y;
            }
        } else {
            try {
                y = vy * t + y0;
                k.setjTextField2(y);
            } catch (NullPointerException e) {
            }
            try {
                y0 = y - vy * t;
            } catch (NullPointerException e) {
            }
        }

        try {
            vx = Math.pow(Math.pow(vx0, 2) + 2 * ax * (x - x0), 1 / 2);
            k.setjTextField6(vx);
        } catch (NullPointerException e) {
        }
        try {
            vy = Math.pow(Math.pow(vy0, 2) + 2 * ay * (y - y0), 1 / 2);
            k.setjTextField5(vy);
        } catch (NullPointerException e) {
        }

        try {
            x = x0 + vx0 * t + 1 / 2 * ax * Math.pow(t, 2);
            k.setjTextField1(x);
        } catch (NullPointerException e) {
        }

        try {
            y = y0 + vy0 * t + 1 / 2 * ay * Math.pow(t, 2);
            k.setjTextField2(y);
        } catch (NullPointerException e) {
        }
    }

    public Double getX() {
        return x;
    }

    public Double getX0() {
        return x0;
    }

    public Double getY() {
        return y;
    }

    public Double getY0() {
        return y0;
    }

    public Double getVx() {
        return vx;
    }

    public Double getVx0() {
        return vx0;
    }

    public Double getVy() {
        return vy;
    }

    public Double getVy0() {
        return vy0;
    }

    public Double getAx() {
        return ax;
    }

    public Double getAy() {
        return ay;
    }

    public Double getT() {
        return t;
    }

    public Double setX(String s) {
        try {
            x = Double.parseDouble(s);
            return x;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setX0(String s) {
        try {
            x0 = Double.parseDouble(s);
            return x0;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setVX(String s) {
        try {
            vx = Double.parseDouble(s);
            return vx;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setVX0(String s) {
        try {
            vx0 = Double.parseDouble(s);
            return vx0;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setY(String s) {
        try {
            y = Double.parseDouble(s);
            return y;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setY0(String s) {
        try {
            y0 = Double.parseDouble(s);
            return y0;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setVY(String s) {
        try {
            vy = Double.parseDouble(s);
            return vy;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setVY0(String s) {
        try {
            vy0 = Double.parseDouble(s);
            return vy0;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setAX(String s) {
        try {
            ax = Double.parseDouble(s);
            return ax;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setAY(String s) {
        try {
            ay = Double.parseDouble(s);
            return ay;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Double setT(String s) {
        try {
            t = Double.parseDouble(s);
            if (t == 0.0) {
                return null;
            }
            return t;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
