package D;

/* JADX INFO: renamed from: D.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0062e implements InterfaceC0064f, InterfaceC0067h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1313a;

    /* JADX INFO: renamed from: b */
    public final float f1314b;

    public C0062e(int i7) {
        this.f1313a = i7;
        switch (i7) {
            case 1:
                this.f1314b = 0;
                break;
            case 2:
                this.f1314b = 0;
                break;
            case 3:
                this.f1314b = 0;
                break;
            default:
                this.f1314b = 0;
                break;
        }
    }

    @Override // D.InterfaceC0064f, D.InterfaceC0067h
    public final float a() {
        switch (this.f1313a) {
        }
        return this.f1314b;
    }

    @Override // D.InterfaceC0067h
    public final void b(n1.d dVar, int i7, int[] iArr, int[] iArr2) {
        switch (this.f1313a) {
            case 0:
                AbstractC0068i.a(i7, iArr, iArr2, false);
                break;
            case 1:
                AbstractC0068i.d(i7, iArr, iArr2, false);
                break;
            case 2:
                AbstractC0068i.e(i7, iArr, iArr2, false);
                break;
            default:
                AbstractC0068i.f(i7, iArr, iArr2, false);
                break;
        }
    }

    @Override // D.InterfaceC0064f
    public final void c(n1.d dVar, int i7, int[] iArr, n1.n nVar, int[] iArr2) {
        switch (this.f1313a) {
            case 0:
                if (nVar != n1.n.f14521o) {
                    AbstractC0068i.a(i7, iArr, iArr2, true);
                } else {
                    AbstractC0068i.a(i7, iArr, iArr2, false);
                }
                break;
            case 1:
                if (nVar != n1.n.f14521o) {
                    AbstractC0068i.d(i7, iArr, iArr2, true);
                } else {
                    AbstractC0068i.d(i7, iArr, iArr2, false);
                }
                break;
            case 2:
                if (nVar != n1.n.f14521o) {
                    AbstractC0068i.e(i7, iArr, iArr2, true);
                } else {
                    AbstractC0068i.e(i7, iArr, iArr2, false);
                }
                break;
            default:
                if (nVar != n1.n.f14521o) {
                    AbstractC0068i.f(i7, iArr, iArr2, true);
                } else {
                    AbstractC0068i.f(i7, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f1313a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
