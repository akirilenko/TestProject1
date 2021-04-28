package persons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Person {
    private String firstName, middleName, lastName, email;
    List pets = new ArrayList();
    List<FamilyMember> familyMembers = new ArrayList();

    Logger logger = Logger.getLogger(Person.class.getName());

    public Person() {
        logger.info("An empty person created");
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        logger.info("person created: " + this.toString());
    }

    public Person(String firstName, String middleName, String lastName, String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;

        logger.info("person created: " + this.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Person information: Name: " + this.firstName + ", Middle Name: " + this.middleName
                + ", LastName: " + this.lastName + ", email: " + this.email;
    }

    public void addPet(String pet) {
        boolean petAllowed = false;
        for (Object element : PetsList.values()) {
            if (element.toString().equals(pet.toUpperCase())) petAllowed = true;
        }
        if (petAllowed) {
            this.pets.add(pet.toUpperCase());
        } else {
            System.out.println("Ped: " + pet.toString() + " does not allowed to person:"
                    + this.lastName + " " + this.firstName + " " + this.middleName);
        }


    }

    public void addFamilyMember(FamilyMember familyMember) {
        for (FamilyMember member : this.familyMembers) {
            if (member.equals(familyMember)) System.out.println("familyMember already exists");
            return;
        }
        this.familyMembers.add(familyMember);
    }

    public int countFamilyMembersByType(String type) {
        int memberCount = 0;
        for (FamilyMember member : this.familyMembers) {
            if (member.getRelationshipType().equals(type)) {
                memberCount++;
            }
        }
        return memberCount;
    }

    public   void setUpFileLogger() {
        try {
            logger = Logger.getAnonymousLogger();
            FileHandler handler = new FileHandler("julLog.log");
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            logger.setLevel(Level.ALL);
            handler.setLevel(Level.FINE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
