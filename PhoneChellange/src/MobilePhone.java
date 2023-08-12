
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0){
            myContact.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newConact)  {
       int pogistion = findContact(oldContact);
       if (pogistion < 0) {
           System.out.println("Cannot find number");
           return false;
       } else {
           myContact.set(pogistion,newConact);
           System.out.println(newConact.getName() + "    add to the list");
           return true;
       }

    }

    public boolean removeContact(Contact contact){
        int pogistion = findContact(contact);
        if (pogistion > 0) {
            myContact.remove(pogistion);
            System.out.println(contact.getName() + " Contact removed");
            return true;
        }else {
            System.out.println(contact.getName() + " cannot find contact");
            return false;
        }
    }

    public int findContact(Contact contact) {
        return (myContact.contains(contact) ? myContact.indexOf(contact) : -1);
    }

    public int findContact(String name){
       for (Contact contact :myContact) {
           if (contact.getName().equals(name)) {
               return myContact.indexOf(contact);
           }
       }
       return -1;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        return (position < 0 ? null : myContact.get(position));
    }

    public void printContacts(){
        System.out.println("Contact List");
        for (Contact el : myContact){
            System.out.println((myContact.indexOf(el)+1)+ ". " + el.getName() + " -> "+ el.getPhoneNumber());
        }

    }

}
