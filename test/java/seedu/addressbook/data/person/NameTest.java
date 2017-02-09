package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {

    @Test
    public void testCreateNames() throws IllegalValueException {
        Name testName1 = new Name("Bob");
        assertTrue(testName1.toString().equals("Bob"));
        
        Name testName2 = new Name("Bob Smith");
        assertTrue(testName2.toString().equals("Bob Smith"));
    }
    
    @Test
    public void testIsSimilar() throws IllegalValueException {
        Name testName1 = new Name("Bob");
        Name testName2 = new Name("Bob");
        assertTrue(testName1.isSimilar(testName2));
    }

}
