package E0;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0.b f1642a;

    public abstract void a(A0.f fVar);

    public InterfaceC1182c b() {
        return this.f1642a;
    }

    public final void c() {
        InterfaceC1182c interfaceC1182cB = b();
        if (interfaceC1182cB != null) {
            interfaceC1182cB.b(this);
        }
    }

    public void d(B0.b bVar) {
        this.f1642a = bVar;
    }
}
