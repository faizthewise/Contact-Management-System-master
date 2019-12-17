package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class ProfessionalFriends extends Acquaintances implements Serializable{
    
    private String CommonInterests;
    public static int numberProF = 0;
    
    ProfessionalFriends(){
        numberProF++;
    }
    
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String Name) {
        super.setName(Name); 
    }

    @Override
    public String getMobileNo() {
        return super.getMobileNo();
    }

    @Override
    public void setMobileNo(String MobileNo) {
        super.setMobileNo(MobileNo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String Email) {
        super.setEmail(Email);
    }

    @Override
    public String getFirstExtra() {
        return CommonInterests;
    }

    @Override
    public void setFirstExtra(String CommonInterests) {
        Scanner reader = new Scanner(System.in);
        if(!CommonInterests.isEmpty())
            this.CommonInterests = CommonInterests;
        else{
            System.out.println("Enter at least one character");
            setFirstExtra(reader.nextLine());
        }
    }
    
    @Override
    public String getSecondExtra(){
        return null;
    }
    
    @Override
    public void setSecondExtra(String n){
        //No Implementation
    }
    
    @Override
     public String getThirdExtra(){
        return null;
    }
     
    @Override
     public void setThirdExtra(String n){
        throw new UnsupportedOperationException("Not implemented");
    }
     
     //TEMPLATE METHOD
    @Override
     int checkExtra(){
         return 1;
     }


}
