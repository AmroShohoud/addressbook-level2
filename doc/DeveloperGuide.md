# Developer Guide

## Setting up

**Prerequisites**

* JDK 8 or later 
* Eclipse IDE

**Importing the project into Eclipse**

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

### System tests

**Windows**

1. Open a DOS window in the `test` folder
2. Run the `runtests.bat` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

**Mac/Unix/Linux**

1. Open a terminal window in the `test` folder
2. Run the `runtests.sh` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

### JUnit tests

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

### Troubleshooting test failures

* Problem: How do I examine the exact differences between `actual.txt` and `expected.txt`?<br>
  Solution: You can use a diff/merge tool with a GUI e.g. WinMerge (on Windows)
* Problem: The two files look exactly the same, but the test script reports they are different.<br>
  Solution: This can happen because the line endings used by Windows is different from Unix-based
  OSes. Convert the actual.txt to the format used by your OS using some [utility](https://kb.iu.edu/d/acux).
* Problem: Test fails during the very first time.<br>
  Solution: The output of the very first test run could be slightly different because the program
  creates a new storage file. Tests should pass from the 2nd run onwards.

### User stories
As a professor, I can create groups of people, so that I can group students from each class together.
As a professor, I can modify all the members of a group, so that I can make changes to all students in a class.
As a student, I can modify the tags of People in my address book.

### Use case
System: Address Book
Use Case: Rename existing tag
Actor: User
Preconditions: User has created a tag and assigned it to one ore more entries.
Guarantees: All instances of the original tag name will be changed to the new tag name.
MSS:
	1. User requests to change tag.
	2. User inputs original tag name and new tag name.
	3. Address Book requests for confirmation.
	4. User confirms tag change.
	5. Address Book displays confirmation message along with all changed entries.
		Use case ends.
Extensions:
	2a. Address Book does not recognize original tag name.
		2a1. Address Book notifies user that tag name does not exist and requests correct tag name.
		2a2. User enters correct tag name and new tag name.
	Steps 2a1‐2a2 are repeated until the data entered are correct.
	Use case resumes from step 3.
	4a. User declines tag change.
		4a1. Address Book cancels tag change and notifies user.
	Use case ends.