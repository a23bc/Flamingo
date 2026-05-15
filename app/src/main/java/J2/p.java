package J2;

import t2.i0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f3723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3724b;

    public p(i0 i0Var, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC1697a.n("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f3723a = i0Var;
        this.f3724b = iArr;
    }
}
