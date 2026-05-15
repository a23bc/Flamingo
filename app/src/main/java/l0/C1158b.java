package l0;

import Z4.i;
import i0.InterfaceC1057e;
import java.util.Iterator;
import k0.C1126c;
import m0.C1190b;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1158b extends i implements InterfaceC1057e {

    /* JADX INFO: renamed from: r */
    public static final C1158b f14148r;

    /* JADX INFO: renamed from: o */
    public final Object f14149o;

    /* JADX INFO: renamed from: p */
    public final Object f14150p;

    /* JADX INFO: renamed from: q */
    public final C1126c f14151q;

    static {
        C1190b c1190b = C1190b.f14325a;
        f14148r = new C1158b(c1190b, c1190b, C1126c.f13971q);
    }

    public C1158b(Object obj, Object obj2, C1126c c1126c) {
        this.f14149o = obj;
        this.f14150p = obj2;
        this.f14151q = c1126c;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        C1126c c1126c = this.f14151q;
        c1126c.getClass();
        return c1126c.f13973p;
    }

    @Override // Z4.AbstractC0507a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14151q.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1159c(this.f14149o, this.f14151q);
    }
}
