package seedu.addressbook.data.tag;
import seedu.addressbook.data.person.Person;

/**
 * Represents an addition or deletion of a tag to a Person
 */

public class Tagging {

    Person person;
    Tag tag;
    boolean added;
    
    Tagging(Person person, Tag tag, boolean added) {
        this.person = person;
        this.tag = tag;
        this.added = added;
    }
    
    public String getPrintableTagString() {
        String printableTag = "";
        if (added) {
            printableTag += "+ ";
        }
        else {
            printableTag += "- ";
        }
        printableTag += person.getName() + " ";
        printableTag += tag.toString();
        return printableTag;
    }
}
