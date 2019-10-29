package StuNET.com.stu.tcp.org.UpLoad;
import java.io.*;
import java.net.Socket;

public class UpLoadClinet {

    private String filePath;

    public UpLoadClinet( String filePath) {

        super ();
        this.filePath = filePath;

    }

    public void upload() throws IOException {

        Socket socket = new Socket("192.168.1.101" , 10003);

        OutputStream out = socket.getOutputStream();

        FileInputStream fileIn = new FileInputStream(filePath);

            byte[] buf = new byte[1024];
            int len = 0;
            int connt = 1;

        System.out.println("上传数据中.....");
            while( (len = fileIn.read(buf)) != -1) {

                System.out.println(len +"..." +connt);
                out.write(buf ,0 ,len);
                System.out.println(connt);
                connt ++;
            }
            socket.shutdownOutput();
        System.out.println("上传完成待服务端处理...");


        InputStream bufin = socket.getInputStream();


        System.out.println("读取服务端返回的数据中.......");


        byte[] buftepm = new byte[1204];
        int line = bufin.read(buftepm);

            System.out.println(new String(buftepm ,0 ,line));

            fileIn.close();

            socket.close();


    }


}
