package Q0;

import java.util.HashSet;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;
import t.C1443E;

/* JADX INFO: renamed from: Q0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0352h0 {

    /* JADX INFO: renamed from: a */
    public final K f6000a;

    /* JADX INFO: renamed from: b */
    public final C0350g0 f6001b;

    /* JADX INFO: renamed from: c */
    public final C0365v f6002c;

    /* JADX INFO: renamed from: d */
    public j0 f6003d;

    /* JADX INFO: renamed from: e */
    public final C0 f6004e;

    /* JADX INFO: renamed from: f */
    public AbstractC1397o f6005f;

    /* JADX INFO: renamed from: g */
    public h0.e f6006g;
    public h0.e h;

    /* JADX INFO: renamed from: i */
    public final h0.e f6007i;

    /* JADX INFO: renamed from: j */
    public C0348f0 f6008j;

    public C0352h0(K k7) {
        this.f6000a = k7;
        C0350g0 c0350g0 = new C0350g0();
        c0350g0.f15640r = -1;
        this.f6001b = c0350g0;
        C0365v c0365v = new C0365v(k7);
        this.f6002c = c0365v;
        this.f6003d = c0365v;
        C0 c02 = c0365v.f6083f0;
        this.f6004e = c02;
        this.f6005f = c02;
        this.f6007i = new h0.e(new InterfaceC1398p[16]);
    }

    public static final void a(C0352h0 c0352h0, AbstractC1397o abstractC1397o, j0 j0Var) {
        c0352h0.getClass();
        for (AbstractC1397o abstractC1397o2 = abstractC1397o.f15641s; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15641s) {
            if (abstractC1397o2 == c0352h0.f6001b) {
                K kV = c0352h0.f6000a.v();
                j0Var.f6028G = kV != null ? kV.f5821T.f6002c : null;
                c0352h0.f6003d = j0Var;
                return;
            } else {
                if ((abstractC1397o2.f15639q & 2) != 0) {
                    return;
                }
                abstractC1397o2.A0(j0Var);
            }
        }
    }

    public static AbstractC1397o b(InterfaceC1396n interfaceC1396n, AbstractC1397o abstractC1397o) {
        AbstractC1397o abstractC1397oK;
        if (interfaceC1396n instanceof AbstractC0344d0) {
            abstractC1397oK = ((AbstractC0344d0) interfaceC1396n).k();
            abstractC1397oK.f15639q = k0.f(abstractC1397oK);
        } else {
            C0341c c0341c = new C0341c();
            c0341c.f15639q = k0.d(interfaceC1396n);
            c0341c.f5937C = interfaceC1396n;
            c0341c.f5939E = new HashSet();
            abstractC1397oK = c0341c;
        }
        if (abstractC1397oK.f15636B) {
            N0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC1397oK.f15645w = true;
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t;
        if (abstractC1397o2 != null) {
            abstractC1397o2.f15641s = abstractC1397oK;
            abstractC1397oK.f15642t = abstractC1397o2;
        }
        abstractC1397o.f15642t = abstractC1397oK;
        abstractC1397oK.f15641s = abstractC1397o;
        return abstractC1397oK;
    }

    public static AbstractC1397o c(AbstractC1397o abstractC1397o) {
        boolean z6 = abstractC1397o.f15636B;
        if (z6) {
            C1443E c1443e = k0.f6048a;
            if (!z6) {
                N0.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            k0.a(abstractC1397o, -1, 2);
            abstractC1397o.y0();
            abstractC1397o.q0();
        }
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15642t;
        AbstractC1397o abstractC1397o3 = abstractC1397o.f15641s;
        if (abstractC1397o2 != null) {
            abstractC1397o2.f15641s = abstractC1397o3;
            abstractC1397o.f15642t = null;
        }
        if (abstractC1397o3 != null) {
            abstractC1397o3.f15642t = abstractC1397o2;
            abstractC1397o.f15641s = null;
        }
        AbstractC1209k.c(abstractC1397o3);
        return abstractC1397o3;
    }

    public static void h(InterfaceC1396n interfaceC1396n, InterfaceC1396n interfaceC1396n2, AbstractC1397o abstractC1397o) {
        if ((interfaceC1396n instanceof AbstractC0344d0) && (interfaceC1396n2 instanceof AbstractC0344d0)) {
            AbstractC1209k.d(abstractC1397o, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0344d0) interfaceC1396n2).m(abstractC1397o);
            if (abstractC1397o.f15636B) {
                k0.c(abstractC1397o);
                return;
            } else {
                abstractC1397o.f15646x = true;
                return;
            }
        }
        if (!(abstractC1397o instanceof C0341c)) {
            N0.a.b("Unknown Modifier.Node type");
            return;
        }
        C0341c c0341c = (C0341c) abstractC1397o;
        if (c0341c.f15636B) {
            c0341c.C0();
        }
        c0341c.f5937C = interfaceC1396n2;
        c0341c.f15639q = k0.d(interfaceC1396n2);
        if (c0341c.f15636B) {
            c0341c.B0(false);
        }
        if (abstractC1397o.f15636B) {
            k0.c(abstractC1397o);
        } else {
            abstractC1397o.f15646x = true;
        }
    }

    public final boolean d(int i7) {
        return (i7 & this.f6005f.f15640r) != 0;
    }

    public final void e() {
        for (AbstractC1397o abstractC1397o = this.f6005f; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.x0();
            if (abstractC1397o.f15645w) {
                C1443E c1443e = k0.f6048a;
                if (!abstractC1397o.f15636B) {
                    N0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                k0.a(abstractC1397o, -1, 1);
            }
            if (abstractC1397o.f15646x) {
                k0.c(abstractC1397o);
            }
            abstractC1397o.f15645w = false;
            abstractC1397o.f15646x = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0153, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0159, code lost:
    
        if ((r22 & 1) != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x015b, code lost:
    
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x015e, code lost:
    
        r8 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0160, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0161, code lost:
    
        if (r13 > r1) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0163, code lost:
    
        if (r13 == r10) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0165, code lost:
    
        if (r13 == r1) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0167, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0175, code lost:
    
        if (r29[(r13 + 1) + r20] >= r29[(r13 - 1) + r20]) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0178, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x017a, code lost:
    
        r8 = r29[(r13 - 1) + r20];
        r14 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0183, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0185, code lost:
    
        r8 = r29[(r13 + 1) + r20];
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x018c, code lost:
    
        r23 = r9 - ((r7 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0192, code lost:
    
        if (r1 == 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0194, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0197, code lost:
    
        r25 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0199, code lost:
    
        if (r14 != r8) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x019b, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x019e, code lost:
    
        r27 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01a0, code lost:
    
        r25 = r23 + (r25 & r27);
        r23 = r8;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01aa, code lost:
    
        if (r14 <= r6) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01ac, code lost:
    
        if (r8 <= r12) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01ae, code lost:
    
        r27 = r8;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01bc, code lost:
    
        if (r11.a(r14 - 1, r27 - 1) == false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01be, code lost:
    
        r14 = r14 - 1;
        r8 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01c5, code lost:
    
        r27 = r8;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01c9, code lost:
    
        r29[r20 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01cd, code lost:
    
        if (r24 == 0) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01cf, code lost:
    
        r8 = r22 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x01d1, code lost:
    
        if (r8 < r10) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01d3, code lost:
    
        if (r8 > r1) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01d9, code lost:
    
        if (r26[r20 + r8] < r14) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01db, code lost:
    
        r15[r32] = r14;
        r21 = 1;
        r15[1] = r27;
        r15[r17] = r23;
        r15[r19] = r25;
        r15[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x026d, code lost:
    
        r13 = r28 + 2;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0275, code lost:
    
        r1 = r1 + 1;
        r8 = r35;
        r10 = r36;
        r13 = r26;
        r14 = r29;
        r21 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r32, h0.e r33, h0.e r34, r0.AbstractC1397o r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0352h0.f(int, h0.e, h0.e, r0.o, boolean):void");
    }

    public final void g() {
        K k7;
        D d4;
        r0 r0Var;
        AbstractC1397o abstractC1397o = this.f6004e.f15641s;
        j0 j0Var = this.f6002c;
        while (true) {
            k7 = this.f6000a;
            if (abstractC1397o == null) {
                break;
            }
            A aG = AbstractC0347f.g(abstractC1397o);
            if (aG != null) {
                j0 j0Var2 = abstractC1397o.f15644v;
                if (j0Var2 != null) {
                    d4 = (D) j0Var2;
                    A a4 = d4.f5777f0;
                    d4.k1(aG);
                    if (a4 != abstractC1397o && (r0Var = d4.f6046Y) != null) {
                        ((R0.A0) r0Var).invalidate();
                    }
                } else {
                    d4 = new D(k7, aG);
                    abstractC1397o.A0(d4);
                }
                j0Var.f6028G = d4;
                d4.f6027F = j0Var;
                j0Var = d4;
            } else {
                abstractC1397o.A0(j0Var);
            }
            abstractC1397o = abstractC1397o.f15641s;
        }
        K kV = k7.v();
        j0Var.f6028G = kV != null ? kV.f5821T.f6002c : null;
        this.f6003d = j0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC1397o abstractC1397o = this.f6005f;
        C0 c02 = this.f6004e;
        if (abstractC1397o == c02) {
            sb.append("]");
        } else {
            while (true) {
                if (abstractC1397o == null || abstractC1397o == c02) {
                    break;
                }
                sb.append(String.valueOf(abstractC1397o));
                if (abstractC1397o.f15642t == c02) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC1397o = abstractC1397o.f15642t;
            }
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
