package n0;

import f0.AbstractC0911s0;
import f0.InterfaceC0906p0;
import f0.c1;
import i0.InterfaceC1055c;
import k0.C1126c;
import k0.C1128e;
import k0.C1135l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends C1126c implements InterfaceC0906p0 {

    /* JADX INFO: renamed from: r */
    public static final i f14490r = new i(C1135l.f13992e, 0);

    @Override // k0.C1126c
    /* JADX INFO: renamed from: b */
    public final C1128e k() {
        h hVar = new h(this);
        hVar.f14489u = this;
        return hVar;
    }

    @Override // k0.C1126c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0911s0) {
            return super.containsKey((AbstractC0911s0) obj);
        }
        return false;
    }

    @Override // Z4.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof c1) {
            return super.containsValue((c1) obj);
        }
        return false;
    }

    public final i d(AbstractC0911s0 abstractC0911s0, c1 c1Var) {
        C1.k kVarU = this.f13972o.u(abstractC0911s0.hashCode(), abstractC0911s0, c1Var, 0);
        return kVarU == null ? this : new i((C1135l) kVarU.f960p, this.f13973p + kVarU.f959o);
    }

    @Override // k0.C1126c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0911s0) {
            return (c1) super.get((AbstractC0911s0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0911s0) ? obj2 : (c1) super.getOrDefault((AbstractC0911s0) obj, (c1) obj2);
    }

    @Override // k0.C1126c, i0.InterfaceC1056d
    public final InterfaceC1055c k() {
        h hVar = new h(this);
        hVar.f14489u = this;
        return hVar;
    }
}
