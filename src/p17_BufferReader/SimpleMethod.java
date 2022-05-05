package p17_BufferReader;

import java.io.*;

// 字符流操作 2

public class SimpleMethod {
    public static void main(String[] args) throws IOException {
        // readFile
        File f = new File("knight.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        while (br.ready()){
            System.out.println(br.readLine());  // readLine返回一行字符串
        }
        br.close();

        // writeFile
        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
        bw.write("\nI know the difference between byteStream and charStream");
        bw.close();
    }
}
//BufferedReader in = new BufferedReader(new FileReader(f));// Fileeader也可以操作，但是buffer增加缓冲，提高效率
//学习资料：https://www.bilibili.com/video/BV1fX4y1F7bP?p=7&spm_id_from=pageDriver

