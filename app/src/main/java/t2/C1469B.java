package t2;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: t2.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1469B {

    /* JADX INFO: renamed from: i */
    public static final String f16178i;

    /* JADX INFO: renamed from: j */
    public static final String f16179j;

    /* JADX INFO: renamed from: k */
    public static final String f16180k;
    public static final String l;

    /* JADX INFO: renamed from: m */
    public static final String f16181m;

    /* JADX INFO: renamed from: n */
    public static final String f16182n;

    /* JADX INFO: renamed from: o */
    public static final String f16183o;

    /* JADX INFO: renamed from: p */
    public static final String f16184p;

    /* JADX INFO: renamed from: a */
    public final Uri f16185a;

    /* JADX INFO: renamed from: b */
    public final String f16186b;

    /* JADX INFO: renamed from: c */
    public final C1495y f16187c;

    /* JADX INFO: renamed from: d */
    public final C1491u f16188d;

    /* JADX INFO: renamed from: e */
    public final List f16189e;

    /* JADX INFO: renamed from: f */
    public final String f16190f;

    /* JADX INFO: renamed from: g */
    public final E4.I f16191g;
    public final long h;

    static {
        int i7 = w2.t.f18881a;
        f16178i = Integer.toString(0, 36);
        f16179j = Integer.toString(1, 36);
        f16180k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        f16181m = Integer.toString(4, 36);
        f16182n = Integer.toString(5, 36);
        f16183o = Integer.toString(6, 36);
        f16184p = Integer.toString(7, 36);
    }

    public C1469B(Uri uri, String str, C1495y c1495y, C1491u c1491u, List list, String str2, E4.I i7, long j3) {
        this.f16185a = uri;
        this.f16186b = M.j(str);
        this.f16187c = c1495y;
        this.f16188d = c1491u;
        this.f16189e = list;
        this.f16190f = str2;
        this.f16191g = i7;
        E4.F fO = E4.I.o();
        for (int i8 = 0; i8 < i7.size(); i8++) {
            F f7 = (F) i7.get(i8);
            E e7 = new E();
            e7.f16202r = f7.f16211a;
            e7.f16199o = f7.f16212b;
            e7.f16203s = f7.f16213c;
            e7.f16200p = f7.f16214d;
            e7.f16201q = f7.f16215e;
            e7.f16204t = f7.f16216f;
            e7.f16205u = f7.f16217g;
            fO.a(new C1471D(e7));
        }
        fO.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1469B)) {
            return false;
        }
        C1469B c1469b = (C1469B) obj;
        return this.f16185a.equals(c1469b.f16185a) && w2.t.a(this.f16186b, c1469b.f16186b) && w2.t.a(this.f16187c, c1469b.f16187c) && w2.t.a(this.f16188d, c1469b.f16188d) && this.f16189e.equals(c1469b.f16189e) && w2.t.a(this.f16190f, c1469b.f16190f) && this.f16191g.equals(c1469b.f16191g) && Long.valueOf(this.h).equals(Long.valueOf(c1469b.h));
    }

    public final int hashCode() {
        int iHashCode = this.f16185a.hashCode() * 31;
        String str = this.f16186b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1495y c1495y = this.f16187c;
        int iHashCode3 = (iHashCode2 + (c1495y == null ? 0 : c1495y.hashCode())) * 31;
        C1491u c1491u = this.f16188d;
        int iHashCode4 = (this.f16189e.hashCode() + ((iHashCode3 + (c1491u == null ? 0 : c1491u.hashCode())) * 31)) * 31;
        String str2 = this.f16190f;
        return (int) ((((long) ((this.f16191g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.h);
    }
}
