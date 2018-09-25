/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman;

import javax.swing.JOptionPane;

/**
 *
 * @author conas1290
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String guess = JOptionPane.showInputDialog("Number of guesses remaining");
    String ans[][] = new String[3][3];
    ans[0][0] = "Games";
    ans[1][0] = "bob";
    ans[2][0] = "bob"; 
    ans[0][1] = "Countries";
    ans[0][2] = "Free Real Estate";       
    ans[1][1] = "bob";      
    ans[2][1] = "bob"; 
    ans[1][2] = "bob"; 
    ans[2][2] = "bob"; 
     for(int i = 0; i < ans.length; i++){
      for(int j = 0; j < ans[i].length; j++){
        System.out.print("[" + ans[i][j] + "]");
   }
     System.out.print("\n");
  }   
 }
}
