package image_loader.adapters;

import image_loader.formats.JpgFormatViewer;
import image_loader.formats.PngFormatViewer;
import image_loader.viewers.AdvancedMediaViewer;
import image_loader.viewers.MediaViewer;

public class MediaAdapter implements MediaViewer {

    AdvancedMediaViewer advancedMediaViewer;

    public MediaAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("png")) {
            advancedMediaViewer = new PngFormatViewer();
        } else if (fileType.equalsIgnoreCase("jpg")) {
            advancedMediaViewer = new JpgFormatViewer();
        }
    }

    @Override
    public void view(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("png")) {
            advancedMediaViewer.viewPng(fileName);
        } else if (fileType.equalsIgnoreCase("jpg")) {
            advancedMediaViewer.viewJpg(fileName);
        }
    }
}
