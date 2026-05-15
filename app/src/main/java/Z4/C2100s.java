package z4;

import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: z4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2100s extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.d f21240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f21241q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2100s(int i7, n0.d dVar) {
        super(2);
        this.f21240p = dVar;
        this.f21241q = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            this.f21240p.invoke(c0912t, Integer.valueOf((this.f21241q >> 6) & 14));
        }
        return Y4.o.f8736a;
    }
}
