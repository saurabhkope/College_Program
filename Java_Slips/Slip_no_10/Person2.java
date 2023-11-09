// Q2. Create a package “utility”. Define a class CapitalString under “utility” package which will
// contain a method to return String with first letter capital. Create a Person class (members – name,
// city) outside the package. Display the person name with first letter as capital by making use of
// CapitalString. 

//run command
//javac -d . CapitalString.java
//javac Person2.java
//java Person2

import utility.CapitalString;

public class Person2 {
    private String name;
    private String city;

    public Person2(String name, String city) {
        this.name = CapitalString.capitalizeFirstLetter(name);
        this.city = city;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person2 person = new Person2("amit", "Pune");
        person.displayPersonDetails();
    }
}
