/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swinglearning;

/**
 *
 * @author liont
 */
public class EmpleadoEjercicio18 {
    String Code;
    String Nombres;
    int HorasTrabajadas;
    int ValorHora;
    int PorcentajeRetencion;
    public int SalarioBruto(){
        return HorasTrabajadas * ValorHora;
    }
    public int SalarioNeto(){
        int S = SalarioBruto();
        return S - S * (PorcentajeRetencion/100);
    }
    
}
