package i0;

import j0.AbstractC1092c;
import j5.AbstractC1107a;
import java.util.List;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1053a extends Z4.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC1092c f13285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f13286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13287q;

    public C1053a(AbstractC1092c abstractC1092c, int i7, int i8) {
        this.f13285o = abstractC1092c;
        this.f13286p = i7;
        AbstractC1107a.l(i7, i8, abstractC1092c.b());
        this.f13287q = i8 - i7;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        return this.f13287q;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC1107a.j(i7, this.f13287q);
        return this.f13285o.get(this.f13286p + i7);
    }

    @Override // Z4.e, java.util.List
    public final List subList(int i7, int i8) {
        AbstractC1107a.l(i7, i8, this.f13287q);
        int i9 = this.f13286p;
        return new C1053a(this.f13285o, i7 + i9, i9 + i8);
    }
}
