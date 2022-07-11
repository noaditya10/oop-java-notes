public class PersonApp {

    public static void main(String[] args) {
        var person1 = new Person("Novi", "Babarsari");

        System.out.println(person1.name);
        person1.sayHello("Farhan");

        var vicePresident = new VicePresident("Satya");
        System.out.println(vicePresident.name);
        vicePresident.sayHello("Aditya");


    }
}
