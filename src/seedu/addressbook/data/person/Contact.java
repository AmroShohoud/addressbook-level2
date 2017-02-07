package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents contact information of Person
 * Super-class of Email, Phone, Address
 */

public class Contact {

    public String value;
    private boolean isPrivate;

    public Contact(boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isPrivate() {
        return isPrivate;
    }
    
}
