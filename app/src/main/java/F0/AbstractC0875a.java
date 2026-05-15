package f0;

import java.util.ArrayList;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0875a implements InterfaceC0881d {

    /* JADX INFO: renamed from: o */
    public final Object f11786o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f11787p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public Object f11788q;

    public AbstractC0875a(Object obj) {
        this.f11786o = obj;
        this.f11788q = obj;
    }

    @Override // f0.InterfaceC0881d
    public final void G() {
        this.f11788q = this.f11787p.remove(r0.size() - 1);
    }

    public final void a() {
        this.f11787p.clear();
        this.f11788q = this.f11786o;
        c();
    }

    public final Object b() {
        return this.f11788q;
    }

    public abstract void c();

    @Override // f0.InterfaceC0881d
    public final void l(Object obj) {
        this.f11787p.add(this.f11788q);
        this.f11788q = obj;
    }

    @Override // f0.InterfaceC0881d
    public void m() {
        Object obj = this.f11788q;
        InterfaceC0895k interfaceC0895k = obj instanceof InterfaceC0895k ? (InterfaceC0895k) obj : null;
        if (interfaceC0895k != null) {
            interfaceC0895k.e();
        }
    }

    @Override // f0.InterfaceC0881d
    public /* synthetic */ void q() {
    }

    @Override // f0.InterfaceC0881d
    public final void z(Object obj, l5.e eVar) {
        eVar.invoke(b(), obj);
    }
}
