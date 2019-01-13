
public class ValidateInput {

    public static boolean validateFirstName(String firstname){
        
        return firstname.matches("[A-Z][a-zA-Z]");
        
    }
    public static boolean validateLastName(String lastName){
//        * hobesakta hay nahi be hosakta 
        return lastName.matches("[a-zA-Z+(['-][a-zA-Z])+)*");
        
    }

    public static boolean validateCity(String city){
        
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
        
    }
    public static boolean validateState(String state){
        
        return state.matches("([a-zA-Z]+| [a-zA-Z]+\\s[a-zA-Z]+)");
        
    }
    
    public static boolean validateZip(String zip){
        return zip.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
        
    }
     public static boolean validateName(String name){
//        A to Z or a to z and the first letter is always a capital letter
//  and Size from 1 to 14 user can input any character 
        return name.matches("[A-Z][a-zA-Z]{1,14}");
    }
    public static boolean validateAddress(String address){
//        The address should start with a number followed by one or two words (for example 16 Khyber or 16 Khyber Ave).
        return address.matches("[1-9]\\d{2}\\s[a-zA-Z]\\s[a-zA-Z]");
    }
    public static boolean validatephoneNumber(String phoneNumber){

        return phoneNumber.matches("^[0]\\d-[0-9]\\d{3}-[0-9]\\{7}");
        
        
    }
        public static boolean CNIC(String cnic){
//        CNIC  should have a format like 0-000-0000000 where the first digit is always a 0
        return cnic.matches("[0-9]\\d{4}-[0-9]\\d{6}-[0-9]\\d{1}");
        
        
        
    }
    public static boolean vaidateEmailAddress(String email){
   
        return email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    }
    
    
}
