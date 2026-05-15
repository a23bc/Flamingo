package androidx.compose.foundation.layout;

import D.D;
import D.F0;
import Q0.AbstractC0344d0;
import l5.e;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f9197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9199c;

    public WrapContentElement(D d4, e eVar, Object obj) {
        this.f9197a = d4;
        this.f9198b = eVar;
        this.f9199c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f9197a == wrapContentElement.f9197a && this.f9199c.equals(wrapContentElement.f9199c);
    }

    public final int hashCode() {
        return this.f9199c.hashCode() + (((this.f9197a.hashCode() * 31) + 1237) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        F0 f02 = new F0();
        f02.f1228C = this.f9197a;
        f02.f1229D = this.f9198b;
        return f02;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        F0 f02 = (F0) abstractC1397o;
        f02.f1228C = this.f9197a;
        f02.f1229D = this.f9198b;
    }
}
