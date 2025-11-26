package Management.People;

// Employee.java
public class Employee extends Person {
    private String _employeeID;
    private String _position;
    private double _salary;
    private int _hoursWorked;

    public Employee(String name, String phoneNumber, String employeeID, String position, double salary) {
        super(name, phoneNumber);
        this._employeeID = employeeID;
        this._position = position;
        this._salary = salary;
        this._hoursWorked = 0;
    }

    public void addHoursWorked(int hours) {
        this._hoursWorked += hours;
    }

    public double calculateSalary() {
        int baseHours = 160;
        if (_hoursWorked <= baseHours) {
            return _salary;
        } else {
            int overtimeHours = _hoursWorked - baseHours;
            double baseSalaryMulti = (_salary / baseHours) * 1.5;
            return baseSalaryMulti* (overtimeHours/160);
        }
    }

    @Override
    public String getInfo() {
        return "ID: " + _employeeID + ", Name: " + getName() + ", Phone: " + getPhoneNumber() + ", Position: " + _position + ", HoursWorked: " + _hoursWorked;
    }


    public String getEmployeeID() { return _employeeID; }
    public String getPosition() { return _position; }
    public double getSalary() { return _salary; }
    public int getHoursWorked() { return _hoursWorked; }
}
