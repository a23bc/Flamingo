package r1;

import H.F;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1409c extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f15667q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1409c(w wVar, int i7) {
        super(1);
        this.f15666p = i7;
        this.f15667q = wVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f15666p) {
            case 0:
                return new F(13, this.f15667q);
            default:
                w wVar = this.f15667q;
                if (wVar.f15729s.f15722a) {
                    wVar.f15728r.a();
                }
                return Y4.o.f8736a;
        }
    }
}
