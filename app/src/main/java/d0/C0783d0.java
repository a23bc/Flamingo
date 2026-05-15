package d0;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0783d0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n0 f10980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10981r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0783d0(n0 n0Var, InterfaceC1180a interfaceC1180a, int i7) {
        super(1);
        this.f10979p = i7;
        this.f10980q = n0Var;
        this.f10981r = interfaceC1180a;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f10979p) {
            case 0:
                if (!this.f10980q.c()) {
                    this.f10981r.a();
                }
                break;
            default:
                if (!this.f10980q.c()) {
                    this.f10981r.a();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
