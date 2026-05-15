package B0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f612q = new c(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f613r = new c(1, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f614p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, int i8) {
        super(i7);
        this.f614p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f614p) {
            case 0:
                break;
            default:
                A0.e.x(0.0f, 126, C1987t.f20261i, 0L, (A0.f) obj);
                break;
        }
        return Y4.o.f8736a;
    }
}
