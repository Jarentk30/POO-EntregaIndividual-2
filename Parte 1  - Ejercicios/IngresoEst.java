package swinglearning;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liont
 */
public class IngresoEst {
    int Num;
    String Nombre;
    int Patrimonio;
    int Est;
    public String CalculoMatricula(){
        if(Patrimonio > 2000000 && Est > 3){
           double matricula = 50000 + Patrimonio * 0.03;
           return String.valueOf(matricula);
       }else{
           double matricula = 50000 + Patrimonio * 0.03;
           return String.valueOf(matricula);
       }
    }
}
