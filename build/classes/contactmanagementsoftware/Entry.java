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
public class Entry implements State{
    
    MUI mg;
    
    public Entry(MUI mg){
        this.mg = mg;
    }

    @Override
    public void jButton1ActionPerformed(ActionEvent evt) {
        mg.addContact();
    }

    @Override
    public void jButton2ActionPerformed(ActionEvent evt) {
        mg.deleteContact();
    }

    @Override
    public void jButton5ActionPerformed(ActionEvent evt) {
        mg.editContact();
    }

    @Override
    public void jButton6ActionPerformed(ActionEvent evt) {
        mg.viewFullDetail();
    }
    
}
