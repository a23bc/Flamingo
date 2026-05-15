package T;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.C0894j0;
import f0.C0912t;
import f0.C0915u0;
import l5.InterfaceC1180a;
import w5.AbstractC1767D;
import x.C1868o0;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a */
    public final n0.d f6837a;

    /* JADX INFO: renamed from: b */
    public final C1872q0 f6838b = new C1872q0();

    /* JADX INFO: renamed from: c */
    public final C0894j0 f6839c = C0879c.t(null);

    public c(n0.d dVar) {
        this.f6837a = dVar;
    }

    @Override // T.f
    public final Object a(e eVar, AbstractC0871i abstractC0871i) {
        R.g gVar = new R.g(this, new b(eVar), null, 1);
        EnumC1862l0 enumC1862l0 = EnumC1862l0.f19772o;
        C1872q0 c1872q0 = this.f6838b;
        c1872q0.getClass();
        Object objH = AbstractC1767D.h(new C1868o0(c1872q0, gVar, null), abstractC0871i);
        return objH == EnumC0830a.f11264o ? objH : o.f8736a;
    }

    public final void b(final InterfaceC1180a interfaceC1180a, C0912t c0912t, final int i7) {
        final InterfaceC1180a interfaceC1180a2;
        C0912t c0912t2;
        c0912t.Z(723898654);
        int i8 = (c0912t.f(this) ? 32 : 16) | i7;
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            b bVar = (b) this.f6839c.getValue();
            if (bVar == null) {
                C0915u0 c0915u0R = c0912t.r();
                if (c0915u0R != null) {
                    final int i9 = 0;
                    c0915u0R.f11932d = new l5.e(this, interfaceC1180a, i7, i9) { // from class: T.a

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ int f6832o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ c f6833p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC1180a f6834q;

                        {
                            this.f6832o = i9;
                            this.f6833p = this;
                        }

                        @Override // l5.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = this.f6832o;
                            C0912t c0912t3 = (C0912t) obj;
                            ((Integer) obj2).getClass();
                            switch (i10) {
                                case 0:
                                    this.f6833p.b(this.f6834q, c0912t3, C0879c.B(7));
                                    break;
                                default:
                                    this.f6833p.b(this.f6834q, c0912t3, C0879c.B(7));
                                    break;
                            }
                            return o.f8736a;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC1180a2 = interfaceC1180a;
            c0912t2 = c0912t;
            this.f6837a.g(bVar, bVar.f6835a, interfaceC1180a2, c0912t2, 384);
        } else {
            interfaceC1180a2 = interfaceC1180a;
            c0912t2 = c0912t;
            c0912t2.Q();
        }
        C0915u0 c0915u0R2 = c0912t2.r();
        if (c0915u0R2 != null) {
            final int i10 = 1;
            c0915u0R2.f11932d = new l5.e(this, interfaceC1180a2, i7, i10) { // from class: T.a

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ int f6832o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ c f6833p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f6834q;

                {
                    this.f6832o = i10;
                    this.f6833p = this;
                }

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    int i102 = this.f6832o;
                    C0912t c0912t3 = (C0912t) obj;
                    ((Integer) obj2).getClass();
                    switch (i102) {
                        case 0:
                            this.f6833p.b(this.f6834q, c0912t3, C0879c.B(7));
                            break;
                        default:
                            this.f6833p.b(this.f6834q, c0912t3, C0879c.B(7));
                            break;
                    }
                    return o.f8736a;
                }
            };
        }
    }
}
