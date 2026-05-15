package androidx.compose.foundation.text.modifiers;

import A0.e;
import Q0.AbstractC0344d0;
import W.f;
import W.h;
import b1.C0622g;
import b1.M;
import f1.d;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0622g f9254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f9255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f9256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1182c f9257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9260g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f9261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1988u f9262j;

    public SelectableTextAnnotatedStringElement(C0622g c0622g, M m7, d dVar, InterfaceC1182c interfaceC1182c, int i7, boolean z6, int i8, int i9, h hVar, InterfaceC1988u interfaceC1988u) {
        this.f9254a = c0622g;
        this.f9255b = m7;
        this.f9256c = dVar;
        this.f9257d = interfaceC1182c;
        this.f9258e = i7;
        this.f9259f = z6;
        this.f9260g = i8;
        this.h = i9;
        this.f9261i = hVar;
        this.f9262j = interfaceC1988u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return AbstractC1209k.a(this.f9262j, selectableTextAnnotatedStringElement.f9262j) && this.f9254a.equals(selectableTextAnnotatedStringElement.f9254a) && AbstractC1209k.a(this.f9255b, selectableTextAnnotatedStringElement.f9255b) && AbstractC1209k.a(this.f9256c, selectableTextAnnotatedStringElement.f9256c) && this.f9257d == selectableTextAnnotatedStringElement.f9257d && this.f9258e == selectableTextAnnotatedStringElement.f9258e && this.f9259f == selectableTextAnnotatedStringElement.f9259f && this.f9260g == selectableTextAnnotatedStringElement.f9260g && this.h == selectableTextAnnotatedStringElement.h && this.f9261i.equals(selectableTextAnnotatedStringElement.f9261i);
    }

    public final int hashCode() {
        int iHashCode = (this.f9256c.hashCode() + e.B(this.f9254a.hashCode() * 31, 31, this.f9255b)) * 31;
        InterfaceC1182c interfaceC1182c = this.f9257d;
        int iHashCode2 = (this.f9261i.hashCode() + ((((((((((iHashCode + (interfaceC1182c != null ? interfaceC1182c.hashCode() : 0)) * 31) + this.f9258e) * 31) + (this.f9259f ? 1231 : 1237)) * 31) + this.f9260g) * 31) + this.h) * 29791)) * 961;
        InterfaceC1988u interfaceC1988u = this.f9262j;
        return iHashCode2 + (interfaceC1988u != null ? interfaceC1988u.hashCode() : 0);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new f(this.f9254a, this.f9255b, this.f9256c, this.f9257d, this.f9258e, this.f9259f, this.f9260g, this.h, this.f9261i, this.f9262j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // Q0.AbstractC0344d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(r0.AbstractC1397o r11) {
        /*
            r10 = this;
            W.f r11 = (W.f) r11
            W.m r0 = r11.f7668F
            y0.u r1 = r0.f7700L
            y0.u r2 = r10.f9262j
            boolean r1 = m5.AbstractC1209k.a(r2, r1)
            r0.f7700L = r2
            b1.M r4 = r10.f9255b
            if (r1 == 0) goto L26
            b1.M r1 = r0.f7692D
            if (r4 == r1) goto L21
            b1.D r2 = r4.f9947a
            b1.D r1 = r1.f9947a
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r4.getClass()
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            b1.g r2 = r10.f9254a
            boolean r2 = r0.G0(r2)
            boolean r7 = r10.f9259f
            f1.d r8 = r10.f9256c
            W.m r3 = r11.f7668F
            int r5 = r10.h
            int r6 = r10.f9260g
            int r9 = r10.f9258e
            boolean r3 = r3.F0(r4, r5, r6, r7, r8, r9)
            W.h r4 = r10.f9261i
            l5.c r5 = r10.f9257d
            boolean r5 = r0.E0(r5, r4)
            r0.B0(r1, r2, r3, r5)
            r11.f7667E = r4
            Q0.AbstractC0347f.n(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.m(r0.o):void");
    }
}
