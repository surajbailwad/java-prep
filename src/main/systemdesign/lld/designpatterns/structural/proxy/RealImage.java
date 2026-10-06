package main.systemdesign.lld.designpatterns.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile();
    }

    private void loadFile() {
        System.out.println("Image loaded " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image");
    }
}
