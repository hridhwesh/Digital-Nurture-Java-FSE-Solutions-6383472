public class Test{
    public static void main(String args[]){
        Computer specs = new Computer.Builder()
                    .setCpu("Intel i7")
                    .setRam("12GB")
                    .setStorage("512GB")
                    .build();
        System.out.println(specs);
    }
}