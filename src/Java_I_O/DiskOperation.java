package Java_I_O;

import java.io.File;

/**
 * Created by xql on 2019/5/7.
 */
public class DiskOperation {
    // 读取目录下所有的文件
    public void listAllFiles(File dir) {
        if(dir==null||!dir.exists()){
            return;
        }
        if(dir.isFile()){
            System.out.println(dir.getName());
            return;
        }
        for(File file:dir.listFiles()){
            listAllFiles(file);
        }
    }
}
