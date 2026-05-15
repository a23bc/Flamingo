package s3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import t2.N;
import w2.m;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i7 = t.f18881a;
        String[] strArrSplit = str.split("\\.", 2);
        long j3 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str2);
        }
        long j7 = j3 * 1000;
        if (strArrSplit.length == 2) {
            j7 += Long.parseLong(strArrSplit[1]);
        }
        return j7 * 1000;
    }

    public static void c(m mVar) throws N {
        int i7 = mVar.f18868b;
        Charset charset = D4.d.f1569c;
        String strH = mVar.h(charset);
        if (strH == null || !strH.startsWith("WEBVTT")) {
            mVar.G(i7);
            throw N.a(null, "Expected WEBVTT. Got " + mVar.h(charset));
        }
    }
}
