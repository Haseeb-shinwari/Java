
package Animal;


public class AnimalTest {

    public static void main(String [] args){
   Bird bird1=new Bird();
   Fish fish1=new Fish();
   Frog frog1=new Frog();
   
   Animal[] animal=new Animal[3];
      
   animal[0]=bird1;
   animal[1]=fish1;
   animal[2]=frog1;
   
   for(Animal currentAnimal:animal){
            
       if( currentAnimal instanceof Bird ){
           
           // downcasting
           Bird currentBird=(Bird) currentAnimal;
           
           System.out.println(currentBird.move()+" i can fly ");
           
       }
       if(currentAnimal instanceof Fish){
           //downcasting
           Fish currentFish=(Fish) currentAnimal;
         System.out.println(currentFish.move()+" i can swim ");
           
       }
       
       if(currentAnimal instanceof Frog){
            //downcasting    
           Frog currentFrog=(Frog) currentAnimal;
           System.out.println(currentFrog.move()+" i can jump ");
       }
       
       
   }
   
   
    }
  
}
