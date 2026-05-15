package j5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import m5.AbstractC1209k;
import u5.AbstractC1539a;
import u5.AbstractC1545g;

/* JADX INFO: renamed from: j5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1108b extends AbstractC1109c {
    public static String C(File file) throws IOException {
        Charset charset = AbstractC1539a.f17313a;
        AbstractC1209k.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strF = AbstractC1110d.F(inputStreamReader);
            inputStreamReader.close();
            return strF;
        } finally {
        }
    }

    public static File D(File file) {
        int length;
        int iW;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        AbstractC1209k.e(path, "getPath(...)");
        char c7 = File.separatorChar;
        int iW2 = AbstractC1545g.W(path, c7, 0, 4);
        if (iW2 != 0) {
            length = (iW2 <= 0 || path.charAt(iW2 + (-1)) != ':') ? (iW2 == -1 && AbstractC1545g.S(path, ':')) ? path.length() : 0 : iW2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c7 || (iW = AbstractC1545g.W(path, c7, 2, 4)) < 0) {
            length = 1;
        } else {
            int iW3 = AbstractC1545g.W(path, c7, iW + 1, 4);
            length = iW3 >= 0 ? iW3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        AbstractC1209k.e(string, "toString(...)");
        if ((string.length() == 0) || AbstractC1545g.S(string, c7)) {
            return new File(string + file2);
        }
        return new File(string + c7 + file2);
    }
}
