import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.put("abc".getBytes());
        byteBuffer.flip();
        byteBuffer.get();
        System.out.println(byteBuffer.capacity()+","+byteBuffer.limit()+","+byteBuffer.position());
    }
}
