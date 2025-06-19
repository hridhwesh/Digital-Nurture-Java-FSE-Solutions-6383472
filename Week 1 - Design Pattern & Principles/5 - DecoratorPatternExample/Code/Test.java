public class Test {
    public static void main(String[] args) {
        String msg = "System is down!";

        // Basic email only
        Notifier notifier = new EmailNotifier();
        notifier.send(msg);

        System.out.println();

        // Email + SMS
        Notifier emailAndSms = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSms.send(msg);

        System.out.println();

        // Email + Slack
        Notifier emailAndSlack = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlack.send(msg);

        System.out.println();

        // Email + SMS + Slack
        Notifier fullNotifier = new SlackNotifierDecorator(
                                  new SMSNotifierDecorator(
                                  new EmailNotifier()));
        fullNotifier.send(msg);
    }
}
//test class