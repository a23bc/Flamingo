package H;

import java.util.Arrays;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1.a f2774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2776d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2779g;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.b h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0183z[] f2773a = E.f2782a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2777e = 1;

    public C(androidx.compose.foundation.lazy.layout.b bVar) {
        this.h = bVar;
    }

    public static void b(C c7, O o7, InterfaceC1765B interfaceC1765B, y0.y yVar, int i7, int i8) {
        c7.h.getClass();
        long jF = o7.f(0);
        c7.a(o7, interfaceC1765B, yVar, i7, i8, (int) (!o7.c() ? jF & 4294967295L : jF >> 32));
    }

    public final void a(O o7, InterfaceC1765B interfaceC1765B, y0.y yVar, int i7, int i8, int i9) {
        C0183z[] c0183zArr = this.f2773a;
        int length = c0183zArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                this.f2778f = i7;
                this.f2779g = i8;
                break;
            } else {
                C0183z c0183z = c0183zArr[i10];
                if (c0183z != null && c0183z.f2944e) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        int length2 = this.f2773a.length;
        for (int iB = o7.b(); iB < length2; iB++) {
            C0183z c0183z2 = this.f2773a[iB];
            if (c0183z2 != null) {
                c0183z2.c();
            }
        }
        if (this.f2773a.length != o7.b()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f2773a, o7.b());
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f2773a = (C0183z[]) objArrCopyOf;
        }
        this.f2774b = new n1.a(o7.j());
        this.f2775c = i9;
        this.f2776d = o7.i();
        this.f2777e = o7.g();
        int iB2 = o7.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            Object objH = o7.h(i11);
            C0168j c0168j = objH instanceof C0168j ? (C0168j) objH : null;
            if (c0168j == null) {
                C0183z c0183z3 = this.f2773a[i11];
                if (c0183z3 != null) {
                    c0183z3.c();
                }
                this.f2773a[i11] = null;
            } else {
                C0183z c0183z4 = this.f2773a[i11];
                if (c0183z4 == null) {
                    c0183z4 = new C0183z(interfaceC1765B, yVar, new E3.e(1, this.h));
                    this.f2773a[i11] = c0183z4;
                }
                c0183z4.f2943d = c0168j.f2889C;
            }
        }
    }
}
