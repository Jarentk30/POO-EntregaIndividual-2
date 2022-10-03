package swinglearning;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liont
 */
public class Empleado {
    String Nombre;
    int    PrecioHora;
    int    HorasTrabajadasMes;
    public String Salary(){
        int SalarioBruto = PrecioHora * HorasTrabajadasMes;
        if (SalarioBruto>450000){
            return ("El salario del empleado "  + Nombre +  " es $" + String.valueOf(SalarioBruto));
        } else { return ("El nombre del empleado es: "+Nombre);}
    } 
}
