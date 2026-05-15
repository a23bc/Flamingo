package N3;

import w.r0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static p f5143p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5144o;

    public /* synthetic */ p(int i7) {
        this.f5144o = i7;
    }

    public static synchronized p d() {
        try {
            if (f5143p == null) {
                f5143p = new p(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5143p;
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // w.q0
    public /* synthetic */ boolean a() {
        return false;
    }

    public void b(Throwable... thArr) {
        if (this.f5144o > 3 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    public void c(Throwable... thArr) {
        if (this.f5144o > 6 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    @Override // w.q0
    public long e(w.r rVar, w.r rVar2, w.r rVar3) {
        return ((long) n()) * 1000000;
    }

    @Override // w.q0
    public w.r f(w.r rVar, w.r rVar2, w.r rVar3) {
        return rVar3;
    }

    public int g() {
        int i7 = this.f5144o;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 == 42) {
            return 16;
        }
        if (i7 != 22) {
            return i7 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void h(Throwable... thArr) {
        if (this.f5144o > 4 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    public void j(Throwable... thArr) {
        if (this.f5144o > 5 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    @Override // w.r0
    public int n() {
        return this.f5144o;
    }

    @Override // w.q0
    public w.r o(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return j3 < ((long) this.f5144o) * 1000000 ? rVar : rVar2;
    }

    @Override // w.r0
    public int v() {
        return 0;
    }

    @Override // w.q0
    public w.r w(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return rVar3;
    }
}
