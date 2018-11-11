/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class Course {
    
   
   private String title;
   private int courseCode;
   
   public Course(String title,int code){
  
      
       this.title=title;
       this.courseCode=code;
       
}

   public void setTitle(String title){
       
       this.title=title;
       
   }
   public void setCourseCode(int  courseCode){
       
       this.courseCode=courseCode;
       
   }



    public int getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }
   
  
   public String toString(){
       
       return String.format(" %nCourse title is %s %n Course code is %s%n",title,courseCode);
       
   }
   
   
    
}
