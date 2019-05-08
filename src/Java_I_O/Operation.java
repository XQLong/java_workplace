package Java_I_O;

import java.io.File;
import java.io.IOException;

/**
 * Created by xql on 2019/5/7.
 */
public class Operation {
    public static void main(String[] args) throws IOException {
        /*DiskOperation dop = new DiskOperation();
        dop.listAllFiles(new File("C:\\downloads"));*/

        ByteAndCharOPeration dco = new ByteAndCharOPeration();
        dco.readjavafileByte("E:\\java_workplace\\java_workplace\\src\\Java_I_O\\DiskOperation.java");
    }
}
