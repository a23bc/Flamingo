package w3;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import d2.C0821i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t2.C1468A;
import t2.C1470C;
import t2.C1476e;
import t2.C1492v;
import t2.C1494x;
import t2.C1496z;
import w2.AbstractC1697a;
import x3.C1910L;
import x3.C1911M;
import x3.C1916a;
import x3.C1917b;
import x3.C1919d;
import x3.C1930o;

/* JADX INFO: renamed from: w3.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1748s {

    /* JADX INFO: renamed from: a */
    public static final E4.M f19344a;

    static {
        int i7 = E4.M.f1877q;
        Object[] objArr = new Object[32];
        objArr[0] = "android.media.metadata.TITLE";
        objArr[1] = "android.media.metadata.ARTIST";
        objArr[2] = "android.media.metadata.DURATION";
        objArr[3] = "android.media.metadata.ALBUM";
        objArr[4] = "android.media.metadata.AUTHOR";
        objArr[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, objArr, 6, 26);
        f19344a = E4.M.o(32, objArr);
    }

    public static long a(x3.m0 m0Var, C1911M c1911m, long j3) {
        long j7 = m0Var == null ? 0L : m0Var.f20070q;
        long jC = c(m0Var, c1911m, j3);
        long jD = d(c1911m);
        return jD == -9223372036854775807L ? Math.max(jC, j7) : w2.t.h(j7, jC, jD);
    }

    public static byte[] b(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(x3.m0 m0Var, C1911M c1911m, long j3) {
        if (m0Var == null) {
            return 0L;
        }
        long jMax = m0Var.f20069p;
        if (m0Var.f20068o == 3) {
            jMax = Math.max(0L, jMax + ((long) (m0Var.f20071r * ((j3 == -9223372036854775807L ? null : Long.valueOf(j3)) != null ? r2.longValue() : SystemClock.elapsedRealtime() - m0Var.f20075v))));
        }
        long j7 = jMax;
        long jD = d(c1911m);
        return jD == -9223372036854775807L ? Math.max(0L, j7) : w2.t.h(j7, 0L, jD);
    }

    public static long d(C1911M c1911m) {
        if (c1911m == null || !c1911m.f19995o.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jA = c1911m.a("android.media.metadata.DURATION");
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i7) {
        switch (i7) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(n1.c.s(i7, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j3) {
        if (j3 == 0) {
            return 0;
        }
        if (j3 == 1) {
            return 1;
        }
        if (j3 == 2) {
            return 2;
        }
        if (j3 == 3) {
            return 3;
        }
        if (j3 == 4) {
            return 4;
        }
        if (j3 == 5) {
            return 5;
        }
        return j3 == 6 ? 6 : 0;
    }

    public static C1910L g(t2.G g6, Bitmap bitmap) {
        char c7;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str = g6.f16223a.equals("") ? null : g6.f16223a;
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        t2.J j3 = g6.f16226d;
        Bundle bundle = j3.f16303I;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        Integer num = j3.f16317p;
        boolean z6 = (num == null || num.intValue() == -1) ? false : true;
        Integer num2 = j3.f16302H;
        boolean z7 = num2 != null;
        if (z6 || z7) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z6) {
                num.getClass();
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", e(num.intValue()));
            }
            if (z7) {
                num2.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num2.intValue());
            }
        }
        CharSequence charSequence5 = j3.f16304a;
        CharSequence charSequence6 = j3.f16308e;
        if (charSequence6 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence5);
            CharSequence charSequence7 = j3.f16309f;
            charSequence3 = j3.f16310g;
            charSequence = charSequence6;
            charSequence2 = charSequence7;
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 < 3) {
                    String[] strArr = C1911M.f19994r;
                    c7 = 2;
                    if (i8 < strArr.length) {
                        int i9 = i8 + 1;
                        String str2 = strArr[i8];
                        str2.getClass();
                        switch (str2) {
                            case "android.media.metadata.ARTIST":
                                charSequence4 = j3.f16305b;
                                break;
                            case "android.media.metadata.WRITER":
                                charSequence4 = j3.f16327z;
                                break;
                            case "android.media.metadata.COMPOSER":
                                charSequence4 = j3.f16295A;
                                break;
                            case "android.media.metadata.ALBUM":
                                charSequence4 = j3.f16306c;
                                break;
                            case "android.media.metadata.TITLE":
                                charSequence4 = charSequence5;
                                break;
                            case "android.media.metadata.ALBUM_ARTIST":
                                charSequence4 = j3.f16307d;
                                break;
                            default:
                                charSequence4 = null;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence4)) {
                            charSequenceArr[i7] = charSequence4;
                            i7++;
                        }
                        i8 = i9;
                    }
                } else {
                    c7 = 2;
                }
            }
            CharSequence charSequence8 = charSequenceArr[0];
            CharSequence charSequence9 = charSequenceArr[1];
            CharSequence charSequence10 = charSequenceArr[c7];
            charSequence = charSequence8;
            charSequence2 = charSequence9;
            charSequence3 = charSequence10;
        }
        return new C1910L(str, charSequence, charSequence2, charSequence3, bitmap2, j3.f16314m, bundle, g6.f16228f.f16196a);
    }

    public static t2.G h(String str, C1911M c1911m, int i7) {
        C1470C c1470c;
        C1492v c1492v = new C1492v();
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var2 = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        C1470C c1470c2 = C1470C.f16192d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = c1911m.f19995o.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            q.S0 s02 = new q.S0();
            s02.f15225p = Uri.parse(string);
            c1470c = new C1470C(s02);
        } else {
            c1470c = c1470c2;
        }
        t2.J jK = k(c1911m, i7);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C1494x c1494x = new C1494x(c1492v);
        C1468A c1468a = new C1468A(c1496z);
        if (jK == null) {
            jK = t2.J.f16263J;
        }
        return new t2.G(str2, c1494x, null, c1468a, jK, c1470c);
    }

    public static t2.G i(C1910L c1910l) {
        c1910l.getClass();
        C1492v c1492v = new C1492v();
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        List list = Collections.EMPTY_LIST;
        C1496z c1496z = new C1496z();
        C1470C c1470c = C1470C.f16192d;
        String str = c1910l.f19984o;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        q.S0 s02 = new q.S0();
        s02.f15225p = c1910l.f19991v;
        C1470C c1470c2 = new C1470C(s02);
        t2.J j3 = j(c1910l, 0);
        C1494x c1494x = new C1494x(c1492v);
        C1468A c1468a = new C1468A(c1496z);
        if (j3 == null) {
            j3 = t2.J.f16263J;
        }
        return new t2.G(str2, c1494x, null, c1468a, j3, c1470c2);
    }

    public static t2.J j(C1910L c1910l, int i7) {
        x3.n0 n0Var;
        byte[] bArrB;
        if (c1910l == null) {
            return t2.J.f16263J;
        }
        t2.I i8 = new t2.I();
        i8.f16244f = c1910l.f19986q;
        i8.f16245g = c1910l.f19987r;
        i8.f16249m = c1910l.f19989t;
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                n0Var = new x3.n0(i7, -1.0f);
                break;
            default:
                n0Var = null;
                break;
        }
        i8.f16246i = o(n0Var);
        Bitmap bitmap = c1910l.f19988s;
        if (bitmap != null) {
            try {
                bArrB = b(bitmap);
            } catch (IOException e7) {
                AbstractC1697a.x("Failed to convert iconBitmap to artworkData", e7);
                bArrB = null;
            }
            i8.b(bArrB, 3);
        }
        Bundle bundle = c1910l.f19990u;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            i8.f16252p = Integer.valueOf(f(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        i8.f16253q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            i8.f16237G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        CharSequence charSequence = c1910l.f19985p;
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            i8.f16239a = charSequence;
        } else {
            i8.f16239a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            i8.f16243e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            i8.f16238H = bundle2;
        }
        i8.f16254r = Boolean.TRUE;
        return new t2.J(i8);
    }

    public static t2.J k(C1911M c1911m, int i7) {
        x3.n0 n0VarA;
        x3.n0 n0VarA2;
        x3.n0 n0Var;
        String string;
        if (c1911m == null) {
            return t2.J.f16263J;
        }
        t2.I i8 = new t2.I();
        Bundle bundle = c1911m.f19995o;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.TITLE");
        CharSequence charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        i8.f16239a = charSequence != null ? charSequence : charSequence2;
        Bitmap bitmap = null;
        if (charSequence == null) {
            charSequence2 = null;
        }
        i8.f16243e = charSequence2;
        i8.f16244f = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
        i8.f16245g = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        i8.f16240b = bundle.getCharSequence("android.media.metadata.ARTIST");
        i8.f16241c = bundle.getCharSequence("android.media.metadata.ALBUM");
        i8.f16242d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        try {
            n0VarA = x3.n0.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception unused) {
            n0VarA = null;
        }
        i8.f16247j = o(n0VarA);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jA = c1911m.a("android.media.metadata.DURATION");
            if (jA >= 0) {
                i8.c(Long.valueOf(jA));
            }
        }
        try {
            n0VarA2 = x3.n0.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception unused2) {
            n0VarA2 = null;
        }
        t2.Y yO = o(n0VarA2);
        if (yO != null) {
            i8.f16246i = yO;
        } else {
            switch (i7) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    n0Var = new x3.n0(i7, -1.0f);
                    break;
                default:
                    n0Var = null;
                    break;
            }
            i8.f16246i = o(n0Var);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            i8.f16255s = Integer.valueOf((int) c1911m.a("android.media.metadata.YEAR"));
        }
        String[] strArr = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI"};
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < 2) {
                String str = strArr[i10];
                if (bundle.containsKey(str)) {
                    CharSequence charSequence3 = bundle.getCharSequence(str);
                    if (charSequence3 != null) {
                        string = charSequence3.toString();
                    }
                } else {
                    i10++;
                }
            }
        }
        string = null;
        if (string != null) {
            i8.f16249m = Uri.parse(string);
        }
        String[] strArr2 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART"};
        while (true) {
            if (i9 < 2) {
                String str2 = strArr2[i9];
                if (bundle.containsKey(str2)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str2);
                    } catch (Exception unused3) {
                    }
                } else {
                    i9++;
                }
            }
        }
        if (bitmap != null) {
            try {
                i8.b(b(bitmap), 3);
            } catch (IOException e7) {
                AbstractC1697a.x("Failed to convert artworkBitmap to artworkData", e7);
            }
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        i8.f16253q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            i8.f16252p = Integer.valueOf(f(c1911m.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            i8.f16237G = Integer.valueOf((int) c1911m.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        i8.f16254r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        E4.p0 it = f19344a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            i8.f16238H = bundle2;
        }
        return new t2.J(i8);
    }

    public static C1911M l(t2.J j3, String str, Uri uri, long j7, Bitmap bitmap) {
        Long l;
        C1930o c1930o = new C1930o();
        c1930o.d("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = j3.f16304a;
        if (charSequence != null) {
            c1930o.e(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = j3.f16308e;
        if (charSequence2 != null) {
            c1930o.e(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = j3.f16309f;
        if (charSequence3 != null) {
            c1930o.e(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = j3.f16310g;
        if (charSequence4 != null) {
            c1930o.e(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = j3.f16305b;
        if (charSequence5 != null) {
            c1930o.e(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = j3.f16306c;
        if (charSequence6 != null) {
            c1930o.e(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = j3.f16307d;
        if (charSequence7 != null) {
            c1930o.e(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (j3.f16321t != null) {
            c1930o.b("android.media.metadata.YEAR", r4.intValue());
        }
        if (uri != null) {
            c1930o.d("android.media.metadata.MEDIA_URI", uri.toString());
        }
        Uri uri2 = j3.f16314m;
        if (uri2 != null) {
            c1930o.d("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            c1930o.d("android.media.metadata.ALBUM_ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            c1930o.a("android.media.metadata.DISPLAY_ICON", bitmap);
            c1930o.a("android.media.metadata.ALBUM_ART", bitmap);
        }
        Integer num = j3.f16317p;
        if (num != null && num.intValue() != -1) {
            c1930o.b("android.media.metadata.BT_FOLDER_TYPE", e(num.intValue()));
        }
        if (j7 == -9223372036854775807L && (l = j3.h) != null) {
            j7 = l.longValue();
        }
        if (j7 != -9223372036854775807L) {
            c1930o.b("android.media.metadata.DURATION", j7);
        }
        x3.n0 n0VarP = p(j3.f16311i);
        if (n0VarP != null) {
            c1930o.c("android.media.metadata.USER_RATING", n0VarP);
        }
        x3.n0 n0VarP2 = p(j3.f16312j);
        if (n0VarP2 != null) {
            c1930o.c("android.media.metadata.RATING", n0VarP2);
        }
        if (j3.f16302H != null) {
            c1930o.b("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r4.intValue());
        }
        Bundle bundle = j3.f16303I;
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    c1930o.e((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    c1930o.b(str2, ((Number) obj).longValue());
                }
            }
        }
        return new C1911M(c1930o.f20090a);
    }

    public static t2.P m(x3.m0 m0Var) {
        if (m0Var == null || m0Var.f20068o != 7) {
            return null;
        }
        CharSequence charSequence = m0Var.f20074u;
        String string = charSequence != null ? charSequence.toString() : null;
        int iR = r(m0Var.f20073t);
        if (iR == -5) {
            iR = 2000;
        } else if (iR == -1) {
            iR = 1000;
        }
        int i7 = iR;
        Bundle bundle = m0Var.f20078y;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new t2.P(string, null, i7, bundle, SystemClock.elapsedRealtime());
    }

    public static int n(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2) {
                AbstractC1697a.w("Unrecognized RepeatMode: " + i7 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i8;
    }

    public static t2.Y o(x3.n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        float f7 = n0Var.f20088p;
        int i7 = n0Var.f20087o;
        switch (i7) {
            case 1:
                if (n0Var.d()) {
                    return new t2.r(i7 == 1 && f7 == 1.0f);
                }
                return new t2.r();
            case 2:
                if (n0Var.d()) {
                    return new t2.b0(i7 == 2 && f7 == 1.0f);
                }
                return new t2.b0();
            case 3:
                return n0Var.d() ? new t2.Z(3, n0Var.c()) : new t2.Z(3);
            case 4:
                return n0Var.d() ? new t2.Z(4, n0Var.c()) : new t2.Z(4);
            case 5:
                return n0Var.d() ? new t2.Z(5, n0Var.c()) : new t2.Z(5);
            case 6:
                if (!n0Var.d()) {
                    return new t2.O();
                }
                if (i7 != 6 || !n0Var.d()) {
                    f7 = -1.0f;
                }
                return new t2.O(f7);
            default:
                return null;
        }
    }

    public static x3.n0 p(t2.Y y6) {
        if (y6 != null) {
            int iV = v(y6);
            if (!y6.b()) {
                switch (iV) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new x3.n0(iV, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iV) {
                case 1:
                    return new x3.n0(1, ((t2.r) y6).f16724c ? 1.0f : 0.0f);
                case 2:
                    return new x3.n0(2, ((t2.b0) y6).f16411c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return x3.n0.e(iV, ((t2.Z) y6).f16375c);
                case 6:
                    float f7 = ((t2.O) y6).f16335b;
                    if (f7 < 0.0f || f7 > 100.0f) {
                        return null;
                    }
                    return new x3.n0(6, f7);
            }
        }
        return null;
    }

    public static int q(int i7) {
        if (i7 == -1 || i7 == 0) {
            return 0;
        }
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2 && i7 != 3) {
                AbstractC1697a.w("Unrecognized PlaybackStateCompat.RepeatMode: " + i7 + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i8;
    }

    public static int r(int i7) {
        switch (i7) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return -107;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return 1;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean s(int i7) {
        if (i7 == -1 || i7 == 0) {
            return false;
        }
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        throw new IllegalArgumentException(n1.c.s(i7, "Unrecognized ShuffleMode: "));
    }

    public static void t(I4.y yVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = false;
        long j3 = 3000;
        while (true) {
            try {
                try {
                    yVar.get(j3, TimeUnit.MILLISECONDS);
                    if (z6) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z6 = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j3 = 3000 - jElapsedRealtime2;
                }
            } finally {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int u(C1476e c1476e) {
        int i7 = 1;
        int i8 = C1919d.f20033b;
        k.I c1917b = Build.VERSION.SDK_INT >= 26 ? new C1917b() : new k.I();
        int i9 = c1476e.f16417a;
        AudioAttributes.Builder builder = (AudioAttributes.Builder) c1917b.f13847p;
        builder.setContentType(i9);
        builder.setFlags(c1476e.f16418b);
        c1917b.O(c1476e.f16419c);
        C1916a c1916aE = c1917b.E();
        int i10 = c1916aE.f20029b;
        if (i10 == -1) {
            int iA = c1916aE.a();
            int iB = c1916aE.b();
            int i11 = C1919d.f20033b;
            if ((iA & 1) != 1) {
                if ((iA & 4) != 4) {
                    switch (iB) {
                        case 2:
                            i7 = 0;
                            break;
                        case 3:
                            i7 = 8;
                            break;
                        case 4:
                            i7 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            i7 = 5;
                            break;
                        case 6:
                            i7 = 2;
                            break;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            i7 = 10;
                            break;
                        case 12:
                        default:
                            i7 = 3;
                            break;
                        case 13:
                            break;
                    }
                } else {
                    i7 = 6;
                }
            } else {
                i7 = 7;
            }
        } else {
            i7 = i10;
        }
        if (i7 == Integer.MIN_VALUE) {
            return 3;
        }
        return i7;
    }

    public static int v(t2.Y y6) {
        if (y6 instanceof t2.r) {
            return 1;
        }
        if (y6 instanceof t2.b0) {
            return 2;
        }
        if (!(y6 instanceof t2.Z)) {
            return y6 instanceof t2.O ? 6 : 0;
        }
        int i7 = ((t2.Z) y6).f16374b;
        int i8 = 3;
        if (i7 != 3) {
            i8 = 4;
            if (i7 != 4) {
                i8 = 5;
                if (i7 != 5) {
                    return 0;
                }
            }
        }
        return i8;
    }

    public static boolean w(long j3, long j7) {
        return (j3 & j7) != 0;
    }
}
