package k2;

import Z1.i;
import Z1.l;
import Z1.m;
import Z1.o;

/* JADX INFO: renamed from: k2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1139a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1144f f14003b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14002a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14004c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f14005d = m.f8781a;

    @Override // Z1.i
    public final i a() {
        C1139a c1139a = new C1139a();
        c1139a.f14005d = this.f14005d;
        c1139a.f14002a = this.f14002a;
        c1139a.f14003b = this.f14003b;
        c1139a.f14004c = this.f14004c;
        return c1139a;
    }

    @Override // Z1.i
    public final o b() {
        return this.f14005d;
    }

    @Override // Z1.i
    public final void c(o oVar) {
        this.f14005d = oVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.f14002a);
        sb.append(", style=");
        sb.append(this.f14003b);
        sb.append(", modifier=");
        sb.append(this.f14005d);
        sb.append(", maxLines=");
        return l.r(sb, this.f14004c, ')');
    }
}
