interface Notification {
    void sendMessage(String message);
}



class EmailNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}



class SMSNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}



class PushNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}




class NotificationFactory {
    public static Notification createNotification(String type) {
        if(type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        else if(type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        else if(type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        return null;
    }
}





public class FactoryMethod {
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.createNotification("email");
        notification1.sendMessage("Your order has been shipped");
        Notification notification2 = NotificationFactory.createNotification("sms");
        notification2.sendMessage("Your OTP is 4567");
        Notification notification3 = NotificationFactory.createNotification("push");
        notification3.sendMessage("New discount available");
    }
}



/*
Sending Email: Your order has been shipped
Sending SMS: Your OTP is 4567
Sending Push Notification: New discount available
*/
