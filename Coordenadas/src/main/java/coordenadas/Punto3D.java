/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/**
 *
 * @author mauri
 */
public class Punto3D extends Punto2D {
    private double z;
    
    public Punto3D(){
    }
    
    public Punto3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Punto3D(String p){
        String[] p3D = p.split(",");
        this.x = Double.valueOf(p3D[0]);
        this.y = Double.valueOf(p3D[1]);
        this.z = Double.valueOf(p3D[2]);
    }
    
    
    
    
  
    
}
