package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private Double annualSalary;

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId() {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName() {
        this.lastName = lastName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment() {
        this.department = department;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

}
