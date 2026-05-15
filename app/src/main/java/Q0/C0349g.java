package Q0;

/* JADX INFO: renamed from: Q0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0349g implements w0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0349g f5993a = new C0349g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f5994b;

    @Override // w0.l
    public final /* synthetic */ void a(q1.n nVar) {
    }

    @Override // w0.l
    public final boolean b() {
        Boolean bool = f5994b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw n1.c.p("canFocus is read before it is written");
    }

    @Override // w0.l
    public final void c(boolean z6) {
        f5994b = Boolean.valueOf(z6);
    }

    @Override // w0.l
    public final /* synthetic */ void d(q1.n nVar) {
    }
}
