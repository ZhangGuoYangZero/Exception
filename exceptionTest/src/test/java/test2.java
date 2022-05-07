import  TESTEXCEPTION.TestException;

import java.io.PrintWriter;


public class test2 {

    public static void main(String[] args) {
         try {
             //这个显示的是全局的的项目编码。
             //我设置的项目编码是GBK， 控制台编码是UTF
             System.out.println(System.getProperty("file.encoding"));
             System.out.println("抛");
             throw new TestException("抓住了！！！");
         }catch (TestException testException){
             System.out.println(testException.getMessage());
         }
    }

}
