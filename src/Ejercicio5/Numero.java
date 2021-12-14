package Ejercicio5;

import javax.swing.*;

public class Numero {

    public void amosarNumeros(){
        int num1,num2,num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" numero 2"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(" numero 3"));

        if (num1 > num2 & num1 > num3){
            JOptionPane.showMessageDialog(null, " El número mayor entre los tres números es : " + num1);

        }
        else if ( num2 > num1 & num2 > num3){
            JOptionPane.showMessageDialog(null, " El número mayor entre los tres números es : " + num2);
        }
        else if ( num3 > num1 & num3 > num2){
            JOptionPane.showMessageDialog(null, " El número mayor entre los tres números es : " + num3);
        }



    }







}
