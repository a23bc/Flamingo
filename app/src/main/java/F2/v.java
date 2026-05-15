package F2;

import D.D0;
import java.util.Comparator;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Comparator {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2306o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2307p;

    public /* synthetic */ v(int i7, Object obj) {
        this.f2306o = i7;
        this.f2307p = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2306o) {
            case 0:
                z zVar = (z) this.f2307p;
                return zVar.g(obj2) - zVar.g(obj);
            case 1:
                return ((Number) ((D0) this.f2307p).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((Y0.s) this.f2307p).invoke(obj, obj2)).intValue();
            default:
                for (InterfaceC1182c interfaceC1182c : (InterfaceC1182c[]) this.f2307p) {
                    int iR = N5.l.r((Comparable) interfaceC1182c.b(obj), (Comparable) interfaceC1182c.b(obj2));
                    if (iR != 0) {
                        return iR;
                    }
                }
                return 0;
        }
    }
}
