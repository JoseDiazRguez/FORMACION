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
        if (isValidUsername(username) && isValidPassword(password)){
            this.username = username;
            this.password = password;
            System.out.println(username + ": Usuario dado de alta correctamente.");
        } else {
            System.out.println("Usuario no creado correctamente.");

            if (!isValidUsername(username)) {
                System.out.println(" └──> " + username + ": El nombre de usuario debe tener al menos 3 caracteres y no contener espacios.");
            }
            
            if (!isValidPassword(password)) {
                System.out.println(" └──> La contraseña debe tener al menos 6 caracteres");
            }
        }        
    }

    // Getters & Setters

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username) {
        if (isValidUsername(username)) {
            this.username = username;
            System.out.println(username + ": Nombre de usuario establecido.");
        } else {
            System.out.println(username + ": Usuario no creado: El nombre de usuario debe tener al menos 3 caracteres y no contener espacios.");
        }
    }
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
            System.out.println("ContraseÃ±a establecida");
        } else {
            System.out.println("La contraseÃ±a debe tener al menos 6 caracteres");
        }
    }

    // Métodos

    public boolean isValidUsername(String username){
        return username != null 
                && username.length() >= 3 
                && !username.contains(" ");
    }

    public boolean isValidPassword(String password){
        return password != null 
                && password.length() >= 6;
    }

    public boolean isValid(){
        return username != null && password != null;
    }
    
    public void checkPassword(String inputPassword){
        if (!isValid()){
            System.out.println(" [-] El usuario no está correctamente inicializado.");
        } else if (password.equals(inputPassword)){                // <-- En Java, == compara las referencias de los objetos String, no su contenido.
            System.out.println(" [V] Contraseña para " + username + " es correcta.");
        } else {
            System.out.println(" [X] Contraseña para " + username + " es incorrecta.");
        }
    }

}
