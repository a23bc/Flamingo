package R1;

import O1.F;
import O1.InterfaceC0335g;
import e5.AbstractC0865c;
import z5.InterfaceC2110e;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0335g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f6659a;

    public d(F f7) {
        this.f6659a = f7;
    }

    @Override // O1.InterfaceC0335g
    public final Object a(l5.e eVar, AbstractC0865c abstractC0865c) {
        return this.f6659a.a(new c(eVar, null), abstractC0865c);
    }

    @Override // O1.InterfaceC0335g
    public final InterfaceC2110e b() {
        return this.f6659a.f5509d;
    }
}
