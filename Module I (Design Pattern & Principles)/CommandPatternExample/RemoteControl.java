public class RemoteControl{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        if(command!=null){
            command.execute();
        }
        else{
            System.out.println("No command set");
        }
    }
}
//INvoker class that holds reference to Command and method to execute it