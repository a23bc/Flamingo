package D2;

import A2.x0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import d2.C0821i;
import java.util.List;
import w2.AbstractC1697a;
import w3.C1710a0;
import w3.C1713b0;
import w3.C1716c0;
import x3.C1901C;
import x3.C1903E;
import x3.C1911M;
import x3.InterfaceC1923h;
import x3.Z;
import x3.m0;

/* JADX INFO: renamed from: D2.a */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0085a extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1462a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f1463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0085a(C0089e c0089e, Looper looper) {
        super(looper);
        this.f1464c = c0089e;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.os.Message r8, D2.D r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            D2.b r0 = (D2.C0086b) r0
            boolean r1 = r0.f1466b
            r2 = 0
            if (r1 != 0) goto Lb
            goto L87
        Lb:
            int r1 = r0.f1468d
            r3 = 1
            int r1 = r1 + r3
            r0.f1468d = r1
            java.lang.Object r4 = r7.f1464c
            D2.e r4 = (D2.C0089e) r4
            A2.x0 r4 = r4.f1478i
            r4.getClass()
            r4 = 3
            if (r1 <= r4) goto L1f
            goto L87
        L1f:
            H2.r r1 = new H2.r
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L36
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L40
        L36:
            D2.d r1 = new D2.d
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L40:
            java.lang.Object r1 = r7.f1464c
            D2.e r1 = (D2.C0089e) r1
            A2.x0 r1 = r1.f1478i
            int r0 = r0.f1468d
            r1.getClass()
            boolean r1 = r9 instanceof t2.N
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof y2.u
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof K2.l
            if (r1 != 0) goto L82
            int r1 = y2.k.f20337p
        L62:
            if (r9 == 0) goto L77
            boolean r1 = r9 instanceof y2.k
            if (r1 == 0) goto L72
            r1 = r9
            y2.k r1 = (y2.k) r1
            int r1 = r1.f20338o
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L72
            goto L82
        L72:
            java.lang.Throwable r9 = r9.getCause()
            goto L62
        L77:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L83
        L82:
            r0 = r4
        L83:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L88
        L87:
            return r2
        L88:
            monitor-enter(r7)
            boolean r9 = r7.f1463b     // Catch: java.lang.Throwable -> L96
            if (r9 != 0) goto L98
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L96
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return r3
        L96:
            r8 = move-exception
            goto L9a
        L98:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return r2
        L9a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.HandlerC0085a.a(android.os.Message, D2.D):boolean");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objE;
        int i7;
        boolean zA0;
        switch (this.f1462a) {
            case 0:
                C0086b c0086b = (C0086b) message.obj;
                try {
                    int i8 = message.what;
                    if (i8 == 1) {
                        objE = ((C0089e) this.f1464c).f1480k.e((v) c0086b.f1467c);
                    } else {
                        if (i8 != 2) {
                            throw new RuntimeException();
                        }
                        C0089e c0089e = (C0089e) this.f1464c;
                        objE = c0089e.f1480k.c(c0089e.l, (u) c0086b.f1467c);
                    }
                } catch (D e7) {
                    boolean zA = a(message, e7);
                    objE = e7;
                    if (zA) {
                        return;
                    }
                } catch (Exception e8) {
                    AbstractC1697a.x("Key/provisioning request produced an unexpected exception. Not retrying.", e8);
                    objE = e8;
                }
                x0 x0Var = ((C0089e) this.f1464c).f1478i;
                long j3 = c0086b.f1465a;
                x0Var.getClass();
                synchronized (this) {
                    try {
                        if (!this.f1463b) {
                            ((C0089e) this.f1464c).f1482n.obtainMessage(message.what, Pair.create(c0086b.f1467c, objE)).sendToTarget();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                if (this.f1463b) {
                    int i9 = message.what;
                    C1710a0 c1710a0 = (C1710a0) this.f1464c;
                    switch (i9) {
                        case 1:
                            Bundle data = message.getData();
                            Z.a(data);
                            c1710a0.h((String) message.obj, data);
                            return;
                        case 2:
                            c1710a0.e((m0) message.obj);
                            return;
                        case 3:
                            c1710a0.d((C1911M) message.obj);
                            return;
                        case 4:
                            c1710a0.a((C1903E) message.obj);
                            return;
                        case 5:
                            c1710a0.f((List) message.obj);
                            return;
                        case 6:
                            c1710a0.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            Z.a(bundle);
                            c1710a0.c(bundle);
                            return;
                        case 8:
                            c1710a0.f19134e.f19154b.a();
                            return;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            int iIntValue = ((Integer) message.obj).intValue();
                            C1716c0 c1716c0 = c1710a0.f19134e;
                            C1713b0 c1713b0 = c1716c0.l;
                            c1716c0.l = new C1713b0(c1713b0.f19140a, c1713b0.f19141b, c1713b0.f19142c, c1713b0.f19143d, c1713b0.f19144e, iIntValue, c1713b0.f19146g, c1713b0.h);
                            c1710a0.k();
                            return;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        default:
                            return;
                        case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                            c1710a0.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            C1716c0 c1716c02 = c1710a0.f19134e;
                            C1713b0 c1713b02 = c1716c02.l;
                            c1716c02.l = new C1713b0(c1713b02.f19140a, c1713b02.f19141b, c1713b02.f19142c, c1713b02.f19143d, c1713b02.f19144e, c1713b02.f19145f, iIntValue2, c1713b02.h);
                            c1710a0.k();
                            return;
                        case 13:
                            C1716c0 c1716c03 = c1710a0.f19134e;
                            if (!c1716c03.f19161j) {
                                c1716c03.U0();
                                return;
                            }
                            C1713b0 c1713b03 = c1716c03.l;
                            m0 m0VarP0 = C1716c0.P0(c1716c03.f19159g.C());
                            InterfaceC1923h interfaceC1923hA = ((C1901C) c1716c03.f19159g.f7389o).f19977e.a();
                            int iR = -1;
                            if (interfaceC1923hA != null) {
                                try {
                                    i7 = interfaceC1923hA.i();
                                } catch (RemoteException unused) {
                                    i7 = -1;
                                }
                            } else {
                                i7 = -1;
                            }
                            InterfaceC1923h interfaceC1923hA2 = ((C1901C) c1716c03.f19159g.f7389o).f19977e.a();
                            if (interfaceC1923hA2 != null) {
                                try {
                                    iR = interfaceC1923hA2.R();
                                    break;
                                } catch (RemoteException unused2) {
                                }
                            }
                            CharSequence charSequence = c1713b03.f19144e;
                            c1716c03.l = new C1713b0(c1713b03.f19140a, m0VarP0, c1713b03.f19142c, c1713b03.f19143d, charSequence, i7, iR, c1713b03.h);
                            InterfaceC1923h interfaceC1923hA3 = ((C1901C) c1716c03.f19159g.f7389o).f19977e.a();
                            if (interfaceC1923hA3 != null) {
                                try {
                                    zA0 = interfaceC1923hA3.a0();
                                } catch (RemoteException unused3) {
                                    zA0 = false;
                                }
                                break;
                            } else {
                                zA0 = false;
                            }
                            c1710a0.b(zA0);
                            c1710a0.f19133d.removeMessages(1);
                            c1716c03.R0(false, c1716c03.l);
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0085a(C1710a0 c1710a0, Looper looper) {
        super(looper);
        this.f1464c = c1710a0;
        this.f1463b = false;
    }
}
