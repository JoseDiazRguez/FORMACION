package c08_oop;

public class Book {     // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    
    // Atributos
    String title;
    String author;

    // Constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // Método
    public void printBook(){
        System.out.println("Título del libro: " + title + " - Autor: " + author +".");
    }

}
