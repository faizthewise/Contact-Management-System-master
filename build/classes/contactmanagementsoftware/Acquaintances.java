package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Acquaintances implements Serializable{
    private String Name;
    private String MobileNo;
    private String Email;
    public static int number = 0;
    
    Acquaintances(){
        number++;
    }
    
    //TEMPLATE METHOD START
    final void newAcquaintances(String name,String email,String mobile,String firstExtra, String secondExtra, String thirdExtra){
        setName(name);
        setEmail(email);
        setMobileNo(mobile);
        
        if(checkExtra()>0)
            setFirstExtra(firstExtra);
        if(checkExtra()>1)
            setSecondExtra(secondExtra);
        
        if(checkExtra()>2)
            setThirdExtra(thirdExtra);
        
    }
    //TEMPLATE METHOD END
        
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Scanner reader = new Scanner(System.in);
        if(!name.isEmpty())
          this.Name = name;
        else{
            System.out.println("Enter atleast one character");
            setName(reader.nextLine());
        }
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public String getEmail() {
        return Email;
    }
    
    public boolean MobileNoChecker(String str)
    {
        int x;
        for(int j = 0 ; j < str.length() ; j++)
        {
            x = (int)str.charAt(j);
            if( x < 48 || x > 57 )
            return false;    
        }
        return true;
    }
    
    
    public void setMobileNo(String MobileNo){
        Scanner reader = new Scanner(System.in);
        if(MobileNoChecker(MobileNo) && MobileNo.length()>=6 && MobileNo.length()<=15)
            this.MobileNo = MobileNo;
        else{
            System.out.print("Enter a valid Mobile No of length between 6 and 15 (inclusive): ");
            setMobileNo(reader.next());
        }
    }
    
    public void setEmail(String Email){
        Scanner reader = new Scanner(System.in);
        if(Email.contains("@"))
            this.Email = Email;
        else{
            System.out.print("Enter a valid Email: ");
            this.setEmail(reader.next());
        }
    }
    
    //TEMPLATE METHOD START
    abstract String getFirstExtra();
    abstract String getSecondExtra();
    abstract String getThirdExtra();
    abstract void setFirstExtra(String firstExtra);
    abstract void setSecondExtra(String secondExtra);
    abstract void setThirdExtra(String thirdExtra);
    abstract int checkExtra();
    //TEMPLATE METHOD END
}
