package Q0;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: Q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0353i extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q */
    public static final C0353i f6009q = new C0353i(0, 0);

    /* JADX INFO: renamed from: r */
    public static final C0353i f6010r = new C0353i(0, 1);

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f6011p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0353i(int i7, int i8) {
        super(i7);
        this.f6011p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f6011p) {
            case 0:
                return new K(2);
            default:
                return new K(3);
        }
    }
}
