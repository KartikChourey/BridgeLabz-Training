package addressbooksystem;

import java.util.*;

class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact 
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("❌ Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("✅ Contact added successfully.");
    }

    // Edit Contact
    public void editContact(String name, String phone, String email) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(phone);
                c.setEmail(email);
                System.out.println("✅ Contact updated.");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    // Delete Contact
    public void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getFullName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("✅ Contact deleted.");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    // Search by City or State
    public void searchByLocation(String location) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(location) ||
                c.getAddress().getState().equalsIgnoreCase(location)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found)
            System.out.println("❌ No contacts found.");
    }

    // Display Sorted Contacts
    public void displayAll() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        System.out.println("\n📒 Address Book:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
