package K0;

import Q0.E0;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import m5.C1216r;

/* JADX INFO: renamed from: K0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238f extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3875p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1216r f3876q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238f(k.I i7, u0.d dVar, C1216r c1216r) {
        super(1);
        this.f3876q = c1216r;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f3875p) {
            case 0:
                if (((AbstractC0240h) obj).f3880E) {
                    this.f3876q.f14435o = false;
                }
                break;
            default:
                u0.d dVar = (u0.d) obj;
                if (dVar.f15636B) {
                    if (dVar.f17134D != null) {
                        N0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    dVar.f17134D = null;
                    C1216r c1216r = this.f3876q;
                    c1216r.f14435o = c1216r.f14435o;
                }
                break;
        }
        return E0.f5783o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238f(C1216r c1216r) {
        super(1);
        this.f3876q = c1216r;
    }
}
