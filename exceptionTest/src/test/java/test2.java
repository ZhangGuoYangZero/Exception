import  TESTEXCEPTION.TestException;

import java.io.PrintWriter;


public class test2 {

    public static void main(String[] args) throws Throwable {
             //这个显示的是全局的的项目编码。
             //我设置的项目编码是GBK， 控制台编码是UTF
             System.out.println(System.getProperty("file.encoding"));

            int a = 5;
            if( a < 4){}
            else {
                throw   new Exception("测试编码100112"){

                };
            }
    }

}
