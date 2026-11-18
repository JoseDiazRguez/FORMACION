package c11_Abstraction;

public class WordDocument extends Document{

    // 9. Crea una clase abstracta Document con el método print(). Luego crea
    // PDFDocument y WordDocument, cada una con su forma de imprimir.
    
    public void print(){
        System.out.println("El Word se está imprimiendo.");
    }
}
