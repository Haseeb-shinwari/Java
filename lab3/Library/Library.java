/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author haseeb
 */
public class Library {

private String libraryName;
private int libraryPhoneNumber;
private String booksCollections;

public Library(String libraryName ,int libraryPhoneNumber){
    this.libraryName=libraryName;
    this.libraryPhoneNumber=libraryPhoneNumber;
    System.out.println(this);
}

    public String getLibraryName() {
        return libraryName;
    }

    public int  getLibraryPhoneNumber() {
        return libraryPhoneNumber;
    }

    public void setLibraryPhoneNumber(int libraryPhoneNumber) {
        this.libraryPhoneNumber = libraryPhoneNumber;
    }
    
    public void addBook(String book){
    this.booksCollections=book;
    
    }
//    public void contains(String nameOfBook){
//        
//        
//    }
    
    public String toString(){
        
        return String.format("Name of Library is : %s%n Library Phone Number is %d %n Book Collections: %s%n", libraryName,libraryPhoneNumber,booksCollections);
    }
}
