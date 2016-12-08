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
    private Double x, x0, y, y0, v, v0, a, t;
    public void input(Double x, Double x0, Double y, Double y0){
        
    }
    public void setX(Object o){
       
   }
    public void setX(Integer i){
       x=i+0.0;
    }
    public Double[] getCoords(){
        Double[] c = {x,x0,y,y0};
        return c;
    }
}
