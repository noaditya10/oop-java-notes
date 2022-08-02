public class Person {
    //fields/attributes/properties
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;

        //untuk mengatasi variable shadowing, ketika nama parameter sama dengan nama field
        this.name = paramName;
    }

    void sayHello(String paramName) {
        System.out.println("Hello, " + paramName + ". My name is " + name);
    }
}
