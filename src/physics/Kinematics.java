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

    private static Double x, x0, y, y0, vx, vx0, vy, vy0, ax, ay, t;

    public Kinematics() {
        x = x0 = 0.0;
    }

    public void input(Double x, Double x0, Double y, Double y0) {

    }

    public static boolean setX(String s) {
        try {
            x = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setX0(String s) {
        try {
            x0 = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setVX(String s) {
        try {
            vx = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setVX0(String s) {
        try {
            vx0 = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setY(String s) {
        try {
            y = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setY0(String s) {
        try {
            y0 = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setVY(String s) {
        try {
            vy = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setVY0(String s) {
        try {
            vy0 = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setAX(String s) {
        try {
            ax = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setAY(String s) {
        try {
            ay = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean setT(String s) {
        try {
            t = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    

    public Double[] getCoords() {
        Double[] c = {x, x0, y, y0};
        return c;
    }
}
