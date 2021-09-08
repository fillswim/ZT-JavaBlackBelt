package P09_IOandNIO.L101_ChannelAndBuffer_WriteFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx2 {
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

            String text = "\nHello World!";

            // Вариант № 1 дописывания в файл
//            // Создаем буффер для записи цитаты
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes(StandardCharsets.UTF_8).length);
//            // Занесли цитату в буффер
//            buffer2.put(text.getBytes(StandardCharsets.UTF_8));
//            buffer2.flip();
//            // записываем информацию
//            channel.write(buffer2);

            // Вариант № 2 дописывания в файл
            // Передаем текст в буффер
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));

            // Сразу саписываем информацию из буффера в файл
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
