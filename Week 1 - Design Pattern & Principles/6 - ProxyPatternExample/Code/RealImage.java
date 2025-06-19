public class RealImage implements Image{
    private String fileName;

    public RealImage (String fileName){
        this.fileName = fileName;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer(){
        System.out.println("Loading img from remote server..");
    }


    // Method to display the image 
    @Override
    public void display(){
        System.out.println("Displaying: "+ fileName);
    }
}

//RealImage: this class implements image and loads image from remote server