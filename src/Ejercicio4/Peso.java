package Ejercicio4;

import javax.swing.*;

public class Peso {

public void amosarPeso(){
    String nome1,nome2;
    float peso1, peso2;


    nome1 = JOptionPane.showInputDialog(" nombre de la primera persona ");
    peso1 = (float) Integer.parseInt(JOptionPane.showInputDialog(" peso de la primera persona"));

    nome2 = JOptionPane.showInputDialog(" nombre de la segunda persona ");
    peso2 = (float) Integer.parseInt(JOptionPane.showInputDialog(" peso de la segunda persona"));

    if ( peso1 > peso2){
        JOptionPane.showMessageDialog(null, "Datos de la persona que pesa más"+"\n"+" Nombre : " + nome1 + "\n" + " Peso : " + peso1 + "\n" + " Diferencia de peso : "+ peso1 +"-" + peso2 + "=" + (peso1-peso2));
    }
    else{
        JOptionPane.showMessageDialog(null,"Datos de la persona que pesa más"+"\n"+"Nombre : " + nome2 + "\n" + " Peso : " + peso2+ "\n" + " Diferencia de peso : "+ peso2 +"-" + peso1 + "=" + (peso2-peso1));
    }


}







}
