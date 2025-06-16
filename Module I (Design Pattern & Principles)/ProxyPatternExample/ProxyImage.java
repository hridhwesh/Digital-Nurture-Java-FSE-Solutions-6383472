public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage; // Cached real image (initially null)


    public ProxyImage (String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(){
        if (realImage == null){
            realImage = new RealImage(fileName); //lazy initialization is being done here
        }
        else{
            System.out.println("Using cached image for: "+fileName); //caching is being done here
        }
        realImage.display();
    }
}
    // Display method checks if image is already loaded (cached)
    // If not, it loads it lazily and then displays