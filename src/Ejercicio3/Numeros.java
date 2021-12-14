package Ejercicio3;

import javax.swing.*;

public class Numeros {

public void amosarSigno(){
    int numero;

    numero = Integer.parseInt(JOptionPane.showInputDialog(" número "));

    if ( numero > 0){
        JOptionPane.showMessageDialog(null, " + ");
    }
    else if ( numero <0){
        JOptionPane.showMessageDialog(null, " - ");
    }
    else if ( numero == 0){
        JOptionPane.showMessageDialog(null, " 0 ");
    }



}





}
