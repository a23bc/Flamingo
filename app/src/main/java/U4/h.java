package u4;

import l5.InterfaceC1180a;
import w.C1689w;
import z.I0;
import z.S;

/* JADX INFO: loaded from: classes.dex */
public final class h implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1689w f17312b;

    public h(InterfaceC1180a interfaceC1180a, C1689w c1689w) {
        this.f17311a = interfaceC1180a;
        this.f17312b = c1689w;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(z.K0 r11, float r12, c5.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof u4.g
            if (r0 == 0) goto L13
            r0 = r13
            u4.g r0 = (u4.g) r0
            int r1 = r0.f17310r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17310r = r1
            goto L1a
        L13:
            u4.g r0 = new u4.g
            e5.c r13 = (e5.AbstractC0865c) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.f17308p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f17310r
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            m5.s r11 = r0.f17307o
            android.support.v4.media.session.b.K(r13)
            r8 = r10
            goto L78
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            android.support.v4.media.session.b.K(r13)
            boolean r13 = r10.b(r12)
            if (r13 == 0) goto L43
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r12)
            return r11
        L43:
            float r13 = java.lang.Math.abs(r12)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 <= 0) goto L7b
            m5.s r7 = new m5.s
            r7.<init>()
            r7.f14436o = r12
            m5.s r5 = new m5.s
            r5.<init>()
            r13 = 28
            r2 = 0
            w.m r12 = w.AbstractC1671d.b(r2, r12, r13)
            G.u r4 = new G.u
            r9 = 8
            r8 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f17307o = r7
            r0.f17310r = r3
            w.w r11 = r8.f17312b
            r13 = 0
            java.lang.Object r11 = w.AbstractC1671d.e(r12, r11, r13, r4, r0)
            if (r11 != r1) goto L77
            return r1
        L77:
            r11 = r7
        L78:
            float r12 = r11.f14436o
            goto L7c
        L7b:
            r8 = r10
        L7c:
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.h.a(z.K0, float, c5.d):java.lang.Object");
    }

    public final boolean b(float f7) {
        I0 i02 = (I0) this.f17311a.a();
        if (f7 >= 0.0f || !i02.a()) {
            return f7 <= 0.0f || !i02.d();
        }
        return false;
    }
}
