package w;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1654C f18739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f18740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f18741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f18742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18743e;

    public s0(InterfaceC1654C interfaceC1654C) {
        this.f18739a = interfaceC1654C;
        this.f18743e = interfaceC1654C.l();
    }

    public final r a(long j3, r rVar, r rVar2) {
        if (this.f18741c == null) {
            this.f18741c = rVar.c();
        }
        r rVar3 = this.f18741c;
        if (rVar3 == null) {
            AbstractC1209k.m("velocityVector");
            throw null;
        }
        int iB = rVar3.b();
        for (int i7 = 0; i7 < iB; i7++) {
            r rVar4 = this.f18741c;
            if (rVar4 == null) {
                AbstractC1209k.m("velocityVector");
                throw null;
            }
            rVar.getClass();
            rVar4.e(i7, this.f18739a.t(j3, rVar2.a(i7)));
        }
        r rVar5 = this.f18741c;
        if (rVar5 != null) {
            return rVar5;
        }
        AbstractC1209k.m("velocityVector");
        throw null;
    }
}
