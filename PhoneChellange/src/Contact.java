public class Contact {
    private String name;
    private String PhoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public Contact createContact(String name,String phoneNumber){
      return new Contact(name,PhoneNumber);
    }
}
