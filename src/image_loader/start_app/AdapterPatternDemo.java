package image_loader.start_app;

import image_loader.viewers.ImageViewer;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        ImageViewer fileViewer = new ImageViewer();

        fileViewer.view("raw", "laptop.raw");
        fileViewer.view("png", "chair.png");
        fileViewer.view("jpg", "phone.jpg");
        fileViewer.view("gif", "car.gif");
    }
}
