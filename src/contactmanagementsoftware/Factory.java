/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author USER
 */
public class Factory {
    public Acquaintances createAc(String type){
        Acquaintances ac;
        
        if(type=="Casual")
            ac = new CasualAcquaintances();
        else if(type=="Personal")
            ac = new PersonalFriends();
        else if(type=="Professional")
            ac = new ProfessionalFriends();
        else
            ac = new Relatives();
        
        return ac;
            
    }
}
