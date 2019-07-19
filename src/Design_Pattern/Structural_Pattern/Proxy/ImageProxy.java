package Design_Pattern.Structural_Pattern.Proxy;

/**
 * @Author: xql
 * @Date: Created in 9:58 2019/7/19
 * 代理模式中的代理主题角色类
 */
public class ImageProxy implements Image{
    private HighResolutionImage highResolutionImage;
    public ImageProxy(HighResolutionImage highResolutionImage){
        this.highResolutionImage = highResolutionImage;
    }
    @Override
    public void showImage() {
        while (!highResolutionImage.isLoad()){
            System.out.println("Temp Image: " + highResolutionImage.getWidth() + " " + highResolutionImage.getHeight());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        highResolutionImage.showImage();
    }
}
