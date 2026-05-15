package k0;

import Z4.AbstractC0507a;
import java.util.Iterator;

/* JADX INFO: renamed from: k0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1134k extends AbstractC0507a {

    /* JADX INFO: renamed from: o */
    public final C1126c f13991o;

    public C1134k(C1126c c1126c) {
        this.f13991o = c1126c;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        C1126c c1126c = this.f13991o;
        c1126c.getClass();
        return c1126c.f13973p;
    }

    @Override // Z4.AbstractC0507a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13991o.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1126c c1126c = this.f13991o;
        AbstractC1136m[] abstractC1136mArr = new AbstractC1136m[8];
        for (int i7 = 0; i7 < 8; i7++) {
            abstractC1136mArr[i7] = new C1137n(2);
        }
        return new C1133j(c1126c.f13972o, abstractC1136mArr);
    }
}
