package Design_Pattern.Behavioral_Pattern.Command;

/**
 * @Author: xql
 * @Date: Created in 11:29 2019/7/20
 * 命令模式具体命令类
 */
public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
