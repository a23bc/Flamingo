package b2;

import E0.C0095f;
import d0.AbstractC0774A;
import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10040p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f10041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10044t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(int i7, long j3, H0 h02, l5.e eVar) {
        super(2);
        this.f10041q = j3;
        this.f10043s = h02;
        this.f10044t = eVar;
        this.f10042r = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10040p) {
            case 0:
                ((Number) obj2).intValue();
                int i7 = this.f10042r | 1;
                I0.c.i(i7, this.f10041q, (H0) this.f10043s, (C0912t) obj, (l5.e) this.f10044t);
                break;
            default:
                ((Number) obj2).intValue();
                int iB = C0879c.B(this.f10042r | 1);
                long j3 = this.f10041q;
                AbstractC0774A.b((C0095f) this.f10043s, (InterfaceC1398p) this.f10044t, j3, (C0912t) obj, iB);
                break;
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C0095f c0095f, InterfaceC1398p interfaceC1398p, long j3, int i7) {
        super(2);
        this.f10043s = c0095f;
        this.f10044t = interfaceC1398p;
        this.f10041q = j3;
        this.f10042r = i7;
    }
}
