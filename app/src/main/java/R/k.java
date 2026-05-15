package R;

import f0.C0912t;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l5.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f6194p = new k(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f6195q = new k(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6196o;

    public /* synthetic */ k(int i7) {
        this.f6196o = i7;
    }

    @Override // l5.h
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i7;
        int i8;
        switch (this.f6196o) {
            case 0:
                P.g gVar = (P.g) obj;
                T.e eVar = (T.e) obj2;
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj3;
                C0912t c0912t = (C0912t) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i7 = ((iIntValue & 8) == 0 ? c0912t.f(gVar) : c0912t.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i7 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i7 |= (iIntValue & 64) == 0 ? c0912t.f(eVar) : c0912t.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i7 |= c0912t.h(interfaceC1180a) ? 256 : 128;
                }
                if (c0912t.N(i7 & 1, (i7 & 1171) != 1170)) {
                    p.c(gVar, eVar, interfaceC1180a, c0912t, i7 & 1022);
                } else {
                    c0912t.Q();
                }
                break;
            default:
                P.g gVar2 = (P.g) obj;
                T.e eVar2 = (T.e) obj2;
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) obj3;
                C0912t c0912t2 = (C0912t) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i8 = ((iIntValue2 & 8) == 0 ? c0912t2.f(gVar2) : c0912t2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i8 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i8 |= (iIntValue2 & 64) == 0 ? c0912t2.f(eVar2) : c0912t2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i8 |= c0912t2.h(interfaceC1180a2) ? 256 : 128;
                }
                if (c0912t2.N(i8 & 1, (i8 & 1171) != 1170)) {
                    p.c(gVar2, eVar2, interfaceC1180a2, c0912t2, i8 & 1022);
                } else {
                    c0912t2.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
