package w0;

import A2.W;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.K;
import R0.C0409u;
import R0.C0414w0;
import R0.C0415x;
import R0.M;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import java.util.ArrayList;
import m5.AbstractC1209k;
import m5.C1220v;
import r0.AbstractC1397o;
import t.C1442D;
import t.C1444F;
import x0.C1893c;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a */
    public final C0415x f18786a;

    /* JADX INFO: renamed from: b */
    public final C0415x f18787b;

    /* JADX INFO: renamed from: d */
    public final g f18789d;

    /* JADX INFO: renamed from: f */
    public C1442D f18791f;
    public u h;

    /* JADX INFO: renamed from: c */
    public final u f18788c = new u(2, null, 6);

    /* JADX INFO: renamed from: e */
    public final FocusOwnerImpl$modifier$1 f18790e = new AbstractC0344d0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f9293a.f18788c.hashCode();
        }

        @Override // Q0.AbstractC0344d0
        public final AbstractC1397o k() {
            return this.f9293a.f18788c;
        }

        @Override // Q0.AbstractC0344d0
        public final /* bridge */ /* synthetic */ void m(AbstractC1397o abstractC1397o) {
        }
    };

    /* JADX INFO: renamed from: g */
    public final C1444F f18792g = new C1444F(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public k(C0415x c0415x, C0415x c0415x2) {
        this.f18786a = c0415x;
        this.f18787b = c0415x2;
        this.f18789d = new g(this, c0415x2);
    }

    public final boolean a(boolean z6) {
        C0352h0 c0352h0;
        u uVar = this.h;
        if (uVar != null) {
            g(null);
            uVar.B0(t.f18812o, t.f18815r);
            if (!uVar.f15637o.f15636B) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1397o abstractC1397o = uVar.f15637o.f15641s;
            K kX = AbstractC0347f.x(uVar);
            while (kX != null) {
                if ((kX.f5821T.f6005f.f15640r & 1024) != 0) {
                    while (abstractC1397o != null) {
                        if ((abstractC1397o.f15639q & 1024) != 0) {
                            h0.e eVar = null;
                            AbstractC1397o abstractC1397oF = abstractC1397o;
                            while (abstractC1397oF != null) {
                                if (abstractC1397oF instanceof u) {
                                    ((u) abstractC1397oF).B0(t.f18813p, t.f18815r);
                                } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                    int i7 = 0;
                                    for (AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                                        if ((abstractC1397o2.f15639q & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC1397oF = abstractC1397o2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (abstractC1397oF != null) {
                                                    eVar.b(abstractC1397oF);
                                                    abstractC1397oF = null;
                                                }
                                                eVar.b(abstractC1397o2);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC1397oF = AbstractC0347f.f(eVar);
                            }
                        }
                        abstractC1397o = abstractC1397o.f15641s;
                    }
                }
                kX = kX.v();
                abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
            }
        }
        return true;
    }

    public final boolean b(int i7, boolean z6, boolean z7) {
        int iOrdinal;
        boolean z8 = true;
        if (z6 || (iOrdinal = f.s(this.f18788c, i7).ordinal()) == 0) {
            a(z6);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new W();
            }
            z8 = false;
        }
        if (z8 && z7) {
            c();
        }
        return z8;
    }

    public final void c() {
        C0415x c0415x = this.f18786a;
        if (c0415x.isFocused() || c0415x.hasFocus()) {
            c0415x.clearFocus();
        } else if (c0415x.hasFocus()) {
            View viewFindFocus = c0415x.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            c0415x.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:390:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x00e0 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:360:0x0007, B:362:0x000e, B:367:0x001a, B:371:0x0024, B:374:0x0030, B:376:0x0036, B:377:0x003b, B:379:0x0043, B:381:0x0048, B:383:0x004e, B:387:0x0054, B:485:0x0168, B:487:0x016e, B:488:0x0171, B:490:0x017c, B:493:0x0188, B:497:0x0192, B:500:0x0198, B:501:0x019d, B:521:0x01d7, B:502:0x01a1, B:504:0x01a7, B:506:0x01ab, B:508:0x01b3, B:510:0x01b9, B:514:0x01c1, B:516:0x01ca, B:517:0x01ce, B:518:0x01d1, B:522:0x01dc, B:523:0x01df, B:525:0x01e5, B:527:0x01e9, B:530:0x01f0, B:532:0x01f8, B:539:0x020f, B:541:0x0214, B:543:0x0218, B:566:0x025a, B:547:0x0224, B:549:0x022a, B:551:0x022e, B:553:0x0236, B:555:0x023c, B:559:0x0244, B:561:0x024d, B:562:0x0251, B:563:0x0254, B:567:0x025f, B:571:0x026f, B:573:0x0274, B:575:0x0278, B:598:0x02ba, B:579:0x0284, B:581:0x028a, B:583:0x028e, B:585:0x0296, B:587:0x029c, B:591:0x02a4, B:593:0x02ad, B:594:0x02b1, B:595:0x02b4, B:600:0x02c1, B:602:0x02c8, B:391:0x005c, B:393:0x0062, B:394:0x0065, B:396:0x006d, B:399:0x0079, B:403:0x0083, B:434:0x00d6, B:436:0x00da, B:406:0x0088, B:408:0x008e, B:410:0x0092, B:412:0x009a, B:414:0x00a0, B:418:0x00a8, B:420:0x00b1, B:421:0x00b5, B:422:0x00b8, B:425:0x00be, B:426:0x00c3, B:427:0x00c6, B:429:0x00cc, B:431:0x00d0, B:437:0x00e0, B:439:0x00e6, B:440:0x00e9, B:442:0x00f3, B:445:0x00ff, B:449:0x0109, B:480:0x015c, B:482:0x0160, B:452:0x010e, B:454:0x0114, B:456:0x0118, B:458:0x0120, B:460:0x0126, B:464:0x012e, B:466:0x0137, B:467:0x013b, B:468:0x013e, B:471:0x0144, B:472:0x0149, B:473:0x014c, B:475:0x0152, B:477:0x0156), top: B:611:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r15v5, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r15v9, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.KeyEvent r14, l5.InterfaceC1180a r15) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k.d(android.view.KeyEvent, l5.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x005d A[PHI: r12
  0x005d: PHI (r12v10 w0.p) = (r12v7 w0.p), (r12v14 w0.p) binds: [B:223:0x007a, B:209:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v4, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r15v8, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r3v13, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r5v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean e(int r19, x0.C1893c r20, l5.InterfaceC1182c r21) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k.e(int, x0.c, l5.c):java.lang.Boolean");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean f(int i7) {
        boolean zY;
        View viewA;
        C1220v c1220v = new C1220v();
        c1220v.f14439o = Boolean.FALSE;
        u uVar = this.h;
        C0415x c0415x = this.f18786a;
        Boolean boolE = e(i7, c0415x.getEmbeddedViewFocusRect(), new j(c1220v, i7));
        if (!AbstractC1209k.a(boolE, Boolean.TRUE) || uVar == this.h) {
            if (boolE != null && c1220v.f14439o != null) {
                if (!boolE.booleanValue() || !((Boolean) c1220v.f14439o).booleanValue()) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 != 7 && i7 != 8) {
                            Integer numC = f.C(i7);
                            if (numC == null) {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                            int iIntValue = numC.intValue();
                            C1893c embeddedViewFocusRect = c0415x.getEmbeddedViewFocusRect();
                            Rect rectU = embeddedViewFocusRect != null ? AbstractC1959I.u(embeddedViewFocusRect) : null;
                            Object obj = C0414w0.f6549f.get();
                            AbstractC1209k.c(obj);
                            C0414w0 c0414w0 = (C0414w0) obj;
                            if (rectU == null) {
                                viewA = c0414w0.b(iIntValue, c0415x.findFocus(), c0415x);
                            } else {
                                c0414w0.f6550a.set(rectU);
                                Rect rect = c0414w0.f6550a;
                                ArrayList<View> arrayList = c0414w0.f6554e;
                                try {
                                    arrayList.clear();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        M.o(c0415x, arrayList, c0415x.isInTouchMode());
                                    } else {
                                        c0415x.addFocusables(arrayList, iIntValue, c0415x.isInTouchMode() ? 1 : 0);
                                    }
                                    viewA = arrayList.isEmpty() ? null : c0414w0.a(iIntValue, rect, null, c0415x, arrayList);
                                    arrayList.clear();
                                } catch (Throwable th) {
                                    arrayList.clear();
                                    throw th;
                                }
                            }
                            if (viewA != null) {
                                zY = f.y(viewA, Integer.valueOf(iIntValue), rectU);
                            }
                            if (!zY) {
                            }
                        }
                        zY = false;
                        if (!zY) {
                        }
                    } else if (b(i7, false, false)) {
                        Boolean boolE2 = e(i7, null, new C0409u(i7, 3));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(u uVar) {
        K kX;
        Y0.j jVarY;
        K kX2;
        Y0.j jVarY2;
        u uVar2 = this.h;
        this.h = uVar;
        C1444F c1444f = this.f18792g;
        Object[] objArr = c1444f.f15983a;
        int i7 = c1444f.f15984b;
        for (int i8 = 0; i8 < i7; i8++) {
            s0.c cVar = (s0.c) objArr[i8];
            cVar.getClass();
            if (uVar2 != null && (kX2 = AbstractC0347f.x(uVar2)) != null && (jVarY2 = kX2.y()) != null) {
                if (jVarY2.f8473o.b(Y0.i.f8455g)) {
                    ((AutofillManager) cVar.f15824a.f13847p).notifyViewExited(cVar.f15826c, kX2.f5831p);
                }
            }
            if (uVar != null && (kX = AbstractC0347f.x(uVar)) != null && (jVarY = kX.y()) != null) {
                if (jVarY.f8473o.b(Y0.i.f8455g)) {
                    int i9 = kX.f5831p;
                    cVar.f15827d.f8739a.B(i9, new s0.a(cVar, i9));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0098, code lost:
    
        r34 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00a2, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00a4, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00aa, code lost:
    
        if (r4.f15976e != 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00bb, code lost:
    
        if (((r4.f15972a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00bd, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c1, code lost:
    
        r3 = r4.f15974c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00c3, code lost:
    
        if (r3 <= 8) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00c5, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00dd, code lost:
    
        if (java.lang.Long.compare((((long) r4.f15975d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00df, code lost:
    
        r3 = r4.f15972a;
        r5 = r4.f15974c;
        r7 = r4.f15973b;
        r8 = (r5 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00eb, code lost:
    
        if (r9 >= r8) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00ed, code lost:
    
        r13 = r3[r9] & (-9187201950435737472L);
        r3[r9] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r9 = r9 + 1;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0106, code lost:
    
        r15 = r7;
        r7 = Z4.l.k0(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0122, code lost:
    
        if (r7 == r5) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0124, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r13 = (r3[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0131, code lost:
    
        if (r13 != 128) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0133, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0138, code lost:
    
        if (r13 == 254) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x013b, code lost:
    
        r13 = r15[r7];
        r13 = ((int) (r13 ^ (r13 >>> 32))) * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r14 = r13 >>> 7;
        r22 = r4.b(r14);
        r14 = r14 & r5;
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x015b, code lost:
    
        if ((((r22 - r14) & r5) / 8) != (((r7 - r14) & r5) / 8)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x015d, code lost:
    
        r3[r8] = (r3[r8] & (~(255 << r9))) | (((long) (r13 & 127)) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x017b, code lost:
    
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x017e, code lost:
    
        r14 = r7;
        r7 = r22 >> 3;
        r36 = r3[r7];
        r8 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x018f, code lost:
    
        if (((r36 >> r8) & 255) != 128) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0191, code lost:
    
        r3[r7] = (r36 & (~(255 << r8))) | (((long) (r13 & 127)) << r8);
        r3[r8] = (r3[r8] & (~(255 << r9))) | (128 << r9);
        r15[r22] = r15[r14];
        r15[r14] = 0;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01b5, code lost:
    
        r3[r7] = (((long) (r13 & 127)) << r8) | (r36 & (~(255 << r8)));
        r7 = r15[r22];
        r15[r22] = r15[r14];
        r15[r14] = r7;
        r7 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d0, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01de, code lost:
    
        r4.f15976e = t.Q.a(r4.f15974c) - r4.f15975d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01eb, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01ed, code lost:
    
        r3 = t.Q.b(r4.f15974c);
        r5 = r4.f15972a;
        r7 = r4.f15973b;
        r8 = r4.f15974c;
        r4.c(r3);
        r3 = r4.f15972a;
        r9 = r4.f15973b;
        r12 = r4.f15974c;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0204, code lost:
    
        if (r13 >= r8) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0214, code lost:
    
        if (((r5[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r20) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0216, code lost:
    
        r14 = r7[r13];
        r18 = r7;
        r19 = r8;
        r7 = ((int) (r14 ^ (r14 >>> 32))) * (-862048943);
        r7 = r7 ^ (r7 << 16);
        r8 = r4.b(r7 >>> 7);
        r17 = r8 >> 3;
        r22 = (r8 & 7) << 3;
        r7 = (r3[r17] & (~(255 << r22))) | (((long) (r7 & 127)) << r22);
        r3[r17] = r7;
        r3[(((r8 - 7) & r12) + (r12 & 7)) >> 3] = r7;
        r9[r8] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0255, code lost:
    
        r18 = r7;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0259, code lost:
    
        r13 = r13 + 1;
        r7 = r18;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0260, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0264, code lost:
    
        r15 = r3;
        r4.f15975d++;
        r3 = r4.f15976e;
        r5 = r4.f15972a;
        r6 = r15 >> 3;
        r7 = r5[r6];
        r9 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x027d, code lost:
    
        if (((r7 >> r9) & 255) != r20) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x027f, code lost:
    
        r25 = r34 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0281, code lost:
    
        r4.f15976e = r3 - r25;
        r3 = r4.f15974c;
        r7 = (r7 & (~(255 << r9))) | (r10 << r9);
        r5[r6] = r7;
        r5[(((r15 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x031f, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0321, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k.h(android.view.KeyEvent):boolean");
    }
}
