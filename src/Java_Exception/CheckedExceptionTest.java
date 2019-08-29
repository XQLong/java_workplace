package Java_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by xql on 2019/8/28.
 * 受检异常
 * 对于受检异常在编译阶段必须进行预处理
 */
public class CheckedExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        //读取d:/abc.txt文件中的内容, 使用了FileInputStream类

        FileInputStream fis = new FileInputStream("d:/abc.txt");
        //SUN在定义FileInputStream构造方法时, 通过 throws关键字声明了FileNotFoundException异常,
        //这个异常就是受检异常, 即在定义方法时, 通过throws声明的异常
        //受检异常在编译前必须进行预处理, 否则编译语法报错
    }
}
