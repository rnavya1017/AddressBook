import java.util.HashMap;

public class AddressBookSystem {

    private HashMap<String, AddressBook> addressBooks =
            new HashMap<>();

    public void addAddressBook(String name,
                               AddressBook addressBook) {

        addressBooks.put(name, addressBook);

        System.out.println(
                "Address Book Added Successfully.");
    }

    public void displayAddressBooks() {

        for(String name : addressBooks.keySet()) {

            System.out.println(
                    "Address Book Name: " + name);

            addressBooks.get(name)
                        .displayContacts();
        }
    }
}