package c08_oop;

public class Person {                           // Las Clases siempre serán públicas
    
    // ATRIBUTOS:
    /* Atributo private: solo se puede acceder desde la misma clase.    
     *                   |--> Buenas prácticas: usar private siempre y generar Getters & Setters
     * Atributo protected: se puede acceder desde la misma clase y desde clases hijas
     * Atributo public: se puede acceder desde cualquier clase
     * Atributo (default): se puede acceder desde la misma clase y desde clases hijas
     */
    private String name;                                        
    private int age;
    final private String id;            // --> final: no se puede cambiar el valor de la variable, ni dentro de la Clase

    // CONSTRUCTORES:
    /* Constructor private: solo se puede acceder desde la misma clase      
     *                   |--> No podríamos instanciarla en otras clases, como por ejemplo en Classes ni del mismo paquete
     * Constructor protected: se puede acceder desde la misma clase y desde clases hijas
     *                   |--> No podríamos instanciarla en clases de otros paquetes, como por ejemplo en Classes de c08_test_Classes
     * Constructor public: se puede acceder desde cualquier clase
     *                   |--> Podemos instanciarla en cualquier clase
     * Constructor (default): se puede acceder desde la misma clase y desde clases hijas
     */
    public Person(String name, int age, String id) {       // Solo si es public podemos instanciarla en otros paquetes
        this.name = name;
        this.setAge(age);               // <-- Llamando al setter para que siempre sea positiva *
        this.id = id;
    }

    // GETTERS & SETTERS
    /* Getters: se usan para obtener el valor de un atributo privado o protegido
     * Setters: se usan para modificar el valor de un atributo privado o protegido
     */
    
    // Getters

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {       // --> Para la edad nos aseguramos que siempre sea positiva *
        if (age >= 0){
            this.age = age;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // MÉTODOS:
    /* Método private: solo se puede acceder desde la misma clase   
     *                   |--> Por ejemplo una función interna que no quisiera que fuera visible
     * Metodo protected: se puede acceder desde la misma clase y desde clases hijas
     * Metodo public: se puede acceder desde cualquier clase
     * Metodo (default): se puede acceder desde la misma clase y desde clases hijas
     */
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años y mi id es: " + id + ".");
    }

}
