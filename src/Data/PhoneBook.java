package Data;

import java.util.HashMap;
import java.util.Objects;

public class PhoneBook {

    public HashMap<String, String> phonebook;

    public PhoneBook(HashMap<String, String> phonebook) {
        this.phonebook = phonebook;
    }

    public HashMap<String, String> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(HashMap<String, String> phonebook) {
        this.phonebook = phonebook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneBook)) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return phonebook.equals(phoneBook.phonebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonebook);
    }

    @Override
    public String toString() {
        return
                "phonebook=" + phonebook + '\n'+
                '}';
    }
}
