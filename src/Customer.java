public class Customer {
    public String name;
    private String contactInfo;
    private int customerId;
    private int toDo;

    public Customer(){

    }

    public Customer(String name, String contactInfo,int customerId){
        this.name = name;
        this.contactInfo = contactInfo;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerIdentity(int customerId) {
        this.customerId = customerId;
    }

    public int getToDo() {
        return toDo;
    }

    public void setToDo(int toDo) {
        this.toDo = toDo;
    }
}
