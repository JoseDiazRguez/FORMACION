package c10_Polymorphism;

public class Notification {

    // 6. Crea una clase Notification con método send(), y subclases
    // EmailNotification, SMSNotification. Luego crea una función
    // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

    public void send(){
        System.out.println("Notificación enviada.");
    }
}
