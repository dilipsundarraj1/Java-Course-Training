package com.learnJava.encapsulation;

/**
 * Created by z001qgd on 2/2/18.
 */
public class PersonWithEncapsulation {

    private String firstName;  // private access modifier
    private String lastName;// private access modifier
    private int age;// private access modifier

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * You can write the logic to handle it. We have control over the values that are being sent from the client.
     * @param age
     */
    public void setAge(int age) {
        if(age < 0){
            age =10;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonWithEncapsulation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
