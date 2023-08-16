package image_loader.formats;

import image_loader.viewers.AdvancedMediaViewer;

public class PngFormatViewer implements AdvancedMediaViewer {

    @Override
    public void viewPng(String fileName) {
        System.out.println("Open png file: " + fileName);
    }

    @Override
    public void viewJpg(String fileName) {

    }
}
