package androidx.compose.foundation.text.modifiers;

import A0.e;
import Q0.AbstractC0344d0;
import W.p;
import b1.M;
import f1.d;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f9272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f9273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9277g;
    public final InterfaceC1988u h;

    public TextStringSimpleElement(String str, M m7, d dVar, int i7, boolean z6, int i8, int i9, InterfaceC1988u interfaceC1988u) {
        this.f9271a = str;
        this.f9272b = m7;
        this.f9273c = dVar;
        this.f9274d = i7;
        this.f9275e = z6;
        this.f9276f = i8;
        this.f9277g = i9;
        this.h = interfaceC1988u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return AbstractC1209k.a(this.h, textStringSimpleElement.h) && AbstractC1209k.a(this.f9271a, textStringSimpleElement.f9271a) && AbstractC1209k.a(this.f9272b, textStringSimpleElement.f9272b) && AbstractC1209k.a(this.f9273c, textStringSimpleElement.f9273c) && this.f9274d == textStringSimpleElement.f9274d && this.f9275e == textStringSimpleElement.f9275e && this.f9276f == textStringSimpleElement.f9276f && this.f9277g == textStringSimpleElement.f9277g;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f9273c.hashCode() + e.B(this.f9271a.hashCode() * 31, 31, this.f9272b)) * 31) + this.f9274d) * 31) + (this.f9275e ? 1231 : 1237)) * 31) + this.f9276f) * 31) + this.f9277g) * 31;
        InterfaceC1988u interfaceC1988u = this.h;
        return iHashCode + (interfaceC1988u != null ? interfaceC1988u.hashCode() : 0);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        p pVar = new p();
        pVar.f7711C = this.f9271a;
        pVar.f7712D = this.f9272b;
        pVar.f7713E = this.f9273c;
        pVar.f7714F = this.f9274d;
        pVar.f7715G = this.f9275e;
        pVar.f7716H = this.f9276f;
        pVar.f7717I = this.f9277g;
        pVar.f7718J = this.h;
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // Q0.AbstractC0344d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(r0.AbstractC1397o r12) {
        /*
            r11 = this;
            W.p r12 = (W.p) r12
            y0.u r0 = r12.f7718J
            y0.u r1 = r11.h
            boolean r0 = m5.AbstractC1209k.a(r1, r0)
            r12.f7718J = r1
            r1 = 0
            r2 = 1
            b1.M r3 = r11.f9272b
            if (r0 == 0) goto L26
            b1.M r0 = r12.f7712D
            if (r3 == r0) goto L21
            b1.D r4 = r3.f9947a
            b1.D r0 = r0.f9947a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            java.lang.String r4 = r12.f7711C
            java.lang.String r5 = r11.f9271a
            boolean r4 = m5.AbstractC1209k.a(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.f7711C = r5
            r1 = 0
            r12.f7722N = r1
            r1 = r2
        L38:
            b1.M r4 = r12.f7712D
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.f7712D = r3
            int r3 = r12.f7717I
            int r5 = r11.f9277g
            if (r3 == r5) goto L4a
            r12.f7717I = r5
            r4 = r2
        L4a:
            int r3 = r12.f7716H
            int r5 = r11.f9276f
            if (r3 == r5) goto L53
            r12.f7716H = r5
            r4 = r2
        L53:
            boolean r3 = r12.f7715G
            boolean r5 = r11.f9275e
            if (r3 == r5) goto L5c
            r12.f7715G = r5
            r4 = r2
        L5c:
            f1.d r3 = r12.f7713E
            f1.d r5 = r11.f9273c
            boolean r3 = m5.AbstractC1209k.a(r3, r5)
            if (r3 != 0) goto L69
            r12.f7713E = r5
            r4 = r2
        L69:
            int r3 = r12.f7714F
            int r5 = r11.f9274d
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.f7714F = r5
        L73:
            if (r1 != 0) goto L77
            if (r2 == 0) goto La3
        L77:
            W.e r3 = r12.B0()
            java.lang.String r4 = r12.f7711C
            b1.M r5 = r12.f7712D
            f1.d r6 = r12.f7713E
            int r7 = r12.f7714F
            boolean r8 = r12.f7715G
            int r9 = r12.f7716H
            int r10 = r12.f7717I
            r3.f7650a = r4
            r3.f7651b = r5
            r3.f7652c = r6
            r3.f7653d = r7
            r3.f7654e = r8
            r3.f7655f = r9
            r3.f7656g = r10
            long r4 = r3.f7666s
            r6 = 2
            long r4 = r4 << r6
            r6 = 2
            long r4 = r4 | r6
            r3.f7666s = r4
            r3.c()
        La3:
            boolean r3 = r12.f15636B
            if (r3 != 0) goto La8
            goto Lc2
        La8:
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto Lb3
            W.n r3 = r12.f7721M
            if (r3 == 0) goto Lb3
        Lb0:
            Q0.AbstractC0347f.o(r12)
        Lb3:
            if (r1 != 0) goto Lb7
            if (r2 == 0) goto Lbd
        Lb7:
            Q0.AbstractC0347f.n(r12)
            Q0.AbstractC0347f.m(r12)
        Lbd:
            if (r0 == 0) goto Lc2
            Q0.AbstractC0347f.m(r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.m(r0.o):void");
    }
}
