public class EmailNotifier implements Notifier{
    @Override
    public void send(String msg){
        System.out.println("Notification sent through e-mail"+ msg);
    }
}
//Concrete component that implements interface