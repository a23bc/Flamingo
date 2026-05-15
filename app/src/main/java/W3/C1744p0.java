package w3;

import android.util.SparseBooleanArray;
import java.util.HashSet;
import t2.C1485n;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1744p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w1 f19319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t2.T f19320e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f19321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.T f19322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E4.I f19323c;

    static {
        HashSet hashSet = new HashSet();
        E4.b0 b0Var = v1.f19378d;
        for (int i7 = 0; i7 < b0Var.f1915r; i7++) {
            hashSet.add(new v1(((Integer) b0Var.get(i7)).intValue()));
        }
        f19319d = new w1(hashSet);
        HashSet hashSet2 = new HashSet();
        E4.b0 b0Var2 = v1.f19379e;
        for (int i8 = 0; i8 < b0Var2.f1915r; i8++) {
            hashSet2.add(new v1(((Integer) b0Var2.get(i8)).intValue()));
        }
        for (int i9 = 0; i9 < b0Var.f1915r; i9++) {
            hashSet2.add(new v1(((Integer) b0Var.get(i9)).intValue()));
        }
        new w1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i10 : t2.S.f16351b) {
            AbstractC1697a.i(!false);
            sparseBooleanArray.append(i10, true);
        }
        AbstractC1697a.i(!false);
        f19320e = new t2.T(new C1485n(sparseBooleanArray));
    }

    public C1744p0(w1 w1Var, t2.T t7, E4.I i7) {
        this.f19321a = w1Var;
        this.f19322b = t7;
        this.f19323c = i7;
    }
}
