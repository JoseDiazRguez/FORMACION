package c10_Polymorphism;

public class EmailNotification extends Notification{

    // 6. Crea una clase Notification con método send(), y subclases
    // EmailNotification, SMSNotification. Luego crea una función
    // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

    @Override
    public void send(){
        System.out.println("Notificación de email enviada.");
    }
}