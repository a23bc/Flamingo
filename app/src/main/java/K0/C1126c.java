package k0;

import i0.InterfaceC1056d;
import l0.C1157a;

/* JADX INFO: renamed from: k0.c */
/* JADX INFO: loaded from: classes.dex */
public class C1126c extends Z4.f implements InterfaceC1056d {

    /* JADX INFO: renamed from: q */
    public static final C1126c f13971q = new C1126c(C1135l.f13992e, 0);

    /* JADX INFO: renamed from: o */
    public final C1135l f13972o;

    /* JADX INFO: renamed from: p */
    public final int f13973p;

    public C1126c(C1135l c1135l, int i7) {
        this.f13972o = c1135l;
        this.f13973p = i7;
    }

    @Override // i0.InterfaceC1056d
    /* JADX INFO: renamed from: b */
    public C1128e k() {
        return new C1128e(this);
    }

    public final C1126c c(Object obj, C1157a c1157a) {
        C1.k kVarU = this.f13972o.u(obj != null ? obj.hashCode() : 0, obj, c1157a, 0);
        return kVarU == null ? this : new C1126c((C1135l) kVarU.f960p, this.f13973p + kVarU.f959o);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13972o.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f13972o.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
