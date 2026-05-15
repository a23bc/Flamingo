package M3;

import A0.e;
import A2.W;
import B.k;
import D.A0;
import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0078t;
import D.C0084z;
import D.D0;
import D.o0;
import D.q0;
import D4.i;
import E0.C0095f;
import F.C0130c;
import I.K;
import I.L;
import I4.v;
import K0.C0236d;
import M.C0265j;
import N5.l;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import S5.C;
import S5.C0423c;
import S5.C0424d;
import S5.D;
import S5.E;
import S5.G;
import S5.t;
import S5.w;
import S5.y;
import T.g;
import T4.m;
import U5.H;
import Y.q;
import Z4.A;
import Z4.o;
import Z4.p;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.Layout;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.glance.appwidget.protobuf.C0558f;
import androidx.versionedparcelable.ParcelImpl;
import b2.L0;
import b2.p0;
import b2.r;
import c1.AbstractC0725k;
import c1.C0723i;
import d0.AbstractC0774A;
import d0.B0;
import d0.F0;
import d0.H0;
import d2.C0821i;
import d6.f;
import dev.chrisbanes.haze.HazeNodeElement;
import f0.C0879c;
import f0.C0886f0;
import f0.C0890h0;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import g2.n;
import g2.s;
import h6.B;
import h6.C1008b;
import h6.C1026k;
import h6.C1043t;
import h6.C1047v;
import h6.C1048w;
import h6.C1049x;
import h6.F;
import h6.I;
import h6.K0;
import h6.M;
import h6.N;
import h6.O0;
import h6.P0;
import h6.R0;
import h6.U0;
import i6.h;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import l2.AbstractC1166f;
import l2.C1162b;
import l2.C1163c;
import l2.C1164d;
import l2.C1165e;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.AbstractC1256m;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1389g;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import r1.C1405D;
import t5.C1523g;
import t5.j;
import u5.AbstractC1545g;
import u5.AbstractC1552n;
import u5.C1541c;
import u5.C1542d;
import u5.C1543e;
import v6.EnumC1649c;
import w.AbstractC1671d;
import w.AbstractC1674g;
import w5.AbstractC1773a;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;
import y0.C1958H;
import y0.C1987t;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.FavPlayListLibrary;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosMediaItemExtraKt;
import z.C2064u;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    public static C0095f f4762a;

    /* JADX INFO: renamed from: b */
    public static boolean f4763b;

    /* JADX WARN: Removed duplicated region for block: B:210:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0246  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:219:0x017b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A(b2.L0 r22, android.widget.RemoteViews r23, Z1.o r24, b2.C0664i0 r25) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.A(b2.L0, android.widget.RemoteViews, Z1.o, b2.i0):void");
    }

    public static final void B(RemoteViews remoteViews, n nVar, int i7) {
        AbstractC1166f abstractC1166f = nVar.f12446a;
        int i8 = Build.VERSION.SDK_INT;
        C1163c c1163c = C1163c.f14163a;
        C1165e c1165e = C1165e.f14165a;
        if (i8 >= 31) {
            if (i8 >= 33 || !o.e0(c1165e, c1163c).contains(abstractC1166f)) {
                r.f10284a.b(remoteViews, i7, abstractC1166f);
                return;
            }
            return;
        }
        List listE0 = o.e0(c1165e, C1164d.f14164a, c1163c);
        Object obj = p0.f10273a;
        if (listE0.contains(abstractC1166f)) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + abstractC1166f + " requires a complex layout before API 31");
    }

    public static final void C(RemoteViews remoteViews, s sVar, int i7) {
        AbstractC1166f abstractC1166f = sVar.f12457a;
        int i8 = Build.VERSION.SDK_INT;
        C1163c c1163c = C1163c.f14163a;
        C1165e c1165e = C1165e.f14165a;
        if (i8 >= 31) {
            if (i8 >= 33 || !o.e0(c1165e, c1163c).contains(abstractC1166f)) {
                r.f10284a.c(remoteViews, i7, abstractC1166f);
                return;
            }
            return;
        }
        List listE0 = o.e0(c1165e, C1164d.f14164a, c1163c);
        Object obj = p0.f10273a;
        if (listE0.contains(abstractC1166f)) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + abstractC1166f + " requires a complex layout before API 31");
    }

    public static final w D(C c7) {
        AbstractC1209k.f(c7, "<this>");
        return new w(c7);
    }

    public static final y E(E e7) {
        AbstractC1209k.f(e7, "<this>");
        return new y(e7);
    }

    public static String F(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b7)));
        }
        return sb.toString();
    }

    public static void G(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(G5.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
            }
        }
    }

    public static void H(String str, String str2) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(G5.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i7), str2));
                sb.append(G5.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int I(int i7, int i8) {
        long j3 = ((long) i7) + ((long) i8);
        int i9 = (int) j3;
        if (j3 == ((long) i9)) {
            return i9;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i7 + ", " + i8 + ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] J(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    public static final float K(K k7) {
        return k7.l().f3412e == EnumC2048l0.f20895p ? Float.intBitsToFloat((int) (k7.p() >> 32)) : Float.intBitsToFloat((int) (k7.p() & 4294967295L));
    }

    public static boolean L(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String M(C0558f c0558f) {
        StringBuilder sb = new StringBuilder(c0558f.size());
        for (int i7 = 0; i7 < c0558f.size(); i7++) {
            byte bA = c0558f.a(i7);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                        sb.append("\\t");
                        break;
                    case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final String N(long j3) {
        long j7 = 60;
        long j8 = j3 / j7;
        long j9 = j3 % j7;
        StringBuilder sb = new StringBuilder();
        sb.append(j8);
        sb.append(':');
        sb.append(j9 < 10 ? e.D("0", j9) : String.valueOf(j9));
        return sb.toString();
    }

    public static Object O(Future future) {
        Object obj;
        boolean z6 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(l.K("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final float P(Layout layout, int i7, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i7);
        C0723i c0723i = AbstractC0725k.f10651a;
        if (layout.getEllipsisCount(i7) <= 0 || layout.getParagraphDirection(i7) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment == null ? -1 : e1.d.f11534a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float Q(Layout layout, int i7, Paint paint) {
        float width;
        float width2;
        C0723i c0723i = AbstractC0725k.f10651a;
        if (layout.getEllipsisCount(i7) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i7) != -1 || layout.getWidth() >= layout.getLineRight(i7)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i7) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment != null ? e1.d.f11534a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static d S(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).f9833o;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static InterfaceC1398p T(InterfaceC1398p interfaceC1398p, T4.l lVar) {
        float f7 = T4.e.f6956a;
        long j3 = C1987t.f20262j;
        m mVar = new m(j3, j3 != 16 ? C1987t.b(j3, C1987t.d(j3) * 0.7f) : j3, T4.e.f6956a, 0.15f);
        AbstractC1209k.f(interfaceC1398p, "<this>");
        AbstractC1209k.f(lVar, "state");
        return interfaceC1398p.f(new HazeNodeElement(lVar, mVar));
    }

    public static v U(Object obj) {
        return obj == null ? v.f3536p : new v(obj);
    }

    public static final int V(RemoteViews remoteViews, L0 l02, int i7, int i8, Integer num) {
        if (i7 == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int iIntValue = num != null ? num.intValue() : l02.f10090g.incrementAndGet();
        if (iIntValue != -1) {
            remoteViews.setInt(i7, "setInflatedId", iIntValue);
        }
        if (i8 != 0) {
            remoteViews.setInt(i7, "setLayoutResource", i8);
        }
        remoteViews.setViewVisibility(i7, 0);
        return iIntValue;
    }

    public static final boolean W(AssertionError assertionError) {
        Logger logger = t.f6809a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1545g.N(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean X(AbstractC1166f abstractC1166f) {
        boolean z6 = true;
        if (abstractC1166f instanceof C1162b) {
            return true;
        }
        if (!(AbstractC1209k.a(abstractC1166f, C1163c.f14163a) ? true : AbstractC1209k.a(abstractC1166f, C1164d.f14164a) ? true : AbstractC1209k.a(abstractC1166f, C1165e.f14165a)) && abstractC1166f != null) {
            z6 = false;
        }
        if (z6) {
            return false;
        }
        throw new W();
    }

    public static final boolean Y(K k7, float f7) {
        k7.l().getClass();
        return !(((k7.q() ? -f7 : K(k7)) > 0.0f ? 1 : ((k7.q() ? -f7 : K(k7)) == 0.0f ? 0 : -1)) > 0);
    }

    public static F5.m Z(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr2[i8];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i8] = AbstractC1545g.u0(str).toString();
        }
        int iG = N5.d.G(0, strArr2.length - 1, 2);
        if (iG >= 0) {
            while (true) {
                String str2 = strArr2[i7];
                String str3 = strArr2[i7 + 1];
                G(str2);
                H(str3, str2);
                if (i7 == iG) {
                    break;
                }
                i7 += 2;
            }
        }
        return new F5.m(strArr2);
    }

    public static final void a(InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        c0912t.Z(1606414032);
        int i8 = i7 | (c0912t.h(interfaceC1180a) ? 4 : 2);
        if ((i8 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pV = AbstractC1109c.v(c0912t, c1395m);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t, 48);
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pV);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a2 = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a2);
            } else {
                c0912t.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t, interfaceC1398pC, c0351h4);
            float f7 = 28;
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            c0912t.X(-1020894010);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = n1.c.q(c0912t);
            }
            k kVar = (k) objK;
            c0912t.p(false);
            c0912t.X(-1020918837);
            boolean zF = ((i8 & 14) == 4) | c0912t.f(context);
            Object objK2 = c0912t.K();
            if (zF || objK2 == obj) {
                objK2 = new C1047v(interfaceC1180a, context, 0);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.a.c(c1395m, kVar, null, false, (InterfaceC1180a) objK2, 28), f7);
            C1390h c1390h = C1385c.f15616s;
            Z zD = AbstractC0074o.d(c1390h, false);
            long j7 = c0912t.f11891T;
            int i10 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pG);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a2);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, c0351h);
            C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t, i10, c0351h3);
            }
            C0879c.y(c0912t, interfaceC1398pC2, c0351h4);
            YosMediaItem yosMediaItem = (YosMediaItem) interfaceC1180a.a();
            AbstractC1110d.a(Boolean.valueOf(yosMediaItem != null ? FavPlayListLibrary.INSTANCE.isFavorite(yosMediaItem) : false), null, new b6.k(3), null, null, null, n0.e.e(-477014781, new h6.C(0, f7), c0912t), c0912t, 1573248, 58);
            c0912t.p(true);
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.k(c1395m, 14));
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(c1395m, new b6.k(4));
            c0912t.X(-1020846298);
            Object objK3 = c0912t.K();
            if (objK3 == obj) {
                objK3 = n1.c.q(c0912t);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pG2 = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.a.c(interfaceC1398pA, (k) objK3, null, false, new C1048w(0), 28), f7);
            Z zD2 = AbstractC0074o.d(c1390h, false);
            long j8 = c0912t.f11891T;
            int i11 = (int) (j8 ^ (j8 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L3 = c0912t.l();
            InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t, interfaceC1398pG2);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a2);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD2, c0351h);
            C0879c.y(c0912t, interfaceC0906p0L3, c0351h2);
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i11))) {
                n1.c.w(i11, c0912t, i11, c0351h3);
            }
            C0879c.y(c0912t, interfaceC1398pC3, c0351h4);
            AbstractC1110d.a(Boolean.FALSE, null, new b6.k(5), null, null, null, n0.e.e(-1909140372, new h6.C(1, f7), c0912t), c0912t, 1573254, 58);
            c0912t.p(true);
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new D0(i7, 13, interfaceC1180a);
        }
    }

    public static i a0(String str) throws ProtocolException {
        int i7;
        String strSubstring;
        AbstractC1209k.f(str, "statusLine");
        boolean zK = AbstractC1552n.K(str, "HTTP/1.", false);
        F5.s sVar = F5.s.f2432p;
        if (zK) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sVar = F5.s.f2433q;
            }
        } else {
            if (!AbstractC1552n.K(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (str.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i7, i8);
            AbstractC1209k.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i9 = Integer.parseInt(strSubstring2);
            if (str.length() <= i8) {
                strSubstring = "";
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i7 + 4);
                AbstractC1209k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new i(sVar, i9, strSubstring, 6);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final void b(final InterfaceC1398p interfaceC1398p, final float f7, C0912t c0912t, final int i7) {
        AbstractC1209k.f(interfaceC1398p, "modifier");
        c0912t.Z(1999432044);
        if ((((c0912t.f(interfaceC1398p) ? 4 : 2) | i7 | 48) & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            f7 = 36;
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            c0912t.X(-1844142904);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.t(Z4.v.f8818o);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            Object objR = n1.c.r(-1844139161, c0912t, false);
            if (objR == w7) {
                objR = C0879c.t("");
                c0912t.i0(objR);
            }
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objR;
            Object objR2 = n1.c.r(-1844136669, c0912t, false);
            if (objR2 == w7) {
                objR2 = C0879c.t(Boolean.FALSE);
                c0912t.i0(objR2);
            }
            InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) objR2;
            c0912t.p(false);
            AbstractC1110d.n(n0.e.e(-1188986257, new F(0, defaultAdapter, context, interfaceC0878b0, interfaceC0878b03, interfaceC0878b02), c0912t), c0912t, 6);
            AbstractC1110d.n(n0.e.e(-1914308378, new O0(interfaceC1398p, interfaceC0878b03, f7, interfaceC0878b02), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(f7, i7) { // from class: h6.z

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ float f13280p;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1398p interfaceC1398p2 = this.f13279o;
                    AbstractC1209k.f(interfaceC1398p2, "$modifier");
                    int iB = C0879c.B(1);
                    M3.a.b(interfaceC1398p2, this.f13280p, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static f b0(long j3, String str, String str2) {
        Pattern patternCompile = Pattern.compile("^\\[(\\d+:\\d+(?:[.:]\\d{2,3})?)]\\s*");
        AbstractC1209k.e(patternCompile, "compile(...)");
        AbstractC1209k.f(str, "input");
        String strReplaceFirst = patternCompile.matcher(str).replaceFirst("");
        AbstractC1209k.e(strReplaceFirst, "replaceFirst(...)");
        String string = AbstractC1545g.u0(strReplaceFirst).toString();
        Z4.v vVar = Z4.v.f8818o;
        return new f(str2, j3, j3, string, vVar, null, vVar);
    }

    public static final void c(float f7, C0912t c0912t, int i7) {
        c0912t.Z(1096526007);
        if ((i7 & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            c0912t.X(608050483);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.t(Z4.v.f8818o);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            Object objR = n1.c.r(608054226, c0912t, false);
            if (objR == w7) {
                objR = C0879c.t("");
                c0912t.i0(objR);
            }
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objR;
            Object objR2 = n1.c.r(608056718, c0912t, false);
            if (objR2 == w7) {
                objR2 = C0879c.t(Boolean.FALSE);
                c0912t.i0(objR2);
            }
            InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) objR2;
            c0912t.p(false);
            AbstractC1110d.n(n0.e.e(-712636358, new F(1, defaultAdapter, context, interfaceC0878b0, interfaceC0878b03, interfaceC0878b02), c0912t), c0912t, 6);
            AbstractC1110d.n(n0.e.e(766274353, new I(f7, interfaceC0878b03, interfaceC0878b02), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new h6.r(i7, f7);
        }
    }

    public static f c0(long j3, String str, String str2) {
        C1543e c1543e = new C1543e("\\[(\\d+:\\d+(?:[.:]\\d{2,3})?)]");
        AbstractC1209k.f(str, "input");
        if (str.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
        }
        List listJ = j.J(new C1523g(new C0236d(c1543e, 10, str), C1542d.f17322w));
        if (listJ.size() <= 1) {
            return b0(j3, str, str2);
        }
        ArrayList arrayList = new ArrayList(p.j0(listJ));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(N5.d.O((String) ((A) ((C1541c) it.next()).a()).get(1))));
        }
        ArrayList arrayListL0 = Z4.n.L0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = listJ.size();
        int i7 = 0;
        while (i7 < size) {
            String strSubstring = str.substring(((C1541c) listJ.get(i7)).b().f15782p + 1, i7 < listJ.size() - 1 ? ((C1541c) listJ.get(i7 + 1)).b().f15781o : str.length());
            AbstractC1209k.e(strSubstring, "substring(...)");
            arrayList2.add(strSubstring);
            i7++;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            String strG0 = (String) arrayList2.get(i8);
            if (strG0.length() != 0) {
                long jLongValue = ((Number) arrayListL0.get(i8)).longValue();
                long jLongValue2 = i8 < arrayListL0.size() - 1 ? ((Number) arrayListL0.get(i8 + 1)).longValue() : ((long) 500) + jLongValue;
                boolean zE = AbstractC1552n.E(strG0, " ", false);
                if (zE) {
                    strG0 = AbstractC1545g.g0(strG0, " ");
                }
                arrayList3.add(new d6.a(jLongValue, jLongValue2, strG0, zE));
            }
            i8++;
        }
        d6.a aVar = (d6.a) Z4.n.y0(arrayList3);
        return new f(str2, j3, aVar != null ? aVar.f11275p : j3, null, arrayList3, null, Z4.v.f8818o);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final r0.InterfaceC1398p r18, l5.InterfaceC1180a r19, final l5.InterfaceC1180a r20, boolean r21, f0.C0912t r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.d(r0.p, l5.a, l5.a, boolean, f0.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:407:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(int r36, int r37, D.InterfaceC0067h r38, D.k0 r39, F.A r40, f0.C0912t r41, l5.InterfaceC1182c r42, r0.C1388f r43, r0.InterfaceC1398p r44, x.C1875s r45, z.S r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.e(int, int, D.h, D.k0, F.A, f0.t, l5.c, r0.f, r0.p, x.s, z.S, boolean):void");
    }

    public static final void f(final InterfaceC1398p interfaceC1398p, final InterfaceC1180a interfaceC1180a, final InterfaceC1180a interfaceC1180a2, final InterfaceC1180a interfaceC1180a3, final Z5.b bVar, final Z5.c cVar, final InterfaceC1180a interfaceC1180a4, C0912t c0912t, final int i7) {
        c0912t.Z(-1527990294);
        if (((i7 | (c0912t.f(interfaceC1398p) ? 4 : 2) | (c0912t.h(interfaceC1180a) ? 32 : 16) | (c0912t.h(interfaceC1180a2) ? 256 : 128) | (c0912t.h(interfaceC1180a3) ? 2048 : 1024) | (c0912t.h(interfaceC1180a4) ? 1048576 : 524288)) & 525459) == 525458 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(-1630029587, new M(1, interfaceC1180a2, interfaceC1180a, interfaceC1180a3, interfaceC1180a4, interfaceC1398p), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1180a, interfaceC1180a2, interfaceC1180a3, bVar, cVar, interfaceC1180a4, i7) { // from class: h6.m

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13105p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13106q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13107r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Z5.b f13108s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Z5.c f13109t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13110u;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1180a interfaceC1180a5 = this.f13105p;
                    AbstractC1209k.f(interfaceC1180a5, "$lrcEntries");
                    InterfaceC1180a interfaceC1180a6 = this.f13106q;
                    AbstractC1209k.f(interfaceC1180a6, "$weightLambda");
                    InterfaceC1180a interfaceC1180a7 = this.f13107r;
                    AbstractC1209k.f(interfaceC1180a7, "$translationLambda");
                    Z5.b bVar2 = this.f13108s;
                    Z5.c cVar2 = this.f13109t;
                    AbstractC1209k.f(cVar2, "$mediaViewModel");
                    InterfaceC1180a interfaceC1180a8 = this.f13110u;
                    AbstractC1209k.f(interfaceC1180a8, "$onBackClick");
                    int iB = C0879c.B(1);
                    M3.a.f(this.f13104o, interfaceC1180a5, interfaceC1180a6, interfaceC1180a7, bVar2, cVar2, interfaceC1180a8, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final C0423c f0(Socket socket) throws IOException {
        Logger logger = t.f6809a;
        D d4 = new D(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC1209k.e(outputStream, "getOutputStream(...)");
        return new C0423c(d4, 0, new C0423c(outputStream, 1, d4));
    }

    public static final void g(final InterfaceC1398p interfaceC1398p, final InterfaceC1180a interfaceC1180a, final InterfaceC1180a interfaceC1180a2, final float f7, final Z5.b bVar, final Z5.c cVar, final InterfaceC1180a interfaceC1180a3, C0912t c0912t, final int i7) {
        c0912t.Z(-1388410625);
        if (((i7 | (c0912t.f(interfaceC1398p) ? 4 : 2) | (c0912t.h(interfaceC1180a) ? 32 : 16) | (c0912t.h(interfaceC1180a2) ? 256 : 128) | (c0912t.c(f7) ? 2048 : 1024) | (c0912t.h(interfaceC1180a3) ? 1048576 : 524288)) & 525459) == 525458 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(2101075676, new N(f7, interfaceC1398p, interfaceC1180a, interfaceC1180a2, interfaceC1180a3, 1), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1180a, interfaceC1180a2, f7, bVar, cVar, interfaceC1180a3, i7) { // from class: h6.q

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13163p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13164q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ float f13165r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Z5.b f13166s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Z5.c f13167t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13168u;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1180a interfaceC1180a4 = this.f13163p;
                    AbstractC1209k.f(interfaceC1180a4, "$lrcEntries");
                    InterfaceC1180a interfaceC1180a5 = this.f13164q;
                    AbstractC1209k.f(interfaceC1180a5, "$translationLambda");
                    Z5.b bVar2 = this.f13166s;
                    Z5.c cVar2 = this.f13167t;
                    AbstractC1209k.f(cVar2, "$mediaViewModel");
                    InterfaceC1180a interfaceC1180a6 = this.f13168u;
                    AbstractC1209k.f(interfaceC1180a6, "$onBackClick");
                    int iB = C0879c.B(1);
                    M3.a.g(this.f13162o, interfaceC1180a4, interfaceC1180a5, this.f13165r, bVar2, cVar2, interfaceC1180a6, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final C0424d g0(InputStream inputStream) {
        Logger logger = t.f6809a;
        AbstractC1209k.f(inputStream, "<this>");
        return new C0424d(inputStream, new G());
    }

    public static final void h(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, float f7, C0912t c0912t, int i7) {
        int i8;
        float f8;
        c0912t.Z(761528809);
        if ((i7 & 6) == 0) {
            i8 = i7 | (c0912t.f(interfaceC1398p) ? 4 : 2);
        } else {
            i8 = i7;
        }
        int i9 = i8 | (c0912t.h(interfaceC1180a) ? 32 : 16) | (c0912t.h(interfaceC1180a2) ? 256 : 128);
        if ((i9 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
            f8 = f7;
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.c(c1395m, 36).f(interfaceC1398p);
            c0912t.X(-1640497175);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = n1.c.q(c0912t);
            }
            k kVar = (k) objK;
            c0912t.p(false);
            c0912t.X(-1640499984);
            boolean z6 = (i9 & 112) == 32;
            Object objK2 = c0912t.K();
            if (z6 || objK2 == w7) {
                objK2 = new L(interfaceC1180a, 2);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(interfaceC1398pF, kVar, null, false, (InterfaceC1180a) objK2, 28);
            Z zD = AbstractC0074o.d(C1385c.f15616s, false);
            long j3 = c0912t.f11891T;
            int i10 = (int) ((j3 >>> 32) ^ j3);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pC);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t, i10, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC2, C0354j.f6017d);
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(c1395m, 8, 0.0f, 0.0f, 0.0f, 14);
            f8 = f7;
            AbstractC1110d.a(Boolean.valueOf(AbstractC1209k.a(interfaceC1180a2.a(), "Lyric")), interfaceC1398pJ, new b6.k(6), null, null, null, n0.e.e(-1596482190, new h6.C(4, f8), c0912t), c0912t, 1573296, 56);
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new B(interfaceC1398p, interfaceC1180a, interfaceC1180a2, f8, i7, 0);
        }
    }

    public static final C0424d h0(Socket socket) throws IOException {
        Logger logger = t.f6809a;
        D d4 = new D(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC1209k.e(inputStream, "getInputStream(...)");
        return new C0424d(d4, new C0424d(inputStream, d4));
    }

    public static final void i(Z5.b bVar, Z5.c cVar, x xVar, InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a4, C0912t c0912t, int i7) {
        AbstractC1209k.f(cVar, "mediaViewModel");
        AbstractC1209k.f(xVar, "navController");
        AbstractC1209k.f(interfaceC1180a, "isPlayingStatusLambda");
        AbstractC1209k.f(interfaceC1182c, "isPlayingOnChanged");
        AbstractC1209k.f(interfaceC1180a2, "nowPageLambda");
        AbstractC1209k.f(interfaceC1180a3, "showMiniPlayer");
        AbstractC1209k.f(interfaceC1182c2, "nowPageOnChanged");
        AbstractC1209k.f(interfaceC1180a4, "expandNowPlaying");
        c0912t.Z(1149170499);
        if (((i7 | (c0912t.f(bVar) ? 4 : 2) | (c0912t.f(cVar) ? 32 : 16) | (c0912t.h(interfaceC1180a) ? 2048 : 1024) | (c0912t.h(interfaceC1182c) ? 16384 : 8192) | (c0912t.h(interfaceC1180a2) ? 131072 : 65536) | (c0912t.h(interfaceC1180a3) ? 1048576 : 524288) | (c0912t.h(interfaceC1182c2) ? 8388608 : 4194304) | (c0912t.h(interfaceC1180a4) ? 67108864 : 33554432)) & 38347795) == 38347794 && c0912t.z()) {
            c0912t.Q();
        } else {
            F0.a(androidx.compose.foundation.layout.c.f9203c, null, C1987t.f20261i, C1987t.f20259f, 0.0f, n0.e.e(-1210158178, new H(interfaceC1180a, interfaceC1180a2, interfaceC1180a3, interfaceC1180a4, bVar, cVar, interfaceC1182c, interfaceC1182c2), c0912t), c0912t, 12586374, 114);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new h6.A(bVar, cVar, xVar, interfaceC1180a, interfaceC1182c, interfaceC1180a2, interfaceC1180a3, interfaceC1182c2, interfaceC1180a4, i7);
        }
    }

    public static void i0(l5.e eVar, AbstractC1773a abstractC1773a, AbstractC1773a abstractC1773a2) {
        try {
            B5.a.h(I0.c.D(I0.c.p(abstractC1773a, abstractC1773a2, eVar)), Y4.o.f8736a);
        } catch (Throwable th) {
            abstractC1773a2.resumeWith(android.support.v4.media.session.b.l(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:564:0x0370 A[PHI: r10
  0x0370: PHI (r10v38 int) = (r10v33 int), (r10v39 int) binds: [B:563:0x036e, B:559:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:584:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x04a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(float r52, int r53, int r54, int r55, A.h r56, A.m r57, D.k0 r58, I.C0209a r59, final I.C0211c r60, I.InterfaceC0221m r61, f0.C0912t r62, l5.InterfaceC1182c r63, n0.d r64, r0.C1389g r65, r0.InterfaceC1398p r66, x.C1875s r67, boolean r68) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.j(float, int, int, int, A.h, A.m, D.k0, I.a, I.c, I.m, f0.t, l5.c, n0.d, r0.g, r0.p, x.s, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public static final int j0(boolean z6, G.n nVar, int i7) {
        return z6 ? ((G.o) nVar.l.get(i7)).f2575u : ((G.o) nVar.l.get(i7)).f2576v;
    }

    public static final void k(final InterfaceC1180a interfaceC1180a, final InterfaceC1182c interfaceC1182c, final InterfaceC1180a interfaceC1180a2, final InterfaceC1182c interfaceC1182c2, final InterfaceC1180a interfaceC1180a3, final b6.k kVar, final InterfaceC1180a interfaceC1180a4, final InterfaceC1180a interfaceC1180a5, final InterfaceC1180a interfaceC1180a6, final InterfaceC1180a interfaceC1180a7, final InterfaceC1182c interfaceC1182c3, final InterfaceC1398p interfaceC1398p, C0912t c0912t, final int i7) {
        C0912t c0912t2;
        c0912t.Z(1296636555);
        int i8 = i7 | (c0912t.h(interfaceC1180a) ? 4 : 2) | (c0912t.h(interfaceC1182c) ? 32 : 16) | (c0912t.h(interfaceC1180a2) ? 256 : 128) | (c0912t.h(interfaceC1182c2) ? 2048 : 1024) | (c0912t.h(interfaceC1180a3) ? 16384 : 8192) | (c0912t.h(interfaceC1180a4) ? 1048576 : 524288) | (c0912t.h(interfaceC1180a5) ? 8388608 : 4194304) | (c0912t.h(interfaceC1180a6) ? 67108864 : 33554432) | (c0912t.h(interfaceC1180a7) ? 536870912 : 268435456);
        int i9 = (c0912t.h(interfaceC1182c3) ? (char) 4 : (char) 2) | '0';
        if ((i8 & 306783379) == 306783378 && (i9 & 19) == 18 && c0912t.z()) {
            c0912t.Q();
            c0912t2 = c0912t;
        } else {
            C0890h0 c0890h0 = (C0890h0) AbstractC1256m.c(new Object[0], null, "PlayerControl_playingDuration", new A0(26), c0912t, 3456, 2);
            C0890h0 c0890h02 = (C0890h0) AbstractC1256m.c(new Object[0], null, "PlayerControl_playingPosition", new A0(27), c0912t, 3456, 2);
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "PlayerControl_playedTime", new A0(28), c0912t, 3456, 2);
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "PlayerControl_remainingTime", new C2064u(1), c0912t, 3456, 2);
            c0912t.X(1857980655);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = new C0886f0(0.0f);
                c0912t.i0(objK);
            }
            C0886f0 c0886f0 = (C0886f0) objK;
            Object objR = n1.c.r(1857983508, c0912t, false);
            if (objR == w7) {
                objR = C0879c.t(Boolean.FALSE);
                c0912t.i0(objR);
            }
            c0912t.p(false);
            c0912t2 = c0912t;
            AbstractC1110d.n(n0.e.e(-1896270194, new h6.D0(interfaceC1398p, (InterfaceC0878b0) objR, c0890h0, c0890h02, interfaceC0878b0, interfaceC0878b02, interfaceC1182c3, c0886f0, interfaceC1180a7, context, kVar, interfaceC1180a2, interfaceC1182c, interfaceC1180a, interfaceC1182c2, interfaceC1180a3, interfaceC1180a4, interfaceC1180a6, interfaceC1180a5), c0912t2), c0912t2, 6);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1182c, interfaceC1180a2, interfaceC1182c2, interfaceC1180a3, kVar, interfaceC1180a4, interfaceC1180a5, interfaceC1180a6, interfaceC1180a7, interfaceC1182c3, interfaceC1398p, i7) { // from class: h6.s

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13179p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13180q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13181r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13182s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ b6.k f13183t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13184u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13185v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13186w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13187x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13188y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1398p f13189z;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1180a interfaceC1180a8 = this.f13178o;
                    AbstractC1209k.f(interfaceC1180a8, "$isPlayingLambda");
                    InterfaceC1182c interfaceC1182c4 = this.f13179p;
                    AbstractC1209k.f(interfaceC1182c4, "$isPlayingOnChanged");
                    InterfaceC1180a interfaceC1180a9 = this.f13180q;
                    AbstractC1209k.f(interfaceC1180a9, "$onPrevious");
                    InterfaceC1182c interfaceC1182c5 = this.f13181r;
                    AbstractC1209k.f(interfaceC1182c5, "$onStatus");
                    InterfaceC1180a interfaceC1180a10 = this.f13182s;
                    AbstractC1209k.f(interfaceC1180a10, "$onNext");
                    b6.k kVar2 = this.f13183t;
                    InterfaceC1180a interfaceC1180a11 = this.f13184u;
                    AbstractC1209k.f(interfaceC1180a11, "$onLyrics");
                    InterfaceC1180a interfaceC1180a12 = this.f13185v;
                    AbstractC1209k.f(interfaceC1180a12, "$onPlaylist");
                    InterfaceC1180a interfaceC1180a13 = this.f13186w;
                    AbstractC1209k.f(interfaceC1180a13, "$nowPage");
                    InterfaceC1180a interfaceC1180a14 = this.f13187x;
                    AbstractC1209k.f(interfaceC1180a14, "$onSlider");
                    InterfaceC1182c interfaceC1182c6 = this.f13188y;
                    AbstractC1209k.f(interfaceC1182c6, "$onWhile");
                    InterfaceC1398p interfaceC1398p2 = this.f13189z;
                    AbstractC1209k.f(interfaceC1398p2, "$modifier");
                    M3.a.k(interfaceC1180a8, interfaceC1182c4, interfaceC1180a9, interfaceC1182c5, interfaceC1180a10, kVar2, interfaceC1180a11, interfaceC1180a12, interfaceC1180a13, interfaceC1180a14, interfaceC1182c6, interfaceC1398p2, (C0912t) obj, C0879c.B(196609));
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void l(final InterfaceC1180a interfaceC1180a, final InterfaceC1182c interfaceC1182c, final InterfaceC1180a interfaceC1180a2, final InterfaceC1182c interfaceC1182c2, final InterfaceC1180a interfaceC1180a3, final b6.k kVar, final InterfaceC1180a interfaceC1180a4, final InterfaceC1182c interfaceC1182c3, final InterfaceC1180a interfaceC1180a5, final InterfaceC1182c interfaceC1182c4, final InterfaceC1180a interfaceC1180a6, final InterfaceC1182c interfaceC1182c5, final InterfaceC1398p interfaceC1398p, C0912t c0912t, final int i7) {
        C0912t c0912t2;
        c0912t.Z(742552484);
        int i8 = i7 | (c0912t.h(interfaceC1180a) ? 4 : 2) | (c0912t.h(interfaceC1182c) ? 32 : 16) | (c0912t.h(interfaceC1180a2) ? 256 : 128) | (c0912t.h(interfaceC1182c2) ? 2048 : 1024) | (c0912t.h(interfaceC1180a3) ? 16384 : 8192) | (c0912t.h(interfaceC1180a4) ? 1048576 : 524288) | (c0912t.h(interfaceC1182c3) ? 8388608 : 4194304) | (c0912t.h(interfaceC1180a5) ? 67108864 : 33554432) | (c0912t.h(interfaceC1182c4) ? 536870912 : 268435456);
        int i9 = (c0912t.h(interfaceC1180a6) ? (char) 4 : (char) 2) | 384 | (c0912t.h(interfaceC1182c5) ? ' ' : (char) 16);
        if ((i8 & 306783379) == 306783378 && (i9 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
            c0912t2 = c0912t;
        } else {
            C0890h0 c0890h0 = (C0890h0) AbstractC1256m.c(new Object[0], null, "PlayerControl_playingDuration", new A0(22), c0912t, 3456, 2);
            C0890h0 c0890h02 = (C0890h0) AbstractC1256m.c(new Object[0], null, "PlayerControl_playingPosition", new A0(23), c0912t, 3456, 2);
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "PlayerControl_playedTime", new A0(24), c0912t, 3456, 2);
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "PlayerControl_remainingTime", new A0(25), c0912t, 3456, 2);
            c0912t.X(1282791962);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = new C0886f0(0.0f);
                c0912t.i0(objK);
            }
            C0886f0 c0886f0 = (C0886f0) objK;
            Object objR = n1.c.r(1282794815, c0912t, false);
            if (objR == w7) {
                objR = C0879c.t(Boolean.FALSE);
                c0912t.i0(objR);
            }
            c0912t.p(false);
            c0912t2 = c0912t;
            AbstractC1110d.n(n0.e.e(-953954713, new h6.F0(interfaceC1398p, (InterfaceC0878b0) objR, c0890h0, c0890h02, interfaceC0878b0, interfaceC0878b02, interfaceC1182c5, c0886f0, interfaceC1180a6, context, kVar, interfaceC1180a4, interfaceC1182c3, interfaceC1180a5, interfaceC1182c4, interfaceC1180a2, interfaceC1182c, interfaceC1180a, interfaceC1182c2, interfaceC1180a3), c0912t2), c0912t2, 6);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1182c, interfaceC1180a2, interfaceC1182c2, interfaceC1180a3, kVar, interfaceC1180a4, interfaceC1182c3, interfaceC1180a5, interfaceC1182c4, interfaceC1180a6, interfaceC1182c5, interfaceC1398p, i7) { // from class: h6.p

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1398p f13142A;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13144p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13145q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13146r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13147s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ b6.k f13148t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13149u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13150v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13151w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13152x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13153y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13154z;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1180a interfaceC1180a7 = this.f13143o;
                    AbstractC1209k.f(interfaceC1180a7, "$isPlayingLambda");
                    InterfaceC1182c interfaceC1182c6 = this.f13144p;
                    AbstractC1209k.f(interfaceC1182c6, "$isPlayingOnChanged");
                    InterfaceC1180a interfaceC1180a8 = this.f13145q;
                    AbstractC1209k.f(interfaceC1180a8, "$onPrevious");
                    InterfaceC1182c interfaceC1182c7 = this.f13146r;
                    AbstractC1209k.f(interfaceC1182c7, "$onStatus");
                    InterfaceC1180a interfaceC1180a9 = this.f13147s;
                    AbstractC1209k.f(interfaceC1180a9, "$onNext");
                    b6.k kVar2 = this.f13148t;
                    InterfaceC1180a interfaceC1180a10 = this.f13149u;
                    AbstractC1209k.f(interfaceC1180a10, "$shuffleModeEnabledLambda");
                    InterfaceC1182c interfaceC1182c8 = this.f13150v;
                    AbstractC1209k.f(interfaceC1182c8, "$shuffleModeOnChanged");
                    InterfaceC1180a interfaceC1180a11 = this.f13151w;
                    AbstractC1209k.f(interfaceC1180a11, "$repeatModeLambda");
                    InterfaceC1182c interfaceC1182c9 = this.f13152x;
                    AbstractC1209k.f(interfaceC1182c9, "$repeatModeOnChanged");
                    InterfaceC1180a interfaceC1180a12 = this.f13153y;
                    AbstractC1209k.f(interfaceC1180a12, "$onSlider");
                    InterfaceC1182c interfaceC1182c10 = this.f13154z;
                    AbstractC1209k.f(interfaceC1182c10, "$onWhile");
                    InterfaceC1398p interfaceC1398p2 = this.f13142A;
                    AbstractC1209k.f(interfaceC1398p2, "$modifier");
                    M3.a.l(interfaceC1180a7, interfaceC1182c6, interfaceC1180a8, interfaceC1182c7, interfaceC1180a9, kVar2, interfaceC1180a10, interfaceC1182c8, interfaceC1180a11, interfaceC1182c9, interfaceC1180a12, interfaceC1182c10, interfaceC1398p2, (C0912t) obj, C0879c.B(196609));
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void m(InterfaceC1398p interfaceC1398p, InterfaceC1398p interfaceC1398p2, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, C0912t c0912t, int i7, int i8) {
        int i9;
        InterfaceC1180a interfaceC1180a4;
        InterfaceC1398p interfaceC1398p3;
        InterfaceC1180a interfaceC1180a5;
        InterfaceC1180a interfaceC1180a6;
        InterfaceC1398p interfaceC1398p4;
        c0912t.Z(877132062);
        int i10 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        int i11 = i8 & 2;
        if (i11 != 0) {
            i9 = i10 | 48;
        } else {
            i9 = i10 | (c0912t.f(interfaceC1398p2) ? 32 : 16);
        }
        if (((i9 | (c0912t.h(interfaceC1180a3) ? 16384 : 8192)) & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            interfaceC1180a4 = interfaceC1180a3;
            interfaceC1180a6 = interfaceC1180a2;
            interfaceC1180a5 = interfaceC1180a;
            interfaceC1398p4 = interfaceC1398p2;
            interfaceC1398p3 = interfaceC1398p;
        } else {
            if (i11 != 0) {
                interfaceC1398p2 = C1395m.f15634a;
            }
            InterfaceC1398p interfaceC1398p5 = interfaceC1398p2;
            interfaceC1180a4 = interfaceC1180a3;
            R.s sVar = new R.s(interfaceC1398p, interfaceC1180a4, interfaceC1180a, interfaceC1398p5, interfaceC1180a2);
            interfaceC1398p3 = interfaceC1398p;
            interfaceC1180a5 = interfaceC1180a;
            interfaceC1180a6 = interfaceC1180a2;
            AbstractC1110d.n(n0.e.e(1378030267, sVar, c0912t), c0912t, 6);
            interfaceC1398p4 = interfaceC1398p5;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new D.L(interfaceC1398p3, interfaceC1398p4, interfaceC1180a5, interfaceC1180a6, interfaceC1180a4, i7, i8);
        }
    }

    public static final void n(InterfaceC0878b0 interfaceC0878b0, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, C0912t c0912t, int i7) {
        InterfaceC1180a interfaceC1180a3;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(1543096785);
        int i8 = (c0912t2.h(interfaceC1180a) ? 256 : 128) | i7;
        if ((i7 & 3072) == 0) {
            interfaceC1180a3 = interfaceC1180a2;
            i8 |= c0912t2.h(interfaceC1180a3) ? 2048 : 1024;
        } else {
            interfaceC1180a3 = interfaceC1180a2;
        }
        if ((i8 & 1171) == 1170 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            c0912t2.X(1131023404);
            Object objK = c0912t2.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.o(new G.i(interfaceC0878b0, 13, interfaceC1180a));
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            if (((Boolean) ((Z0) objK).getValue()).booleanValue()) {
                c0912t2.X(702194052);
                FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1331e, C1385c.f15609B, c0912t2, 54);
                long j3 = c0912t2.f11891T;
                int i9 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, fillElement);
                InterfaceC0355k.f6047i.getClass();
                C0353i c0353i = C0354j.f6015b;
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i);
                } else {
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, c0084zA, C0354j.f6019f);
                C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
                C0351h c0351h = C0354j.f6020g;
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                    n1.c.w(i9, c0912t2, i9, c0351h);
                }
                C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
                D0.b bVarB = AbstractC1267a.B(R.drawable.ic_uitabbar_library, c0912t2);
                C1395m c1395m = C1395m.f15634a;
                AbstractC0774A.a(bVarB, null, h.l(androidx.compose.foundation.layout.c.g(AbstractC1109c.v(c0912t2, c1395m), 70), 0.6f), 0L, c0912t2, 48, 8);
                H0.b(I0.c.S(R.string.playlist_unavailable_title, c0912t2), androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 18, 0.0f, 12, 5), C1987t.f20259f, AbstractC1109c.u(18), f1.k.f12005w, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, 200112, 0, 131024);
                c0912t2 = c0912t;
                AbstractC1110d.n(n0.e.e(-1094127387, new C1026k(interfaceC0878b0, 2), c0912t2), c0912t2, 6);
                c0912t2.p(true);
                c0912t2.p(false);
            } else {
                c0912t2.X(703744300);
                List list = (List) interfaceC0878b0.getValue();
                YosMediaItem yosMediaItem = (YosMediaItem) interfaceC1180a3.a();
                c0912t2.X(1131077976);
                boolean zF = c0912t2.f(list) | c0912t2.f(yosMediaItem);
                Object objK2 = c0912t2.K();
                if (zF || objK2 == w7) {
                    List list2 = (List) interfaceC0878b0.getValue();
                    objK2 = Integer.valueOf(list2 != null ? list2.indexOf(b6.i.f10424d.getValue()) : 0);
                    c0912t2.i0(objK2);
                }
                int iIntValue = ((Number) objK2).intValue();
                c0912t2.p(false);
                Object objK3 = c0912t2.K();
                if (objK3 == w7) {
                    objK3 = C0879c.l(c0912t2);
                    c0912t2.i0(objK3);
                }
                AbstractC1110d.n(n0.e.e(-1611878728, new K0(F.D.a(iIntValue + 1, c0912t2, 48, 0), interfaceC0878b0, (InterfaceC1765B) objK3, 1), c0912t2), c0912t2, 6);
                c0912t2.p(false);
            }
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new H.I(i7, 6, interfaceC0878b0, interfaceC1180a, interfaceC1180a2);
        }
    }

    public static final void o(final InterfaceC1398p interfaceC1398p, final InterfaceC1180a interfaceC1180a, final InterfaceC1182c interfaceC1182c, final InterfaceC1180a interfaceC1180a2, final InterfaceC1182c interfaceC1182c2, final InterfaceC1180a interfaceC1180a3, C0912t c0912t, final int i7) {
        c0912t.Z(-1652344047);
        if (((i7 | (c0912t.f(interfaceC1398p) ? 4 : 2) | (c0912t.h(interfaceC1180a) ? 32 : 16) | (c0912t.h(interfaceC1182c) ? 256 : 128) | (c0912t.h(interfaceC1180a2) ? 2048 : 1024) | (c0912t.h(interfaceC1182c2) ? 16384 : 8192)) & 74899) == 74898 && c0912t.z()) {
            c0912t.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.c(c1395m, 12));
            c0912t.X(125694062);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = b6.i.f10422b;
                c0912t.i0(objK);
            }
            c0912t.p(false);
            AbstractC1110d.n(n0.e.e(-1271301458, new H(interfaceC1398p, (InterfaceC0878b0) objK, interfaceC1180a, interfaceC1180a3, context, interfaceC1182c, interfaceC1180a2, interfaceC1182c2), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1180a, interfaceC1182c, interfaceC1180a2, interfaceC1182c2, interfaceC1180a3, i7) { // from class: h6.u

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13230p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13231q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13232r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f13233s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f13234t;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1180a interfaceC1180a4 = this.f13230p;
                    AbstractC1209k.f(interfaceC1180a4, "$shuffleModeEnabledLambda");
                    InterfaceC1182c interfaceC1182c3 = this.f13231q;
                    AbstractC1209k.f(interfaceC1182c3, "$shuffleModeOnChanged");
                    InterfaceC1180a interfaceC1180a5 = this.f13232r;
                    AbstractC1209k.f(interfaceC1180a5, "$repeatModeLambda");
                    InterfaceC1182c interfaceC1182c4 = this.f13233s;
                    AbstractC1209k.f(interfaceC1182c4, "$repeatModeOnChanged");
                    InterfaceC1180a interfaceC1180a6 = this.f13234t;
                    AbstractC1209k.f(interfaceC1180a6, "$thisMusicPlayingLambda");
                    int iB = C0879c.B(196609);
                    M3.a.o(this.f13229o, interfaceC1180a4, interfaceC1182c3, interfaceC1180a5, interfaceC1182c4, interfaceC1180a6, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void p(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, float f7, C0912t c0912t, int i7) {
        int i8;
        float f8;
        c0912t.Z(993398136);
        if ((i7 & 6) == 0) {
            i8 = i7 | (c0912t.f(interfaceC1398p) ? 4 : 2);
        } else {
            i8 = i7;
        }
        int i9 = i8 | (c0912t.h(interfaceC1180a) ? 32 : 16) | (c0912t.h(interfaceC1180a2) ? 256 : 128);
        if ((i9 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
            f8 = f7;
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pF = androidx.compose.foundation.layout.c.c(c1395m, 36).f(interfaceC1398p);
            c0912t.X(-1432129442);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = n1.c.q(c0912t);
            }
            k kVar = (k) objK;
            c0912t.p(false);
            c0912t.X(-1432132313);
            boolean z6 = (i9 & 112) == 32;
            Object objK2 = c0912t.K();
            if (z6 || objK2 == w7) {
                objK2 = new L(interfaceC1180a, 3);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pC = androidx.compose.foundation.a.c(interfaceC1398pF, kVar, null, false, (InterfaceC1180a) objK2, 28);
            Z zD = AbstractC0074o.d(C1385c.f15616s, false);
            long j3 = c0912t.f11891T;
            int i10 = (int) ((j3 >>> 32) ^ j3);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t, interfaceC1398pC);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t, i10, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC2, C0354j.f6017d);
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 0.0f, 8, 0.0f, 11);
            f8 = f7;
            AbstractC1110d.a(Boolean.valueOf(AbstractC1209k.a(interfaceC1180a2.a(), "PlayingList")), interfaceC1398pJ, new b6.k(7), null, null, null, n0.e.e(1972820303, new h6.C(5, f8), c0912t), c0912t, 1573296, 56);
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new B(interfaceC1398p, interfaceC1180a, interfaceC1180a2, f8, i7, 1);
        }
    }

    public static final void q(InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(790527681);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(dVar) ? 32 : 16;
        }
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
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
                objK2 = new F.m(interfaceC0878b0, 5);
                c0912t.i0(objK2);
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
            C1405D c1405d = R.p.f6206a;
            T.c cVarL = l.l(R.l.f6198b, c0912t, 6);
            C0879c.b(new C0913t0[]{g.f6846b.a(I0.c.K(interfaceC1180a, c0912t, 2)), g.f6845a.a(cVarL)}, n0.e.e(1070596993, new R.s(interfaceC1398p, interfaceC0878b0, dVar, cVarL, interfaceC1180a, 0), c0912t), c0912t, 56);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new R.i(interfaceC1398p, dVar, i7, 3);
        }
    }

    public static final void r(InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(155925518);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(dVar) ? 32 : 16;
        }
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            boolean z6 = c0912t.j(g.f6845a) != null;
            boolean z7 = c0912t.j(g.f6846b) != null;
            if (z6 && z7) {
                c0912t.X(-1977156178);
                Z zD = AbstractC0074o.d(C1385c.f15612o, true);
                long j3 = c0912t.f11891T;
                int i9 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
                InterfaceC0355k.f6047i.getClass();
                C0353i c0353i = C0354j.f6015b;
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, zD, C0354j.f6019f);
                C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                C0351h c0351h = C0354j.f6020g;
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                    n1.c.w(i9, c0912t, i9, c0351h);
                }
                C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                dVar.invoke(c0912t, Integer.valueOf((i8 >> 3) & 14));
                c0912t.p(true);
                c0912t.p(false);
            } else if (z6) {
                c0912t.X(-1976965962);
                I0.c.g(interfaceC1398p, dVar, c0912t, i8 & 126);
                c0912t.p(false);
            } else if (z7) {
                c0912t.X(-1976815178);
                R.p.d(interfaceC1398p, dVar, c0912t, i8 & 126);
                c0912t.p(false);
            } else {
                c0912t.X(-1976684761);
                q(interfaceC1398p, dVar, c0912t, i8 & 126);
                c0912t.p(false);
            }
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new R.i(interfaceC1398p, dVar, i7, 4);
        }
    }

    public static final void s(InterfaceC1180a interfaceC1180a, Context context, InterfaceC1182c interfaceC1182c, float f7, C0912t c0912t, int i7) {
        c0912t.Z(-1185354661);
        if ((((c0912t.h(interfaceC1180a) ? 4 : 2) | i7 | (c0912t.f(context) ? 32 : 16) | (c0912t.h(interfaceC1182c) ? 256 : 128)) & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(-2134002978, new O0(interfaceC1180a, context, interfaceC1182c, f7, 0), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1049x(interfaceC1180a, context, interfaceC1182c, f7, i7, 1);
        }
    }

    public static final void t(InterfaceC1180a interfaceC1180a, Context context, InterfaceC1182c interfaceC1182c, float f7, C0912t c0912t, int i7) {
        c0912t.Z(-1503803524);
        if ((((c0912t.h(interfaceC1180a) ? 4 : 2) | i7 | (c0912t.f(context) ? 32 : 16) | (c0912t.h(interfaceC1182c) ? 256 : 128)) & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(-1490860071, new O0(interfaceC1180a, context, interfaceC1182c, f7, 1), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1049x(interfaceC1180a, context, interfaceC1182c, f7, i7, 0);
        }
    }

    public static final void u(C0130c c0130c, YosMediaItem yosMediaItem, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        int i8;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(41677811);
        if ((i7 & 48) == 0) {
            i8 = (c0912t2.f(yosMediaItem) ? 32 : 16) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t2.h(interfaceC1180a) ? 256 : 128;
        }
        if ((i8 & 145) == 144 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.c(c1395m, 64), 1.0f), false, null, interfaceC1180a, 15), 30, 0.0f, 2);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pI);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t2, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t2, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t2, interfaceC1398pC, c0351h4);
            yosMediaItem.getTitle();
            System.out.getClass();
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(c1395m, 48);
            float f7 = 4;
            EnumC1649c enumC1649c = EnumC1649c.f18349p;
            c0912t2.X(-1028162962);
            boolean z6 = (i8 & 112) == 32;
            Object objK = c0912t2.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = new C1008b(yosMediaItem, 1);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            AbstractC1109c.f((InterfaceC1180a) objK, interfaceC1398pG, 0.0f, null, false, f7, enumC1649c, false, c0912t2, 14159280, 304);
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(c1395m, 14, 0.0f, 0.0f, 0.0f, 14);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
            long j7 = c0912t2.f11891T;
            int i10 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pJ);
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA, c0351h);
            C0879c.y(c0912t2, interfaceC0906p0L2, c0351h2);
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h3);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, c0351h4);
            String title = yosMediaItem.getTitle();
            if (title == null) {
                title = "Unknown Work";
            }
            H0.b(title, androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 0.0f, 0.0f, 1, 7), 0L, AbstractC1109c.u(16), null, null, 0L, null, AbstractC1109c.u(16), 2, false, 1, 0, null, c0912t, 3120, 3126, 119796);
            String artistsName = YosMediaItemExtraKt.getArtistsName(yosMediaItem);
            if (artistsName == null) {
                artistsName = "Unknown Artist";
            }
            H0.b(artistsName, h.l(c1395m, 0.5f), 0L, AbstractC1109c.t(11.5d), null, null, 0L, null, AbstractC1109c.t(11.5d), 2, false, 1, 0, null, c0912t, 3120, 3126, 119796);
            c0912t2 = c0912t;
            c0912t2.p(true);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new H.I(i7, 5, c0130c, yosMediaItem, interfaceC1180a);
        }
    }

    public static final void v(C1395m c1395m, C1958H c1958h, long j3, long j7, float f7, n0.d dVar, C0912t c0912t, int i7) {
        C1395m c1395m2;
        C1958H c1958h2;
        float f8;
        C1395m c1395m3;
        C1958H c1958h3;
        float f9;
        c0912t.Z(1412203386);
        if (((i7 | 54 | (c0912t.e(j7) ? 2048 : 1024) | 221184) & 599187) == 599186 && c0912t.z()) {
            c0912t.Q();
            c1395m3 = c1395m;
            c1958h3 = c1958h;
            f9 = f7;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                c1395m2 = C1395m.f15634a;
                c1958h2 = AbstractC1959I.f20180a;
                f8 = 0;
            } else {
                c0912t.Q();
                c1395m2 = c1395m;
                c1958h2 = c1958h;
                f8 = f7;
            }
            c0912t.q();
            f0.D d4 = Y.k.f8382b;
            float f10 = ((n1.g) c0912t.j(d4)).f14511o + f8;
            C0879c.b(new C0913t0[]{Y.e.f8369a.a(new C1987t(j7)), d4.a(new n1.g(f10))}, n0.e.e(-1822160838, new q(c1395m2, c1958h2, j3, f10, f8, dVar, 0), c0912t), c0912t, 56);
            c1395m3 = c1395m2;
            c1958h3 = c1958h2;
            f9 = f8;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new Y.r(c1395m3, c1958h3, j3, j7, f9, dVar, i7);
        }
    }

    public static final void w(final B0 b0, final C1395m c1395m, final float f7, C0912t c0912t, final int i7) {
        c0912t.Z(432507350);
        int i8 = (c0912t.f(b0) ? 4 : 2) | i7 | 48;
        if ((i7 & 384) == 0) {
            i8 |= c0912t.c(f7) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            c1395m = C1395m.f15634a;
            AbstractC1110d.n(n0.e.e(281977241, new P0(f7, b0), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: h6.y
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0.B0 b02 = b0;
                    int iB = C0879c.B(i7 | 1);
                    M3.a.w(b02, c1395m, f7, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void x(Z0 z02, Context context, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0, float f7, C0912t c0912t, final int i7, final int i8) {
        float f8;
        final Z0 z03;
        final Context context2;
        final InterfaceC0878b0 interfaceC0878b03;
        final InterfaceC0878b0 interfaceC0878b04;
        final C0890h0 c0890h02;
        c0912t.Z(218098746);
        int i9 = (c0912t.f(context) ? 32 : 16) | i7 | (c0912t.f(interfaceC0878b0) ? 256 : 128) | (c0912t.f(interfaceC0878b02) ? 2048 : 1024) | (c0912t.f(c0890h0) ? 16384 : 8192);
        int i10 = i8 & 32;
        int i11 = 196608;
        if (i10 != 0) {
            i9 |= i11;
        } else if ((196608 & i7) == 0) {
            i11 = c0912t.c(f7) ? 131072 : 65536;
            i9 |= i11;
        }
        if ((i9 & 74899) == 74898 && c0912t.z()) {
            c0912t.Q();
            f8 = f7;
            c0890h02 = c0890h0;
            interfaceC0878b04 = interfaceC0878b02;
            interfaceC0878b03 = interfaceC0878b0;
            context2 = context;
            z03 = z02;
        } else {
            if (i10 != 0) {
                f7 = 30;
            }
            f8 = f7;
            R0 r02 = new R0(z02, context, interfaceC0878b0, interfaceC0878b02, c0890h0, f8);
            z03 = z02;
            context2 = context;
            interfaceC0878b03 = interfaceC0878b0;
            interfaceC0878b04 = interfaceC0878b02;
            c0890h02 = c0890h0;
            AbstractC1110d.n(n0.e.e(-1195763267, r02, c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            final float f9 = f8;
            c0915u0R.f11932d = new l5.e() { // from class: h6.n
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Z0 z04 = z03;
                    AbstractC1209k.f(z04, "$translationButtonEnabled");
                    Context context3 = context2;
                    AbstractC1209k.f(context3, "$context");
                    InterfaceC0878b0 interfaceC0878b05 = interfaceC0878b03;
                    AbstractC1209k.f(interfaceC0878b05, "$translation");
                    InterfaceC0878b0 interfaceC0878b06 = interfaceC0878b04;
                    AbstractC1209k.f(interfaceC0878b06, "$showControl");
                    C0890h0 c0890h03 = c0890h02;
                    AbstractC1209k.f(c0890h03, "$lastClickTime");
                    M3.a.x(z04, context3, interfaceC0878b05, interfaceC0878b06, c0890h03, f9, (C0912t) obj, C0879c.B(i7 | 1), i8);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void y(Context context, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C0886f0 c0886f0;
        InterfaceC1180a interfaceC1180a2;
        Context context2;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(-301096993);
        int i8 = (c0912t2.f(context) ? 4 : 2) | i7 | (c0912t2.h(interfaceC1180a) ? 32 : 16);
        if ((i8 & 19) == 18 && c0912t2.z()) {
            c0912t2.Q();
            interfaceC1180a2 = interfaceC1180a;
            context2 = context;
        } else {
            Object systemService = context.getSystemService("audio");
            AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            c0912t2.X(1454965904);
            Object objK = c0912t2.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = new C0886f0(streamVolume / streamMaxVolume);
                c0912t2.i0(objK);
            }
            C0886f0 c0886f02 = (C0886f0) objK;
            Object objR = n1.c.r(1454969670, c0912t2, false);
            if (objR == w7) {
                objR = C0879c.t(Boolean.FALSE);
                c0912t2.i0(objR);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objR;
            c0912t2.p(false);
            Z0 z0B = AbstractC1674g.b(((Boolean) interfaceC0878b0.getValue()).booleanValue() ? 1.05f : 1.0f, AbstractC1671d.k(0.6f, 200.0f, null, 4), 0.0f, null, c0912t2, 48, 28);
            Z0 z0B2 = AbstractC1674g.b(((Boolean) interfaceC0878b0.getValue()).booleanValue() ? 0.62f : 0.45f, AbstractC1671d.k(0.6f, 200.0f, null, 4), 0.0f, null, c0912t, 48, 28);
            Z0 z0A = AbstractC1674g.a(((Boolean) interfaceC0878b0.getValue()).booleanValue() ? 12 : 7, AbstractC1671d.k(0.6f, 200.0f, null, 4), c0912t, 48);
            c0912t.X(1454989887);
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                c0886f0 = c0886f02;
                objK2 = new f6.a(new F.w(streamMaxVolume, 2, c0886f0));
                c0912t.i0(objK2);
            } else {
                c0886f0 = c0886f02;
            }
            f6.a aVar = (f6.a) objK2;
            c0912t.p(false);
            IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
            Y4.o oVar = Y4.o.f8736a;
            c0912t.X(1454999198);
            boolean zF = ((i8 & 14) == 4) | c0912t.f(intentFilter);
            Object objK3 = c0912t.K();
            if (zF || objK3 == w7) {
                objK3 = new C0265j(context, aVar, intentFilter, 8);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            C0879c.d(oVar, (InterfaceC1182c) objK3, c0912t);
            C1389g c1389g = C1385c.f15622y;
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pV = AbstractC1109c.v(c0912t, c1395m);
            c0912t.X(1455017635);
            boolean zF2 = c0912t.f(z0B) | c0912t.f(z0B2);
            Object objK4 = c0912t.K();
            if (zF2 || objK4 == w7) {
                objK4 = new C1043t(z0B, z0B2, 0);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.a.j(androidx.compose.ui.graphics.a.a(interfaceC1398pV, (InterfaceC1182c) objK4), 0.0f, 0.0f, 1.5f, 0.0f, 11), 8, 0.0f, 2), 0.0f, 4, 0.0f, 2.5f, 5);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, c1389g, c0912t, 48);
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pJ);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, q0VarA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            float f7 = 20;
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_volume, c0912t), "Mute", androidx.compose.foundation.layout.c.g(c1395m, f7), 0L, c0912t, 432, 8);
            c0912t2 = c0912t;
            interfaceC1180a2 = interfaceC1180a;
            context2 = context;
            AbstractC1110d.n(n0.e.e(184797016, new U0(interfaceC0878b0, c0886f0, streamMaxVolume, audioManager, interfaceC1180a, context, z0A), c0912t2), c0912t2, 6);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_nowplaying_volume_full, c0912t2), "Max Volume", androidx.compose.foundation.layout.c.g(c1395m, f7), 0L, c0912t2, 432, 8);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(context2, interfaceC1180a2, i7, 14);
        }
    }

    public static final boolean z(BluetoothDevice bluetoothDevice) {
        Object objL;
        try {
            Method method = BluetoothDevice.class.getMethod("isConnected", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(bluetoothDevice, new Object[0]);
            AbstractC1209k.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            objL = (Boolean) objInvoke;
        } catch (Throwable th) {
            objL = android.support.v4.media.session.b.l(th);
        }
        Object obj = Boolean.FALSE;
        if (objL instanceof Y4.j) {
            objL = obj;
        }
        return ((Boolean) objL).booleanValue();
    }

    public abstract InputFilter[] R(InputFilter[] inputFilterArr);

    public abstract void d0(boolean z6);

    public abstract void e0(boolean z6);
}
