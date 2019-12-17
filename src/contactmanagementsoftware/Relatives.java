package contactmanagementsoftware;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Relatives extends Acquaintances implements Serializable{
    private String BDate;
    private String LDate;
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    
    Relatives(){
        numberRel++;
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
        return BDate;
    }

    @Override
    public void setFirstExtra(String BDate) {
        this.BDate = BDate;
    }

    @Override
    public String getSecondExtra() {
        return LDate;
    }

    @Override
    public void setSecondExtra(String LDate) {
        this.LDate = LDate;
    }

    @Override
    String getThirdExtra() {
        return null;
    }

    @Override
    void setThirdExtra(String thirdExtra) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
     //TEMPLATE METHOD
    @Override
     int checkExtra(){
         return 2;
     }
    
}
