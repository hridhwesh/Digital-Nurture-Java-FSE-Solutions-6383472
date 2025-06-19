public class Test{
    public static void main(String[] args) {
        Image img1 = new ProxyImage("me.jpg");
        Image img2 = new ProxyImage("you.jpg");

        //Loading for the first time 
        img1.display();
        
        //Loading for second time (this uses cache )
        img1.display();

        //Loading another img for first time
        img2.display();

    }
}