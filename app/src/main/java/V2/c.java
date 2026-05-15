package V2;

import C2.N;
import N2.A;
import N2.B;
import N2.C;
import N2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ B f7423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ N f7424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(N n7, B b7, B b8) {
        super(b7);
        this.f7424c = n7;
        this.f7423b = b8;
    }

    @Override // N2.t, N2.B
    public final A j(long j3) {
        A aJ = this.f7423b.j(j3);
        C c7 = aJ.f4963a;
        long j7 = c7.f4966a;
        long j8 = this.f7424c.f1005o;
        C c8 = new C(j7, c7.f4967b + j8);
        C c9 = aJ.f4964b;
        return new A(c8, new C(c9.f4966a, c9.f4967b + j8));
    }
}
