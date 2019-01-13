
public class Student extends Person {
private String status;

    public Student(String name,String address,double phoneNumber,String emailAddress,String status) {
      super(name,address,phoneNumber,emailAddress);
      this.status=status;
      
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n", super.toString(),getStatus()) ;
    }



}
