package q1;

import A2.W;
import Q0.K;
import androidx.lifecycle.InterfaceC0597u;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q */
    public static final l f15499q = new l(2, 0);

    /* JADX INFO: renamed from: r */
    public static final l f15500r = new l(2, 1);

    /* JADX INFO: renamed from: s */
    public static final l f15501s = new l(2, 2);

    /* JADX INFO: renamed from: t */
    public static final l f15502t = new l(2, 3);

    /* JADX INFO: renamed from: u */
    public static final l f15503u = new l(2, 4);

    /* JADX INFO: renamed from: v */
    public static final l f15504v = new l(2, 5);

    /* JADX INFO: renamed from: w */
    public static final l f15505w = new l(2, 6);

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f15506p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i7, int i8) {
        super(i7);
        this.f15506p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        switch (this.f15506p) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((K) obj).setUpdateBlock((InterfaceC1182c) obj2);
                return Y4.o.f8736a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((K) obj).setReleaseBlock((InterfaceC1182c) obj2);
                return Y4.o.f8736a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((K) obj).setModifier((InterfaceC1398p) obj2);
                return Y4.o.f8736a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((K) obj).setDensity((n1.d) obj2);
                return Y4.o.f8736a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((K) obj).setLifecycleOwner((InterfaceC0597u) obj2);
                return Y4.o.f8736a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((K) obj).setSavedStateRegistryOwner((E3.f) obj2);
                return Y4.o.f8736a;
            default:
                q qVarC = androidx.compose.ui.viewinterop.a.c((K) obj);
                int iOrdinal = ((n1.n) obj2).ordinal();
                if (iOrdinal != 0) {
                    i7 = 1;
                    if (iOrdinal != 1) {
                        throw new W();
                    }
                } else {
                    i7 = 0;
                }
                qVarC.setLayoutDirection(i7);
                return Y4.o.f8736a;
        }
    }
}
