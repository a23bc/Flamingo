package W3;

import N2.z;
import N3.p;
import N3.v;
import Z1.l;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: s */
    public static final z f7804s;

    /* JADX INFO: renamed from: a */
    public String f7805a;

    /* JADX INFO: renamed from: b */
    public v f7806b = v.f5150o;

    /* JADX INFO: renamed from: c */
    public String f7807c;

    /* JADX INFO: renamed from: d */
    public String f7808d;

    /* JADX INFO: renamed from: e */
    public N3.h f7809e;

    /* JADX INFO: renamed from: f */
    public N3.h f7810f;

    /* JADX INFO: renamed from: g */
    public long f7811g;
    public long h;

    /* JADX INFO: renamed from: i */
    public long f7812i;

    /* JADX INFO: renamed from: j */
    public N3.c f7813j;

    /* JADX INFO: renamed from: k */
    public int f7814k;
    public int l;

    /* JADX INFO: renamed from: m */
    public long f7815m;

    /* JADX INFO: renamed from: n */
    public long f7816n;

    /* JADX INFO: renamed from: o */
    public long f7817o;

    /* JADX INFO: renamed from: p */
    public long f7818p;

    /* JADX INFO: renamed from: q */
    public boolean f7819q;

    /* JADX INFO: renamed from: r */
    public int f7820r;

    static {
        p.i("WorkSpec");
        f7804s = new z();
    }

    public i(String str, String str2) {
        N3.h hVar = N3.h.f5134b;
        this.f7809e = hVar;
        this.f7810f = hVar;
        this.f7813j = N3.c.f5117i;
        this.l = 1;
        this.f7815m = 30000L;
        this.f7818p = -1L;
        this.f7820r = 1;
        this.f7805a = str;
        this.f7807c = str2;
    }

    public final long a() {
        int i7;
        if (this.f7806b == v.f5150o && (i7 = this.f7814k) > 0) {
            return Math.min(18000000L, this.l == 2 ? this.f7815m * ((long) i7) : (long) Math.scalb(this.f7815m, i7 - 1)) + this.f7816n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f7816n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f7811g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j3 = this.f7816n;
        if (j3 == 0) {
            j3 = this.f7811g + jCurrentTimeMillis2;
        }
        long j7 = this.f7812i;
        long j8 = this.h;
        if (j7 != j8) {
            return j3 + j8 + (j3 == 0 ? j7 * (-1) : 0L);
        }
        return j3 + (j3 != 0 ? j8 : 0L);
    }

    public final boolean b() {
        return !N3.c.f5117i.equals(this.f7813j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f7811g != iVar.f7811g || this.h != iVar.h || this.f7812i != iVar.f7812i || this.f7814k != iVar.f7814k || this.f7815m != iVar.f7815m || this.f7816n != iVar.f7816n || this.f7817o != iVar.f7817o || this.f7818p != iVar.f7818p || this.f7819q != iVar.f7819q || !this.f7805a.equals(iVar.f7805a) || this.f7806b != iVar.f7806b || !this.f7807c.equals(iVar.f7807c)) {
            return false;
        }
        String str = this.f7808d;
        if (str != null) {
            if (!str.equals(iVar.f7808d)) {
                return false;
            }
        } else if (iVar.f7808d != null) {
            return false;
        }
        return this.f7809e.equals(iVar.f7809e) && this.f7810f.equals(iVar.f7810f) && this.f7813j.equals(iVar.f7813j) && this.l == iVar.l && this.f7820r == iVar.f7820r;
    }

    public final int hashCode() {
        int iC = A0.e.C(this.f7807c, (this.f7806b.hashCode() + (this.f7805a.hashCode() * 31)) * 31, 31);
        String str = this.f7808d;
        int iHashCode = (this.f7810f.hashCode() + ((this.f7809e.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j3 = this.f7811g;
        int i7 = (iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.h;
        int i8 = (i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f7812i;
        int iB = (AbstractC1676i.b(this.l) + ((((this.f7813j.hashCode() + ((i8 + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31) + this.f7814k) * 31)) * 31;
        long j9 = this.f7815m;
        int i9 = (iB + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f7816n;
        int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f7817o;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f7818p;
        return AbstractC1676i.b(this.f7820r) + ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f7819q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return l.t(new StringBuilder("{WorkSpec: "), this.f7805a, "}");
    }
}
