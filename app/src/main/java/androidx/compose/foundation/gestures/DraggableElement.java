package androidx.compose.foundation.gestures;

import B.k;
import Q0.AbstractC0344d0;
import l5.f;
import m5.AbstractC1209k;
import o0.C1247d;
import r0.AbstractC1397o;
import z.EnumC2048l0;
import z.P;
import z.Q;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1247d f9164i = new C1247d(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f9165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2048l0 f9166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f9168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f9170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f9171g;
    public final boolean h;

    public DraggableElement(Q q7, EnumC2048l0 enumC2048l0, boolean z6, k kVar, boolean z7, f fVar, f fVar2, boolean z8) {
        this.f9165a = q7;
        this.f9166b = enumC2048l0;
        this.f9167c = z6;
        this.f9168d = kVar;
        this.f9169e = z7;
        this.f9170f = fVar;
        this.f9171g = fVar2;
        this.h = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return AbstractC1209k.a(this.f9165a, draggableElement.f9165a) && this.f9166b == draggableElement.f9166b && this.f9167c == draggableElement.f9167c && AbstractC1209k.a(this.f9168d, draggableElement.f9168d) && this.f9169e == draggableElement.f9169e && AbstractC1209k.a(this.f9170f, draggableElement.f9170f) && AbstractC1209k.a(this.f9171g, draggableElement.f9171g) && this.h == draggableElement.h;
    }

    public final int hashCode() {
        int iHashCode = (((this.f9166b.hashCode() + (this.f9165a.hashCode() * 31)) * 31) + (this.f9167c ? 1231 : 1237)) * 31;
        k kVar = this.f9168d;
        return ((this.f9171g.hashCode() + ((this.f9170f.hashCode() + ((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + (this.f9169e ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1247d c1247d = f9164i;
        EnumC2048l0 enumC2048l0 = this.f9166b;
        P p7 = new P(c1247d, this.f9167c, this.f9168d, enumC2048l0);
        p7.f20705N = this.f9165a;
        p7.f20706O = enumC2048l0;
        p7.f20707P = this.f9169e;
        p7.f20708Q = this.f9170f;
        p7.f20709R = this.f9171g;
        p7.f20710S = this.h;
        return p7;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        boolean z6;
        boolean z7;
        P p7 = (P) abstractC1397o;
        C1247d c1247d = f9164i;
        Q q7 = p7.f20705N;
        Q q8 = this.f9165a;
        if (AbstractC1209k.a(q7, q8)) {
            z6 = false;
        } else {
            p7.f20705N = q8;
            z6 = true;
        }
        EnumC2048l0 enumC2048l0 = p7.f20706O;
        EnumC2048l0 enumC2048l02 = this.f9166b;
        if (enumC2048l0 != enumC2048l02) {
            p7.f20706O = enumC2048l02;
            z6 = true;
        }
        boolean z8 = p7.f20710S;
        boolean z9 = this.h;
        if (z8 != z9) {
            p7.f20710S = z9;
            z7 = true;
        } else {
            z7 = z6;
        }
        p7.f20708Q = this.f9170f;
        p7.f20709R = this.f9171g;
        p7.f20707P = this.f9169e;
        p7.M0(c1247d, this.f9167c, this.f9168d, enumC2048l02, z7);
    }
}
