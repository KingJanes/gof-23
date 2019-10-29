package StuNET.com.stu.tcp.org.UpLoad;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

    private String trigePosePath;

    public UploadServer(String trigePosePath) {

        this.trigePosePath = trigePosePath;

    }

    // TODO: 2019/7/24 0024   此上传小程序会将源数据扩增10倍  上传mkv文件时服务端阻塞函数会一直阻塞无法停止   待分析

    public void loadServer() throws IOException {

        ServerSocket server = new ServerSocket(10003);

        Socket clinet = server.accept();

        String clinetIP = clinet.getInetAddress().getHostAddress();

        System.out.println( clinetIP+ "  connect......" );


        InputStream clinetIn = clinet.getInputStream();

        File purposeDir = new File(trigePosePath);
            if ( ! purposeDir.exists()) {
                purposeDir.mkdirs();
            }

        FileOutputStream fileOut = new FileOutputStream( purposeDir + clinetIP + "unload.mkv");


            byte[] buf = new byte[1024];

            int len = 0;

                System.out.println("读取客户端上传的数据中....");

                while((len = clinetIn.read()) != -1) {

                    fileOut.write(buf ,0 ,len);

                }
                         System.out.println("读取客户端上传的数据完成 准备返回响应数据....");

            OutputStream clinetOut = clinet.getOutputStream();

                clinetOut.write("上传成功".getBytes());
                clinet.shutdownOutput();

               fileOut.close();
               server.close();
    }
}
