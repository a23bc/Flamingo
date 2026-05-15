package t0;

import A2.AbstractC0002c;
import A2.W;
import L2.C0247a;
import O0.Q;
import R.o;
import R0.C0415x;
import R0.N0;
import Y0.r;
import Z1.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0583f;
import androidx.lifecycle.InterfaceC0597u;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m5.AbstractC1209k;
import t.AbstractC1457l;
import t.AbstractC1458m;
import t.y;
import y5.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0583f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A */
    public N0 f16141A;

    /* JADX INFO: renamed from: B */
    public boolean f16142B;

    /* JADX INFO: renamed from: C */
    public final B2.e f16143C;

    /* JADX INFO: renamed from: o */
    public final C0415x f16144o;

    /* JADX INFO: renamed from: p */
    public final o f16145p;

    /* JADX INFO: renamed from: q */
    public U0.c f16146q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f16147r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final long f16148s = 100;

    /* JADX INFO: renamed from: t */
    public a f16149t = a.f16134o;

    /* JADX INFO: renamed from: u */
    public boolean f16150u = true;

    /* JADX INFO: renamed from: v */
    public final y5.c f16151v = j.a(1, 6, null);

    /* JADX INFO: renamed from: w */
    public final Handler f16152w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x */
    public y f16153x;

    /* JADX INFO: renamed from: y */
    public long f16154y;

    /* JADX INFO: renamed from: z */
    public final y f16155z;

    public c(C0415x c0415x, o oVar) {
        this.f16144o = c0415x;
        this.f16145p = oVar;
        y yVar = AbstractC1458m.f16088a;
        AbstractC1209k.d(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f16153x = yVar;
        this.f16155z = new y();
        Y0.o oVarA = c0415x.getSemanticsOwner().a();
        AbstractC1209k.d(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f16141A = new N0(oVarA, yVar);
        this.f16143C = new B2.e(21, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x007d -> B:50:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(e5.AbstractC0865c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t0.b
            if (r0 == 0) goto L13
            r0 = r8
            t0.b r0 = (t0.b) r0
            int r1 = r0.f16140r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16140r = r1
            goto L18
        L13:
            t0.b r0 = new t0.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f16138p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f16140r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            y5.b r2 = r0.f16137o
            android.support.v4.media.session.b.K(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            y5.b r2 = r0.f16137o
            android.support.v4.media.session.b.K(r8)
            goto L52
        L3a:
            android.support.v4.media.session.b.K(r8)
            y5.c r8 = r7.f16151v
            r8.getClass()
            y5.b r2 = new y5.b
            r2.<init>(r8)
        L47:
            r0.f16137o = r2
            r0.f16140r = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.c()
            boolean r8 = r7.k()
            if (r8 == 0) goto L66
            r7.l()
        L66:
            boolean r8 = r7.f16142B
            if (r8 != 0) goto L73
            r7.f16142B = r4
            android.os.Handler r8 = r7.f16152w
            B2.e r5 = r7.f16143C
            r8.post(r5)
        L73:
            r0.f16137o = r2
            r0.f16140r = r3
            long r5 = r7.f16148s
            java.lang.Object r8 = w5.AbstractC1767D.i(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            Y4.o r8 = Y4.o.f8736a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.a(e5.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void b(InterfaceC0597u interfaceC0597u) {
        AbstractC1209k.f(interfaceC0597u, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void c(InterfaceC0597u interfaceC0597u) {
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void d(InterfaceC0597u interfaceC0597u) {
        l.c(interfaceC0597u);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(t.AbstractC1457l r35) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.e(t.l):void");
    }

    public final AbstractC1457l f() {
        if (this.f16150u) {
            this.f16150u = false;
            this.f16153x = r.b(this.f16144o.getSemanticsOwner());
            this.f16154y = System.currentTimeMillis();
        }
        return this.f16153x;
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void h(InterfaceC0597u interfaceC0597u) {
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void i(InterfaceC0597u interfaceC0597u) {
        this.f16146q = (U0.c) this.f16145p.a();
        o(-1, this.f16144o.getSemanticsOwner().a());
        l();
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void j(InterfaceC0597u interfaceC0597u) {
        p(this.f16144o.getSemanticsOwner().a());
        l();
        this.f16146q = null;
    }

    public final boolean k() {
        return this.f16146q != null;
    }

    public final void l() {
        U0.c cVar = this.f16146q;
        if (cVar == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f16147r;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            Object obj = cVar.f7027a;
            if (i7 >= size) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentCaptureSession contentCaptureSessionG = H1.c.g(obj);
                    U0.a aVarF = N5.d.F(cVar.f7028b);
                    Objects.requireNonNull(aVarF);
                    U0.b.g(contentCaptureSessionG, AbstractC0002c.o(aVarF.f7026a), new long[]{Long.MIN_VALUE});
                }
                arrayList.clear();
                return;
            }
            d dVar = (d) arrayList.get(i7);
            int iOrdinal = dVar.f16158c.ordinal();
            if (iOrdinal == 0) {
                C0247a c0247a = dVar.f16159d;
                if (c0247a != null && Build.VERSION.SDK_INT >= 29) {
                    U0.b.d(H1.c.g(obj), (ViewStructure) c0247a.f4105p);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new W();
                }
                AutofillId autofillIdA = cVar.a(dVar.f16156a);
                if (autofillIdA != null && Build.VERSION.SDK_INT >= 29) {
                    U0.b.e(H1.c.g(obj), autofillIdA);
                }
            }
            i7++;
        }
    }

    public final void m(Y0.o oVar, N0 n02) {
        Q q7 = new Q(n02, 9, this);
        oVar.getClass();
        List listJ = Y0.o.j(4, oVar);
        int size = listJ.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = listJ.get(i8);
            if (f().a(((Y0.o) obj).f8487g)) {
                q7.invoke(Integer.valueOf(i7), obj);
                i7++;
            }
        }
        List listJ2 = Y0.o.j(4, oVar);
        int size2 = listJ2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Y0.o oVar2 = (Y0.o) listJ2.get(i9);
            if (f().a(oVar2.f8487g)) {
                y yVar = this.f16155z;
                int i10 = oVar2.f8487g;
                if (yVar.a(i10)) {
                    Object objB = yVar.b(i10);
                    if (objB == null) {
                        throw n1.c.p("node not present in pruned tree before this change");
                    }
                    m(oVar2, (N0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void n(int i7, String str) {
        U0.c cVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29 && (cVar = this.f16146q) != null) {
            AutofillId autofillIdA = cVar.a(i7);
            if (autofillIdA == null) {
                throw n1.c.p("Invalid content capture ID");
            }
            if (i8 >= 29) {
                U0.b.f(H1.c.g(cVar.f7027a), autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r23, Y0.o r24) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.o(int, Y0.o):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16152w.removeCallbacks(this.f16143C);
        this.f16146q = null;
    }

    public final void p(Y0.o oVar) {
        if (k()) {
            this.f16147r.add(new d(oVar.f8487g, this.f16154y, e.f16161p, null));
            List listJ = Y0.o.j(4, oVar);
            int size = listJ.size();
            for (int i7 = 0; i7 < size; i7++) {
                p((Y0.o) listJ.get(i7));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r17 = this;
            r0 = r17
            t.y r1 = r0.f16155z
            r1.c()
            t.l r2 = r0.f()
            int[] r3 = r2.f16084b
            java.lang.Object[] r4 = r2.f16085c
            long[] r2 = r2.f16083a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            Y0.p r13 = (Y0.p) r13
            R0.N0 r15 = new R0.N0
            Y0.o r13 = r13.f8488a
            t.l r6 = r0.f()
            r15.<init>(r13, r6)
            r1.h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            R0.N0 r1 = new R0.N0
            R0.x r2 = r0.f16144o
            Y0.q r2 = r2.getSemanticsOwner()
            Y0.o r2 = r2.a()
            t.l r3 = r0.f()
            r1.<init>(r2, r3)
            r0.f16141A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.q():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
