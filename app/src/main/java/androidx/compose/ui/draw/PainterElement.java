package androidx.compose.ui.draw;

import D0.b;
import O0.C0318o;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import m5.AbstractC1209k;
import n1.c;
import r0.AbstractC1397o;
import r0.InterfaceC1386d;
import v0.i;
import x0.C1895e;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1386d f9284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1980m f9286d;

    public PainterElement(b bVar, InterfaceC1386d interfaceC1386d, float f7, C1980m c1980m) {
        this.f9283a = bVar;
        this.f9284b = interfaceC1386d;
        this.f9285c = f7;
        this.f9286d = c1980m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!AbstractC1209k.a(this.f9283a, painterElement.f9283a) || !AbstractC1209k.a(this.f9284b, painterElement.f9284b)) {
            return false;
        }
        Object obj2 = C0318o.f5426b;
        return obj2.equals(obj2) && Float.compare(this.f9285c, painterElement.f9285c) == 0 && AbstractC1209k.a(this.f9286d, painterElement.f9286d);
    }

    public final int hashCode() {
        int iN = c.n(this.f9285c, (C0318o.f5426b.hashCode() + ((this.f9284b.hashCode() + (((this.f9283a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        C1980m c1980m = this.f9286d;
        return iN + (c1980m == null ? 0 : c1980m.hashCode());
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        i iVar = new i();
        iVar.f18215C = this.f9283a;
        iVar.f18216D = true;
        iVar.f18217E = this.f9284b;
        iVar.f18218F = C0318o.f5426b;
        iVar.f18219G = this.f9285c;
        iVar.f18220H = this.f9286d;
        return iVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        i iVar = (i) abstractC1397o;
        boolean z6 = iVar.f18216D;
        b bVar = this.f9283a;
        boolean z7 = (z6 && C1895e.a(iVar.f18215C.h(), bVar.h())) ? false : true;
        iVar.f18215C = bVar;
        iVar.f18216D = true;
        iVar.f18217E = this.f9284b;
        iVar.f18218F = C0318o.f5426b;
        iVar.f18219G = this.f9285c;
        iVar.f18220H = this.f9286d;
        if (z7) {
            AbstractC0347f.n(iVar);
        }
        AbstractC0347f.m(iVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f9283a + ", sizeToIntrinsics=true, alignment=" + this.f9284b + ", contentScale=" + C0318o.f5426b + ", alpha=" + this.f9285c + ", colorFilter=" + this.f9286d + ')';
    }
}
