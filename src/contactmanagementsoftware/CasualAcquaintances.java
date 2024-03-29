package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class CasualAcquaintances extends Acquaintances implements Serializable{
    private String WhenWhere;
    private String Circumstances;
    private String OtherInfo;
    public static int numberCA = 0;
    
    CasualAcquaintances(){
        numberCA++;
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
        return WhenWhere;
    }
    
    @Override

    public void setFirstExtra(String WhenWhere) {
        Scanner reader = new Scanner(System.in);
        if(!WhenWhere.isEmpty())
            this.WhenWhere = WhenWhere;
        else{
            System.out.println("Enter atleast one character");
            setFirstExtra(reader.nextLine());
        }
    }
    
    @Override
    public String getSecondExtra() {
        return Circumstances;
    }
    
    @Override
    public void setSecondExtra(String Circumstances) {
        Scanner reader = new Scanner(System.in);
        if(!Circumstances.isEmpty())
            this.Circumstances = Circumstances;
        else{
            System.out.println("Enter atleast one character");
            setSecondExtra(reader.nextLine());
        }
    }

    @Override
    public String getThirdExtra() {
        return OtherInfo;
    }
    
    @Override
    public void setThirdExtra(String OtherInfo) {
        Scanner reader = new Scanner(System.in);
        if(!OtherInfo.isEmpty())
            this.OtherInfo = OtherInfo;
        else{
            System.out.println("Enter atleast one character");
            setThirdExtra(reader.nextLine());
        }
    }
    
    //TEMPLATE METHOD
    @Override
     int checkExtra(){
         return 3;
     }
}
