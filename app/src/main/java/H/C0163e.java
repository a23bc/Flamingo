package H;

import java.util.ArrayList;
import l5.InterfaceC1182c;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: H.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0163e implements InterfaceC1396n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2862b = new ArrayList();

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(e5.AbstractC0865c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof H.C0162d
            if (r0 == 0) goto L13
            r0 = r7
            H.d r0 = (H.C0162d) r0
            int r1 = r0.f2858r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2858r = r1
            goto L18
        L13:
            H.d r0 = new H.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f2856p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f2858r
            java.util.ArrayList r3 = r6.f2862b
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            m5.v r0 = r0.f2855o
            android.support.v4.media.session.b.K(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r7 = move-exception
            goto L6b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            android.support.v4.media.session.b.K(r7)
            boolean r7 = r6.f2861a
            if (r7 != 0) goto L74
            m5.v r7 = new m5.v
            r7.<init>()
            r0.f2855o = r7     // Catch: java.lang.Throwable -> L67
            r0.f2858r = r4     // Catch: java.lang.Throwable -> L67
            w5.k r2 = new w5.k     // Catch: java.lang.Throwable -> L67
            c5.d r0 = I0.c.D(r0)     // Catch: java.lang.Throwable -> L67
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L67
            r2.r()     // Catch: java.lang.Throwable -> L67
            r7.f14439o = r2     // Catch: java.lang.Throwable -> L67
            r3.add(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r2.q()     // Catch: java.lang.Throwable -> L67
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r0 = r7
        L5e:
            java.lang.Object r7 = r0.f14439o
            m5.AbstractC1223y.a(r3)
            r3.remove(r7)
            goto L74
        L67:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L6b:
            java.lang.Object r0 = r0.f14439o
            m5.AbstractC1223y.a(r3)
            r3.remove(r0)
            throw r7
        L74:
            Y4.o r7 = Y4.o.f8736a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0163e.k(e5.c):java.lang.Object");
    }
}
