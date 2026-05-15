package X0;

import Y4.o;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import n1.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f8238q = new d(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f8239r = new d(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f8240s = new d(1, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8241p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i8) {
        super(i7);
        this.f8241p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f8241p) {
            case 0:
                ((Number) obj).longValue();
                return o.f8736a;
            case 1:
                return Integer.valueOf(((k) obj).f8259b);
            default:
                l lVar = ((k) obj).f8260c;
                return Integer.valueOf(lVar.f14519d - lVar.f14517b);
        }
    }
}
