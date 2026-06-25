import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        AddressBookSystem system = new AddressBookSystem();
 
        while (true) {

            System.out.println("\n1.Add Contact");
            System.out.println("2.Display");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Add Address Book");
            System.out.println("6.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    char c;

                    do {

                        System.out.println("Enter First Name:");
                        String firstName = sc.nextLine();

                        System.out.println("Enter Last Name:");
                        String lastName = sc.nextLine();

                        System.out.println("Enter Address:");
                        String address = sc.nextLine();

                        System.out.println("Enter City:");
                        String city = sc.nextLine();

                        System.out.println("Enter State:");
                        String state = sc.nextLine();

                        System.out.println("Enter Zip:");
                        String zip = sc.nextLine();

                        System.out.println("Enter Phone:");
                        String phone = sc.nextLine();

                        System.out.println("Enter Email:");
                        String email = sc.nextLine();

                        Contact contact =
                                new Contact(
                                        firstName,
                                        lastName,
                                        address,
                                        city,
                                        state,
                                        zip,
                                        phone,
                                        email);

                        addressBook.addContact(contact);

                        System.out.println(
                                "Add Another Contact? (y/n)");

                        c = sc.next().charAt(0);
                        sc.nextLine();

                    } while (c == 'y' || c == 'Y');

                    break;

                case 2:

                    addressBook.displayContacts();

                    break;

                case 3:

                    System.out.println(
                            "Enter first name:");

                    String editName = sc.nextLine();

                    addressBook.editContact(editName, sc);

                    break;

                case 4:

                    System.out.println(
                            "Enter first name:");

                    String deleteName = sc.nextLine();

                    addressBook.deleteContact(deleteName,sc);

                    break;

                case 5:

                    System.out.println(
                            "Enter Address Book Name:");

                    String bookName = sc.nextLine();

                    system.addAddressBook(
                            bookName,
                            addressBook);
                            system.displayAddressBooks();

                    break;

                case 6:

                    System.out.println("Exiting...");

                    System.exit(0);

                default:

                    System.out.println(
                            "Invalid Choice.");
            }
        }
    }
}