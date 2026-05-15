package androidx.compose.foundation.text.modifiers;

import A0.e;
import Q0.AbstractC0344d0;
import W.m;
import b1.C0622g;
import b1.M;
import f1.d;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0622g f9263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f9264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f9265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1182c f9266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9269g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1988u f9270i;

    public TextAnnotatedStringElement(C0622g c0622g, M m7, d dVar, InterfaceC1182c interfaceC1182c, int i7, boolean z6, int i8, int i9, InterfaceC1988u interfaceC1988u) {
        this.f9263a = c0622g;
        this.f9264b = m7;
        this.f9265c = dVar;
        this.f9266d = interfaceC1182c;
        this.f9267e = i7;
        this.f9268f = z6;
        this.f9269g = i8;
        this.h = i9;
        this.f9270i = interfaceC1988u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return AbstractC1209k.a(this.f9270i, textAnnotatedStringElement.f9270i) && this.f9263a.equals(textAnnotatedStringElement.f9263a) && AbstractC1209k.a(this.f9264b, textAnnotatedStringElement.f9264b) && AbstractC1209k.a(this.f9265c, textAnnotatedStringElement.f9265c) && this.f9266d == textAnnotatedStringElement.f9266d && this.f9267e == textAnnotatedStringElement.f9267e && this.f9268f == textAnnotatedStringElement.f9268f && this.f9269g == textAnnotatedStringElement.f9269g && this.h == textAnnotatedStringElement.h;
    }

    public final int hashCode() {
        int iHashCode = (this.f9265c.hashCode() + e.B(this.f9263a.hashCode() * 31, 31, this.f9264b)) * 31;
        InterfaceC1182c interfaceC1182c = this.f9266d;
        int iHashCode2 = (((((((((iHashCode + (interfaceC1182c != null ? interfaceC1182c.hashCode() : 0)) * 31) + this.f9267e) * 31) + (this.f9268f ? 1231 : 1237)) * 31) + this.f9269g) * 31) + this.h) * 923521;
        InterfaceC1988u interfaceC1988u = this.f9270i;
        return (iHashCode2 + (interfaceC1988u != null ? interfaceC1988u.hashCode() : 0)) * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new m(this.f9263a, this.f9264b, this.f9265c, this.f9266d, this.f9267e, this.f9268f, this.f9269g, this.h, null, this.f9270i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // Q0.AbstractC0344d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(r0.AbstractC1397o r9) {
        /*
            r8 = this;
            r0 = r9
            W.m r0 = (W.m) r0
            y0.u r9 = r0.f7700L
            y0.u r1 = r8.f9270i
            boolean r9 = m5.AbstractC1209k.a(r1, r9)
            r0.f7700L = r1
            if (r9 == 0) goto L25
            b1.M r9 = r0.f7692D
            b1.M r1 = r8.f9264b
            if (r1 == r9) goto L20
            b1.D r1 = r1.f9947a
            b1.D r9 = r9.f9947a
            boolean r9 = r1.b(r9)
            if (r9 == 0) goto L25
            goto L23
        L20:
            r1.getClass()
        L23:
            r9 = 0
            goto L26
        L25:
            r9 = 1
        L26:
            b1.g r1 = r8.f9263a
            boolean r7 = r0.G0(r1)
            int r3 = r8.f9269g
            int r6 = r8.f9267e
            b1.M r1 = r8.f9264b
            int r2 = r8.h
            boolean r4 = r8.f9268f
            f1.d r5 = r8.f9265c
            boolean r1 = r0.F0(r1, r2, r3, r4, r5, r6)
            l5.c r2 = r8.f9266d
            r3 = 0
            boolean r2 = r0.E0(r2, r3)
            r0.B0(r9, r7, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.m(r0.o):void");
    }
}
