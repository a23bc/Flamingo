package I0;

import A2.N;
import A2.W;
import F.m;
import G.o;
import I.C0211c;
import I4.C0229d;
import K0.C0236d;
import L2.C0247a;
import N2.z;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.InterfaceC0357m;
import Q0.K;
import Q0.M;
import Q0.j0;
import R0.AbstractC0403q0;
import S5.C0425e;
import V4.C0455b;
import V4.C0456c;
import V4.C0457d;
import X4.f;
import Z4.l;
import Z4.n;
import Z4.p;
import Z4.v;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0597u;
import b1.L;
import b2.AbstractC0680v;
import b2.B0;
import b2.C0;
import b2.E0;
import b2.F0;
import b2.G0;
import b2.H0;
import c5.g;
import c5.h;
import c5.i;
import c5.j;
import d.InterfaceC0744J;
import d5.C0831b;
import d5.C0832c;
import d5.C0833d;
import d5.C0834e;
import d5.EnumC0830a;
import e5.AbstractC0863a;
import e5.AbstractC0865c;
import f0.AbstractC0911s0;
import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.D;
import f0.InterfaceC0878b0;
import f0.a1;
import g1.C0980v;
import j5.AbstractC1110d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import o5.AbstractC1267a;
import r0.AbstractC1397o;
import r0.InterfaceC1398p;
import u5.AbstractC1545g;
import w3.C1760y;
import y0.C1987t;
import y3.x;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    public static ValueAnimator f3440a;

    /* JADX INFO: renamed from: b */
    public static int f3441b;

    public static final long A(KeyEvent keyEvent) {
        return AbstractC1267a.b(keyEvent.getKeyCode());
    }

    public static final int B(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static int C(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static c5.d D(c5.d dVar) {
        c5.d dVarIntercepted;
        AbstractC1209k.f(dVar, "<this>");
        AbstractC0865c abstractC0865c = dVar instanceof AbstractC0865c ? (AbstractC0865c) dVar : null;
        return (abstractC0865c == null || (dVarIntercepted = abstractC0865c.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static List G(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC1209k.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static i H(g gVar, h hVar) {
        AbstractC1209k.f(hVar, "key");
        return AbstractC1209k.a(gVar.getKey(), hVar) ? j.f10685o : gVar;
    }

    public static final int I(o oVar, EnumC2048l0 enumC2048l0) {
        return (int) (enumC2048l0 == EnumC2048l0.f20894o ? oVar.f2574t & 4294967295L : oVar.f2574t >> 32);
    }

    public static final boolean J(String str) {
        AbstractC1209k.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final R.h K(InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
        boolean zF = c0912t.f(view);
        Object objK = c0912t.K();
        Object obj = C0903o.f11850a;
        if (zF || objK == obj) {
            objK = new R.h(view, null, interfaceC1180a);
            c0912t.i0(objK);
        }
        R.h hVar = (R.h) objK;
        boolean zH = c0912t.h(hVar);
        Object objK2 = c0912t.K();
        if (zH || objK2 == obj) {
            objK2 = new R.a(hVar, 3);
            c0912t.i0(objK2);
        }
        C0879c.d(hVar, (InterfaceC1182c) objK2, c0912t);
        return hVar;
    }

    public static i L(g gVar, i iVar) {
        AbstractC1209k.f(iVar, "context");
        return iVar == j.f10685o ? gVar : (i) iVar.y(gVar, c5.b.f10680r);
    }

    public static U1.b O(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j3;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i7 = byteBufferDuplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                j3 = -1;
                break;
            }
            int i9 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i9) {
                break;
            }
            i8++;
        }
        if (j3 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j3 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i10 = 0; i10 < j7; i10++) {
                int i11 = byteBufferDuplicate.getInt();
                long j8 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i11 || 1701669481 == i11) {
                    byteBufferDuplicate.position((int) (j8 + j3));
                    U1.b bVar = new U1.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f2745r = byteBufferDuplicate;
                    bVar.f2742o = iPosition;
                    int i12 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f2743p = i12;
                    bVar.f2744q = ((ByteBuffer) bVar.f2745r).getShort(i12);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void R(int i7) {
        a6.d.f8892b.setValue(Boolean.valueOf(i7 == 1));
    }

    public static final String S(int i7, C0912t c0912t) {
        return ((Resources) c0912t.j(AndroidCompositionLocals_androidKt.f9325c)).getString(i7);
    }

    public static final String T(int i7, Object[] objArr, C0912t c0912t) {
        return ((Resources) c0912t.j(AndroidCompositionLocals_androidKt.f9325c)).getString(i7, Arrays.copyOf(objArr, objArr.length));
    }

    public static final ExtractedText U(C0980v c0980v) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0980v.f12384a.f9970p;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = c0980v.f12385b;
        extractedText.selectionStart = L.f(j3);
        extractedText.selectionEnd = L.e(j3);
        extractedText.flags = !AbstractC1545g.O(c0980v.f12384a.f9970p, '\n') ? 1 : 0;
        return extractedText;
    }

    public static String V(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (c7 >= 'A' && c7 <= 'Z') {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String W(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (c7 >= 'a' && c7 <= 'z') {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static final double X(long j3) {
        return ((j3 >>> 11) * ((double) 2048)) + (j3 & 2047);
    }

    public static final int Y(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config != null) {
            int i7 = C4.a.f1205a[config.ordinal()];
            if (i7 == 1) {
                return 4;
            }
            if (i7 == 2) {
                return 1;
            }
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }

    public static Object Z(l5.e eVar, Object obj, c5.d dVar) {
        AbstractC1209k.f(eVar, "<this>");
        i context = dVar.getContext();
        Object c0833d = context == j.f10685o ? new C0833d(dVar) : new C0834e(dVar, context);
        AbstractC1223y.c(2, eVar);
        return eVar.invoke(obj, c0833d);
    }

    public static final void a(boolean z6, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        c0912t.Z(-361453782);
        if ((((c0912t.g(z6) ? 4 : 2) | i7 | (c0912t.f(interfaceC1180a) ? 32 : 16)) & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            InterfaceC0878b0 interfaceC0878b0X = C0879c.x(interfaceC1180a, c0912t);
            c0912t.Y(-971159753);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = new e.e(z6, interfaceC0878b0X);
                c0912t.i0(objK);
            }
            e.e eVar = (e.e) objK;
            c0912t.p(false);
            c0912t.Y(-971159481);
            boolean zF = c0912t.f(eVar) | c0912t.g(z6);
            Object objK2 = c0912t.K();
            if (zF || objK2 == obj) {
                objK2 = new e.c(eVar, z6);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            C0879c.g((InterfaceC1180a) objK2, c0912t);
            InterfaceC0744J interfaceC0744JA = e.h.a(c0912t);
            if (interfaceC0744JA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object objA = interfaceC0744JA.a();
            Object obj2 = (InterfaceC0597u) c0912t.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0912t.Y(-971159120);
            boolean zF2 = c0912t.f(objA) | c0912t.f(obj2) | c0912t.f(eVar);
            Object objK3 = c0912t.K();
            if (zF2 || objK3 == obj) {
                objK3 = new M(objA, obj2, eVar, 2);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            C0879c.c(obj2, objA, (InterfaceC1182c) objK3, c0912t);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new e.d(z6, interfaceC1180a, i7);
        }
    }

    public static final void b(X4.a aVar, z zVar, C0247a c0247a, n0.d dVar, C0912t c0912t, int i7) {
        X4.a aVarA;
        z zVar2;
        C0247a c0247a2;
        X4.a aVar2;
        z zVar3;
        C0247a c0247a3;
        c0912t.Z(-1670139021);
        if (((i7 | 402) & 5851) == 1170 && c0912t.z()) {
            c0912t.Q();
            aVar2 = aVar;
            zVar3 = zVar;
            c0247a3 = c0247a;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                if ((((Configuration) c0912t.j(AndroidCompositionLocals_androidKt.f9323a)).uiMode & 48) == 32) {
                    X4.a aVar3 = X4.c.f8321a;
                    aVarA = new X4.a(true, X4.d.f8327e, X4.d.f8328f, X4.d.f8329g, X4.d.h);
                } else {
                    aVarA = X4.c.a();
                }
                zVar2 = new z(20);
                c0247a2 = new C0247a(15);
            } else {
                c0912t.Q();
                aVarA = aVar;
                zVar2 = zVar;
                c0247a2 = c0247a;
            }
            c0912t.q();
            N5.d.d(0, c0912t, aVarA.f8312a);
            C0913t0 c0913t0A = X4.c.f8322b.a(aVarA);
            C0913t0 c0913t0A2 = f.f8335a.a(zVar2);
            C0913t0 c0913t0A3 = X4.g.f8336a.a(c0247a2);
            a1 a1Var = U4.c.f7053a;
            c0912t.Y(1529596785);
            AbstractC0911s0 abstractC0911s0 = (AbstractC0911s0) c0912t.j(U4.c.f7053a);
            c0912t.p(false);
            C0913t0 c0913t0A4 = abstractC0911s0.a((b1.M) c0247a2.f4105p);
            C0913t0 c0913t0A5 = ((AbstractC0911s0) c0912t.j(U4.b.f7051a)).a(new C1987t(aVarA.f8314c));
            D d4 = androidx.compose.foundation.f.f9163a;
            c0912t.Y(1095859702);
            InterfaceC0878b0 interfaceC0878b0X = C0879c.x(C0456c.f7479q, c0912t);
            c0912t.Y(1143208689);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = new C0455b(new C0457d(interfaceC0878b0X, 0));
                c0912t.i0(objK);
            }
            c0912t.p(false);
            c0912t.p(false);
            C0913t0 c0913t0A6 = d4.a((C0455b) objK);
            a1 a1Var2 = AbstractC0403q0.l;
            c0912t.Y(121347370);
            G0.a aVar4 = (G0.a) c0912t.j(a1Var2);
            c0912t.p(false);
            C0879c.b(new C0913t0[]{c0913t0A, c0913t0A2, c0913t0A3, c0913t0A4, c0913t0A5, c0913t0A6, a1Var2.a(aVar4)}, dVar, c0912t, 56);
            aVar2 = aVarA;
            zVar3 = zVar2;
            c0247a3 = c0247a2;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new T5.h(aVar2, zVar3, c0247a3, dVar, i7, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public static final void c(int i7, long j3, H0 h02, C0912t c0912t, l5.e eVar) {
        ?? r02;
        ?? G6;
        ?? G7;
        H0 h03 = h02;
        c0912t.Z(1526030150);
        int i8 = i7 | (c0912t.f(h03) ? 4 : 2) | (c0912t.e(j3) ? 32 : 16) | (c0912t.f(eVar) ? 256 : 128);
        if ((i8 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            if (h03 instanceof G0) {
                c0912t.Y(-1173540356);
                c0912t.p(false);
                G7 = G(new n1.i(j3));
            } else {
                if (!(h03 instanceof F0)) {
                    c0912t.Y(-1173645715);
                    c0912t.p(false);
                    throw new W();
                }
                c0912t.Y(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    c0912t.Y(-2019914396);
                    Bundle bundle = (Bundle) c0912t.j(AbstractC0680v.f10339a);
                    c0912t.Y(-1173535336);
                    boolean zE = c0912t.e(j3);
                    Object objK = c0912t.K();
                    if (zE || objK == C0903o.f11850a) {
                        objK = new C0(j3);
                        c0912t.i0(objK);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK;
                    c0912t.p(false);
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i9 = bundle.getInt("appWidgetMinHeight", 0);
                        int i10 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i11 = bundle.getInt("appWidgetMinWidth", 0);
                        int i12 = bundle.getInt("appWidgetMaxWidth", 0);
                        G6 = (i9 == 0 || i10 == 0 || i11 == 0 || i12 == 0) ? G(interfaceC1180a.a()) : Z4.o.e0(new n1.i(i6.g.d(i11, i10)), new n1.i(i6.g.d(i12, i9)));
                    } else {
                        G6 = new ArrayList(p.j0(parcelableArrayList));
                        for (SizeF sizeF : parcelableArrayList) {
                            G6.add(new n1.i(i6.g.d(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    c0912t.p(false);
                    r02 = G6;
                } else {
                    c0912t.Y(-2019826759);
                    Bundle bundle2 = (Bundle) c0912t.j(AbstractC0680v.f10339a);
                    int i13 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i14 = bundle2.getInt("appWidgetMaxWidth", 0);
                    n1.i iVar = null;
                    n1.i iVar2 = (i13 == 0 || i14 == 0) ? null : new n1.i(i6.g.d(i14, i13));
                    int i15 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i16 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i15 != 0 && i16 != 0) {
                        iVar = new n1.i(i6.g.d(i16, i15));
                    }
                    ArrayList arrayListG0 = l.g0(new n1.i[]{iVar2, iVar});
                    boolean zIsEmpty = arrayListG0.isEmpty();
                    List listG = arrayListG0;
                    if (zIsEmpty) {
                        listG = G(new n1.i(j3));
                    }
                    c0912t.p(false);
                    r02 = listG;
                }
                c0912t.p(false);
                G7 = r02;
            }
            List listK0 = n.K0(n.N0(G7));
            ArrayList arrayList = new ArrayList(p.j0(listK0));
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                i(((i8 << 3) & 112) | (i8 & 896), ((n1.i) it.next()).f14513a, h03, c0912t, eVar);
                arrayList.add(Y4.o.f8736a);
                h03 = h02;
            }
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new B0(i7, j3, h02, eVar);
        }
    }

    public static final void d(x xVar, C0211c c0211c, Z5.a aVar, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        AbstractC1209k.f(c0211c, "pagerState");
        AbstractC1209k.f(interfaceC1182c, "nowPageOnChanged");
        c0912t.Z(2086975130);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7 | (c0912t.f(c0211c) ? 32 : 16) | (c0912t.f(aVar) ? 256 : 128) | (c0912t.h(interfaceC1182c) ? 2048 : 1024)) & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(2069833399, new T.d(c0211c, interfaceC1182c, xVar, aVar, 3), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new H.L(xVar, c0211c, aVar, interfaceC1182c, i7, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(int r23, int r24, D.InterfaceC0067h r25, D.k0 r26, F.A r27, f0.C0912t r28, l5.InterfaceC1182c r29, r0.C1388f r30, r0.InterfaceC1398p r31, x.C1875s r32, z.S r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.c.e(int, int, D.h, D.k0, F.A, f0.t, l5.c, r0.f, r0.p, x.s, z.S, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:410:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final r0.InterfaceC1398p r39, G.x r40, final G.c r41, final D.k0 r42, final z.S r43, final boolean r44, final x.C1875s r45, final D.InterfaceC0067h r46, final D.InterfaceC0064f r47, final l5.InterfaceC1182c r48, f0.C0912t r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.c.f(r0.p, G.x, G.c, D.k0, z.S, boolean, x.s, D.h, D.f, l5.c, f0.t, int, int):void");
    }

    public static final void g(InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(2064964257);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(dVar) ? 32 : 16;
        }
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            h(interfaceC1398p, dVar, c0912t, ((i8 << 3) & 896) | (i8 & 14) | 48);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new R.i(interfaceC1398p, dVar, i7, 0);
        }
    }

    public static final void h(InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(771959668);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(null) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(dVar) ? 256 : 128;
        }
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                C0894j0 c0894j0 = new C0894j0(null, f0.W.f11764q);
                c0912t.i0(c0894j0);
                objK = c0894j0;
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                objK2 = new m(interfaceC0878b0, 4);
                c0912t.i0(objK2);
            }
            C0879c.a(T.g.f6846b.a(K((InterfaceC1180a) objK2, c0912t, 0)), n0.e.e(-291176396, new R.j(interfaceC1398p, interfaceC0878b0, dVar, 0), c0912t), c0912t, 56);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new R.i(interfaceC1398p, dVar, i7, 1);
        }
    }

    public static final void i(int i7, long j3, H0 h02, C0912t c0912t, l5.e eVar) {
        c0912t.Z(-53921383);
        int i8 = (c0912t.e(j3) ? 4 : 2) | i7;
        if ((i7 & 48) == 0) {
            int i9 = i7 & 64;
            i8 |= c0912t.f(h02) ? 32 : 16;
        }
        if (((i8 | (c0912t.f(eVar) ? 256 : 128)) & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            C0879c.b(new C0913t0[]{Z1.h.f8771a.a(new n1.i(j3))}, n0.e.b(c0912t, -1209815847, new B0(eVar, j3, h02)), c0912t, 48);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new E0(i7, j3, h02, eVar);
        }
    }

    public static C0425e j() throws InterruptedException {
        C0425e c0425e = C0425e.l;
        AbstractC1209k.c(c0425e);
        C0425e c0425e2 = c0425e.f6782f;
        if (c0425e2 == null) {
            long jNanoTime = System.nanoTime();
            C0425e.f6778i.await(C0425e.f6779j, TimeUnit.MILLISECONDS);
            C0425e c0425e3 = C0425e.l;
            AbstractC1209k.c(c0425e3);
            if (c0425e3.f6782f != null || System.nanoTime() - jNanoTime < C0425e.f6780k) {
                return null;
            }
            return C0425e.l;
        }
        long jNanoTime2 = c0425e2.f6783g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0425e.f6778i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0425e c0425e4 = C0425e.l;
        AbstractC1209k.c(c0425e4);
        c0425e4.f6782f = c0425e2.f6782f;
        c0425e2.f6782f = null;
        return c0425e2;
    }

    public static final Object k(InterfaceC0357m interfaceC0357m, InterfaceC1180a interfaceC1180a, AbstractC0865c abstractC0865c) {
        Object obj;
        j0 j0VarW;
        Object objP;
        C0352h0 c0352h0;
        AbstractC1397o abstractC1397o = (AbstractC1397o) interfaceC0357m;
        boolean z6 = abstractC1397o.f15637o.f15636B;
        Y4.o oVar = Y4.o.f8736a;
        if (z6) {
            if (!z6) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o.f15641s;
            K kX = AbstractC0347f.x(interfaceC0357m);
            loop0: while (true) {
                obj = null;
                if (kX == null) {
                    break;
                }
                if ((kX.f5821T.f6005f.f15640r & 524288) != 0) {
                    while (abstractC1397o2 != null) {
                        if ((abstractC1397o2.f15639q & 524288) != 0) {
                            AbstractC1397o abstractC1397oF = abstractC1397o2;
                            h0.e eVar = null;
                            while (abstractC1397oF != null) {
                                if (abstractC1397oF instanceof V0.a) {
                                    obj = abstractC1397oF;
                                    break loop0;
                                }
                                if ((abstractC1397oF.f15639q & 524288) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                    int i7 = 0;
                                    for (AbstractC1397o abstractC1397o3 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o3 != null; abstractC1397o3 = abstractC1397o3.f15642t) {
                                        if ((abstractC1397o3.f15639q & 524288) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC1397oF = abstractC1397o3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (abstractC1397oF != null) {
                                                    eVar.b(abstractC1397oF);
                                                    abstractC1397oF = null;
                                                }
                                                eVar.b(abstractC1397o3);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC1397oF = AbstractC0347f.f(eVar);
                            }
                        }
                        abstractC1397o2 = abstractC1397o2.f15641s;
                    }
                }
                kX = kX.v();
                abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
            }
            V0.a aVar = (V0.a) obj;
            if (aVar != null && (objP = aVar.P((j0VarW = AbstractC0347f.w(interfaceC0357m)), new C0236d(interfaceC1180a, 6, j0VarW), abstractC0865c)) == EnumC0830a.f11264o) {
                return objP;
            }
        }
        return oVar;
    }

    public static final double o(int i7, int i8, int i9, int i10, q4.g gVar) {
        double d4 = ((double) i9) / ((double) i7);
        double d7 = ((double) i10) / ((double) i8);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d4, d7);
        }
        if (iOrdinal == 1) {
            return Math.min(d4, d7);
        }
        throw new W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c5.d p(c5.d dVar, c5.d dVar2, l5.e eVar) {
        AbstractC1209k.f(eVar, "<this>");
        if (eVar instanceof AbstractC0863a) {
            return ((AbstractC0863a) eVar).create(dVar, dVar2);
        }
        i context = dVar2.getContext();
        return context == j.f10685o ? new C0831b(dVar2, dVar, eVar) : new C0832c(dVar2, context, eVar, dVar);
    }

    public static final String q(int i7) {
        return n1.c.s(i7, "appWidget-");
    }

    public static boolean r(String str, String str2) {
        char c7;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i7 = 0; i7 < length; i7++) {
                if (str.charAt(i7) == str2.charAt(i7) || ((c7 = (char) ((r3 | ' ') - 97)) < 26 && c7 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static void s(C1760y c1760y) {
        R(0);
        v(c1760y, c1760y.R(), 0.0f, 0, new E3.e(20, c1760y));
    }

    public static void t(C1760y c1760y) {
        R(1);
        float fR = c1760y.R();
        c1760y.e();
        v(c1760y, fR, 1.0f, 1, null);
    }

    public static void u(N n7, float f7, float f8, int i7, E3.e eVar) {
        f3441b = i7;
        ValueAnimator valueAnimator = f3440a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f8);
        f3440a = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(200L);
        }
        ValueAnimator valueAnimator2 = f3440a;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new G1.L(n7, 2));
        }
        ValueAnimator valueAnimator3 = f3440a;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new G1.M(1, eVar));
        }
        ValueAnimator valueAnimator4 = f3440a;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public static void v(C1760y c1760y, float f7, float f8, int i7, E3.e eVar) {
        f3441b = i7;
        ValueAnimator valueAnimator = f3440a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f8);
        f3440a = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(200L);
        }
        ValueAnimator valueAnimator2 = f3440a;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new G1.L(c1760y, 1));
        }
        ValueAnimator valueAnimator3 = f3440a;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new G1.M(2, eVar));
        }
        ValueAnimator valueAnimator4 = f3440a;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public static F5.l y(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listJ = v.f8818o;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        F5.g gVarC = F5.g.f2340b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        F5.z zVarP = android.support.v4.media.session.b.p(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listJ2 = peerCertificates != null ? G5.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listJ;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listJ = G5.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new F5.l(zVarP, gVarC, listJ, new E0.K(1, listJ2));
    }

    public static g z(g gVar, h hVar) {
        AbstractC1209k.f(hVar, "key");
        if (AbstractC1209k.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public boolean E() {
        return false;
    }

    public abstract boolean F();

    public abstract void M(I4.o oVar, I4.o oVar2);

    public abstract void N(I4.o oVar, Thread thread);

    public abstract void Q(boolean z6);

    public abstract void a0(byte[] bArr, int i7, int i8);

    public abstract boolean l(I4.p pVar, C0229d c0229d, C0229d c0229d2);

    public abstract boolean m(I4.p pVar, Object obj, Object obj2);

    public abstract boolean n(I4.p pVar, I4.o oVar, I4.o oVar2);

    public abstract C0229d w(I4.p pVar);

    public abstract I4.o x(I4.p pVar);

    public void P(boolean z6) {
    }
}
