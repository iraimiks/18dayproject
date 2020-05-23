package lv.raimonds;

import java.io.*;

public class TestFile {

    public static void main(String[] args) throws IOException {
        File file = new File("filetest.txt");
        file.createNewFile();
        //        System.out.println(file.canRead());
        //        System.out.println(file.canWrite());
        //read
        //write
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String str = "Cool day";
        byte[] bytes = str.getBytes();

        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("Your file is written...");
        System.out.println("Read...");
        myMethodToReadFilesText(file);
    }
    public static void myMethodToReadFilesText(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        while ((i = fileInputStream.read())!= -1){
            System.out.print((char)i);
        }
        fileInputStream.close();
    }
    // create method to read() from file;




}
