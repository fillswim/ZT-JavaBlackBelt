package P09_IOandNIO.L102_ChannelAndBuffer_OtherMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx3 {
    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("text5.txt", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);

            // Начинаем читать из буффера
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());

            // Перемещение позиции для чтения в буффере на позицию 0
            buffer.rewind();
            System.out.println((char) buffer.get());

            System.out.println("-----------------------------------------");

            // compact - аналог clear, только оставляет элементы в буффере для дальнейшего чтения
            // compact копирует непрочитанные байты в начало буффера
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

            System.out.println("-----------------------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();

            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
