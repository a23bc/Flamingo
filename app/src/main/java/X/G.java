package X;

import b1.AbstractC0607C;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0480i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f7900b = new G(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f7901c = new G(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f7902d = new F(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F f7903e = new F(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F f7904f = new F(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F f7905g = new F(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7906a;

    public /* synthetic */ G(int i7) {
        this.f7906a = i7;
    }

    @Override // X.InterfaceC0480i
    public long a(B b7, int i7) {
        switch (this.f7906a) {
            case 0:
                String str = b7.f7878f.f9929a.f9920a.f9970p;
                return AbstractC0607C.b(M.V.q(str, i7), M.V.p(str, i7));
            default:
                return b7.f7878f.k(i7);
        }
    }
}
