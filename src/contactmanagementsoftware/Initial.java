/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author fadzlyhusaini
 */
public class Initial implements State{
    
    MUI mg;
    
    public Initial(MUI mg){
        this.mg = mg;
    }

    @Override
    public void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select a category!");
    }

    @Override
    public void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select a category!");
    }
    
    @Override
    public void jButton5ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select a category!");
    }

    @Override
    public void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select a category!");
    }
    
}
