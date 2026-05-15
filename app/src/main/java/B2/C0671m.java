package b2;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import f0.C0894j0;
import j2.C1103f;
import j2.InterfaceC1098a;
import java.util.concurrent.atomic.AtomicBoolean;
import w5.AbstractC1767D;
import w5.C1792j0;
import yos.music.player.R;

/* JADX INFO: renamed from: b2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0671m {

    /* JADX INFO: renamed from: a */
    public final String f10226a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f10227b;

    /* JADX INFO: renamed from: c */
    public final y5.c f10228c;

    /* JADX INFO: renamed from: d */
    public final A0.b f10229d;

    /* JADX INFO: renamed from: e */
    public final C0651c f10230e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1098a f10231f;

    /* JADX INFO: renamed from: g */
    public final H0 f10232g;
    public final boolean h;

    /* JADX INFO: renamed from: i */
    public final C0894j0 f10233i;

    /* JADX INFO: renamed from: j */
    public final C0894j0 f10234j;

    /* JADX INFO: renamed from: k */
    public Object f10235k;
    public final C1792j0 l;

    /* JADX INFO: renamed from: m */
    public final z5.J f10236m;

    public C0671m(A0.b bVar, C0651c c0651c, Bundle bundle, int i7) {
        bundle = (i7 & 4) != 0 ? null : bundle;
        C1103f c1103f = C1103f.f13698a;
        F0 f02 = (F0) bVar.f52r;
        this.f10226a = I0.c.q(c0651c.f10163a);
        this.f10227b = new AtomicBoolean(true);
        this.f10228c = y5.j.a(Integer.MAX_VALUE, 6, null);
        this.f10229d = bVar;
        this.f10230e = c0651c;
        this.f10231f = c1103f;
        this.f10232g = f02;
        this.h = true;
        int i8 = c0651c.f10163a;
        if (Integer.MIN_VALUE <= i8 && i8 < -1) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        f0.W w7 = f0.W.f11764q;
        this.f10233i = new C0894j0(null, w7);
        this.f10234j = new C0894j0(bundle, w7);
        this.f10235k = Z4.w.f8819o;
        this.l = AbstractC1767D.b();
        this.f10236m = z5.z.b(null);
    }

    public final void a(Context context, Throwable th) throws Throwable {
        if (!this.h) {
            throw th;
        }
        int i7 = this.f10230e.f10163a;
        this.f10229d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i7, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:64|66|(2:68|(1:70)(1:71))(0)|72|(1:(1:(4:82|106|123|124)(1:(2:79|80)(3:81|118|119)))(1:83))(2:84|(2:86|87)(3:88|(1:91)|122))|92|127|93|94|95|(4:97|(1:99)|102|103)(3:107|108|109)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r15.b(r5) == r6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x010a, code lost:
    
        r7.a(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x010d, code lost:
    
        r5.f10186o = null;
        r5.f10187p = null;
        r5.f10188q = null;
        r5.f10191t = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0119, code lost:
    
        if (r15.b(r5) != r6) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x011c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x011d, code lost:
    
        r5.f10186o = r0;
        r5.f10187p = null;
        r5.f10188q = null;
        r5.f10191t = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0129, code lost:
    
        if (r15.b(r5) != r6) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0130, code lost:
    
        r5.f10186o = null;
        r5.f10187p = null;
        r5.f10188q = null;
        r5.f10191t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x013c, code lost:
    
        if (r15.b(r5) != r6) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r19, Z1.k r20, e5.AbstractC0865c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0671m.b(android.content.Context, Z1.k, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r8, java.lang.Object r9, e5.AbstractC0865c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0671m.c(android.content.Context, java.lang.Object, e5.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r5.c(r2, r10, r0) == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0077 A[Catch: l -> 0x008f, TRY_LEAVE, TryCatch #0 {l -> 0x008f, blocks: (B:49:0x002e, B:58:0x0058, B:62:0x006f, B:64:0x0077, B:54:0x0046, B:57:0x004d), top: B:70:0x0020 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x008c -> B:50:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r8, Q0.M r9, e5.AbstractC0865c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof i2.C1075j
            if (r0 == 0) goto L13
            r0 = r10
            i2.j r0 = (i2.C1075j) r0
            int r1 = r0.f13390u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13390u = r1
            goto L18
        L13:
            i2.j r0 = new i2.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f13388s
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13390u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            y5.b r8 = r0.f13387r
            l5.c r9 = r0.f13386q
            android.content.Context r2 = r0.f13385p
            b2.m r5 = r0.f13384o
            android.support.v4.media.session.b.K(r10)     // Catch: y5.l -> L8f
        L31:
            r10 = r2
            r2 = r8
            r8 = r10
            r10 = r5
            goto L58
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            y5.b r8 = r0.f13387r
            l5.c r9 = r0.f13386q
            android.content.Context r2 = r0.f13385p
            b2.m r5 = r0.f13384o
            android.support.v4.media.session.b.K(r10)     // Catch: y5.l -> L8f
            goto L6f
        L4a:
            android.support.v4.media.session.b.K(r10)
            y5.c r10 = r7.f10228c     // Catch: y5.l -> L8f
            r10.getClass()     // Catch: y5.l -> L8f
            y5.b r2 = new y5.b     // Catch: y5.l -> L8f
            r2.<init>(r10)     // Catch: y5.l -> L8f
            r10 = r7
        L58:
            r0.f13384o = r10     // Catch: y5.l -> L8f
            r0.f13385p = r8     // Catch: y5.l -> L8f
            r0.f13386q = r9     // Catch: y5.l -> L8f
            r0.f13387r = r2     // Catch: y5.l -> L8f
            r0.f13390u = r4     // Catch: y5.l -> L8f
            java.lang.Object r5 = r2.b(r0)     // Catch: y5.l -> L8f
            if (r5 != r1) goto L69
            goto L8e
        L69:
            r6 = r2
            r2 = r8
            r8 = r6
            r6 = r5
            r5 = r10
            r10 = r6
        L6f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: y5.l -> L8f
            boolean r10 = r10.booleanValue()     // Catch: y5.l -> L8f
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r8.c()     // Catch: y5.l -> L8f
            r9.b(r10)     // Catch: y5.l -> L8f
            r0.f13384o = r5     // Catch: y5.l -> L8f
            r0.f13385p = r2     // Catch: y5.l -> L8f
            r0.f13386q = r9     // Catch: y5.l -> L8f
            r0.f13387r = r8     // Catch: y5.l -> L8f
            r0.f13390u = r3     // Catch: y5.l -> L8f
            java.lang.Object r10 = r5.c(r2, r10, r0)     // Catch: y5.l -> L8f
            if (r10 != r1) goto L31
        L8e:
            return r1
        L8f:
            Y4.o r8 = Y4.o.f8736a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0671m.d(android.content.Context, Q0.M, e5.c):java.lang.Object");
    }

    public final Object e(Object obj, AbstractC0865c abstractC0865c) {
        Object objP = this.f10228c.p(abstractC0865c, obj);
        return objP == EnumC0830a.f11264o ? objP : Y4.o.f8736a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(e5.AbstractC0865c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b2.C0669l
            if (r0 == 0) goto L13
            r0 = r6
            b2.l r0 = (b2.C0669l) r0
            int r1 = r0.f10218r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10218r = r1
            goto L18
        L13:
            b2.l r0 = new b2.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10216p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f10218r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b2.g r0 = r0.f10215o
            android.support.v4.media.session.b.K(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            android.support.v4.media.session.b.K(r6)
            b2.g r6 = new b2.g
            w5.j0 r2 = r5.l
            w5.j0 r4 = new w5.j0
            r4.<init>(r2)
            r6.<init>(r4)
            r0.f10215o = r6
            r0.f10218r = r3
            java.lang.Object r0 = r5.e(r6, r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r6
        L4c:
            w5.j0 r6 = r0.f10181a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0671m.f(e5.c):java.lang.Object");
    }
}
