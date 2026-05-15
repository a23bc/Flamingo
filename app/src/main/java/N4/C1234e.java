package n4;

import C1.k;
import t.C1465u;

/* JADX INFO: renamed from: n4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1234e extends C1465u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V1.a f14548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234e(int i7, V1.a aVar) {
        super(i7);
        this.f14548g = aVar;
    }

    @Override // t.C1465u
    public final void b(Object obj, Object obj2, Object obj3) {
        C1233d c1233d = (C1233d) obj2;
        ((k) this.f14548g.f7389o).h((C1230a) obj, c1233d.f14545a, c1233d.f14546b, c1233d.f14547c);
    }

    @Override // t.C1465u
    public final int g(Object obj, Object obj2) {
        return ((C1233d) obj2).f14547c;
    }
}
