package main.systemdesign.lld.designpatterns.structural.proxy;

public class ProxyClient {

    public static void execute() {
        Image image = new ImageProxy("photo.jpeg");
        image.display();
    }
}
