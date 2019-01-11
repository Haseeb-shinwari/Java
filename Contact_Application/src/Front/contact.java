
package Front;

public class contact {
  
    private Integer cid;
    private String firstName;
    private String lastName;
    private String group;
    private String phone;
    private String email;
    private String address;
    private int uid;
    public contact(){}

    public contact( Integer cid, String firstName, String lastName, String group, String phone, String email, String address, int uid) {
        this.cid = cid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
}
