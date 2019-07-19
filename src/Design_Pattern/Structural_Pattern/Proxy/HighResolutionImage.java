package Design_Pattern.Structural_Pattern.Proxy;

import java.net.URL;

/**
 * @Author: xql
 * @Date: Created in 9:42 2019/7/19
 * 代理模式中的真实主题角色类
 */
public class HighResolutionImage implements Image{
    private URL imageURL;
    private long startTime;
    private int height;
    private int width;

    public HighResolutionImage(URL imageURL) {
        this.imageURL = imageURL;
        this.startTime = System.currentTimeMillis();
        this.width = 600;
        this.height = 600;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public boolean isLoad(){
        //模拟图片加载，延迟3秒完成加载
        long endTime = System.currentTimeMillis();
        return endTime-startTime>3000;
    }

    @Override
    public void showImage() {
        System.out.println("Real Image: " + imageURL);
    }
}
