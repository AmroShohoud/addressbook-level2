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
        
        Name testName3 = new Name("Bob Smith");
        Name testName4 = new Name("Bob Smith");
        assertTrue(testName3.isSimilar(testName4));
        
        Name testName5 = new Name("Bob Robert Smith III");
        Name testName6 = new Name("Bob Robert Smith III");
        assertTrue(testName5.isSimilar(testName6));
        
        Name testName7 = new Name("Bob");
        Name testName8 = new Name("Bobby Smith");
        assertTrue(testName7.isSimilar(testName8));
        
        Name testName9 = new Name("Bob");
        Name testName10 = new Name("Bob Smith");
        assertTrue(testName9.isSimilar(testName10));
        
        Name testName11 = new Name("Bob Robert");
        Name testName12 = new Name("Bob Smith");
        assertTrue(testName11.isSimilar(testName12));
        
        Name testName13 = new Name("Bob Smith");
        Name testName14 = new Name("Smith Robert");
        assertTrue(testName13.isSimilar(testName14));
        
        Name testName15 = new Name("Bob");
        Name testName16 = new Name("Rob");
        assertFalse(testName15.isSimilar(testName16));
        
        Name testName17 = new Name("Bob Robert");
        Name testName18 = new Name("John Robin");
        assertFalse(testName17.isSimilar(testName18));
    }

}