package c08_test_oop;

public class User {

    // 6. Crea una clase User con los atributos privados username y password.
    // Implementa los métodos setUsername(String username), setPassword(String
    // password) y checkPassword(String inputPassword) que compare contraseñas.
    
    // Atributos

    private String username;
    private String password;

    // Constructor

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    // Getters & Setters

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // Métodos

    public void checkPassword(String inputPassword){
        if (password.equals(inputPassword)){                // <-- En Java, == compara las referencias de los objetos String, no su contenido.
            System.out.println("Contraseña para " + username + " es correcta.");
        } else {
            System.out.println("Contraseña para " + username + " es incorrecta.");
        }
    }

}
