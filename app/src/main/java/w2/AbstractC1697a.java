package w2;

import E4.F;
import E4.I;
import E4.b0;
import android.media.MediaFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: w2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1697a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f18828a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f18829b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final Object f18830c = new Object();

    public static void a(String str, Throwable th) {
        String strReplace;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (f18830c) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } finally {
                    }
                }
            }
            str2 = strReplace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static String b(int i7, boolean z6, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = {f18829b[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(z6 ? 'H' : 'L'), Integer.valueOf(i10)};
        int i11 = t.f18881a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static void c(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void d(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, boolean z6) throws f {
        if (!z6) {
            throw new f(str);
        }
    }

    public static void f(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void i(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void l(String str) {
        synchronized (f18830c) {
            a(str, null);
        }
    }

    public static void m(String str) {
        synchronized (f18830c) {
            a(str, null);
        }
    }

    public static void n(String str, Throwable th) {
        synchronized (f18830c) {
            a(str, th);
        }
    }

    public static b0 o(D4.e eVar, List list) {
        F fO = I.o();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Bundle bundle = (Bundle) list.get(i7);
            bundle.getClass();
            fO.a(eVar.apply(bundle));
        }
        return fO.f();
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static void q(String str) {
        synchronized (f18830c) {
            a(str, null);
        }
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void t(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void u(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(n1.c.s(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static ArrayList v(Collection collection, D4.e eVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) eVar.apply(it.next()));
        }
        return arrayList;
    }

    public static void w(String str) {
        synchronized (f18830c) {
            a(str, null);
        }
    }

    public static void x(String str, Throwable th) {
        synchronized (f18830c) {
            a(str, th);
        }
    }
}
