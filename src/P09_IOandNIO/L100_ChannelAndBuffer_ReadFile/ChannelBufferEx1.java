package P09_IOandNIO.L100_ChannelAndBuffer_ReadFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("text2.txt", "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stringBuilder = new StringBuilder();

            // канал читает в буффер и возвращает количество прочитанных байт
            // capaciti - вместимость буффера
            // position - позиция, куда идет запись в буффер
            // после flip() position = 0
            // limit - количество записанных байт в буффер и доступных для чтения
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read: " + byteRead);
                // flip() - смена позиции на позицию для чтения
                buffer.flip();

                while (buffer.hasRemaining()) {
                    stringBuilder.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(stringBuilder);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
