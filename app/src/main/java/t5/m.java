package t5;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f17109q = new m(1, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f17110p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8) {
        super(i7);
        this.f17110p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f17110p) {
            case 0:
                return Boolean.valueOf(obj == null);
            default:
                AbstractC1209k.f(obj, "it");
                return Integer.valueOf(p5.d.f15102o.c(2147418112) + 65536);
        }
    }
}
