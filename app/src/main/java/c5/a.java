package c5;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f10678o;

    public a(h hVar) {
        this.f10678o = hVar;
    }

    @Override // c5.g
    public final h getKey() {
        return this.f10678o;
    }

    @Override // c5.i
    public final i h(i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public g n(h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // c5.i
    public i u(h hVar) {
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }
}
