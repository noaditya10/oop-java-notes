public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Novi");
        employee.sayHello("Farhan");

        employee = new Manager("Novi");
        employee.sayHello("Wepe");

        employee = new VicePresident("Novi");
        employee.sayHello("Pratama");

        //Basic Polymorphism
        //Perhatikan perubahan bentuk di atas, pada deklarasi pertama, employee dalam bentuk
        //object Employee. namun di line selanjutnya ada yang berubah bentuk menjadi Manager,
        //dan VicePresident

        //polymorphism tidak bisa mengakses method child classnya

    }
}
