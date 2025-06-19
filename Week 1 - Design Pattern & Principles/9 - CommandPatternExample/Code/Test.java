public class Test{
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl rc = new RemoteControl();

        rc.setCommand(lightOn);
        rc.pressButton();

        rc.setCommand(lightOff);
        rc.pressButton();

        rc.setCommand(null);
        rc.pressButton();
    }
}
//test class