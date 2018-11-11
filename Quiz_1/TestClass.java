
package Quiz_1;

//A test class that creates an array of Product variables to store references to various
//Product objects. Use a loop to display the content of each object. The sub classes’
//constructor should invoke the super class’s constructor and the sub classes’ toString
//method should invoke the super class’s toString method
public class TestClass {


    
    public static void main(String [] args){
             Date date1=new Date(7,8,2018);
    Apparel apparel=new Apparel(date1," Oop book ",2300,0.05,"winter collection",0.02);
    
    Product product1=new Product(date1," linear algebra by anthon",4000,0.010);
    
    Book book1=new Book(date1," Urdu poetry",5000,0.25," Iqbal "); 
        System.out.println(book1);
    }
    
}
