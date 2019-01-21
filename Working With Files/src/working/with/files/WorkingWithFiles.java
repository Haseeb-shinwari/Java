
package working.with.files;
import java.io.File;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) {
    
         Scanner input = new Scanner(System.in);
         System.out.println("Enter file or directory name: ");
         analyzePath(input.nextLine());
    
    }
    
    public static void analyzePath(String path){
        //create file object based on user input
        File name = new File(path);
        
        if(name.exists())
        {
            //display the information about the directory or file
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", 
                    name.getName(), " exists", 
                    (name.isFile()? "is a file" : "is not a file"),
                    (name.isDirectory()? "is a Directory" : "is not a Directory"),
                    (name.isAbsolute()? "is absolute path" : "is not absolute path"),
                    "Last Modified: ", name.lastModified(), "Length: ", name.length(), 
                    "Path: ", name.getPath(), "Absolute path: ", name.getAbsolutePath(), "Parent: ", name.getParent());
            
            if(name.isDirectory())//output directory listing
            {
                String[] directory = name.list();
                
                System.out.println("\n\nDirectory contents:\n");
                
                for(String directoryName : directory)
                    System.out.println(directoryName);
            }
        }
        else
        {
            System.out.printf("%s%s", path, "does not exist.");
        }
    }
    
}
