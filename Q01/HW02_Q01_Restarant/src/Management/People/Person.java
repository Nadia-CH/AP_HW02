package Management.People;
// Person.java
public abstract class Person {
    private String _name;
    private String _phoneNumber;

    public Person() {}

    public Person(String name, String phoneNumber) {
        this._name = name;
        this._phoneNumber = phoneNumber;
    }

    public abstract String getInfo();

    public String getName() {
        return _name; }
    public void setName(String name) {
        this._name = name; }


    public String getPhoneNumber() {
        return _phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        this._phoneNumber = phoneNumber; }
}