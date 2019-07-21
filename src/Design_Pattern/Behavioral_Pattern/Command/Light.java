package Design_Pattern.Behavioral_Pattern.Command;

/**
 * @Author: xql
 * @Date: Created in 11:24 2019/7/20
 * 命令模式接收者类
 */
public class Light {
    public void on(){
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is off");
    }
}
