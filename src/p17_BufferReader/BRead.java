package p17_BufferReader;

import java.io.*;

public class BRead {
    // 为什么要加上static he throws 才行？？？
    public static String readString(BufferedReader br) throws IOException {
        String s;
        s = br.readLine();

        return s;
    }

    public static void main(String[] args) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");

        String s = readString(br);
        System.out.println(s);

        // 上面的步骤已经把buffer清空，需要在控制台再次输入

        do {
            // char 类型会返回字符，如果第7行类型设置为int，这里会返回ascii码值
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

    }
}