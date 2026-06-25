import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        while (true) {

            System.out.println("\n1.Add Contact");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("First Name:");
                    String first = sc.nextLine();

                    System.out.println("Last Name:");
                    String last = sc.nextLine();

                    System.out.println("Address:");
                    String address = sc.nextLine();

                    System.out.println("City:");
                    String city = sc.nextLine();

                    System.out.println("State:");
                    String state = sc.nextLine();

                    System.out.println("Zip:");
                    String zip = sc.nextLine();

                    System.out.println("Phone:");
                    String phone = sc.nextLine();

                    System.out.println("Email:");
                    String email = sc.nextLine();

                    Contact c = new Contact(
                            first, last,
                            address, city,
                            state, zip,
                            phone, email);

                    addressBook.addContact(c);

                    break;

                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    }
        }
    }
} 