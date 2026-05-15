package N5;

import D.C0056b;
import D.C0078t;
import D.J;
import E0.C0095f;
import G1.H;
import G1.InterfaceC0142i;
import H.I;
import I.z;
import M.C0252c;
import M.r0;
import N3.v;
import N5.l;
import O0.Q;
import Q0.AbstractC0347f;
import Q0.InterfaceC0357m;
import Y4.o;
import a.AbstractC0509a;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.HandwritingGesture;
import b1.AbstractC0607C;
import b1.C0622g;
import b1.L;
import d.InterfaceC0744J;
import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.D;
import f0.InterfaceC0878b0;
import f0.W;
import f2.C0928a;
import g1.C0959a;
import g1.C0963e;
import g1.C0979u;
import g1.InterfaceC0965g;
import g2.s;
import g5.AbstractC0992a;
import h0.C0994b;
import h5.AbstractC1005a;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.C1140b;
import k2.C1144f;
import l2.C1162b;
import l2.C1164d;
import l2.C1167g;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.p;
import r0.InterfaceC1398p;
import t.C1444F;
import u5.AbstractC1539a;
import u5.AbstractC1545g;
import u5.AbstractC1552n;
import w2.t;
import y0.C1987t;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosMediaItemExtraKt;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a */
    public static Boolean f5263a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f5264b = false;

    /* JADX INFO: renamed from: c */
    public static Method f5265c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f5266d = false;

    /* JADX INFO: renamed from: e */
    public static Field f5267e;

    /* JADX INFO: renamed from: f */
    public static C0095f f5268f;

    public static final int A(z zVar) {
        return (int) (zVar.f3412e == EnumC2048l0.f20894o ? zVar.g() & 4294967295L : zVar.g() >> 32);
    }

    public static final ViewParent B(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final L1.a C(View view) {
        L1.a aVar = (L1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        L1.a aVar2 = new L1.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static void D(x xVar, String str) {
        AbstractC1209k.f(xVar, "<this>");
        x.i(xVar, str);
    }

    public static int E(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Z1.l.o(i7, "Could not convert ", " to BackoffPolicy"));
    }

    public static int F(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 4;
        }
        if (i7 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i7 != 5) {
            throw new IllegalArgumentException(Z1.l.o(i7, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int G(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Z1.l.o(i7, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static v H(int i7) {
        if (i7 == 0) {
            return v.f5150o;
        }
        if (i7 == 1) {
            return v.f5151p;
        }
        if (i7 == 2) {
            return v.f5152q;
        }
        if (i7 == 3) {
            return v.f5153r;
        }
        if (i7 == 4) {
            return v.f5154s;
        }
        if (i7 == 5) {
            return v.f5155t;
        }
        throw new IllegalArgumentException(Z1.l.o(i7, "Could not convert ", " to State"));
    }

    public static boolean I(Throwable th) {
        return t.f18881a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean J(Throwable th) {
        return t.f18881a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static String K(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder sbU = Z1.l.u("<", str2, " threw ");
                    sbU.append(e7.getClass().getName());
                    sbU.append(">");
                    string = sbU.toString();
                }
            }
            objArr[i8] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i9 = 0;
        while (i7 < objArr.length && (iIndexOf = str.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) str, i9, iIndexOf);
            sb.append(objArr[i7]);
            i9 = iIndexOf + 2;
            i7++;
        }
        sb.append((CharSequence) str, i9, str.length());
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void L(long j3, C0622g c0622g, boolean z6, J j7) {
        if (z6) {
            int i7 = L.f9944c;
            int iCharCount = (int) (j3 >> 32);
            int iCharCount2 = (int) (j3 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c0622g, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c0622g.f9970p.length() ? Character.codePointAt(c0622g, iCharCount2) : 10;
            if (AbstractC0509a.M(iCodePointBefore) && (AbstractC0509a.L(iCodePointAt) || AbstractC0509a.J(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c0622g, iCharCount);
                    }
                } while (AbstractC0509a.M(iCodePointBefore));
                j3 = AbstractC0607C.b(iCharCount, iCharCount2);
            } else if (AbstractC0509a.M(iCodePointAt) && (AbstractC0509a.L(iCodePointBefore) || AbstractC0509a.J(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c0622g.f9970p.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c0622g, iCharCount2);
                    }
                } while (AbstractC0509a.M(iCodePointAt));
                j3 = AbstractC0607C.b(iCharCount, iCharCount2);
            }
        }
        int i8 = (int) (4294967295L & j3);
        j7.b(new V.n(new InterfaceC0965g[]{new C0979u(i8, i8), new C0963e(L.d(j3), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void M(n0.d r4, e5.AbstractC0865c r5) {
        /*
            boolean r0 = r5 instanceof b2.C0643M
            if (r0 == 0) goto L13
            r0 = r5
            b2.M r0 = (b2.C0643M) r0
            int r1 = r0.f10097p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10097p = r1
            goto L18
        L13:
            b2.M r0 = new b2.M
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10096o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r1 = r0.f10097p
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            android.support.v4.media.session.b.K(r5)
            A2.W r4 = new A2.W
            r4.<init>()
            throw r4
        L34:
            android.support.v4.media.session.b.K(r5)
            c5.i r5 = r0.getContext()
            b2.y r1 = b2.C0683y.f10352o
            c5.g r5 = r5.n(r1)
            b2.p r5 = (b2.C0675p) r5
            if (r5 == 0) goto L4b
            r0.f10097p = r2
            r5.a(r4, r0)
            return
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.l.M(n0.d, e5.c):void");
    }

    public static final String N(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, AbstractC1539a.f17313a), 8192);
                try {
                    String strF = AbstractC1110d.F(bufferedReader);
                    bufferedReader.close();
                    inputStreamOpenInputStream.close();
                    return strF;
                } finally {
                }
            } finally {
            }
        } catch (Exception e7) {
            e7.getMessage();
            System.out.getClass();
            return null;
        }
    }

    public static final void O(View view, InterfaceC0744J interfaceC0744J) {
        AbstractC1209k.f(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0744J);
    }

    public static final void P(g0.L l, int i7, Object obj) {
        l.f12277y[(l.f12278z - l.f12273u[l.f12274v - 1].f12272b) + i7] = obj;
    }

    public static final void Q(g0.L l, int i7, Object obj, int i8, Object obj2) {
        int i9 = l.f12278z - l.f12273u[l.f12274v - 1].f12272b;
        Object[] objArr = l.f12277y;
        objArr[i7 + i9] = obj;
        objArr[i9 + i8] = obj2;
    }

    public static String R(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static int S(v vVar) {
        int iOrdinal = vVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                i7 = 3;
                if (iOrdinal != 3) {
                    i7 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + vVar + " to int");
                    }
                }
            }
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String T(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = -1
            r2 = 0
            if (r6 == 0) goto L1e
            r3 = 6
            int r3 = u5.AbstractC1545g.X(r5, r6, r0, r0, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r3 == r1) goto L11
            goto L12
        L11:
            r4 = r2
        L12:
            if (r4 == 0) goto L1e
            int r3 = r4.intValue()
            int r6 = r6.length()
            int r6 = r6 + r3
            goto L1f
        L1e:
            r6 = r0
        L1f:
            r3 = 4
            java.lang.String r4 = " at "
            int r0 = u5.AbstractC1545g.X(r5, r4, r6, r0, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r0 == r1) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            int r0 = r3.intValue()
            goto L39
        L35:
            int r0 = r5.length()
        L39:
            if (r6 > r0) goto L45
            java.lang.String r5 = r5.substring(r6, r0)
            java.lang.String r6 = "substring(...)"
            m5.AbstractC1209k.e(r5, r6)
            return r5
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.l.T(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0056, code lost:
    
        if (r11 == r2) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object U(A0.b r9, android.content.Context r10, e5.AbstractC0865c r11) {
        /*
            boolean r0 = r11 instanceof b2.C0644N
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r11
            b2.N r0 = (b2.C0644N) r0
            int r2 = r0.f10103s
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.f10103s = r2
            goto L18
        L13:
            b2.N r0 = new b2.N
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f10102r
            d5.a r2 = d5.EnumC0830a.f11264o
            int r3 = r0.f10103s
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L40
            if (r3 == r4) goto L38
            if (r3 != r5) goto L30
            java.util.Iterator r9 = r0.f10101q
            android.content.Context r10 = r0.f10100p
            A0.b r3 = r0.f10099o
            android.support.v4.media.session.b.K(r11)
            goto L61
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            android.content.Context r10 = r0.f10100p
            A0.b r9 = r0.f10099o
            android.support.v4.media.session.b.K(r11)
            goto L59
        L40:
            android.support.v4.media.session.b.K(r11)
            b2.W r11 = new b2.W
            r11.<init>(r10)
            java.lang.Class r3 = r9.getClass()
            r0.f10099o = r9
            r0.f10100p = r10
            r0.f10103s = r4
            java.io.Serializable r11 = r11.a(r3, r0)
            if (r11 != r2) goto L59
            goto L94
        L59:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r3 = r9
            r9 = r11
        L61:
            boolean r11 = r9.hasNext()
            Y4.o r6 = Y4.o.f8736a
            if (r11 == 0) goto L9d
            java.lang.Object r11 = r9.next()
            b2.c r11 = (b2.C0651c) r11
            r0.f10099o = r3
            r0.f10100p = r10
            r0.f10101q = r9
            r0.f10103s = r5
            r3.getClass()
            boolean r7 = r11 instanceof b2.C0651c
            if (r7 == 0) goto L95
            int r11 = r11.f10163a
            r7 = 0
            if (r1 > r11) goto L87
            r8 = -1
            if (r11 >= r8) goto L87
            r7 = r4
        L87:
            if (r7 != 0) goto L95
            java.lang.Object r11 = A0.b.r0(r3, r10, r11, r0)
            d5.a r7 = d5.EnumC0830a.f11264o
            if (r11 != r7) goto L92
            r6 = r11
        L92:
            if (r6 != r2) goto L61
        L94:
            return r2
        L95:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Invalid Glance ID"
            r9.<init>(r10)
            throw r9
        L9d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.l.U(A0.b, android.content.Context, e5.c):java.lang.Object");
    }

    public static final void a(final float f7, final float f8, C0912t c0912t, final int i7) {
        C0912t c0912t2;
        c0912t.Z(216683752);
        if ((((c0912t.c(f7) ? 4 : 2) | i7 | (c0912t.c(f8) ? 32 : 16)) & 19) == 18 && c0912t.z()) {
            c0912t.Q();
            c0912t2 = c0912t;
        } else {
            float f9 = 4;
            c0912t2 = c0912t;
            c(android.support.v4.media.session.b.A(new s(C1164d.f14164a), f9 + f8, f7 + f9), g2.c.f12412e, V5.b.f7609a, c0912t2, 384, 0);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(f7, f8, i7) { // from class: V5.f

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ float f7612o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ float f7613p;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iB = C0879c.B(1);
                    l.a(this.f7612o, this.f7613p, (C0912t) obj, iB);
                    return o.f8736a;
                }
            };
        }
    }

    public static final void b(Context context, Z1.o oVar, C0912t c0912t, int i7) {
        Z1.o oVar2;
        C0912t c0912t2;
        AbstractC1209k.f(context, "thisContext");
        c0912t.Z(2043807632);
        int i8 = (c0912t.f(context) ? 4 : 2) | i7 | (c0912t.f(oVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0912t.z()) {
            c0912t.Q();
            oVar2 = oVar;
            c0912t2 = c0912t;
        } else {
            c0912t.S();
            if ((i7 & 1) != 0 && !c0912t.x()) {
                c0912t.Q();
            }
            c0912t.q();
            oVar2 = oVar;
            c0912t2 = c0912t;
            c(oVar2, g2.c.f12411d, n0.e.e(-890523922, new V5.h(context, 0), c0912t), c0912t2, ((i8 >> 3) & 14) | 384, 0);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(context, oVar2, i7, 7);
        }
    }

    public static final void c(Z1.o oVar, g2.c cVar, n0.d dVar, C0912t c0912t, int i7, int i8) {
        int i9;
        c0912t.Z(1959221577);
        if ((i7 & 6) == 0) {
            i9 = (c0912t.f(oVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i10 = i8 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            i9 |= c0912t.f(cVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0912t.f(dVar) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            if (i10 != 0) {
                cVar = g2.c.f12410c;
            }
            g2.d dVar2 = g2.d.f12415w;
            c0912t.Y(578571862);
            int i11 = i9 & 896;
            c0912t.Y(-548224868);
            if (!(c0912t.f11893a instanceof Z1.b)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(dVar2);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, oVar, g2.e.f12416q);
            C0879c.y(c0912t, cVar, g2.e.f12417r);
            dVar.invoke(c0912t, Integer.valueOf((i11 >> 6) & 14));
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
        }
        g2.c cVar2 = cVar;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new g2.f(oVar, cVar2, dVar, i7, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(android.graphics.Bitmap r8, Z1.o r9, f0.C0912t r10, int r11) {
        /*
            java.lang.String r0 = "modifier"
            m5.AbstractC1209k.f(r9, r0)
            r0 = 709487624(0x2a49ec08, float:1.7934276E-13)
            r10.Z(r0)
            boolean r0 = r10.f(r8)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r11
            boolean r1 = r10.f(r9)
            if (r1 == 0) goto L1e
            r1 = 32
            goto L20
        L1e:
            r1 = 16
        L20:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            if (r1 != r2) goto L34
            boolean r1 = r10.z()
            if (r1 != 0) goto L2e
            goto L34
        L2e:
            r10.Q()
        L31:
            r3 = r9
            r5 = r10
            goto L49
        L34:
            if (r8 == 0) goto L31
            Z1.d r2 = new Z1.d
            r2.<init>(r8)
            int r0 = r0 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r6 = r0 | 48
            r7 = 16
            r4 = 0
            r3 = r9
            r5 = r10
            a.AbstractC0509a.g(r2, r3, r4, r5, r6, r7)
        L49:
            f0.u0 r9 = r5.r()
            if (r9 == 0) goto L58
            D.t r10 = new D.t
            r0 = 8
            r10.<init>(r8, r3, r11, r0)
            r9.f11932d = r10
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.l.d(android.graphics.Bitmap, Z1.o, f0.t, int):void");
    }

    public static final void e(C0928a c0928a, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-1977781714);
        if (((i7 | 2) & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                c0928a = (C0928a) c0912t.j(Z1.h.f8775e);
            } else {
                c0912t.Q();
            }
            c0912t.q();
            C0879c.b(new C0913t0[]{Z1.h.f8775e.a(c0928a)}, dVar, c0912t, 48);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new Q(c0928a, dVar, i7, 3);
        }
    }

    public static final void f(final YosMediaItem yosMediaItem, final long j3, C0912t c0912t, final int i7) {
        String title;
        String artistsName;
        c0912t.Z(-1607241405);
        if ((((c0912t.f(yosMediaItem) ? 4 : 2) | i7 | (c0912t.e(j3) ? 32 : 16)) & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            if (yosMediaItem == null || (title = yosMediaItem.getTitle()) == null) {
                title = "Unknown Work";
            }
            AbstractC1109c.g(title, new g2.n(new C1162b(18.5f)), new C1144f(new C1167g(C1987t.f20259f), new p(AbstractC1109c.u(14)), new C1140b(), 120), 1, c0912t, 3072, 0);
            if (yosMediaItem == null || (artistsName = YosMediaItemExtraKt.getArtistsName(yosMediaItem)) == null) {
                artistsName = "Unknown Artist";
            }
            AbstractC1109c.g(artistsName, null, new C1144f(new C1167g(C1987t.b(j3, 0.6f)), new p(AbstractC1109c.u(13)), null, 124), 1, c0912t, 3072, 2);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(j3, i7) { // from class: V5.e

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ long f7611p;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iB = C0879c.B(1);
                    l.f(this.f7610o, this.f7611p, (C0912t) obj, iB);
                    return o.f8736a;
                }
            };
        }
    }

    public static final void g(final float f7, final long j3, final Context context, C0912t c0912t, final int i7) {
        C0912t c0912t2;
        AbstractC1209k.f(context, "thisContext");
        c0912t.Z(-755971664);
        if ((((c0912t.c(f7) ? 4 : 2) | i7 | (c0912t.e(j3) ? 32 : 16) | (c0912t.f(context) ? 256 : 128)) & 147) == 146 && c0912t.z()) {
            c0912t.Q();
            c0912t2 = c0912t;
        } else {
            float f8 = 0;
            c0912t2 = c0912t;
            c(android.support.v4.media.session.b.B(new g2.p(android.support.v4.media.session.b.L(f7), android.support.v4.media.session.b.L(f8), android.support.v4.media.session.b.L(f7), android.support.v4.media.session.b.L(f8)), 0.0f, 4, 13), null, n0.e.e(2052116494, new C0252c(1, j3, context), c0912t), c0912t2, 384, 2);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(f7, j3, context, i7) { // from class: V5.g

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ float f7614o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ long f7615p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Context f7616q;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Context context2 = this.f7616q;
                    AbstractC1209k.f(context2, "$thisContext");
                    int iB = C0879c.B(1);
                    l.g(this.f7614o, this.f7615p, context2, (C0912t) obj, iB);
                    return o.f8736a;
                }
            };
        }
    }

    public static final void h(InterfaceC1398p interfaceC1398p, D d4, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        InterfaceC1398p interfaceC1398p2;
        n0.d dVar2;
        n0.d dVar3 = R.l.f6197a;
        c0912t.Z(-714464401);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(d4) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(dVar3) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.h(dVar) ? 2048 : 1024;
        }
        if (c0912t.N(i8 & 1, (i8 & 1171) != 1170)) {
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                Object c0894j0 = new C0894j0(null, W.f11764q);
                c0912t.i0(c0894j0);
                objK = c0894j0;
            }
            T.c cVarL = l(dVar3, c0912t, (i8 >> 6) & 14);
            interfaceC1398p2 = interfaceC1398p;
            dVar2 = dVar;
            C0879c.a(d4.a(cVarL), n0.e.e(274270255, new T.d(interfaceC1398p2, (InterfaceC0878b0) objK, dVar2, cVarL, 0), c0912t), c0912t, 56);
        } else {
            interfaceC1398p2 = interfaceC1398p;
            dVar2 = dVar;
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(interfaceC1398p2, d4, dVar2, i7);
        }
    }

    public static final void i(int i7, C0912t c0912t) {
        n0.d dVar = W5.c.f7833a;
        c0912t.Z(-1550911814);
        if ((i7 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            e(null, n0.e.e(-1748209999, new V5.j((YosMediaItem) a6.b.f8888f.getValue()), c0912t), c0912t, 48);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0056b(i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x001c  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [f0.v] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [b2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [f0.B0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [w5.g0] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i2.i] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(i2.K r18, android.content.Context r19, b2.C0671m r20, i2.I r21, E0.K r22, e5.AbstractC0865c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.l.j(i2.K, android.content.Context, b2.m, i2.I, E0.K, e5.c):java.lang.Object");
    }

    public static void k(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        AbstractC1209k.f(th, "<this>");
        AbstractC1209k.f(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC1005a.f12746a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0992a.f12534a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final T.c l(n0.d dVar, C0912t c0912t, int i7) {
        boolean z6 = (((i7 & 14) ^ 6) > 4 && c0912t.f(dVar)) || (i7 & 6) == 4;
        Object objK = c0912t.K();
        Object obj = C0903o.f11850a;
        if (z6 || objK == obj) {
            objK = new T.c(dVar);
            c0912t.i0(objK);
        }
        T.c cVar = (T.c) objK;
        boolean zF = c0912t.f(cVar);
        Object objK2 = c0912t.K();
        if (zF || objK2 == obj) {
            objK2 = new J(16, cVar);
            c0912t.i0(objK2);
        }
        C0879c.d(cVar, (InterfaceC1182c) objK2, c0912t);
        return cVar;
    }

    public static final Uri m(String str, boolean z6) {
        AbstractC1209k.f(str, "relativePath");
        StringBuilder sb = new StringBuilder("content://com.android.externalstorage.documents/");
        sb.append(z6 ? "document" : "tree");
        sb.append("/primary%3A");
        sb.append(AbstractC1552n.I(AbstractC1545g.f0(str, Environment.getExternalStorageDirectory().getAbsolutePath() + '/'), "/", "%2F"));
        String string = sb.toString();
        System.out.getClass();
        return Uri.parse(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0043 -> B:115:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static N3.e n(byte[] r7) throws java.lang.Throwable {
        /*
            N3.e r0 = new N3.e
            r0.<init>()
            if (r7 != 0) goto L8
            goto L5f
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            N3.d r5 = new N3.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f5127a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.l.n(byte[]):N3.e");
    }

    public static void o(String str, long j3) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }

    public static final InterfaceC0878b0 p(B.k kVar, C0912t c0912t, int i7) {
        Object objK = c0912t.K();
        W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = C0879c.t(Boolean.FALSE);
            c0912t.i0(objK);
        }
        InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
        boolean z6 = (((i7 & 14) ^ 6) > 4 && c0912t.f(kVar)) || (i7 & 6) == 4;
        Object objK2 = c0912t.K();
        if (z6 || objK2 == w7) {
            objK2 = new B.p(kVar, interfaceC0878b0, null);
            c0912t.i0(objK2);
        }
        C0879c.e(c0912t, kVar, (l5.e) objK2);
        return interfaceC0878b0;
    }

    public static final P.c q(InterfaceC0357m interfaceC0357m) {
        P.f fVar;
        O.a aVar = new O.a();
        AbstractC0347f.A(interfaceC0357m, S.c.f6703a, new J(new J(14, aVar), 15, new r0(1, aVar, O.a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0, 2)));
        C1444F c1444f = new C1444F();
        C1444F c1444f2 = aVar.f5273a;
        Object[] objArr = c1444f2.f15983a;
        int i7 = c1444f2.f15984b;
        boolean z6 = true;
        int i8 = 0;
        P.b bVar = null;
        while (true) {
            fVar = P.f.f5698b;
            if (i8 >= i7) {
                break;
            }
            P.b bVar2 = (P.b) objArr[i8];
            if (!z6 || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z6 = false;
                    break;
                    break;
                }
                if (bVar2 != fVar) {
                    C1444F c1444f3 = aVar.f5274b;
                    Object[] objArr2 = c1444f3.f15983a;
                    int i9 = c1444f3.f15984b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (!((Boolean) ((InterfaceC1182c) objArr2[i10]).b(bVar2)).booleanValue()) {
                            z6 = false;
                            break;
                        }
                    }
                }
                c1444f.a(bVar2);
                z6 = false;
                bVar = bVar2;
            }
            i8++;
        }
        if (((P.b) (c1444f.g() ? null : c1444f.f15983a[c1444f.f15984b - 1])) == fVar) {
            c1444f.j(c1444f.f15984b - 1);
        }
        C0994b c0994b = c1444f.f15985c;
        if (c0994b == null) {
            c0994b = new C0994b(c1444f);
            c1444f.f15985c = c0994b;
        }
        return new P.c(c0994b);
    }

    public static int r(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = G1.I.f2641a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = H.f2637d;
        H h = (H) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (h == null) {
            h = new H();
            h.f2638a = null;
            h.f2639b = null;
            h.f2640c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, h);
        }
        WeakReference weakReference2 = h.f2640c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        h.f2640c = new WeakReference(keyEvent);
        if (h.f2639b == null) {
            h.f2639b = new SparseArray();
        }
        SparseArray sparseArray = h.f2639b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean v(InterfaceC0142i interfaceC0142i, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0142i != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0142i.c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f5264b) {
                            try {
                                f5265c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f5264b = true;
                        }
                        Method method = f5265c;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (G1.I.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f5266d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f5267e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f5266d = true;
                }
                Field field = f5267e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (G1.I.b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && G1.I.b(view, keyEvent)) || interfaceC0142i.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static int x(HandwritingGesture handwritingGesture, J j3) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        j3.b(new C0959a(fallbackText, 1));
        return 5;
    }

    public static F5.s y(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return F5.s.f2432p;
        }
        if (str.equals("http/1.1")) {
            return F5.s.f2433q;
        }
        if (str.equals("h2_prior_knowledge")) {
            return F5.s.f2436t;
        }
        if (str.equals("h2")) {
            return F5.s.f2435s;
        }
        if (str.equals("spdy/3.1")) {
            return F5.s.f2434r;
        }
        if (str.equals("quic")) {
            return F5.s.f2437u;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public abstract boolean s(P0.f fVar);

    public abstract String t(byte[] bArr, int i7, int i8);

    public abstract int w(String str, byte[] bArr, int i7, int i8);

    public abstract Object z(P0.f fVar);
}
