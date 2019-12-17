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
public class Category implements State{
    
    MUI mg;
    
    public Category(MUI mg){
        this.mg = mg;
    }

    @Override
    public void jButton1ActionPerformed(ActionEvent evt) {
        mg.addContact();
    }

    @Override
    public void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select an entry!");
    }

    @Override
    public void jButton5ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select an entry!");
    }

    @Override
    public void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(mg, "Select an entry!");
    }
    
}
