/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackpot;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Yogi
 */
public class ButtonThread extends Thread{
    
    public ButtonThread(JButton button, Color color){
        this.button = button;
        this.color = color;
    }
    
    public void run(){
        try {
            
            button.setBackground(color);
            sleep(500);
            button.setBackground(new Color(240,240,240));
        } catch (InterruptedException ex) {
            Logger.getLogger(ButtonThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private JButton button;
    private Color color;
}
