package structure.composite;

public class Main {
    public static void main(String[] args) {
        IFileSystemComponent file1 = new File("file1.txt");
        IFileSystemComponent file2 = new File("file2.txt");

        Directory directory = new Directory("Documents");
        directory.addComponent(file1);
        directory.addComponent(file2);

        IFileSystemComponent file3 = new File("file3.txt");
        Directory subDirectory = new Directory("Images");
        subDirectory.addComponent(file3);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory);
        rootDirectory.addComponent(subDirectory);

        rootDirectory.showDetails();
    }
}