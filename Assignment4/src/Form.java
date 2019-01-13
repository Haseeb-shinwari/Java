
import java.util.Scanner;




public class Form {

    public static Scanner itake=new Scanner(System.in);
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

       System.out.println("Enter your FirstName");
        String name=input.nextLine();
      
        System.out.println("Enter your LastName");
         String LastName=input.nextLine();
      
          
         System.out.println("The phone number should have a format like 000-000000-0 ");
         System.out.println("Enter your CNIC");
         String cnic=input.nextLine();

//          
        System.out.println("Enter your Phone Number");
        System.out.println(" format like 0-000-0000000 where the first digit is always a 0");
          double phoneNumber=itake.nextDouble();
  
//               

        System.out.println("Enter your Email Address");
        System.out.println("  The address should start with a number followed by one or two words (for example 16 Khyber or 16 Khyber Ave)");
          String address=itake.nextLine();
         
//              

//       
          System.out.println("Enter your Email Address");
          String emailAddress=itake.nextLine();
          
          System.out.println("ENTER Ok to Confirm OR AnyThing else to Cancel");
          String ok=input.nextLine();
          if(ok.contains("ok")){
          
          validate(name,LastName,cnic,phoneNumber,emailAddress,address);
          }else{
                      throw new IllegalArgumentException("You Cancel form  ");
          }
    } 
    
    
    
    public static void validate(String name,String LastName,String  cnic,double phoneNumber,String  emailAddress,String address){
              if(!ValidateInput.vaidateEmailAddress(emailAddress)){
            throw new IllegalArgumentException("Enter Valid  Email Address ");
              }
              
              
      if(!ValidateInput.validateFirstName(name)){
              
              throw new IllegalArgumentException("Enter Valid Name ");
          }           
         
      if(!ValidateInput.validateAddress(address)){
         throw new IllegalArgumentException("Enter Valid  Address ");
          }
         
          if(!ValidateInput.validatephoneNumber(name)){
              throw new IllegalArgumentException("Enter Valid Phone Number ");
          }
        
          if(!ValidateInput.CNIC(cnic)){
                    throw new IllegalArgumentException("Enter Valid cnic ");
          }
          
          if(!ValidateInput.validateLastName(LastName)){
                  throw new IllegalArgumentException("Enter Valid LastName ");
          }
    }

}
