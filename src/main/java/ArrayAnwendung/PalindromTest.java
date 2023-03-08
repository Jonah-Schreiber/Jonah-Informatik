package ArrayAnwendung;

import javax.swing.*;
import java.util.*;

public class PalindromTest {

    public static void main(String[] args){
        new PalindromTest();
    }
    String input;

    public PalindromTest(){
        input = JOptionPane.showInputDialog("Gib zu prüfenden Text ein:");

        palindromCheck(input);
    }
    public void palindromCheck(String checkTest){
       StringBuilder output = new StringBuilder();
       for (int i = checkTest.length(); i > 0; i--){
           if(checkTest.charAt(i-1) == ' '){}
           else {
               output.append(checkTest.charAt(i - 1));
           }
        }
       System.out.println(output);
       if (output.toString().equalsIgnoreCase(input)){
           JOptionPane.showMessageDialog(null, "Palindrom");
       }
       else{
           JOptionPane.showMessageDialog(null, "kein Palindrom");
       }
    }
}
