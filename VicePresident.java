public class VicePresident extends Manager{

    VicePresident(String name) {
        super(name);
    }
    //kalau di parent memiliki Constructor berparameter, maka child harus mengaksesnya
    //kecuali jika parent memiliki default Constructor (constructor tanpa parameter)
    //maka child tidak wajib mengaksesnya

    void sayHello(String name) {
        System.out.println("Hi " +name + ", my name is VP " + this.name);
    }
    //method overriding: nama, return, dan param harus sama
}
