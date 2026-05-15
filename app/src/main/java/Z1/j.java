package Z1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f8777b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f8776a = m.f8781a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8778c = 1;

    @Override // Z1.i
    public final i a() {
        j jVar = new j();
        jVar.f8776a = this.f8776a;
        jVar.f8777b = this.f8777b;
        jVar.f8778c = this.f8778c;
        return jVar;
    }

    @Override // Z1.i
    public final o b() {
        return this.f8776a;
    }

    @Override // Z1.i
    public final void c(o oVar) {
        this.f8776a = oVar;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f8776a + ", provider=" + this.f8777b + ", colorFilterParams=null, contentScale=" + ((Object) g2.j.a(this.f8778c)) + ')';
    }
}
