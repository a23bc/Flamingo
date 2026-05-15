package N3;

import android.os.Build;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i */
    public static final c f5117i;

    /* JADX INFO: renamed from: b */
    public boolean f5119b;

    /* JADX INFO: renamed from: c */
    public boolean f5120c;

    /* JADX INFO: renamed from: d */
    public boolean f5121d;

    /* JADX INFO: renamed from: e */
    public boolean f5122e;

    /* JADX INFO: renamed from: a */
    public int f5118a = 1;

    /* JADX INFO: renamed from: f */
    public long f5123f = -1;

    /* JADX INFO: renamed from: g */
    public long f5124g = -1;
    public e h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f5118a = 1;
        cVar.f5123f = -1L;
        cVar.f5124g = -1L;
        cVar.h = new e();
        cVar.f5119b = false;
        int i7 = Build.VERSION.SDK_INT;
        cVar.f5120c = false;
        cVar.f5118a = 1;
        cVar.f5121d = false;
        cVar.f5122e = false;
        if (i7 >= 24) {
            cVar.h = eVar;
            cVar.f5123f = -1L;
            cVar.f5124g = -1L;
        }
        f5117i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f5119b == cVar.f5119b && this.f5120c == cVar.f5120c && this.f5121d == cVar.f5121d && this.f5122e == cVar.f5122e && this.f5123f == cVar.f5123f && this.f5124g == cVar.f5124g && this.f5118a == cVar.f5118a) {
            return this.h.equals(cVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int iB = ((((((((AbstractC1676i.b(this.f5118a) * 31) + (this.f5119b ? 1 : 0)) * 31) + (this.f5120c ? 1 : 0)) * 31) + (this.f5121d ? 1 : 0)) * 31) + (this.f5122e ? 1 : 0)) * 31;
        long j3 = this.f5123f;
        int i7 = (iB + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f5124g;
        return this.h.f5127a.hashCode() + ((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }
}
