package com.cormor.overscroll.core;

import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.InterfaceC1398p;
import u4.f;
import u4.h;
import v.C1602U;
import w.C1689w;

/* JADX INFO: loaded from: classes.dex */
public final class OverScrollKt {
    public static InterfaceC1398p a(InterfaceC1398p interfaceC1398p) {
        AbstractC1209k.f(interfaceC1398p, "<this>");
        return AbstractC1383a.a(interfaceC1398p, new f());
    }

    public static final h b(InterfaceC1180a interfaceC1180a, C0912t c0912t) {
        AbstractC1209k.f(interfaceC1180a, "getScrollState");
        c0912t.X(215030395);
        C1689w c1689w = new C1689w(new C1602U());
        c0912t.X(30193535);
        boolean zF = c0912t.f(c1689w) | c0912t.f(interfaceC1180a);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new h(interfaceC1180a, c1689w);
            c0912t.i0(objK);
        }
        h hVar = (h) objK;
        c0912t.p(false);
        c0912t.p(false);
        return hVar;
    }
}
