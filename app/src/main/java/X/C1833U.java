package x;

import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1955E;
import y0.InterfaceC1963M;

/* JADX INFO: renamed from: x.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1833U implements InterfaceC1963M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1833U f19688b = new C1833U(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1833U f19689c = new C1833U(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19690a;

    public /* synthetic */ C1833U(int i7) {
        this.f19690a = i7;
    }

    @Override // y0.InterfaceC1963M
    public final AbstractC1959I a(long j3, n1.n nVar, n1.d dVar) {
        switch (this.f19690a) {
            case 0:
                float fL = dVar.L(AbstractC1889z.f19862a);
                return new C1955E(new C1893c(0.0f, -fL, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + fL));
            default:
                float fL2 = dVar.L(AbstractC1889z.f19862a);
                return new C1955E(new C1893c(-fL2, 0.0f, Float.intBitsToFloat((int) (j3 >> 32)) + fL2, Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
    }
}
