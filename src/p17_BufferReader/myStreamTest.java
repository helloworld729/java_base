package p17_BufferReader;

import java.io.*;
// 目标：将一句话写入到文件中 并读取 输出到控制台

public class myStreamTest{
    public static void main(String[] args) throws IOException{

        // 写文件
        // 文件对象
        File f = new File("knight.txt");
        // 输出流对象
        FileOutputStream fop = new FileOutputStream(f, false);
        // 输出流writer对象
        OutputStreamWriter os = new OutputStreamWriter(fop, "UTF-8");

        // 添加到缓冲区
        os.append("knight is learning java\n");
        os.append("骑士在学习java语言\n");
        // 写入到文件中，并关闭writer对象
        os.close();
        // 关闭输出流对象，释放系统资源
        fop.close();

        // 读文件
        FileInputStream fin = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fin);

        StringBuffer sf = new StringBuffer();

        while (reader.ready()){
            sf.append((char) reader.read());
        }
        reader.close();
        fin.close();

        // 输出
        System.out.println(sf.toString());


    }

}
