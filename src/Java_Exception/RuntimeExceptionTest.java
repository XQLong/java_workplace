package Java_Exception;

/**
 * Created by xql on 2019/8/28.
 * 运行时异常都是RuntimeException的子类
 * 不需要进行预处理
 * 通过规范代码进行规避
 */
public class RuntimeExceptionTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
//		divide(x, y); 		//10/2=5
//		divide(10, 0);		//这一行产生了异常,导致了程序中断, 程序不再继续向下执行
        divide22(x, y);
        divide22(10, 0);
        System.out.println("main....end...");
    }
    //定义方法,计算两个整数的商, 没有判断除数为0的情况
    public static void divide( int num1, int num2) {
        int result = num1/num2;
        System.out.println( num1 + "/" + num2 + "=" + result);
    }
    //定义方法,计算两个整数的商, 通过判断除数为0避免出现算术异常
    public static void divide22( int num1, int num2) {
        if ( num2 == 0  ) {
            System.out.println("除数不能为0");
            return ;			//结束方法的执行
        }
        int result = num1/num2;
        System.out.println( num1 + "/" + num2 + "=" + result);
    }
}
