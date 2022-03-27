/*
------------------------------------------------------
My name: Swastik Satapathy
My student number: 7232408
My course code: CSIT121
My email address: ss7796@uowmail.edu.au
Assignment number: 1
-------------------------------------------------------
*/

public class Student {

    private int number; //Student number
    private String name, dob, email, address, phone, degree; // essential student details

    public Student() {

        // creating a default empty constructor to avoid system to generate null values for the data members.
        this(0, "", "", "", "", "", "");

    }

    public Student(int studentNumber, String name, String dob, String email, String address, String phoneNumber, String degreeName) {

        // assigning values to all data members

        this.number = studentNumber;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phoneNumber;
        this.degree = degreeName;
    }

    // defining the public access methods which returns value of private data members.

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getDegree() {
        return degree;
    }

    // defining public update methods that updates values of private data members.

    public void setNumber(int newNumber) {
        number = newNumber;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDOB(String newDOB) {
        dob = newDOB;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setPhone(String newPhone) {
        phone = newPhone;
    }

    public void setDegree(String newDegree) {
        degree = newDegree;
    }

    public String toString() {
        String s= "";

        s += + number + ", " + name + ", " +dob +", " + email + ", " +address +", " + phone +", " + degree + "\n\n";

        /*
        'students' arrayList is defined in another class(StudentEnrolmentSystem) Therefore, the error in the below lines of code.
        Commenting out the for loop temporarily until I get a clarification from the lecturer regarding my question.
            - Sent a mail to the lecturer on further clarity regarding the addition of data members and methods apart
            from the ones mentioned in the assignment document.
            - Test the toString override method in the StudentEnrolmentSystem class to check if the output is
            properly formatted according to assignment specifications.

        for(Student student:students)
            s+=students;

        return s+"------------";
    }
        */
        return s;
    }
}
