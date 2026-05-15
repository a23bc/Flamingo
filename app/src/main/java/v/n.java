package V;

import g1.C0966h;
import g1.InterfaceC0965g;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC0965g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0965g[] f7340a;

    public n(InterfaceC0965g[] interfaceC0965gArr) {
        this.f7340a = interfaceC0965gArr;
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        for (InterfaceC0965g interfaceC0965g : this.f7340a) {
            interfaceC0965g.a(c0966h);
        }
    }
}
