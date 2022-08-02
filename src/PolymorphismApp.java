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

        sayHello(new Employee("Farhan Employee"));
        sayHello(new Manager("Wahyu Manager"));
        sayHello(new VicePresident("Pratama VP"));
    }

    //contoh aplikasi polymorphism :
    //parameter dalam method berbentuk object Employee, tetapi ketika dipanggil bisa berubah
    //bentuk ke Manager atau VicePresident
    //hal ini akan membuat kode lebih efektif
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }


}
