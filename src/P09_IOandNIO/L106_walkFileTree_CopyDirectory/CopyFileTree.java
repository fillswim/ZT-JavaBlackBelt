package P09_IOandNIO.L106_walkFileTree_CopyDirectory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) {

        Path source = Paths.get("F:\\Java\\A");
        Path destination = Paths.get("F:\\Java\\B");

        try {
            Files.walkFileTree(source, new MyFileVisitor(source, destination));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        // Вычисление относительного пути
        Path pathRelativize = source.relativize(dir);
        // Вычисление полного пути
        Path newDestination = destination.resolve(pathRelativize);

        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        // Вычисление относительного пути
        Path pathRelativize = source.relativize(file);
        // Вычисление полного пути
        Path newDestination = destination.resolve(pathRelativize);

        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }
}
