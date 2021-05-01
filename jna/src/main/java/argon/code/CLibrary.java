package argon.code;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface CLibrary extends Library {
    CLibrary instance= Native.load("D:\\Coding\\VSproj\\Dll9\\x64\\Debug\\Dllx.dll",CLibrary.class);
    void SayHello();
    int addTest(int a,int b);
}
