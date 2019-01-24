package haiidea.com.myopencv.utils;

/**
 * Created by Administrator on 2019/1/24.
 */

public class NdkUtil {
    static {
        System.loadLibrary("NDKUtils");//导入生成的链接库文件
//        System.loadLibrary("libMyOpenCV");//导入生成的链接库文件
//        System.loadLibrary("libc++_shared");//导入生成的链接库文件
    }
    public native int [] gray(int[] bug, int w, int h);
    public native String test();
}
