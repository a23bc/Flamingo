package K0;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1220v;
import u5.AbstractC1545g;

/* JADX INFO: renamed from: K0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239g extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3877p = 1;

    public /* synthetic */ C0239g(int i7) {
        super(i7);
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f3877p) {
            case 0:
                ((AbstractC0240h) obj).getClass();
                return Boolean.TRUE;
            default:
                String str = (String) obj;
                AbstractC1209k.f(str, "it");
                return AbstractC1545g.Z(str) ? str.length() < 2 ? "  " : str : "  ".concat(str);
        }
    }

    public C0239g(C1220v c1220v) {
        super(1);
    }
}
