package G;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f2538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f2539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f2540f;

    public m(q qVar, int i7, int i8, l lVar, t tVar) {
        this.f2540f = qVar;
        this.f2535a = qVar;
        this.f2536b = i7;
        this.f2537c = i8;
        this.f2538d = lVar;
        this.f2539e = tVar;
    }

    public final long a(int i7, int i8) {
        int i9;
        q qVar = this.f2535a;
        int[] iArr = qVar.f2585a;
        if (i8 == 1) {
            i9 = iArr[i7];
        } else {
            int i10 = (i8 + i7) - 1;
            int[] iArr2 = qVar.f2586b;
            i9 = (iArr2[i10] + iArr[i10]) - iArr2[i7];
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 < 0) {
            n1.j.a("width must be >= 0");
        }
        return n1.b.h(i9, i9, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final p b(int i7) {
        C1.k kVarC = this.f2539e.c(i7);
        ?? r52 = kVarC.f960p;
        int size = r52.size();
        int i8 = 0;
        int i9 = kVarC.f959o;
        int i10 = (size == 0 || i9 + size == this.f2536b) ? 0 : this.f2537c;
        o[] oVarArr = new o[size];
        int i11 = 0;
        while (i8 < size) {
            int i12 = (int) ((b) r52.get(i8)).f2485a;
            int i13 = i10;
            o oVarB1 = this.f2538d.b1(i9 + i8, a(i11, i12), i11, i12, i13);
            i11 += i12;
            oVarArr[i8] = oVarB1;
            i8++;
            i10 = i13;
        }
        return new p(i7, oVarArr, this.f2540f, r52, i10);
    }
}
