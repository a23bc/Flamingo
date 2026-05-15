package s2;

import Y1.s;
import androidx.lifecycle.Q;
import t.U;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1430a extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f15865c = new s(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f15866b = new U(0);

    @Override // androidx.lifecycle.Q
    public final void d() {
        U u7 = this.f15866b;
        if (u7.h() > 0) {
            u7.i(0).getClass();
            throw new ClassCastException();
        }
        int i7 = u7.f16040r;
        Object[] objArr = u7.f16039q;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        u7.f16040r = 0;
        u7.f16037o = false;
    }
}
