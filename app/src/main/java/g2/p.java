package g2;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Z1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f12452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f12453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f12454f;

    public p(o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6) {
        this.f12449a = oVar;
        this.f12450b = oVar2;
        this.f12451c = oVar3;
        this.f12452d = oVar4;
        this.f12453e = oVar5;
        this.f12454f = oVar6;
    }

    @Override // Z1.o
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Z1.o
    public final /* synthetic */ Z1.o c(Z1.o oVar) {
        return Z1.l.f(this, oVar);
    }

    @Override // Z1.o
    public final boolean d(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    @Override // Z1.o
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC1209k.a(this.f12449a, pVar.f12449a) && AbstractC1209k.a(this.f12450b, pVar.f12450b) && AbstractC1209k.a(this.f12451c, pVar.f12451c) && AbstractC1209k.a(this.f12452d, pVar.f12452d) && AbstractC1209k.a(this.f12453e, pVar.f12453e) && AbstractC1209k.a(this.f12454f, pVar.f12454f);
    }

    public final int hashCode() {
        return this.f12454f.hashCode() + ((this.f12453e.hashCode() + ((this.f12452d.hashCode() + ((this.f12451c.hashCode() + ((this.f12450b.hashCode() + (this.f12449a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f12449a + ", start=" + this.f12450b + ", top=" + this.f12451c + ", right=" + this.f12452d + ", end=" + this.f12453e + ", bottom=" + this.f12454f + ')';
    }

    public /* synthetic */ p(o oVar, o oVar2, o oVar3, o oVar4) {
        this(new o(3, 0.0f), oVar, oVar2, new o(3, 0.0f), oVar3, oVar4);
    }
}
