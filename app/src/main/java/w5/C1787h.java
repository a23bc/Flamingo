package w5;

import l5.InterfaceC1182c;

/* JADX INFO: renamed from: w5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1787h implements InterfaceC1789i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19536b;

    public /* synthetic */ C1787h(int i7, Object obj) {
        this.f19535a = i7;
        this.f19536b = obj;
    }

    @Override // w5.InterfaceC1789i
    public final void c(Throwable th) {
        switch (this.f19535a) {
            case 0:
                ((InterfaceC1182c) this.f19536b).b(th);
                break;
            default:
                ((N) this.f19536b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f19535a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC1182c) this.f19536b).getClass().getSimpleName() + '@' + AbstractC1767D.m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((N) this.f19536b) + ']';
        }
    }
}
