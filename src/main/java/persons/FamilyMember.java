package persons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FamilyMember extends Person {
    private Date dateOfBerth;

    public FamilyMember(String firstName, String middleName, String lastName, String dateOfBerth, String relationshipType) {
        super(firstName, middleName, lastName);
        SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-mm-dd");
        try {
            this.dateOfBerth = formatter.parse(dateOfBerth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.relationshipType = relationshipType;
    }

    public FamilyMember(String firstName, String middleName, String lastName, String email, String dateOfBerth, String relationshipType) {
        super(firstName, middleName, lastName, email);
        SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-mm-dd");
        try {
            this.dateOfBerth = formatter.parse(dateOfBerth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.relationshipType = relationshipType;
    }

    public FamilyMember(String firstName, String middleName, String lastName, Date dateOfBerth, String relationshipType) {
        this.dateOfBerth = dateOfBerth;
        this.relationshipType = relationshipType;
    }

    public FamilyMember(String firstName, String middleName, String lastName, String email, Date dateOfBerth, String relationshipType) {
        super(firstName, middleName, lastName, email);

        this.dateOfBerth = dateOfBerth;
        this.relationshipType = relationshipType;
    }


    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    private String relationshipType;

    public void setDateOfBerth(Date dateOfBerth) {
        this.dateOfBerth = dateOfBerth;
    }

    public Date getDateOfBerth() {
        return dateOfBerth;
    }
}
