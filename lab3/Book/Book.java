
package Book;


public class Book {
    
    private String bookTitle;
    private int bookIsbn;
    private int numberOfPages;
    private boolean onLoan;
   
   public  Book(String bookTitle ,int bookIsbn,int numberOfPages,boolean onLoan){
       
       this.bookIsbn=bookIsbn;
       this.bookTitle=bookTitle;
       this.numberOfPages=numberOfPages;
       this.onLoan=onLoan;
       
   }
    public int getBookIsbn() {
        return bookIsbn;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public boolean isOnloan(){
        
        return onLoan;
    }
    public void setOnLoan(boolean onLoan){
         this.onLoan=onLoan;
         
    }
    public String toString(){
        
    return  String.format(" Book title is %s :%n Book isbn Number is : %d%n Number of pages :%d%n Book is On Loan :%B ", bookTitle,bookIsbn,numberOfPages,onLoan);
    }
    
}
