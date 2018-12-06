package liz;

import javax.swing.*;

public class JavaEvening2 {
    public static void main(String[] args) {
        String num1,num2;
        Double num1Con,num2Con,Answer;
        num1 = JOptionPane.showInputDialog("Enter First Number");
        num2 = JOptionPane.showInputDialog("Enter Second Number");
        num1Con = Double.parseDouble(num1);
        num2Con = Double.parseDouble(num2);
        Answer = num1Con*num2Con;
        JOptionPane.showMessageDialog(null,"Your Product is "+Answer);
    }
}
