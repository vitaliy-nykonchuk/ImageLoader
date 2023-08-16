package image_loader.viewers;

import image_loader.adapters.MediaAdapter;

public class ImageViewer implements MediaViewer {

    MediaAdapter mediaAdapter;

    @Override
    public void view(String fileType, String fileName) {

        if (fileType.equalsIgnoreCase("raw")) {
            System.out.println("Open raw file: " + fileName);
        } else if (fileType.equalsIgnoreCase("jpg") ||
                fileType.equalsIgnoreCase("png")
        ) {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.view(fileType, fileName);
        } else {
            System.out.println("Invalid file. " + fileType + " format not supported");
        }
    }
}
