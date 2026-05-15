package B3;

import android.util.SparseBooleanArray;
import t2.C1485n;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f858b;

    public l() {
        this.f858b = new SparseBooleanArray();
    }

    public void a(int i7) {
        AbstractC1697a.i(!this.f857a);
        ((SparseBooleanArray) this.f858b).append(i7, true);
    }

    public void b(C1485n c1485n) {
        for (int i7 = 0; i7 < c1485n.f16552a.size(); i7++) {
            a(c1485n.b(i7));
        }
    }

    public void c(int... iArr) {
        for (int i7 : iArr) {
            a(i7);
        }
    }

    public C1485n d() {
        AbstractC1697a.i(!this.f857a);
        this.f857a = true;
        return new C1485n((SparseBooleanArray) this.f858b);
    }

    public l(String str, boolean z6) {
        this.f857a = z6;
        this.f858b = str;
    }
}
