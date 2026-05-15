package t2;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1495y {

    /* JADX INFO: renamed from: i */
    public static final String f16758i;

    /* JADX INFO: renamed from: j */
    public static final String f16759j;

    /* JADX INFO: renamed from: k */
    public static final String f16760k;
    public static final String l;

    /* JADX INFO: renamed from: m */
    public static final String f16761m;

    /* JADX INFO: renamed from: n */
    public static final String f16762n;

    /* JADX INFO: renamed from: o */
    public static final String f16763o;

    /* JADX INFO: renamed from: p */
    public static final String f16764p;

    /* JADX INFO: renamed from: a */
    public final UUID f16765a;

    /* JADX INFO: renamed from: b */
    public final Uri f16766b;

    /* JADX INFO: renamed from: c */
    public final E4.K f16767c;

    /* JADX INFO: renamed from: d */
    public final boolean f16768d;

    /* JADX INFO: renamed from: e */
    public final boolean f16769e;

    /* JADX INFO: renamed from: f */
    public final boolean f16770f;

    /* JADX INFO: renamed from: g */
    public final E4.I f16771g;
    public final byte[] h;

    static {
        int i7 = w2.t.f18881a;
        f16758i = Integer.toString(0, 36);
        f16759j = Integer.toString(1, 36);
        f16760k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        f16761m = Integer.toString(4, 36);
        f16762n = Integer.toString(5, 36);
        f16763o = Integer.toString(6, 36);
        f16764p = Integer.toString(7, 36);
    }

    public C1495y(C2.I i7) {
        AbstractC1697a.i((i7.f983c && ((Uri) i7.f985e) == null) ? false : true);
        UUID uuid = (UUID) i7.f984d;
        uuid.getClass();
        this.f16765a = uuid;
        this.f16766b = (Uri) i7.f985e;
        this.f16767c = (E4.K) i7.f986f;
        this.f16768d = i7.f981a;
        this.f16770f = i7.f983c;
        this.f16769e = i7.f982b;
        this.f16771g = (E4.I) i7.f987g;
        byte[] bArr = (byte[]) i7.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1495y)) {
            return false;
        }
        C1495y c1495y = (C1495y) obj;
        return this.f16765a.equals(c1495y.f16765a) && w2.t.a(this.f16766b, c1495y.f16766b) && w2.t.a(this.f16767c, c1495y.f16767c) && this.f16768d == c1495y.f16768d && this.f16770f == c1495y.f16770f && this.f16769e == c1495y.f16769e && this.f16771g.equals(c1495y.f16771g) && Arrays.equals(this.h, c1495y.h);
    }

    public final int hashCode() {
        int iHashCode = this.f16765a.hashCode() * 31;
        Uri uri = this.f16766b;
        return Arrays.hashCode(this.h) + ((this.f16771g.hashCode() + ((((((((this.f16767c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f16768d ? 1 : 0)) * 31) + (this.f16770f ? 1 : 0)) * 31) + (this.f16769e ? 1 : 0)) * 31)) * 31);
    }
}
