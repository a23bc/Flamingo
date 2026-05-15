package z0;

import t.AbstractC1458m;
import t.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f21063a;

    static {
        q qVar = d.f21037e;
        int i7 = qVar.f21032c;
        e eVar = new e(qVar, qVar, 1);
        l lVar = d.f21054x;
        int i8 = lVar.f21032c << 6;
        int i9 = qVar.f21032c;
        int i10 = i8 | i9;
        g gVar = new g(qVar, lVar, 0);
        int i11 = (i9 << 6) | lVar.f21032c;
        g gVar2 = new g(lVar, qVar, 0);
        y yVar = AbstractC1458m.f16088a;
        y yVar2 = new y();
        yVar2.h(i7 | (i7 << 6), eVar);
        yVar2.h(i10, gVar);
        yVar2.h(i11, gVar2);
        f21063a = yVar2;
    }
}
