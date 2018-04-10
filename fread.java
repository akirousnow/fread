import java.io.*;
public class fread {
    private static int s;
    public fread(){
        //默认构造方法
    }


    public static int canRead(File input) throws IOException {
        InputStreamReader fs = new InputStreamReader(new FileInputStream(input));
        while(fs.read()!=-1){ s++; } //循环算出该文件有多少字节
        fs.close(); //释放资源
        return s; //返回该文件的字节
    }
}

