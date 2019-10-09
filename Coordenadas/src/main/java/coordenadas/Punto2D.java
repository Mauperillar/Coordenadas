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
public class Punto2D {
    double x;
    double y;
    
    public Punto2D() {
    }
    
    public Punto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    
    
    public Punto2D(String p){
        String[] p2D = p.split(",");
        this.x = Double.valueOf(p2D[0]);
        this.y = Double.valueOf(p2D[1]);
    }
    
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    
    public void moveX(double dx){
        this.x = this.x + dx;
    }
    public void moveY(double dy){
        this.y = this.y + dy;
    }
    
    public void moveXY(double dx, double dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    public void moveXY(String dXY){
        String[] dp = dXY.split(",");
        this.x = this.x + Double.valueOf(dp[0]);
        this.y = this.y + Double.valueOf(dp[1]);
    }
    
    public double distancia(Punto2D p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double rta =    3;
        return rta;
    }
    
    
    
    
}
