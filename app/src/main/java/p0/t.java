package p0;

import d.C0746L;
import f0.C0879c;
import f0.C0910s;
import f0.G;
import java.util.HashMap;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.C1443E;
import t.J;
import t.K;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f14961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1443E f14963c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14969j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14964d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f14965e = android.support.v4.media.session.b.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f14966f = new J();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f14967g = new K();
    public final h0.e h = new h0.e(new G[16]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0910s f14968i = new C0910s(1, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J f14970k = android.support.v4.media.session.b.i();
    public final HashMap l = new HashMap();

    public t(InterfaceC1182c interfaceC1182c) {
        this.f14961a = interfaceC1182c;
    }

    public final void a(Object obj, D.J j3, InterfaceC1180a interfaceC1180a) {
        boolean z6;
        int i7;
        int i8;
        Object obj2 = this.f14962b;
        C1443E c1443e = this.f14963c;
        int i9 = this.f14964d;
        this.f14962b = obj;
        this.f14963c = (C1443E) this.f14966f.g(obj);
        if (this.f14964d == -1) {
            long jG = l.k().g();
            this.f14964d = (int) (jG ^ (jG >>> 32));
        }
        C0910s c0910s = this.f14968i;
        h0.e eVarM = C0879c.m();
        boolean z7 = true;
        try {
            eVarM.b(c0910s);
            C0746L.x(interfaceC1180a, j3);
            eVarM.l(eVarM.f12548q - 1);
            Object obj3 = this.f14962b;
            AbstractC1209k.c(obj3);
            int i10 = this.f14964d;
            C1443E c1443e2 = this.f14963c;
            if (c1443e2 != null) {
                long[] jArr = c1443e2.f15977a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j7 = jArr[i11];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            z6 = z7;
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j7 & 255) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    i8 = i12;
                                    Object obj4 = c1443e2.f15978b[i15];
                                    i7 = i14;
                                    boolean z8 = c1443e2.f15979c[i15] != i10 ? z6 : false;
                                    if (z8) {
                                        d(obj3, obj4);
                                    }
                                    if (z8) {
                                        c1443e2.g(i15);
                                    }
                                } else {
                                    i7 = i14;
                                    i8 = i12;
                                }
                                j7 >>= i8;
                                i14 = i7 + 1;
                                i12 = i8;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z6 = z7;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z7 = z6;
                    }
                }
            }
            this.f14962b = obj2;
            this.f14963c = c1443e;
            this.f14964d = i9;
        } catch (Throwable th) {
            eVarM.l(eVarM.f12548q - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b(java.util.Set r47) {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, t.C1443E r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f14969j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f15979c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f15978b
            r7[r4] = r1
            int[] r3 = r3.f15979c
            r3[r4] = r2
            boolean r3 = r1 instanceof f0.G
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            f0.G r2 = (f0.G) r2
            f0.F r2 = r2.j()
            java.util.HashMap r3 = r0.l
            java.lang.Object r7 = r2.f11655f
            r3.put(r1, r7)
            t.E r2 = r2.f11654e
            t.J r3 = r0.f14970k
            android.support.v4.media.session.b.F(r3, r1)
            java.lang.Object[] r7 = r2.f15978b
            long[] r2 = r2.f15977a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            p0.y r9 = (p0.y) r9
            boolean r5 = r9 instanceof p0.z
            if (r5 == 0) goto L82
            r5 = r9
            p0.z r5 = (p0.z) r5
            r5.f(r4)
        L82:
            android.support.v4.media.session.b.e(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof p0.z
            if (r2 == 0) goto L9d
            r2 = r1
            p0.z r2 = (p0.z) r2
            r2.f(r4)
        L9d:
            t.J r2 = r0.f14965e
            r3 = r23
            android.support.v4.media.session.b.e(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t.c(java.lang.Object, int, java.lang.Object, t.E):void");
    }

    public final void d(Object obj, Object obj2) {
        J j3 = this.f14965e;
        android.support.v4.media.session.b.E(j3, obj2, obj);
        if (!(obj2 instanceof G) || j3.c(obj2)) {
            return;
        }
        android.support.v4.media.session.b.F(this.f14970k, obj2);
        this.l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t.e():void");
    }
}
