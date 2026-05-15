package z5;

import m5.AbstractC1209k;
import w5.C1793k;
import w5.N;

/* JADX INFO: loaded from: classes.dex */
public final class w implements N {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f21325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f21326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f21327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1793k f21328r;

    public w(y yVar, long j3, Object obj, C1793k c1793k) {
        this.f21325o = yVar;
        this.f21326p = j3;
        this.f21327q = obj;
        this.f21328r = c1793k;
    }

    @Override // w5.N
    public final void a() {
        y yVar = this.f21325o;
        synchronized (yVar) {
            if (this.f21326p < yVar.o()) {
                return;
            }
            Object[] objArr = yVar.f21339v;
            AbstractC1209k.c(objArr);
            long j3 = this.f21326p;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            z.c(objArr, j3, z.f21344a);
            yVar.j();
        }
    }
}
