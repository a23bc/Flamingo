package M;

import X.InterfaceC0494p;
import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: M.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0248a implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f4522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4524r;

    public /* synthetic */ C0248a(Object obj, Object obj2, long j3, int i7, int i8) {
        this.f4521o = i8;
        this.f4523q = obj;
        this.f4524r = obj2;
        this.f4522p = j3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4521o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(1);
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) this.f4524r;
                long j3 = this.f4522p;
                AbstractC0260g.a((InterfaceC0494p) this.f4523q, interfaceC1398p, j3, (C0912t) obj, iB);
                break;
            case 1:
                ((Integer) obj2).getClass();
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f4523q;
                AbstractC1209k.f(interfaceC1180a, "$expandedLambda");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f4524r;
                AbstractC1209k.f(interfaceC1182c, "$expandedOnChanged");
                i6.z.a(interfaceC1180a, interfaceC1182c, this.f4522p, (C0912t) obj, C0879c.B(55));
                break;
            default:
                ((Integer) obj2).getClass();
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f4523q;
                AbstractC1209k.f(interfaceC1180a2, "$progress");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f4524r;
                AbstractC1209k.f(interfaceC1180a3, "$colorLambda");
                u6.E0.b(interfaceC1180a2, this.f4522p, interfaceC1180a3, (C0912t) obj, C0879c.B(1));
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0248a(InterfaceC1180a interfaceC1180a, long j3, InterfaceC1180a interfaceC1180a2, int i7) {
        this.f4521o = 2;
        this.f4523q = interfaceC1180a;
        this.f4522p = j3;
        this.f4524r = interfaceC1180a2;
    }
}
