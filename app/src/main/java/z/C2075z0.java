package z;

import l5.InterfaceC1182c;
import x0.C1892b;

/* JADX INFO: renamed from: z.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2075z0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f21021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f21022q;

    public /* synthetic */ C2075z0(Object obj, int i7, Object obj2) {
        this.f21020o = i7;
        this.f21021p = obj;
        this.f21022q = obj2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f21020o) {
            case 0:
                long j3 = ((C2057q) obj).f20944a;
                ((M0) this.f21021p).a(((P0) this.f21022q).f20714d == EnumC2048l0.f20895p ? C1892b.a(j3, 0.0f, 1) : C1892b.a(j3, 0.0f, 2), 1);
                break;
            default:
                ((Long) obj).longValue();
                t1 t1Var = (t1) this.f21021p;
                float f7 = t1Var.f20962e;
                t1Var.f20962e = 0.0f;
                ((InterfaceC1182c) this.f21022q).b(Float.valueOf(f7));
                break;
        }
        return Y4.o.f8736a;
    }
}
