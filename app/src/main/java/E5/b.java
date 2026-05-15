package E5;

import Y4.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f2002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f2003r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i7) {
        super(1);
        this.f2001p = i7;
        this.f2002q = dVar;
        this.f2003r = cVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f2001p) {
            case 0:
                this.f2003r.getClass();
                this.f2002q.f(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.h;
                this.f2003r.getClass();
                d dVar = this.f2002q;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.f(null);
                break;
        }
        return o.f8736a;
    }
}
