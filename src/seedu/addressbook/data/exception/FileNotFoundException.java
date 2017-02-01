package seedu.addressbook.data.exception;

/**
 * Signals that storage file could not be found.
 */

public class FileNotFoundException extends Exception  {

    public FileNotFoundException(String message) {
        super(message);
    }
}
