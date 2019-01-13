
import java.util.Scanner;

public class Test {
    
   public static Scanner itake=new Scanner(System.in);
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

         
       System.out.println("Select 1 for Student");    
        System.out.println("select 2 for Employee");
        
        int  option=input.nextInt();
      
         if(option==1){
         student();
         }
         if(option==2){
             employee();
             
         }else{
             System.out.println("Your Selection is out of Boundry  try Again");
         }
        
      
    }
    public static void student(){
        
       System.out.println("Enter your FirstName");
        String name=input.nextLine();
      
        System.out.println("Enter your LastName");
         String LastName=input.nextLine();
      
          
         System.out.println(" The phone number should have a format like 0-000-0000000 where the first digit is always a 0");
         System.out.println("Enter your phone number ");
         double phoneNumber=input.nextDouble();
  
//               

        System.out.println("Enter your Address");
        System.out.println("  The address should start with a number followed by one or two words (for example 16 Khyber or 16 Khyber Ave)");
          String address=itake.nextLine();
         
       System.out.println("Enter your statuc");
        System.out.println("  Either Junior or Senoir");
          String status=itake.nextLine();         

//       
          System.out.println("Enter your Email Address");
          String emailAddress=itake.nextLine();
          
          System.out.println("ENTER Ok to Confirm OR AnyThing else to Cancel");
          String ok=input.nextLine();
          if(ok.contains("ok")){
          
          validateStudent(name,LastName,phoneNumber,emailAddress,address,status);
          }else{
                      throw new IllegalArgumentException("You Cancel form  ");
          }
    }
    
    
            
    public static void   validateStudent(String name,String LastName,double phoneNumber, String emailAddress,String address, String status){
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
      if(!ValidateInput.validateLastName(LastName)){
                  throw new IllegalArgumentException("Enter Valid LastName ");
          }
    }
    
    
    
       public static void employee(){
        
       System.out.println("Enter your FirstName");
        String name=input.nextLine();
     
         System.out.println("Enter your LastName");
         String LastName=input.nextLine();
 
         System.out.println("Enter your salary");
         double salary=input.nextDouble();

//          
        System.out.println("Enter your Phone Number");
          System.out.println(" The phone number should have a format like 0-000-0000000 where the first digit is always a 0");
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
          
          validateEmployee(name,LastName,phoneNumber,emailAddress,address,salary);
          }else{
                      throw new IllegalArgumentException("You Cancel form  ");
          }
       }
    
          
          
          
  
    
    
    
    public static void validateEmployee(String name,String LastName,double phoneNumber,String  emailAddress,String address,double salary){

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
       if(!ValidateInput.validateLastName(LastName)){
                  throw new IllegalArgumentException("Enter Valid LastName ");
          }
         Date date1=new Date(12,3,2019);
        Employee emp1=new Employee(name,address,phoneNumber,emailAddress,salary,date1);
        System.out.println(emp1);

    }
  }

