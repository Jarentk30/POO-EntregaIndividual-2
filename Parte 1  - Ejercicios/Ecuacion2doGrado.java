/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swinglearning;

/**
 *
 * @author liont
 */
public class Ecuacion2doGrado {
    double A;  //Coeficiente de X^2
    double B;  //Coeficiente de X
    double C; //Termino Independiente
    public double FirstRoot(){
        return ((-B+Math.sqrt(Math.pow(B,2)-4*A*C))/ (2*A));
    }
    public double SecondRoot() {
        return ((-B-Math.sqrt(Math.pow(B,2)-4*A*C))/ (2*A));
    }
}
