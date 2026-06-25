 import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact Added Successfully.");
    }

    public void displayContacts() {

        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
}