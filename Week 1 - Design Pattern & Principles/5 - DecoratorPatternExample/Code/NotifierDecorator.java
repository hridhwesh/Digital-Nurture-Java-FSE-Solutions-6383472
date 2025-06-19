abstract public class NotifierDecorator implements Notifier{

    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(String msg){
        notifier.send(msg);
    }
}
//abstract decorator class that holds reference to notifier object