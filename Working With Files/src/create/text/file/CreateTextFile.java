
package create.text.file;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import account.record.AccountRecord;


public class CreateTextFile {
//    Formatter is class
    private Formatter output; //object used to output text to file
    
    public void openFile()
    {
        try
        {
            output = new Formatter( "clients.txt" ); //open the file
        }
        catch(SecurityException securityException)
        {
            System.err.println("You do not have write access to this file");
            System.exit(1);//terminate the program
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening or creating file");
            System.exit(1);
        }
    }
    
    public void addRecords()
    {
        AccountRecord record = new AccountRecord();
        Scanner input = new Scanner(System.in);
        // input.next() used to read only word x and than write 
    //        input.nextLine() used to read full line and than write
    
    System.out.printf("%s\n%s\n%s\n%s\n\n", 
                "To terminate input, type the end-of-file indicator ",
                "when you are prompted to enter input.",
                "",
                "On Windows, type <ctrl> z then press enter ");
        System.out.printf("%s\n%s", "Enter account number ( > 0 ), first name, last name, and balance", "?");
        // loop until file contain next word
//         jab tak user value input karta rahay tab tak execute hotay roha
//   user koe be value input karsakta hay 

        while(input.hasNext()) //loop until end of file indicator
        {
            try
            {
                //retrieve data to be output
                record.setAccount(input.nextInt());//read account number
                record.setFirstName(input.next());
                record.setLastName(input.next());//read last name
                record.setBalance(input.nextDouble());
                
                if(record.getAccount() > 0)
                {
                    //write new record
                    output.format("%d %s %s %.2f\n", record.getAccount(),record.getFirstName(),
                            record.getLastName(),record.getBalance());
                }//end if
                else
                {
                    System.out.println("Account number must be greater than zero");
                }//end else
            }//end try
            catch(FormatterClosedException formatterClosedException)
            {
                System.err.println("Error writing to file");
                return;
            }
            catch(NoSuchElementException elementException)
            {
                System.err.println("Invalid input, please try again");
                input.nextLine();
            }
            System.out.printf("%s %s\n%s", "Enter acount number ( > 0 ), ", 
                    "first name, last name and balance.", "? ");
        }
    }
    public void closeFile()
    {
        if(output != null)
        {
            output.close();
        }
    }
}
