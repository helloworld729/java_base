import java.io.*;
import java.util.Timer;

public class hahaha {
    public static void main(String[] args) throws IOException{
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            filefun1();
        }

        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
    // 3559 3634 3249
    public static void filefun1() throws IOException{
        File f = new File("file.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f, false));
        bw.write("hello\n");
        bw.write("world\n");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));
        while (br.ready()){
            br.readLine();
        }
    }
    // 3669 3555 3655
    public static void filefun2() throws IOException{
        File f = new File("file.txt");
        FileWriter bw = new FileWriter(f, false);
        bw.write("hello\n");
        bw.write("world\n");
        bw.close();

        FileReader br = new FileReader(f);
        while (br.ready()){
            char a = (char)br.read();
        }
    }
}
