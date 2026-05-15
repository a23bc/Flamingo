package R0;

import android.view.View;
import g1.C0981w;
import java.util.concurrent.atomic.AtomicReference;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class U implements InterfaceC1765B {

    /* JADX INFO: renamed from: o */
    public final View f6378o;

    /* JADX INFO: renamed from: p */
    public final C0981w f6379p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1765B f6380q;

    /* JADX INFO: renamed from: r */
    public final AtomicReference f6381r = new AtomicReference(null);

    public U(View view, C0981w c0981w, InterfaceC1765B interfaceC1765B) {
        this.f6378o = view;
        this.f6379p = c0981w;
        this.f6380q = interfaceC1765B;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(V.u r6, e5.AbstractC0865c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof R0.S
            if (r0 == 0) goto L13
            r0 = r7
            R0.S r0 = (R0.S) r0
            int r1 = r0.f6373q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6373q = r1
            goto L18
        L13:
            R0.S r0 = new R0.S
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6371o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f6373q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            android.support.v4.media.session.b.K(r7)
            goto L4e
        L2f:
            android.support.v4.media.session.b.K(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f6381r
            K0.A r2 = new K0.A
            r4 = 5
            r2.<init>(r6, r4, r5)
            R0.T r6 = new R0.T
            r4 = 0
            r6.<init>(r5, r4)
            r0.f6373q = r3
            r0.s r3 = new r0.s
            r3.<init>(r2, r7, r6, r4)
            java.lang.Object r6 = w5.AbstractC1767D.h(r3, r0)
            if (r6 != r1) goto L4e
            return
        L4e:
            A2.W r6 = new A2.W
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.U.a(V.u, e5.c):void");
    }

    @Override // w5.InterfaceC1765B
    public final c5.i g() {
        return this.f6380q.g();
    }
}
