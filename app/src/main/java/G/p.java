package G;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o[] f2579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2584g;

    public p(int i7, o[] oVarArr, q qVar, List list, int i8) {
        this.f2578a = i7;
        this.f2579b = oVarArr;
        this.f2580c = qVar;
        this.f2581d = list;
        this.f2582e = i8;
        int iMax = 0;
        for (o oVar : oVarArr) {
            iMax = Math.max(iMax, oVar.f2568n);
        }
        this.f2583f = iMax;
        int i9 = iMax + this.f2582e;
        this.f2584g = i9 >= 0 ? i9 : 0;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final o[] a(int i7, int i8, int i9) {
        o[] oVarArr = this.f2579b;
        int length = oVarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            o oVar = oVarArr[i10];
            int i13 = i11 + 1;
            int i14 = (int) ((b) this.f2581d.get(i11)).f2485a;
            oVar.l(i7, this.f2580c.f2586b[i12], i8, i9, this.f2578a, i12);
            i12 += i14;
            i10++;
            i11 = i13;
        }
        return oVarArr;
    }
}
