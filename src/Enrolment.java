public class Enrolment {
    private int number; //student number
    private String code, date; //subject code and enrolment date


    public Enrolment() {

        // creating a default empty constructor to avoid system to generate null values for the data members.
        this(0,"","");

    }
    public Enrolment(int numberInput, String codeInput, String dateInput) {

        // assigning values to all data members

        this.number=numberInput;
        this.code=codeInput;
        this.date=dateInput;
    }

    // defining the public access methods which returns value of private data members.

    public int getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    // defining public update methods that updates values of private data members.

    public void setNumber(int newNumber) {
        this.number=newNumber;
    }

    public void setCode(String newCode) {
        this.code=newCode;
    }

    public void setDate(String newDate) {
        this.date=newDate;
    }




}
