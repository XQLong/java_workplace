package Java_I_O;

import java.io.*;

/**
 * Created by xql on 2019/5/7.
 */
public class ByteAndCharOPeration {
    //以字节流的形式读取文件
    public void readjavafileByte(String path) throws IOException {
        //创建字节流输入
        FileInputStream input = new FileInputStream(path);
        byte[] bytes = new byte[256];
        int hasread = 0;
        while ((hasread = input.read(bytes))>0){
            System.out.println(hasread);
            System.out.println(new String(bytes,0,hasread));
        }
        input.close();
    }

    //以字节流的形式读取文件,使用try语句自动关闭资源
    public void readjavafileChar(String path) throws IOException {
        try {
            FileReader input = new FileReader(path);
            char[] chars = new char[32];
            int hasread = 0;
            while ((hasread = input.read(chars))>0){
                System.out.println(hasread);
                System.out.println(new String(chars,0,hasread));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
