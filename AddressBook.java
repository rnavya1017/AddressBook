import java.util.ArrayList;
import java.util.Scanner;

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

    
    public void editContact(String editFirstName,Scanner sc) {
        sc=new Scanner(System.in);
         for (Contact contact : contactList) {

            if (contact.getFirstName().equalsIgnoreCase(editFirstName)) {

                System.out.println("Enter New Address:");
                contact.setAddress(sc.nextLine());

                System.out.println("Enter New City:");
                contact.setCity(sc.nextLine());

                System.out.println("Enter New State:");
                contact.setState(sc.nextLine());

                System.out.println("Enter New Zip:");
                contact.setZip(sc.nextLine());

                System.out.println("Enter New Phone Number:");
                contact.setPhoneNumber(sc.nextLine());

                System.out.println("Enter New Email:");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact Updated Successfully.");
                return;
            }
        }
        System.out.println("Contact with first name " + editFirstName + " not found.");
    }
}