package p17_BufferReader;

import java.io.*;

// 字符流操作 1

public class MostSimple {
    public static void main(String[] args) throws IOException {
        // readFile
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader("knight.txt");
        while (fr.ready()){
            sb.append((char) fr.read());//将字节码转化为字符
        }
        System.out.println(sb);
        fr.close();

        // writeFile
        FileWriter fw = new FileWriter("knight.txt", true);
        fw.write("\nI know the difference between byteStream and charStream");
        fw.close();
    }
}
