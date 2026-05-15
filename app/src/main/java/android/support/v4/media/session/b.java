package android.support.v4.media.session;

import B1.d;
import B1.f;
import B3.m;
import D.AbstractC0068i;
import D.q0;
import E0.C0095f;
import F5.z;
import K1.n;
import M.C0271p;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import S5.AbstractC0421a;
import S5.j;
import Y4.h;
import Z1.i;
import Z1.k;
import Z1.o;
import Z4.l;
import Z4.y;
import a.AbstractC0509a;
import a2.AbstractC0514d;
import a2.AbstractC0515e;
import a2.C0512b;
import a2.C0516f;
import a2.InterfaceC0511a;
import android.content.Context;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Size;
import android.util.SizeF;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.work.impl.WorkDatabase_Impl;
import b1.AbstractC0607C;
import b1.M;
import b2.o0;
import b2.u0;
import d.C0746L;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import f0.C0879c;
import f0.C0886f0;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.a1;
import f1.C0926a;
import g2.p;
import g2.s;
import j5.AbstractC1109c;
import java.io.File;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.AbstractC1166f;
import l2.C1164d;
import l2.C1165e;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import n0.e;
import n1.g;
import o5.AbstractC1267a;
import q.C1302a0;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import t.J;
import t.K;
import t.Q;
import u5.AbstractC1539a;
import x0.C1893c;
import yos.music.player.R;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public static C0095f f8936a;

    /* JADX INFO: renamed from: b */
    public static String f8937b;

    /* JADX INFO: renamed from: c */
    public static String f8938c;

    public static final o A(o oVar, float f7, float f8) {
        return oVar.c(new p(L(f7), L(f8), L(f7), L(f8)));
    }

    public static o B(o oVar, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        return oVar.c(new p(L(f7), L(f8), L(0), L(0)));
    }

    public static String C(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        j jVar = j.f6786r;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC1209k.e(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i7 = 0;
        AbstractC1267a.o(encoded.length, 0, length);
        j jVarB = new j(l.b0(encoded, 0, length)).b("SHA-256");
        byte[] bArr = AbstractC0421a.f6770a;
        byte[] bArr2 = jVarB.f6787o;
        AbstractC1209k.f(bArr2, "<this>");
        AbstractC1209k.f(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length2 = bArr2.length - (bArr2.length % 3);
        int i8 = 0;
        while (i7 < length2) {
            byte b7 = bArr2[i7];
            int i9 = i7 + 2;
            byte b8 = bArr2[i7 + 1];
            i7 += 3;
            byte b9 = bArr2[i9];
            bArr3[i8] = bArr[(b7 & 255) >> 2];
            bArr3[i8 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr3[i8 + 2] = bArr[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i8 += 4;
            bArr3[i10] = bArr[b9 & 63];
        }
        int length3 = bArr2.length - length2;
        if (length3 == 1) {
            byte b10 = bArr2[i7];
            bArr3[i8] = bArr[(b10 & 255) >> 2];
            bArr3[1 + i8] = bArr[(b10 & 3) << 4];
            bArr3[2 + i8] = 61;
            bArr3[i8 + 3] = 61;
        } else if (length3 == 2) {
            int i11 = i7 + 1;
            byte b11 = bArr2[i7];
            byte b12 = bArr2[i11];
            bArr3[i8] = bArr[(b11 & 255) >> 2];
            bArr3[1 + i8] = bArr[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr3[i8 + 2] = bArr[(b12 & 15) << 2];
            bArr3[i8 + 3] = 61;
        }
        sb.append(new String(bArr3, AbstractC1539a.f17313a));
        return sb.toString();
    }

    public static Cursor D(WorkDatabase_Impl workDatabase_Impl, m mVar) {
        Cursor cursorG = workDatabase_Impl.g(mVar);
        if (cursorG instanceof AbstractWindowedCursor) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorG;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i7 = 0; i7 < abstractWindowedCursor.getColumnCount(); i7++) {
                            int type = abstractWindowedCursor.getType(i7);
                            if (type == 0) {
                                objArr[i7] = null;
                            } else if (type == 1) {
                                objArr[i7] = Long.valueOf(abstractWindowedCursor.getLong(i7));
                            } else if (type == 2) {
                                objArr[i7] = Double.valueOf(abstractWindowedCursor.getDouble(i7));
                            } else if (type == 3) {
                                objArr[i7] = abstractWindowedCursor.getString(i7);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i7] = abstractWindowedCursor.getBlob(i7);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    abstractWindowedCursor.close();
                    throw th;
                }
            }
        }
        return cursorG;
    }

    public static final boolean E(J j3, Object obj, Object obj2) {
        Object objG = j3.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof K)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            j3.k(obj);
            return true;
        }
        K k7 = (K) objG;
        boolean zL = k7.l(obj2);
        if (zL && k7.g()) {
            j3.k(obj);
        }
        return zL;
    }

    public static final void F(J j3, Object obj) {
        boolean zG;
        long[] jArr = j3.f16003a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i7 << 3) + i9;
                        Object obj2 = j3.f16004b[i10];
                        Object obj3 = j3.f16005c[i10];
                        if (obj3 instanceof K) {
                            AbstractC1209k.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            K k7 = (K) obj3;
                            k7.l(obj);
                            zG = k7.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            j3.l(i10);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public static void G(Window window, boolean z6) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            B1.a.f(window, z6);
        } else {
            if (i7 >= 30) {
                B1.a.e(window, z6);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void H(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            d.p(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void I(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static void J(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i7 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public static final void K(Object obj) {
        if (obj instanceof Y4.j) {
            throw ((Y4.j) obj).f8728o;
        }
    }

    public static final g2.o L(float f7) {
        return new g2.o(2, f7);
    }

    public static final void M(k kVar) {
        u0 u0Var = u0.f10334s;
        int i7 = 0;
        for (Object obj : kVar.f8780b) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                Z4.o.i0();
                throw null;
            }
            i iVar = (i) u0Var.b((i) obj);
            kVar.f8780b.set(i7, iVar);
            if (iVar instanceof k) {
                M((k) iVar);
            }
            i7 = i8;
        }
    }

    public static ActionMode.Callback N(ActionMode.Callback callback) {
        return (!(callback instanceof n) || Build.VERSION.SDK_INT < 26) ? callback : ((n) callback).f3980a;
    }

    public static final LinkedHashMap O(k kVar) {
        ArrayList arrayList = kVar.f8780b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i7 = 0;
        for (Object obj : arrayList) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                Z4.o.i0();
                throw null;
            }
            i iVar = (i) obj;
            o oVarB = iVar.b();
            h hVar = oVarB.d(u0.f10332q) ? (h) oVarB.b(new h(null, Z1.m.f8781a), o0.f10269z) : new h(null, oVarB);
            C0512b c0512b = (C0512b) hVar.f8726o;
            o oVar = (o) hVar.f8727p;
            InterfaceC0511a interfaceC0511a = c0512b != null ? c0512b.f8834a : null;
            h hVar2 = interfaceC0511a instanceof AbstractC0515e ? new h(interfaceC0511a, oVar) : new h(null, oVar);
            if (iVar instanceof k) {
                for (Map.Entry entry : O((k) iVar).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i7 = i8;
        }
        return linkedHashMap;
    }

    public static ActionMode.Callback P(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof n) || callback == null) ? callback : new n(callback, textView);
    }

    public static final void a(D0.b bVar, String str, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(bVar, "icon");
        AbstractC1209k.f(str, "label");
        AbstractC1209k.f(interfaceC1180a, "onClick");
        c0912t2.Z(-2141956109);
        int i8 = i7 | (c0912t2.h(bVar) ? 4 : 2) | (c0912t2.f(str) ? 32 : 16) | (c0912t2.h(interfaceC1180a) ? 256 : 128);
        if ((i8 & 147) == 146 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pD = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 54), false, null, interfaceC1180a, 15);
            q0 q0VarA = D.o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pD);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, q0VarA, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.a.j(c1395m, 18, 0.0f, 2, 0.0f, 10), 40);
            a1 a1Var = AbstractC0805u.f11147a;
            AbstractC0774A.a(bVar, null, interfaceC1398pG, ((C0803s) c0912t2.j(a1Var)).f11095a, c0912t2, (i8 & 14) | 432, 0);
            long jU = AbstractC1109c.u(20);
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            H0.b(str, interfaceC1398pB.f(new LayoutWeightElement(1.0f, true)), 0L, jU, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, ((i8 >> 3) & 14) | 3072, 0, 131060);
            c0912t2 = c0912t;
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_action_next, c0912t2), null, i6.h.l(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 0.0f, 21, 0.0f, 11), 12), 0.3f), ((C0803s) c0912t2.j(a1Var)).f11107o, c0912t2, 432, 0);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0271p(i7, 2, bVar, str, interfaceC1180a);
        }
    }

    public static final void b(final long j3, final YosMediaItem yosMediaItem, final Context context, final long j7, C0912t c0912t, final int i7) {
        int i8;
        AbstractC1209k.f(context, "thisContext");
        c0912t.Z(1032321867);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.e(j3) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(yosMediaItem) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.f(context) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.e(j7) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            g gVar = new g(n1.i.b(j3));
            g gVar2 = new g(n1.i.a(j3));
            if (gVar.compareTo(gVar2) > 0) {
                gVar = gVar2;
            }
            float f7 = gVar.f14511o;
            double d4 = f7;
            float f8 = (float) (0.05d * d4);
            float f9 = (float) (d4 * 0.25d);
            c0912t.X(-1125517947);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = a6.b.f8886d;
                c0912t.i0(objK);
            }
            c0912t.p(false);
            C1164d c1164d = C1164d.f14164a;
            AbstractC0509a.d(0, 3072, 6, new s(c1164d).c(new g2.n(c1164d)), c0912t, e.e(-1149514603, new W5.h(f7, f8, f8, f9, j7, context, (InterfaceC0878b0) objK, yosMediaItem), c0912t));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: W5.d
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Context context2 = context;
                    AbstractC1209k.f(context2, "$thisContext");
                    android.support.v4.media.session.b.b(j3, yosMediaItem, context2, j7, (C0912t) obj, C0879c.B(i7 | 1));
                    return Y4.o.f8736a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0047  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x003c -> B:53:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(K0.L r8, e5.AbstractC0863a r9) {
        /*
            boolean r0 = r9 instanceof Q.a
            if (r0 == 0) goto L13
            r0 = r9
            Q.a r0 = (Q.a) r0
            int r1 = r0.f5767q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5767q = r1
            goto L18
        L13:
            Q.a r0 = new Q.a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f5766p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f5767q
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            K0.L r8 = r0.f5765o
            K(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            K(r9)
        L34:
            r0.f5765o = r8
            r0.f5767q = r3
            java.lang.Object r9 = A0.e.q(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            K0.m r9 = (K0.C0245m) r9
            int r2 = r9.f3899d
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.f3896a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r9.get(r5)
            K0.u r6 = (K0.u) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.h
            if (r7 != 0) goto L34
            boolean r6 = r6.f3913d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L4f
        L68:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.c(K0.L, e5.a):java.lang.Object");
    }

    public static final float d(List list, Resources resources) {
        float dimension = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static final void e(J j3, Object obj, Object obj2) {
        int iF = j3.f(obj);
        boolean z6 = iF < 0;
        Object obj3 = z6 ? null : j3.f16005c[iF];
        if (obj3 != null) {
            if (obj3 instanceof K) {
                ((K) obj3).a(obj2);
            } else if (obj3 != obj2) {
                K k7 = new K();
                k7.a(obj3);
                k7.a(obj2);
                obj2 = k7;
            }
            obj2 = obj3;
        }
        if (!z6) {
            j3.f16005c[iF] = obj2;
            return;
        }
        int i7 = ~iF;
        j3.f16004b[i7] = obj;
        j3.f16005c[i7] = obj2;
    }

    public static final Bundle f(h... hVarArr) {
        Bundle bundle = new Bundle(hVarArr.length);
        for (h hVar : hVarArr) {
            String str = (String) hVar.f8726o;
            Object obj = hVar.f8727p;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC1209k.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void g(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(Z1.l.p("fromIndex: ", i7, i8, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static void h(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static J i() {
        long[] jArr = Q.f16032a;
        return new J();
    }

    public static final boolean j(C1893c c1893c, float f7, float f8) {
        return f7 <= c1893c.f19871c && c1893c.f19869a <= f7 && f8 <= c1893c.f19872d && c1893c.f19870b <= f8;
    }

    public static final boolean k(C1893c c1893c, float f7, float f8) {
        return f7 <= c1893c.f19871c && c1893c.f19869a <= f7 && f8 <= c1893c.f19872d && c1893c.f19870b <= f8;
    }

    public static final Y4.j l(Throwable th) {
        AbstractC1209k.f(th, "exception");
        return new Y4.j(th);
    }

    public static final f1.e m(Context context) {
        C0746L c0746l = new C0746L(2);
        context.getApplicationContext();
        return new f1.e(c0746l, new C0926a(Build.VERSION.SDK_INT >= 31 ? f1.l.f12009a.a(context) : 0));
    }

    public static final long n(I.K k7) {
        return AbstractC1267a.I(((C0886f0) k7.f3294d.f3207e).h() * k7.o()) + (((long) k7.k()) * ((long) k7.o()));
    }

    public static final File o(Context context, String str) {
        AbstractC1209k.f(context, "<this>");
        AbstractC1209k.f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), AbstractC1209k.l(str, "datastore/"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static z p(String str) {
        AbstractC1209k.f(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return z.f2478r;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return z.f2477q;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return z.f2476p;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return z.f2479s;
            }
        } else if (str.equals("SSLv3")) {
            return z.f2480t;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0616 A[PHI: r0 r1 r5 r31
  0x0616: PHI (r0v30 java.util.ArrayList) = (r0v8 java.util.ArrayList), (r0v8 java.util.ArrayList), (r0v15 java.util.ArrayList) binds: [B:506:0x0614, B:509:0x0634, B:721:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0616: PHI (r1v30 long) = (r1v15 long), (r1v15 long), (r1v23 long) binds: [B:506:0x0614, B:509:0x0634, B:721:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0616: PHI (r5v36 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v30 java.lang.String) binds: [B:506:0x0614, B:509:0x0634, B:721:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0616: PHI (r31v7 java.util.LinkedHashMap) = (r31v0 java.util.LinkedHashMap), (r31v0 java.util.LinkedHashMap), (r31v1 java.util.LinkedHashMap) binds: [B:506:0x0614, B:509:0x0634, B:721:0x0616] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x090d  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [int] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7, types: [int] */
    /* JADX WARN: Type inference failed for: r25v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList q(java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 2601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.q(java.lang.String):java.util.ArrayList");
    }

    public static W.b r(W.b bVar, n1.n nVar, M m7, n1.d dVar, f1.d dVar2) {
        if (bVar != null && nVar == bVar.f7626a && AbstractC0607C.i(m7, nVar).equals(bVar.f7627b) && dVar.b() == bVar.f7628c.f14506o && dVar2 == bVar.f7629d) {
            return bVar;
        }
        W.b bVar2 = W.b.h;
        if (bVar2 != null && nVar == bVar2.f7626a && AbstractC0607C.i(m7, nVar).equals(bVar2.f7627b) && dVar.b() == bVar2.f7628c.f14506o && dVar2 == bVar2.f7629d) {
            return bVar2;
        }
        W.b bVar3 = new W.b(nVar, AbstractC0607C.i(m7, nVar), new n1.e(dVar.b(), dVar.n()), dVar2);
        W.b.h = bVar3;
        return bVar3;
    }

    public static final Bundle s(String str, Bundle bundle) {
        AbstractC1209k.f(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(Z1.l.q("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static E1.a t(C1302a0 c1302a0) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new E1.a(d.m(c1302a0));
        }
        TextPaint textPaint = new TextPaint(c1302a0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1302a0.getBreakStrategy();
        int hyphenationFrequency = c1302a0.getHyphenationFrequency();
        if (c1302a0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i7 < 28 || (c1302a0.getInputType() & 15) != 3) {
            boolean z6 = c1302a0.getLayoutDirection() == 1;
            switch (c1302a0.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z6) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(d.d(f.b(c1302a0.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new E1.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean u(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final C0516f v(AbstractC0514d... abstractC0514dArr) {
        ArrayList arrayList = new ArrayList(abstractC0514dArr.length);
        if (abstractC0514dArr.length > 0) {
            AbstractC0514d abstractC0514d = abstractC0514dArr[0];
            throw null;
        }
        h[] hVarArr = (h[]) arrayList.toArray(new h[0]);
        h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length);
        AbstractC1209k.f(hVarArr2, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.k0(hVarArr2.length));
        y.n0(linkedHashMap, hVarArr2);
        return new C0516f(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void w(b2.y0 r5) {
        /*
            java.util.ArrayList r0 = r5.f8780b
            boolean r0 = r0.isEmpty()
            java.util.ArrayList r1 = r5.f8780b
            r2 = 1
            if (r0 != 0) goto L5b
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L16
            goto L2b
        L16:
            java.util.Iterator r0 = r1.iterator()
        L1a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r0.next()
            Z1.i r3 = (Z1.i) r3
            boolean r3 = r3 instanceof b2.C0633C
            if (r3 != 0) goto L1a
            goto L5b
        L2b:
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            Z1.i r1 = (Z1.i) r1
            java.lang.String r3 = "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox"
            m5.AbstractC1209k.d(r1, r3)
            b2.C r1 = (b2.C0633C) r1
            java.util.ArrayList r1 = r1.f8780b
            int r3 = r1.size()
            if (r3 == r2) goto L2f
            g2.k r3 = new g2.k
            r3.<init>()
            java.util.ArrayList r4 = r3.f8780b
            Z4.t.l0(r4, r1)
            r1.clear()
            r1.add(r3)
            goto L2f
        L5b:
            int r0 = r1.size()
            if (r0 != r2) goto L62
            goto L72
        L62:
            g2.k r0 = new g2.k
            r0.<init>()
            java.util.ArrayList r2 = r0.f8780b
            Z4.t.l0(r2, r1)
            r1.clear()
            r1.add(r0)
        L72:
            x(r5)
            M(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.w(b2.y0):void");
    }

    public static final void x(k kVar) {
        for (i iVar : kVar.f8780b) {
            if (iVar instanceof k) {
                x((k) iVar);
            }
        }
        g2.n nVar = (g2.n) kVar.b().b(null, o0.f10247B);
        AbstractC1166f abstractC1166f = C1165e.f14165a;
        boolean z6 = (nVar != null ? nVar.f12446a : abstractC1166f) instanceof C1165e;
        ArrayList arrayList = kVar.f8780b;
        C1164d c1164d = C1164d.f14164a;
        if (z6 && (!(arrayList instanceof Collection) || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g2.n nVar2 = (g2.n) ((i) it.next()).b().b(null, o0.f10249D);
                if ((nVar2 != null ? nVar2.f12446a : null) instanceof C1164d) {
                    kVar.c(kVar.b().c(new g2.n(c1164d)));
                    break;
                }
            }
        }
        s sVar = (s) kVar.b().b(null, o0.f10248C);
        if (sVar != null) {
            abstractC1166f = sVar.f12457a;
        }
        if (abstractC1166f instanceof C1165e) {
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                s sVar2 = (s) ((i) it2.next()).b().b(null, o0.f10250E);
                if ((sVar2 != null ? sVar2.f12457a : null) instanceof C1164d) {
                    kVar.c(kVar.b().c(new s(c1164d)));
                    return;
                }
            }
        }
    }

    public abstract void y(Throwable th);

    public abstract void z(U3.h hVar);
}
