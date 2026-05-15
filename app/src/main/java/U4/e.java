package u4;

import f0.C0886f0;
import f0.InterfaceC0878b0;
import m5.AbstractC1209k;
import w.C1670c;
import w5.AbstractC1767D;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class e implements J0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1670c f17299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J0.d f17300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f17303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17306v;

    public e(J0.d dVar, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, C0886f0 c0886f0, InterfaceC0878b0 interfaceC0878b03, InterfaceC0878b0 interfaceC0878b04, InterfaceC0878b0 interfaceC0878b05) {
        this.f17300p = dVar;
        this.f17301q = interfaceC0878b0;
        this.f17302r = interfaceC0878b02;
        this.f17303s = c0886f0;
        this.f17304t = interfaceC0878b03;
        this.f17305u = interfaceC0878b04;
        this.f17306v = interfaceC0878b05;
    }

    @Override // J0.a
    public final long I(int i7, long j3, long j7) {
        long j8;
        long jG;
        if (i7 != 1) {
            return this.f17300p.d(j7, i7);
        }
        if (((Boolean) this.f17301q.getValue()).booleanValue()) {
            j8 = j7;
            jG = C1892b.g(j8, this.f17300p.b(i7, j3, j8));
        } else {
            j8 = j7;
            jG = j8;
        }
        l5.e eVar = (l5.e) this.f17304t.getValue();
        C0886f0 c0886f0 = this.f17303s;
        Float fValueOf = Float.valueOf(c0886f0.h());
        InterfaceC0878b0 interfaceC0878b0 = this.f17302r;
        c0886f0.j(((Number) eVar.invoke(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (f.e(interfaceC0878b0) ? jG & 4294967295L : jG >> 32))))).floatValue());
        if (f.e(interfaceC0878b0)) {
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (jG >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (jG & 4294967295L)))) & 4294967295L);
    }

    public final C1670c a() {
        C1670c c1670c = this.f17299o;
        if (c1670c != null) {
            return c1670c;
        }
        AbstractC1209k.m("lastFlingAnimator");
        throw null;
    }

    @Override // J0.a
    public final long m(long j3, int i7) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        J0.d dVar = this.f17300p;
        if (i7 != 1) {
            return dVar.d(j3, i7);
        }
        if (this.f17299o != null && a().f()) {
            AbstractC1767D.t(dVar.e(), null, new d(this, null), 3);
        }
        long jG = ((Boolean) this.f17301q.getValue()).booleanValue() ? C1892b.g(j3, dVar.d(j3, i7)) : j3;
        InterfaceC0878b0 interfaceC0878b0 = this.f17302r;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f.e(interfaceC0878b0) ? jG & 4294967295L : jG >> 32));
        float fSignum = Math.signum(fIntBitsToFloat);
        C0886f0 c0886f0 = this.f17303s;
        boolean z6 = fSignum == Math.signum(c0886f0.h());
        if (Math.abs(c0886f0.h()) <= 0.5f || z6) {
            return C1892b.g(j3, jG);
        }
        float fFloatValue = ((Number) ((l5.e) this.f17304t.getValue()).invoke(Float.valueOf(c0886f0.h()), Float.valueOf(fIntBitsToFloat))).floatValue();
        if (Math.signum(c0886f0.h()) == Math.signum(fFloatValue)) {
            c0886f0.j(fFloatValue);
            if (f.e(interfaceC0878b0)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (jG >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (jG & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat4);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
            }
        } else {
            c0886f0.j(0.0f);
            if (f.e(interfaceC0878b0)) {
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (jG >> 32));
                float fIntBitsToFloat7 = (Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (jG & 4294967295L))) + fIntBitsToFloat;
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat6);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat7);
            } else {
                float fIntBitsToFloat8 = (Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (jG >> 32))) + fIntBitsToFloat;
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (jG & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
            }
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r1.h(r8) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m0(long r17, c5.d r19) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e.m0(long, c5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(long r17, long r19, c5.d r21) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e.x(long, long, c5.d):java.lang.Object");
    }
}
