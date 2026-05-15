package p0;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f14937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f14938q;

    public /* synthetic */ k(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, int i7) {
        this.f14936o = i7;
        this.f14937p = interfaceC1182c;
        this.f14938q = interfaceC1182c2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f14936o) {
            case 0:
                this.f14937p.b(obj);
                this.f14938q.b(obj);
                break;
            default:
                this.f14937p.b(obj);
                this.f14938q.b(obj);
                break;
        }
        return Y4.o.f8736a;
    }
}
