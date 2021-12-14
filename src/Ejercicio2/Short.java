package Ejercicio2;

import javax.swing.*;

public class Short {

    public void amosarCalculos(){

        short num1, num2;

        num1 = (short) Integer.parseInt(JOptionPane.showInputDialog(" numero 1 "));
        num2 = (short) Integer.parseInt(JOptionPane.showInputDialog(" numero 2 "));

        if ( num1 >= num2){
            JOptionPane.showMessageDialog(null, " a resta entre " + num1 + " e " + num2 + " e igual a " + (num1 - num2) + "\n" + " ademas, la suma es igual a " + (num1 + num2));

        }
        else
            JOptionPane.showMessageDialog(null," a suma entre " + num1 + " e " + num2 + " e igual a " + (num1 + num2) );



    }

}
