package image;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Image with path " + fileName + " was displayed");
    }

    public void loadFromDisk() {
        System.out.println("Image with path " + fileName + " was loaded from disk.");
    }
}
