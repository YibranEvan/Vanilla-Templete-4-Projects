package com.techelevator;
import java.util.List;

public class BankCustomer implements Accountable{
private String name;
private String address;
private String phoneNumber;
private List<Accountable> account;

public String getName() {
    return name;
}
public void setName(String name) {
    this.name =name;
}
public String getAddress() {
    return address;
}
public void setAddress(String address){
    this.address = address;
}
public String getPhoneNumber(){
    return phoneNumber;
}
public void setPhoneNumber (String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public List<Accountable> getAccount(){
    return account;
}


}
