package b1;

import l5.InterfaceC1182c;
import o0.C1245b;
import o0.InterfaceC1255l;

/* JADX INFO: renamed from: b1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605A implements InterfaceC1255l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l5.e f9876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f9877p;

    public C0605A(l5.e eVar, InterfaceC1182c interfaceC1182c) {
        this.f9876o = eVar;
        this.f9877p = interfaceC1182c;
    }

    @Override // o0.InterfaceC1255l
    public final Object g(C1245b c1245b, Object obj) {
        return this.f9876o.invoke(c1245b, obj);
    }
}
