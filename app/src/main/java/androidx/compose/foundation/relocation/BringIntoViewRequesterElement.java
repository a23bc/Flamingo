package androidx.compose.foundation.relocation;

import J.b;
import J.c;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9230a;

    public BringIntoViewRequesterElement(b bVar) {
        this.f9230a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return AbstractC1209k.a(this.f9230a, ((BringIntoViewRequesterElement) obj).f9230a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9230a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        c cVar = new c();
        cVar.f3571C = this.f9230a;
        return cVar;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        c cVar = (c) abstractC1397o;
        b bVar = cVar.f3571C;
        if (bVar instanceof b) {
            AbstractC1209k.d(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            bVar.f3570a.k(cVar);
        }
        b bVar2 = this.f9230a;
        if (bVar2 instanceof b) {
            bVar2.f3570a.b(cVar);
        }
        cVar.f3571C = bVar2;
    }
}
