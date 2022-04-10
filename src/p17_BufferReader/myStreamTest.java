package p17_BufferReader;

import java.io.*;


public class myStreamTest{
    // 加了throws 这里好像会屏蔽IO异常, 但是不加static没有运行标志
    public static void main(String[] args) throws IOException {
        // 文件对象
        File f = new File("knight.txt");
        // 文件输出流对象
        FileOutputStream fop = new FileOutputStream(f, false);
        // 文件输出writr对象 注意，这里的参数只能用双引号，否则会报错
        OutputStreamWriter os = new OutputStreamWriter(fop, "UTF-8");

        os.append("Knight is learning java\n");
        os.append("骑士在学习java语言\n");
        os.close();  // 清空缓存，写入文件
        fop.close(); // 释放资源

        // 文件输入流对象
        FileInputStream fin = new FileInputStream(f);
        // 输入流reader对象
        InputStreamReader reader = new InputStreamReader(fin);

        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            // 这里有加上 char 进行字符类型转换，否则会是数字
            sb.append((char) reader.read()); // 逐个字符读入
        }

        System.out.println(sb.toString());
    }
}
