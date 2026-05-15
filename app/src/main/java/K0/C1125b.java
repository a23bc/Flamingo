package k0;

import E0.G;
import java.util.NoSuchElementException;
import n5.InterfaceC1240d;

/* JADX INFO: renamed from: k0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1125b extends C1124a implements InterfaceC1240d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final G f13969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f13970s;

    public C1125b(G g6, Object obj, Object obj2) {
        super(obj, 0, obj2);
        this.f13969r = g6;
        this.f13970s = obj2;
    }

    @Override // k0.C1124a, java.util.Map.Entry
    public final Object getValue() {
        return this.f13970s;
    }

    @Override // k0.C1124a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f13970s;
        this.f13970s = obj;
        C1129f c1129f = (C1129f) this.f13969r.f1656p;
        C1128e c1128e = c1129f.f13983r;
        Object obj3 = this.f13967p;
        if (!c1128e.containsKey(obj3)) {
            return obj2;
        }
        boolean z6 = c1129f.f13976q;
        if (!z6) {
            c1128e.put(obj3, obj);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            AbstractC1136m abstractC1136m = c1129f.f13974o[c1129f.f13975p];
            Object obj4 = abstractC1136m.f13997o[abstractC1136m.f13999q];
            c1128e.put(obj3, obj);
            c1129f.d(obj4 != null ? obj4.hashCode() : 0, c1128e.f13979q, obj4, 0);
        }
        c1129f.f13986u = c1128e.f13981s;
        return obj2;
    }
}
