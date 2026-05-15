package L;

import n1.n;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements InterfaceC1963M {

    /* JADX INFO: renamed from: a */
    public final b f4080a;

    /* JADX INFO: renamed from: b */
    public final b f4081b;

    /* JADX INFO: renamed from: c */
    public final b f4082c;

    /* JADX INFO: renamed from: d */
    public final b f4083d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f4080a = bVar;
        this.f4081b = bVar2;
        this.f4082c = bVar3;
        this.f4083d = bVar4;
    }

    @Override // y0.InterfaceC1963M
    public final AbstractC1959I a(long j3, n nVar, n1.d dVar) {
        float fA = this.f4080a.a(j3, dVar);
        float fA2 = this.f4081b.a(j3, dVar);
        float fA3 = this.f4082c.a(j3, dVar);
        float fA4 = this.f4083d.a(j3, dVar);
        float fC = C1895e.c(j3);
        float f7 = fA + fA4;
        if (f7 > fC) {
            float f8 = fC / f7;
            fA *= f8;
            fA4 *= f8;
        }
        float f9 = fA2 + fA3;
        if (f9 > fC) {
            float f10 = fC / f9;
            fA2 *= f10;
            fA3 *= f10;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            C.b.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return b(j3, fA, fA2, fA3, fA4, nVar);
    }

    public abstract AbstractC1959I b(long j3, float f7, float f8, float f9, float f10, n nVar);
}
