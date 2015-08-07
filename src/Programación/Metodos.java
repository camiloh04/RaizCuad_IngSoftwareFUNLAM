/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Programación;

import javax.swing.JOptionPane;

/**
 *
 * @author nn
 */

public class Metodos {
    
    public String calculaRaiz(double numero){
             String resultado=" ";
             if(numero>=0){
                double numero2 =Math.sqrt(numero);
                resultado= String.valueOf(numero2);
                System.out.print("El resultado es"+resultado);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a cero por favor");
            }
             return resultado;
    }
    
}
