package P09_IOandNIO.L107_walkFileTree_DeleteDirectory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTree {
    public static void main(String[] args) {

        Path path = Paths.get("F:\\Java\\B");

        try {
            Files.walkFileTree(path, new MyFileVisitor());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete file: " + file.getFileName());
        Files.delete(file);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete directory: " + dir.getFileName());
        Files.delete(dir);

        return FileVisitResult.CONTINUE;
    }
}