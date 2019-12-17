package contactmanagementsoftware;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonalFriends extends Acquaintances implements Serializable{
    private String AContext;
    private String ADate;
    private String Events;
    private static Scanner reader = new Scanner(System.in);
    public static int numberPerF = 0;
    
    PersonalFriends(){
        numberPerF++;
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
        return Events;
    }

    @Override
    public void setFirstExtra(String Events) {
        Scanner reader = new Scanner(System.in);
        if(!Events.isEmpty())
            this.Events = Events;
        else{
            System.out.println("Enter at least one character");
            setSecondExtra(reader.nextLine());
        }
    }
    
    @Override
    public String getSecondExtra() {
        return AContext;
        
    }
    @Override
    public void setSecondExtra(String AContext) {
        Scanner reader = new Scanner(System.in);
        if(!AContext.isEmpty())
            this.AContext = AContext;
        else{
            System.out.println("Enter at least one character");
            setSecondExtra(reader.nextLine());
        }
    }

    @Override
    public String getThirdExtra() {
        return ADate;
    }

    @Override
    public void setThirdExtra(String ADate) {
        this.ADate = ADate;
    }
    
    //TEMPLATE METHOD
    @Override
     int checkExtra(){
         return 3;
     }

  
}
