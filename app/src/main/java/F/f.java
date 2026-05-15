package F;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class f implements H.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f2069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1182c f2070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.d f2071c;

    public f(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, n0.d dVar) {
        this.f2069a = interfaceC1182c;
        this.f2070b = interfaceC1182c2;
        this.f2071c = dVar;
    }

    @Override // H.r
    public final InterfaceC1182c a() {
        return this.f2070b;
    }

    @Override // H.r
    public final InterfaceC1182c getKey() {
        return this.f2069a;
    }
}
