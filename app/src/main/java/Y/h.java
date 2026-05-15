package Y;

import Q0.AbstractC0347f;
import y0.AbstractC1959I;
import y0.C1987t;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC1988u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8373b;

    public /* synthetic */ h(int i7, Object obj) {
        this.f8372a = i7;
        this.f8373b = obj;
    }

    @Override // y0.InterfaceC1988u
    public final long a() {
        switch (this.f8372a) {
            case 0:
                j jVar = (j) this.f8373b;
                long jA = jVar.f8379H.a();
                if (jA != 16) {
                    return jA;
                }
                l lVar = (l) AbstractC0347f.i(jVar, m.f8384a);
                if (lVar != null) {
                    long j3 = lVar.f8383a;
                    if (j3 != 16) {
                        return j3;
                    }
                }
                long j7 = ((C1987t) AbstractC0347f.i(jVar, e.f8369a)).f20264a;
                return (((Boolean) ((a) AbstractC0347f.i(jVar, c.f8367a)).f8356m.getValue()).booleanValue() || ((double) AbstractC1959I.o(j7)) >= 0.5d) ? j7 : C1987t.f20259f;
            default:
                return ((n) this.f8373b).f8390b;
        }
    }
}
