
package Quiz_1;

public class Book extends Product {
            
    private String author;
    
    public  Book(Date date,String name ,double price,double percent,String author ){
        
        super(date,name,price,percent);
           this.author=author;
        }
    public void setAuthor(){
        this.author=author;
    }
    public String getAuthor(){
        
        return author;
        
    }
    public String toString(){
        
        return String.format("%s%n Author is :%s",super.toString(),getAuthor());
    }
}
