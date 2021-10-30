import java.util.Calendar;

public class Person {
    // fields
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;

    // methods
    public void changeAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        String str[] = dateOfBirth.split("/");
        return Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(str[2]);
    }

}
