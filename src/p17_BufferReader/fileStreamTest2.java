package p17_BufferReader;

import java.io.*;

public class fileStreamTest2 {
    public static void main(String[] args) throws IOException {
        // 构建 文件对象
        File f = new File("a.txt");

        // 构建FileOutputStream对象
        FileOutputStream fop = new FileOutputStream(f, true); // 第二个参数为true表示以追加方式

        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        // 写入到缓冲区
        writer.append("中文输入");

        // 换行
        writer.append("\r\n");

        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        writer.append("English");
        writer.append("\r\n");

        // 关闭写入流,同时会把缓冲区内容写入文件
        writer.close();

        // 关闭输出流,释放系统资源
        fop.close();

        // 构建FileInputStream对象
        FileInputStream fip = new FileInputStream(f);

        // 构建InputStreamReader对象,编码与写入相同
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();

        // 关闭输入流,释放系统资源
        fip.close();
    }
}
