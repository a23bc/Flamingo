package y2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t2.H;
import u3.C1533c;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f20344i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f20345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f20348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20351g;
    public final int h;

    static {
        H.a("media3.datasource");
    }

    public m(Uri uri, int i7, byte[] bArr, Map map, long j3, long j7, String str, int i8) {
        AbstractC1697a.d(j3 >= 0);
        AbstractC1697a.d(j3 >= 0);
        AbstractC1697a.d(j7 > 0 || j7 == -1);
        uri.getClass();
        this.f20345a = uri;
        this.f20346b = i7;
        this.f20347c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f20348d = Collections.unmodifiableMap(new HashMap(map));
        this.f20349e = j3;
        this.f20350f = j7;
        this.f20351g = str;
        this.h = i8;
    }

    public final C1533c a() {
        C1533c c1533c = new C1533c();
        c1533c.f17265e = this.f20345a;
        c1533c.f17261a = this.f20346b;
        c1533c.f17266f = this.f20347c;
        c1533c.f17267g = this.f20348d;
        c1533c.f17262b = this.f20349e;
        c1533c.f17263c = this.f20350f;
        c1533c.h = this.f20351g;
        c1533c.f17264d = this.h;
        return c1533c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i7 = this.f20346b;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f20345a);
        sb.append(", ");
        sb.append(this.f20349e);
        sb.append(", ");
        sb.append(this.f20350f);
        sb.append(", ");
        sb.append(this.f20351g);
        sb.append(", ");
        sb.append(this.h);
        sb.append("]");
        return sb.toString();
    }
}
