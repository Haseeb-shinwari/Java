
package TrafficLight;

public class TestTrafficLight {

  public static void main(String [] args ){
       
      for(TrafficLight traffic1:TrafficLight.values()){
          
          System.out.println(traffic1.getDescription()+traffic1.getTime());
      
      }
      
  }
    
}
