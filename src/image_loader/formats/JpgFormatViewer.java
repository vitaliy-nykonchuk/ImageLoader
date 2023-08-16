package image_loader.formats;

import image_loader.viewers.AdvancedMediaViewer;

public class JpgFormatViewer implements AdvancedMediaViewer {

    @Override
    public void viewJpg(String fileName) {
        System.out.println("Open jpg file: " + fileName);
    }

    @Override
    public void viewPng(String fileName) {
    }
}
