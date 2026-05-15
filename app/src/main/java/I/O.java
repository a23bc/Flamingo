package I;

import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import o0.AbstractC1256m;
import w5.AbstractC1767D;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3317a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f3318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f3319c;

    static {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        f3318b = new z(0, 0, 0, 0, 0, 0, A.m.f43a, new M(), AbstractC1767D.a(c5.j.f10685o));
        f3319c = new N();
    }

    public static final long a(z zVar, int i7) {
        int i8 = zVar.f3410c;
        long j3 = (((((long) i7) * ((long) (zVar.f3409b + i8))) + ((long) (-zVar.f3413f))) + ((long) zVar.f3411d)) - ((long) i8);
        int iG = (int) (zVar.f3412e == EnumC2048l0.f20895p ? zVar.g() >> 32 : zVar.g() & 4294967295L);
        zVar.f3419n.getClass();
        long jQ = j3 - ((long) (iG - i6.h.q(0, 0, iG)));
        if (jQ < 0) {
            return 0L;
        }
        return jQ;
    }

    public static final C0211c b(InterfaceC1180a interfaceC1180a, C0912t c0912t) {
        Object[] objArr = new Object[0];
        V1.a aVar = C0211c.f3328I;
        boolean zD = c0912t.d(0) | c0912t.c(0.0f);
        Object objK = c0912t.K();
        if (zD || objK == C0903o.f11850a) {
            objK = new L(interfaceC1180a, 0);
            c0912t.i0(objK);
        }
        C0211c c0211c = (C0211c) AbstractC1256m.d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 0);
        c0211c.f3329H.setValue(interfaceC1180a);
        return c0211c;
    }
}
