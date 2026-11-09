package c08_test_oop;

public class c03_AccessModifiersExercises {
    
    public static void main(String[] args) {
        
        // Encapsulamiento (modificadores de acceso) --> Permite controlar el acceso a los atributos y métodos de una clase

        /* Modificadores de acceso
         * - private: solo se puede acceder desde la misma clase
         * - protected: se puede acceder desde la misma clase y desde clases hijas
         * - public: se puede acceder desde cualquier clase
         * - (default: se puede acceder desde la misma clase y desde clases hijas)
         */

        // Getters & Setters

        /* Getters & Setters
         * - Getters: se usan para obtener el valor de un atributo privado o protegido.
         * - Setters: se usan para modificar el valor de un atributo privado o protegido.
         */

        // Ejercicios:

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.

        var person = new Person("Jose",43);
        person.showPerson();

        // 2. Crea una clase Product con el atributo privado price. Añade el método
        // setPrice(double price) que solo permita precios mayores a 0.

        var product = new Product("PructoA",20);
        product.setPrice(22.25);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
        // métodos deposit(double amount) y withdraw(double amount) que validen las
        // cantidades correctamente.

        var bankAccount = new BankAccount(1500);

        bankAccount.deposit(50.25);
        bankAccount.withdraw(300.10);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
        // método getTitle() pero no modificarlo (sin setTitle()). El título debe
        // asignarse solo por el constructor.

        var book = new Book("Don Quijote de la Mancha");

        System.out.println("Estoy leyendo el libro de " + book.getTitle() + ".");

        // 5. Crea una clase Temperature con el atributo privado celsius. El método
        // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        var temperature = new Temperature(16);
        temperature.showTemperature();

        temperature.setCelsius(22.1);
        temperature.showTemperature();

        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los métodos setUsername(String username), setPassword(String
        // password) y checkPassword(String inputPassword) que compare contraseñas.

        var user1 = new User("Jose","123456789A");
        var user2 = new User("Vanessa", "123456789B");
        var user3 = new User("Jose Díaz","123456789C");
        var user4 = new User("Jose_Díaz","123456789D");

        user1.checkPassword("123456789A");
        user2.checkPassword("123456789A");
        user3.checkPassword("123456789A");
        user4.checkPassword("123456789A");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método
        // raiseSalary(double percent) que solo permita aumentos positivos.

        var employee = new Employee("Jose",2100);

        employee.showSalary();
        employee.raiseSalary(20);
        employee.showSalary();

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
        // setters y el método calculateArea() que devuelva el resultado de width * height.

        var rectangle = new Rectangle(20, 30);

        rectangle.calculateArea();
        rectangle.setWidth(30);
        rectangle.calculateArea();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos
        // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        var student = new Student(45);

        System.out.println(student.isPassed());
        student.setGrade(60);
        System.out.println(student.isPassed());
        student.setGrade(75);
        System.out.println(student.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos
        // accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int
        // amount) que reduzca la velocidad (mí­nimo 0).

        var car = new Car(100);

        car.accelerate(25);
        car.showSpeed();
        car.brake(60);
        car.showSpeed();
        car.accelerate(30);
        car.showSpeed();
        car.brake(100);
        car.showSpeed();
        car.accelerate(30);
        car.showSpeed();

    }
}
