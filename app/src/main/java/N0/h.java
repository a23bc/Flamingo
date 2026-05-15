package n0;

import f0.AbstractC0911s0;
import f0.c1;
import k0.C1128e;
import k0.C1135l;
import m0.C1190b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C1128e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f14489u;

    @Override // k0.C1128e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0911s0) {
            return super.containsKey((AbstractC0911s0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof c1) {
            return super.containsValue((c1) obj);
        }
        return false;
    }

    @Override // k0.C1128e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final i a() {
        C1135l c1135l = this.f13979q;
        i iVar = this.f14489u;
        if (c1135l != iVar.f13972o) {
            this.f13978p = new C1190b();
            iVar = new i(this.f13979q, this.f13982t);
        }
        this.f14489u = iVar;
        return iVar;
    }

    @Override // k0.C1128e, java.util.AbstractMap, java.util.Map
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

    @Override // k0.C1128e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0911s0) {
            return (c1) super.remove((AbstractC0911s0) obj);
        }
        return null;
    }
}
