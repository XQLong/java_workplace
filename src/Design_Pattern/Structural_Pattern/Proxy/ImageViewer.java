package Design_Pattern.Structural_Pattern.Proxy;

import java.net.URL;

/**
 * @Author: xql
 * @Date: Created in 10:11 2019/7/19
 */
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
