package R0;

import G1.AbstractC0151s;
import G1.C0135b;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b1.C0613I;
import b1.C0622g;
import j5.AbstractC1107a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import t.AbstractC1454i;
import t.AbstractC1456k;
import t.AbstractC1457l;
import t.AbstractC1458m;
import t.C1451f;
import u.AbstractC1525a;
import x0.C1893c;
import x0.C1894d;
import y0.AbstractC1959I;
import y0.C1954D;
import y0.C1955E;
import y0.C1956F;
import y0.C1976i;
import y0.InterfaceC1963M;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class F extends C0135b {

    /* JADX INFO: renamed from: Q */
    public static final t.x f6270Q;

    /* JADX INFO: renamed from: A */
    public boolean f6271A;

    /* JADX INFO: renamed from: B */
    public C f6272B;

    /* JADX INFO: renamed from: C */
    public t.y f6273C;

    /* JADX INFO: renamed from: D */
    public final t.z f6274D;

    /* JADX INFO: renamed from: E */
    public final t.w f6275E;

    /* JADX INFO: renamed from: F */
    public final t.w f6276F;

    /* JADX INFO: renamed from: G */
    public final String f6277G;

    /* JADX INFO: renamed from: H */
    public final String f6278H;

    /* JADX INFO: renamed from: I */
    public final A0.b f6279I;

    /* JADX INFO: renamed from: J */
    public final t.y f6280J;

    /* JADX INFO: renamed from: K */
    public N0 f6281K;

    /* JADX INFO: renamed from: L */
    public boolean f6282L;

    /* JADX INFO: renamed from: M */
    public final t.w f6283M;

    /* JADX INFO: renamed from: N */
    public final B2.e f6284N;

    /* JADX INFO: renamed from: O */
    public final ArrayList f6285O;

    /* JADX INFO: renamed from: P */
    public final E f6286P;

    /* JADX INFO: renamed from: d */
    public final C0415x f6287d;

    /* JADX INFO: renamed from: e */
    public int f6288e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public final E f6289f = new E(this, 0);

    /* JADX INFO: renamed from: g */
    public final AccessibilityManager f6290g;
    public long h;

    /* JADX INFO: renamed from: i */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0417y f6291i;

    /* JADX INFO: renamed from: j */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0419z f6292j;

    /* JADX INFO: renamed from: k */
    public List f6293k;
    public final Handler l;

    /* JADX INFO: renamed from: m */
    public final B f6294m;

    /* JADX INFO: renamed from: n */
    public int f6295n;

    /* JADX INFO: renamed from: o */
    public int f6296o;

    /* JADX INFO: renamed from: p */
    public H1.e f6297p;

    /* JADX INFO: renamed from: q */
    public H1.e f6298q;

    /* JADX INFO: renamed from: r */
    public boolean f6299r;

    /* JADX INFO: renamed from: s */
    public final t.y f6300s;

    /* JADX INFO: renamed from: t */
    public final t.y f6301t;

    /* JADX INFO: renamed from: u */
    public final t.U f6302u;

    /* JADX INFO: renamed from: v */
    public final t.U f6303v;

    /* JADX INFO: renamed from: w */
    public int f6304w;

    /* JADX INFO: renamed from: x */
    public Integer f6305x;

    /* JADX INFO: renamed from: y */
    public final C1451f f6306y;

    /* JADX INFO: renamed from: z */
    public final y5.c f6307z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        t.x xVar = AbstractC1456k.f16082a;
        t.x xVar2 = new t.x(32);
        int i7 = xVar2.f16127b;
        if (i7 < 0) {
            AbstractC1525a.d("");
            throw null;
        }
        int i8 = i7 + 32;
        int[] iArr2 = xVar2.f16126a;
        if (iArr2.length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i8, (iArr2.length * 3) / 2));
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            xVar2.f16126a = iArrCopyOf;
        }
        int[] iArr3 = xVar2.f16126a;
        int i9 = xVar2.f16127b;
        if (i7 != i9) {
            Z4.l.V(i8, i7, i9, iArr3, iArr3);
        }
        Z4.l.Z(i7, 0, 12, iArr, iArr3);
        xVar2.f16127b += 32;
        f6270Q = xVar2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [R0.y] */
    /* JADX WARN: Type inference failed for: r4v4, types: [R0.z] */
    public F(C0415x c0415x) {
        this.f6287d = c0415x;
        Object systemService = c0415x.getContext().getSystemService("accessibility");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f6290g = accessibilityManager;
        this.h = 100L;
        this.f6291i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: R0.y
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z6) {
                F f7 = this.f6645a;
                f7.f6293k = z6 ? f7.f6290g.getEnabledAccessibilityServiceList(-1) : Z4.v.f8818o;
            }
        };
        this.f6292j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: R0.z
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                F f7 = this.f6650a;
                f7.f6293k = f7.f6290g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f6293k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.f6294m = new B(this);
        this.f6295n = Integer.MIN_VALUE;
        this.f6296o = Integer.MIN_VALUE;
        this.f6300s = new t.y();
        this.f6301t = new t.y();
        this.f6302u = new t.U(0);
        this.f6303v = new t.U(0);
        this.f6304w = -1;
        this.f6306y = new C1451f(0);
        this.f6307z = y5.j.a(1, 6, null);
        this.f6271A = true;
        t.y yVar = AbstractC1458m.f16088a;
        AbstractC1209k.d(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f6273C = yVar;
        this.f6274D = new t.z();
        this.f6275E = new t.w();
        this.f6276F = new t.w();
        this.f6277G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f6278H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f6279I = new A0.b(24);
        this.f6280J = new t.y();
        Y0.o oVarA = c0415x.getSemanticsOwner().a();
        AbstractC1209k.d(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f6281K = new N0(oVarA, yVar);
        int i7 = AbstractC1454i.f16080a;
        this.f6283M = new t.w();
        c0415x.addOnAttachStateChangeListener(new A(0, this));
        this.f6284N = new B2.e(9, this);
        this.f6285O = new ArrayList();
        this.f6286P = new E(this, 1);
    }

    public static Rect G(AbstractC1959I abstractC1959I) {
        if (!(abstractC1959I instanceof C1955E) && !(abstractC1959I instanceof C1956F)) {
            return null;
        }
        C1893c c1893cM = abstractC1959I.m();
        return new Rect((int) c1893cM.f19869a, (int) c1893cM.f19870b, (int) c1893cM.f19871c, (int) c1893cM.f19872d);
    }

    public static float[] H(AbstractC1959I abstractC1959I) {
        if (!(abstractC1959I instanceof C1956F)) {
            return null;
        }
        C1956F c1956f = (C1956F) abstractC1959I;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1956f.f20177e.f19877e >> 32));
        C1894d c1894d = c1956f.f20177e;
        return new float[]{fIntBitsToFloat, Float.intBitsToFloat((int) (c1894d.f19877e & 4294967295L)), Float.intBitsToFloat((int) (c1894d.f19878f >> 32)), Float.intBitsToFloat((int) (c1894d.f19878f & 4294967295L)), Float.intBitsToFloat((int) (c1894d.f19879g >> 32)), Float.intBitsToFloat((int) (c1894d.f19879g & 4294967295L)), Float.intBitsToFloat((int) (c1894d.h >> 32)), Float.intBitsToFloat((int) (4294967295L & c1894d.h))};
    }

    public static Region I(AbstractC1959I abstractC1959I) {
        if (!(abstractC1959I instanceof C1954D)) {
            return null;
        }
        C1954D c1954d = (C1954D) abstractC1959I;
        C1893c c1893cB = c1954d.f20175e.b();
        Region region = new Region(new Rect((int) c1893cB.f19869a, (int) c1893cB.f19870b, (int) c1893cB.f19871c, (int) c1893cB.f19872d));
        Region region2 = new Region();
        C1976i c1976i = c1954d.f20175e;
        if (!(c1976i instanceof C1976i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(c1976i.f20241a, region);
        return region2;
    }

    public static CharSequence J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i7 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i7 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i7);
                AbstractC1209k.d(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String p(Y0.o oVar) {
        C0622g c0622g;
        if (oVar != null) {
            Y0.w wVar = Y0.t.f8530a;
            Y0.j jVar = oVar.f8484d;
            t.J j3 = jVar.f8473o;
            if (j3.c(wVar)) {
                return p1.a.a((List) jVar.e(wVar), ",", null, 62);
            }
            Y0.w wVar2 = Y0.t.f8519E;
            if (j3.c(wVar2)) {
                Object objG = j3.g(wVar2);
                if (objG == null) {
                    objG = null;
                }
                C0622g c0622g2 = (C0622g) objG;
                if (c0622g2 != null) {
                    return c0622g2.f9970p;
                }
            } else {
                Object objG2 = j3.g(Y0.t.f8515A);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (c0622g = (C0622g) Z4.n.r0(list)) != null) {
                    return c0622g.f9970p;
                }
            }
        }
        return null;
    }

    public static final boolean s(Y0.h hVar, float f7) {
        InterfaceC1180a interfaceC1180a = hVar.f8445a;
        if (f7 >= 0.0f || ((Number) interfaceC1180a.a()).floatValue() <= 0.0f) {
            return f7 > 0.0f && ((Number) interfaceC1180a.a()).floatValue() < ((Number) hVar.f8446b.a()).floatValue();
        }
        return true;
    }

    public static final boolean t(Y0.h hVar) {
        InterfaceC1180a interfaceC1180a = hVar.f8445a;
        if (((Number) interfaceC1180a.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC1180a.a()).floatValue();
        ((Number) hVar.f8446b.a()).floatValue();
        return false;
    }

    public static final boolean u(Y0.h hVar) {
        InterfaceC1180a interfaceC1180a = hVar.f8445a;
        if (((Number) interfaceC1180a.a()).floatValue() < ((Number) hVar.f8446b.a()).floatValue()) {
            return true;
        }
        ((Number) interfaceC1180a.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(F f7, int i7, int i8, Integer num, int i9) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        f7.y(i7, i8, num, null);
    }

    public final void A(String str, int i7, int i8) {
        AccessibilityEvent accessibilityEventJ = j(v(i7), 32);
        accessibilityEventJ.setContentChangeTypes(i8);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i7) {
        C c7 = this.f6272B;
        if (c7 != null) {
            Y0.o oVar = c7.f6250a;
            if (i7 != oVar.f8487g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c7.f6255f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(oVar.f8487g), 131072);
                accessibilityEventJ.setFromIndex(c7.f6253d);
                accessibilityEventJ.setToIndex(c7.f6254e);
                accessibilityEventJ.setAction(c7.f6251b);
                accessibilityEventJ.setMovementGranularity(c7.f6252c);
                accessibilityEventJ.getText().add(p(oVar));
                x(accessibilityEventJ);
            }
        }
        this.f6272B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:377:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x064c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(t.AbstractC1457l r55) {
        /*
            Method dump skipped, instruction units count: 1706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.F.C(t.l):void");
    }

    public final void D(Q0.K k7, t.z zVar) {
        Y0.j jVarY;
        if (k7.I() && !this.f6287d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(k7)) {
            Q0.K k8 = null;
            if (!k7.f5821T.d(8)) {
                k7 = k7.v();
                while (true) {
                    if (k7 == null) {
                        k7 = null;
                        break;
                    } else if (k7.f5821T.d(8)) {
                        break;
                    } else {
                        k7 = k7.v();
                    }
                }
            }
            if (k7 == null || (jVarY = k7.y()) == null) {
                return;
            }
            if (!jVarY.f8475q) {
                Q0.K kV = k7.v();
                while (true) {
                    if (kV != null) {
                        Y0.j jVarY2 = kV.y();
                        if (jVarY2 != null && jVarY2.f8475q) {
                            k8 = kV;
                            break;
                        }
                        kV = kV.v();
                    } else {
                        break;
                    }
                }
                if (k8 != null) {
                    k7 = k8;
                }
            }
            int i7 = k7.f5831p;
            if (zVar.a(i7)) {
                z(this, v(i7), 2048, 1, 8);
            }
        }
    }

    public final void E(Q0.K k7) {
        if (k7.I() && !this.f6287d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(k7)) {
            int i7 = k7.f5831p;
            Y0.h hVar = (Y0.h) this.f6300s.b(i7);
            Y0.h hVar2 = (Y0.h) this.f6301t.b(i7);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i7, 4096);
            if (hVar != null) {
                accessibilityEventJ.setScrollX((int) ((Number) hVar.f8445a.a()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) hVar.f8446b.a()).floatValue());
            }
            if (hVar2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) hVar2.f8445a.a()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) hVar2.f8446b.a()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(Y0.o oVar, int i7, int i8, boolean z6) {
        String strP;
        Y0.j jVar = oVar.f8484d;
        Y0.w wVar = Y0.i.f8456i;
        if (jVar.f8473o.c(wVar) && M.k(oVar)) {
            l5.f fVar = (l5.f) ((Y0.a) oVar.f8484d.e(wVar)).f8431b;
            if (fVar != null) {
                return ((Boolean) fVar.d(Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z6))).booleanValue();
            }
        } else if ((i7 != i8 || i8 != this.f6304w) && (strP = p(oVar)) != null) {
            if (i7 < 0 || i7 != i8 || i8 > strP.length()) {
                i7 = -1;
            }
            this.f6304w = i7;
            boolean z7 = strP.length() > 0;
            int i9 = oVar.f8487g;
            x(l(v(i9), z7 ? Integer.valueOf(this.f6304w) : null, z7 ? Integer.valueOf(this.f6304w) : null, z7 ? Integer.valueOf(strP.length()) : null, strP));
            B(i9);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0143, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x014d, code lost:
    
        if (((r7 & ((~r7) << 6)) & r22) == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x014f, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.F.K():void");
    }

    @Override // G1.C0135b
    public final A.b a(View view) {
        return this.f6294m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i7, H1.e eVar, String str, Bundle bundle) {
        Y0.o oVar;
        Region regionI;
        float[] fArrH;
        Rect rectG;
        C0613I c0613iZ;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i8;
        RectF rectF;
        Y0.p pVar = (Y0.p) o().b(i7);
        if (pVar == null || (oVar = pVar.f8488a) == null) {
            return;
        }
        String strP = p(oVar);
        boolean zA = AbstractC1209k.a(str, this.f6277G);
        AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f2969a;
        if (zA) {
            int iD = this.f6275E.d(i7);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (AbstractC1209k.a(str, this.f6278H)) {
            int iD2 = this.f6276F.d(i7);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        Y0.w wVar = Y0.i.f8449a;
        Y0.j jVar = oVar.f8484d;
        t.J j3 = jVar.f8473o;
        Q0.j0 j0Var = null;
        if (j3.c(wVar) && bundle != null && AbstractC1209k.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i9 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i10 <= 0 || i9 < 0) {
                return;
            }
            if (i9 < (strP != null ? strP.length() : Integer.MAX_VALUE) && (c0613iZ = M.z(jVar)) != null) {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i9 + i11;
                    if (i12 >= c0613iZ.f9929a.f9920a.f9970p.length()) {
                        arrayList.add(j0Var);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i8 = i11;
                    } else {
                        C1893c c1893cB = c0613iZ.b(i12);
                        Q0.j0 j0VarD = oVar.d();
                        long jI = 0;
                        if (j0VarD != null) {
                            if (!j0VarD.J0().f15636B) {
                                j0VarD = j0Var;
                            }
                            if (j0VarD != null) {
                                jI = j0VarD.I(0L);
                            }
                        }
                        C1893c c1893cI = c1893cB.i(jI);
                        C1893c c1893cG = oVar.g();
                        C1893c c1893cE = c1893cI.g(c1893cG) ? c1893cI.e(c1893cG) : j0Var;
                        if (c1893cE != 0) {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c1893cE.f19869a)) << 32) | (((long) Float.floatToRawIntBits(c1893cE.f19870b)) & 4294967295L);
                            C0415x c0415x = this.f6287d;
                            long jX = c0415x.x(jFloatToRawIntBits);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i8 = i11;
                            long jX2 = c0415x.x((((long) Float.floatToRawIntBits(c1893cE.f19872d)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1893cE.f19871c)) << 32));
                            int i13 = (int) (jX >> 32);
                            int i14 = (int) (jX2 >> 32);
                            int i15 = (int) (jX & 4294967295L);
                            int i16 = (int) (jX2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)));
                        } else {
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i8 = i11;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i11 = i8 + 1;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    j0Var = null;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        Y0.w wVar2 = Y0.t.f8552y;
        if (j3.c(wVar2) && bundle != null && AbstractC1209k.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = j3.g(wVar2);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC1209k.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, oVar.f8487g);
            return;
        }
        if (AbstractC1209k.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = j3.g(Y0.t.f8529O);
            InterfaceC1963M interfaceC1963M = (InterfaceC1963M) (objG2 == null ? null : objG2);
            if (interfaceC1963M != null) {
                AbstractC1959I abstractC1959IK = k(interfaceC1963M, oVar);
                if (abstractC1959IK instanceof C1955E) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(abstractC1959IK));
                    return;
                } else if (abstractC1959IK instanceof C1956F) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(abstractC1959IK));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(abstractC1959IK));
                    return;
                } else {
                    if (!(abstractC1959IK instanceof C1954D)) {
                        throw new A2.W();
                    }
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(abstractC1959IK));
                    return;
                }
            }
            return;
        }
        if (AbstractC1209k.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = j3.g(Y0.t.f8529O);
            InterfaceC1963M interfaceC1963M2 = (InterfaceC1963M) (objG3 == null ? null : objG3);
            if (interfaceC1963M2 == null || (rectG = G(k(interfaceC1963M2, oVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
            return;
        }
        if (AbstractC1209k.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = j3.g(Y0.t.f8529O);
            InterfaceC1963M interfaceC1963M3 = (InterfaceC1963M) (objG4 == null ? null : objG4);
            if (interfaceC1963M3 == null || (fArrH = H(k(interfaceC1963M3, oVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrH);
            return;
        }
        if (AbstractC1209k.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = j3.g(Y0.t.f8529O);
            InterfaceC1963M interfaceC1963M4 = (InterfaceC1963M) (objG5 == null ? null : objG5);
            if (interfaceC1963M4 == null || (regionI = I(k(interfaceC1963M4, oVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionI);
        }
    }

    public final Rect f(Y0.p pVar) {
        n1.l lVar = pVar.f8489b;
        float f7 = lVar.f14516a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(lVar.f14517b)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        C0415x c0415x = this.f6287d;
        long jX = c0415x.x(jFloatToRawIntBits);
        long jX2 = c0415x.x((((long) Float.floatToRawIntBits(lVar.f14518c)) << 32) | (((long) Float.floatToRawIntBits(lVar.f14519d)) & 4294967295L));
        int i7 = (int) (jX >> 32);
        int i8 = (int) (jX2 >> 32);
        int i9 = (int) (jX & 4294967295L);
        int i10 = (int) (jX2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))), (int) Math.floor(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f2, code lost:
    
        if (w5.AbstractC1767D.i(r6, r2) == r3) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:73:0x0030, B:84:0x005d, B:88:0x006f, B:90:0x0077, B:92:0x0080, B:94:0x0086, B:95:0x0095, B:97:0x009d, B:80:0x0047, B:83:0x004e), top: B:117:0x0026 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x00f2 -> B:110:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(e5.AbstractC0865c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.F.g(e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.F.h(int, long, boolean):boolean");
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.f6287d.getSemanticsOwner().a(), this.f6281K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(o());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i7, int i8) {
        Y0.p pVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i8);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        C0415x c0415x = this.f6287d;
        accessibilityEventObtain.setPackageName(c0415x.getContext().getPackageName());
        accessibilityEventObtain.setSource(c0415x, i7);
        if (q() && (pVar = (Y0.p) o().b(i7)) != null) {
            Y0.o oVar = pVar.f8488a;
            accessibilityEventObtain.setPassword(oVar.f8484d.f8473o.c(Y0.t.f8524J));
            Object objG = oVar.f8484d.f8473o.g(Y0.t.f8541n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = AbstractC1209k.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0151s.i(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    public final AbstractC1959I k(InterfaceC1963M interfaceC1963M, Y0.o oVar) {
        Q0.j0 j0VarD = oVar.d();
        return interfaceC1963M.a(AbstractC1107a.E(j0VarD != null ? j0VarD.f5418q : 0L), oVar.f8483c.f5815N, this.f6287d.getDensity());
    }

    public final AccessibilityEvent l(int i7, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i7, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int m(Y0.o oVar) {
        Y0.j jVar = oVar.f8484d;
        Y0.w wVar = Y0.t.f8530a;
        if (!jVar.f8473o.c(Y0.t.f8530a)) {
            Y0.w wVar2 = Y0.t.f8520F;
            Y0.j jVar2 = oVar.f8484d;
            if (jVar2.f8473o.c(wVar2)) {
                return (int) (4294967295L & ((b1.L) jVar2.e(wVar2)).f9945a);
            }
        }
        return this.f6304w;
    }

    public final int n(Y0.o oVar) {
        Y0.j jVar = oVar.f8484d;
        Y0.w wVar = Y0.t.f8530a;
        if (!jVar.f8473o.c(Y0.t.f8530a)) {
            Y0.w wVar2 = Y0.t.f8520F;
            Y0.j jVar2 = oVar.f8484d;
            if (jVar2.f8473o.c(wVar2)) {
                return (int) (((b1.L) jVar2.e(wVar2)).f9945a >> 32);
            }
        }
        return this.f6304w;
    }

    public final AbstractC1457l o() {
        if (this.f6271A) {
            this.f6271A = false;
            C0415x c0415x = this.f6287d;
            this.f6273C = Y0.r.b(c0415x.getSemanticsOwner());
            if (q()) {
                t.y yVar = this.f6273C;
                Resources resources = c0415x.getContext().getResources();
                t.w wVar = this.f6275E;
                wVar.a();
                t.w wVar2 = this.f6276F;
                wVar2.a();
                Y0.p pVar = (Y0.p) yVar.b(-1);
                Y0.o oVar = pVar != null ? pVar.f8488a : null;
                AbstractC1209k.c(oVar);
                ArrayList arrayListB = Y0.x.b(oVar, new B0.b(9, yVar), new B0.b(10, resources), I0.c.G(oVar));
                int iD0 = Z4.o.d0(arrayListB);
                int i7 = 1;
                if (1 <= iD0) {
                    while (true) {
                        int i8 = ((Y0.o) arrayListB.get(i7 - 1)).f8487g;
                        int i9 = ((Y0.o) arrayListB.get(i7)).f8487g;
                        wVar.f(i8, i9);
                        wVar2.f(i9, i8);
                        if (i7 == iD0) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return this.f6273C;
    }

    public final boolean q() {
        return this.f6290g.isEnabled() && !this.f6293k.isEmpty();
    }

    public final void r(Q0.K k7) {
        if (this.f6306y.add(k7)) {
            this.f6307z.k(Y4.o.f8736a);
        }
    }

    public final int v(int i7) {
        if (i7 == this.f6287d.getSemanticsOwner().a().f8487g) {
            return -1;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(Y0.o r20, R0.N0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = t.AbstractC1459n.f16089a
            t.z r3 = new t.z
            r3.<init>()
            r4 = 4
            java.util.List r5 = Y0.o.j(r4, r1)
            int r6 = r5.size()
            r7 = 0
            r8 = r7
        L18:
            Q0.K r9 = r1.f8483c
            if (r8 >= r6) goto L42
            java.lang.Object r10 = r5.get(r8)
            Y0.o r10 = (Y0.o) r10
            t.l r11 = r0.o()
            int r12 = r10.f8487g
            boolean r11 = r11.a(r12)
            if (r11 == 0) goto L3f
            t.z r11 = r2.f6362b
            int r10 = r10.f8487g
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3c
            r0.r(r9)
            return
        L3c:
            r3.a(r10)
        L3f:
            int r8 = r8 + 1
            goto L18
        L42:
            t.z r2 = r2.f6362b
            int[] r5 = r2.f16130b
            long[] r2 = r2.f16129a
            int r6 = r2.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L8d
            r8 = r7
        L4e:
            r10 = r2[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L88
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r7
        L68:
            if (r14 >= r12) goto L86
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L82
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L82
            r0.r(r9)
            return
        L82:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L68
        L86:
            if (r12 != r13) goto L8d
        L88:
            if (r8 == r6) goto L8d
            int r8 = r8 + 1
            goto L4e
        L8d:
            java.util.List r1 = Y0.o.j(r4, r1)
            int r2 = r1.size()
        L95:
            if (r7 >= r2) goto Lbb
            java.lang.Object r3 = r1.get(r7)
            Y0.o r3 = (Y0.o) r3
            int r4 = r3.f8487g
            t.y r5 = r0.f6280J
            java.lang.Object r4 = r5.b(r4)
            R0.N0 r4 = (R0.N0) r4
            if (r4 == 0) goto Lb8
            t.l r5 = r0.o()
            int r6 = r3.f8487g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb8
            r0.w(r3, r4)
        Lb8:
            int r7 = r7 + 1
            goto L95
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.F.w(Y0.o, R0.N0):void");
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f6299r = true;
        }
        try {
            return ((Boolean) this.f6289f.b(accessibilityEvent)).booleanValue();
        } finally {
            this.f6299r = false;
        }
    }

    public final boolean y(int i7, int i8, Integer num, List list) {
        if (i7 == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i7, i8);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(p1.a.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
