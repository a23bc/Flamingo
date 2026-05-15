package G;

import H.N;
import H.O;
import H.P;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f2528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f2529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N f2531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f2532g;
    public final /* synthetic */ int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, N n7, int i7, x xVar, int i8, int i9, long j3) {
        super(0);
        this.f2531f = n7;
        this.f2532g = xVar;
        this.h = i8;
        this.f2533i = i9;
        this.f2534j = j3;
        this.f2528c = hVar;
        this.f2529d = n7;
        this.f2530e = i7;
    }

    @Override // H.P
    public final O S0(int i7, int i8, int i9, long j3) {
        return b1(i7, j3, i8, i9, this.f2530e);
    }

    public final o b1(int i7, long j3, int i8, int i9, int i10) {
        int i11;
        h hVar = this.f2528c;
        Object objB = hVar.b(i7);
        Object objL = hVar.f2510b.l(i7);
        List listT0 = T0(this.f2529d, i7, j3);
        if (n1.a.f(j3)) {
            i11 = n1.a.j(j3);
        } else {
            if (!n1.a.e(j3)) {
                C.b.a("does not have fixed height");
            }
            i11 = n1.a.i(j3);
        }
        int i12 = i11;
        n1.n layoutDirection = this.f2531f.f2809p.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.b bVar = this.f2532g.f2621m;
        return new o(i7, objB, i12, i10, layoutDirection, this.h, this.f2533i, listT0, this.f2534j, objL, bVar, j3, i8, i9);
    }
}
