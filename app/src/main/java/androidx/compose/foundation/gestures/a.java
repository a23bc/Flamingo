package androidx.compose.foundation.gestures;

import M.z0;
import o0.C1247d;
import r0.InterfaceC1398p;
import z.C2061s0;
import z.C2063t0;
import z.C2065u0;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1247d f9176a = new C1247d(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2063t0 f9177b = new C2063t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2061s0 f9178c = new C2061s0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2065u0 f9179d = new C2065u0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(z.P0 r10, long r11, e5.AbstractC0865c r13) {
        /*
            boolean r0 = r13 instanceof z.C2067v0
            if (r0 == 0) goto L13
            r0 = r13
            z.v0 r0 = (z.C2067v0) r0
            int r1 = r0.f20975r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20975r = r1
            goto L18
        L13:
            z.v0 r0 = new z.v0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f20974q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20975r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            m5.s r10 = r0.f20973p
            z.P0 r11 = r0.f20972o
            android.support.v4.media.session.b.K(r13)
            r8 = r10
            r10 = r11
            goto L55
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            android.support.v4.media.session.b.K(r13)
            m5.s r8 = new m5.s
            r8.<init>()
            x.l0 r13 = x.EnumC1862l0.f19772o
            z.w0 r4 = new z.w0
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f20972o = r5
            r0.f20973p = r8
            r0.f20975r = r3
            java.lang.Object r10 = r5.f(r13, r4, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r10 = r5
        L55:
            float r11 = r8.f14436o
            long r10 = r10.h(r11)
            x0.b r12 = new x0.b
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(z.P0, long, e5.c):java.lang.Object");
    }

    public static InterfaceC1398p b(z0 z0Var, EnumC2048l0 enumC2048l0, boolean z6, boolean z7) {
        return new ScrollableElement(z0Var, enumC2048l0, z6, z7);
    }
}
