package R0;

import android.view.View;
import androidx.lifecycle.InterfaceC0597u;
import e5.AbstractC0871i;
import m5.C1220v;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f6435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1220v f6436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f0.B0 f6437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0597u f6438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e1 f6439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f6440u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(C1220v c1220v, f0.B0 b0, InterfaceC0597u interfaceC0597u, e1 e1Var, View view, c5.d dVar) {
        super(2, dVar);
        this.f6436q = c1220v;
        this.f6437r = b0;
        this.f6438s = interfaceC0597u;
        this.f6439t = e1Var;
        this.f6440u = view;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        d1 d1Var = new d1(this.f6436q, this.f6437r, this.f6438s, this.f6439t, this.f6440u, dVar);
        d1Var.f6435p = obj;
        return d1Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r10.f6434o
            androidx.lifecycle.u r2 = r10.f6438s
            r3 = 0
            R0.e1 r4 = r10.f6439t
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 != r5) goto L19
            java.lang.Object r0 = r10.f6435p
            w5.g0 r0 = (w5.InterfaceC1786g0) r0
            android.support.v4.media.session.b.K(r11)     // Catch: java.lang.Throwable -> L16
            goto L6b
        L16:
            r11 = move-exception
            goto L80
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            android.support.v4.media.session.b.K(r11)
            java.lang.Object r11 = r10.f6435p
            w5.B r11 = (w5.InterfaceC1765B) r11
            m5.v r1 = r10.f6436q     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = r1.f14439o     // Catch: java.lang.Throwable -> L5a
            R0.F0 r1 = (R0.F0) r1     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L5c
            android.view.View r6 = r10.f6440u     // Catch: java.lang.Throwable -> L5a
            android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L5a
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L5a
            z5.H r6 = R0.h1.a(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L5a
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L5a
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L5a
            f0.f0 r8 = r1.f6308o     // Catch: java.lang.Throwable -> L5a
            r8.j(r7)     // Catch: java.lang.Throwable -> L5a
            R0.c1 r7 = new R0.c1     // Catch: java.lang.Throwable -> L5a
            r7.<init>(r6, r1, r3)     // Catch: java.lang.Throwable -> L5a
            r1 = 3
            w5.w0 r11 = w5.AbstractC1767D.t(r11, r3, r7, r1)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L58:
            r0 = r3
            goto L80
        L5a:
            r11 = move-exception
            goto L58
        L5c:
            r11 = r3
        L5d:
            f0.B0 r1 = r10.f6437r     // Catch: java.lang.Throwable -> L7e
            r10.f6435p = r11     // Catch: java.lang.Throwable -> L7e
            r10.f6434o = r5     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.O(r10)     // Catch: java.lang.Throwable -> L7e
            if (r1 != r0) goto L6a
            return r0
        L6a:
            r0 = r11
        L6b:
            if (r0 == 0) goto L70
            r0.c(r3)
        L70:
            androidx.lifecycle.K r11 = r2.h()
            r11.l(r4)
            Y4.o r11 = Y4.o.f8736a
            return r11
        L7a:
            r9 = r0
            r0 = r11
            r11 = r9
            goto L80
        L7e:
            r0 = move-exception
            goto L7a
        L80:
            if (r0 == 0) goto L85
            r0.c(r3)
        L85:
            androidx.lifecycle.K r0 = r2.h()
            r0.l(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
