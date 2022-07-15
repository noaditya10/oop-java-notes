public class Manager {

    String name;

    String company;

    Manager(String name){
        this.name = name;
    }

    Manager(String name, String company){
        this.name = name;
        this.company = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name);
    }
}
