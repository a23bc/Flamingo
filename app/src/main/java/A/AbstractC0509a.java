package a;

import A2.W;
import B2.g;
import D4.k;
import E0.A;
import E0.C0094e;
import E0.C0095f;
import E0.C0096g;
import E0.C0100k;
import E0.K;
import E0.o;
import E0.u;
import G1.O;
import H.N;
import I.C0218j;
import I.w;
import K1.b;
import K1.c;
import M.E0;
import M.V;
import M.Z;
import N2.z;
import O0.C;
import O0.Y;
import R0.S0;
import S5.C0427g;
import Y0.t;
import Y4.e;
import Y4.f;
import Y4.h;
import Y4.l;
import Y4.m;
import Y4.n;
import Y4.p;
import Z1.i;
import Z1.j;
import Z1.q;
import Z1.r;
import Z4.v;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EdgeEffect;
import b1.AbstractC0607C;
import b1.C0611G;
import b1.C0613I;
import b1.C0630o;
import b1.L;
import b2.C0632B;
import b2.C0662h0;
import b2.C0679u;
import b2.o0;
import com.kyant.taglib.AudioProperties;
import com.kyant.taglib.AudioPropertiesReadStyle;
import com.kyant.taglib.TagLib;
import d1.d;
import f0.C0879c;
import f0.C0912t;
import f0.C0915u0;
import g2.C0985a;
import g2.C0986b;
import j5.AbstractC1107a;
import j5.AbstractC1110d;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.C1389g;
import t.S;
import t.y;
import u5.AbstractC1539a;
import u5.AbstractC1545g;
import u5.AbstractC1552n;
import x0.C1892b;
import x0.C1893c;
import y0.AbstractC1951A;
import y0.AbstractC1959I;
import y0.AbstractC1970c;
import y0.AbstractC1978k;
import y0.C1954D;
import y0.C1955E;
import y0.C1956F;
import y0.C1965O;
import y0.C1976i;
import y0.C1980m;
import y0.InterfaceC1985r;
import z.EnumC2048l0;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0509a implements O, d {

    /* JADX INFO: renamed from: o */
    public static Constructor f8825o;

    /* JADX INFO: renamed from: p */
    public static Method f8826p;

    /* JADX INFO: renamed from: q */
    public static Method f8827q;

    /* JADX INFO: renamed from: r */
    public static C0095f f8828r;

    /* JADX INFO: renamed from: s */
    public static C0095f f8829s;

    /* JADX INFO: renamed from: t */
    public static C0095f f8830t;

    public static float A(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int B(C0630o c0630o, long j3, S0 s02) {
        float f7 = s02 != null ? s02.f() : 0.0f;
        int i7 = (int) (4294967295L & j3);
        int iE = c0630o.e(Float.intBitsToFloat(i7));
        if (Float.intBitsToFloat(i7) < c0630o.f(iE) - f7 || Float.intBitsToFloat(i7) > c0630o.b(iE) + f7) {
            return -1;
        }
        int i8 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i8) < (-f7) || Float.intBitsToFloat(i8) > c0630o.f9990d + f7) {
            return -1;
        }
        return iE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String C(t2.L r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0509a.C(t2.L):java.lang.String");
    }

    public static final C0095f D() {
        C0095f c0095f = f8828r;
        if (c0095f != null) {
            return c0095f;
        }
        C0094e c0094e = new C0094e("PersonCropCircle", (float) 23.9062d, (float) 23.918d, 23.9062f, 23.918f, 0L, 0, false, 224);
        C1965O c1965o = new C1965O(AbstractC1959I.d(4278190080L));
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new o(0.0f, 0.0f));
        arrayList.add(new u(23.9062f));
        arrayList.add(new A(23.918f));
        arrayList.add(new u(-23.9062f));
        arrayList.add(C0100k.f1770c);
        C0094e.a(c0094e, arrayList, c1965o, 0.0f, 0.0f, 0.0f, 0, 4.0f);
        C1965O c1965o2 = new C1965O(AbstractC1959I.d(4278190080L));
        C0096g c0096g = new C0096g(0);
        c0096g.p(11.9531f, 23.9062f);
        c0096g.j(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f);
        c0096g.j(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f);
        c0096g.j(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f);
        c0096g.j(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f);
        c0096g.i();
        c0096g.p(11.9531f, 21.9141f);
        c0096g.j(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f);
        c0096g.j(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f);
        c0096g.j(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f);
        c0096g.j(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f);
        c0096g.i();
        c0096g.p(19.9688f, 19.6758f);
        c0096g.n(19.9336f, 19.5469f);
        c0096g.j(19.3594f, 17.8242f, 16.2656f, 15.9375f, 11.9531f, 15.9375f);
        c0096g.j(7.6523f, 15.9375f, 4.5586f, 17.8242f, 3.9727f, 19.5352f);
        c0096g.n(3.9375f, 19.6758f);
        c0096g.j(6.0469f, 21.7617f, 9.668f, 22.9805f, 11.9531f, 22.9805f);
        c0096g.j(14.25f, 22.9805f, 17.8359f, 21.7734f, 19.9688f, 19.6758f);
        c0096g.i();
        c0096g.p(11.9531f, 13.9453f);
        c0096g.j(14.2148f, 13.9688f, 15.9727f, 12.0469f, 15.9727f, 9.5273f);
        c0096g.j(15.9727f, 7.1602f, 14.2031f, 5.2031f, 11.9531f, 5.2031f);
        c0096g.j(9.7031f, 5.2031f, 7.9219f, 7.1602f, 7.9336f, 9.5273f);
        c0096g.j(7.9453f, 12.0469f, 9.7031f, 13.9219f, 11.9531f, 13.9453f);
        c0096g.i();
        C0094e.a(c0094e, c0096g.f1743o, c1965o2, 1.0f, 1.0f, 0.0f, 0, 4.0f);
        C0095f c0095fB = c0094e.b();
        f8828r = c0095fB;
        return c0095fB;
    }

    public static h E(String str) throws IOException {
        File file = new File(str);
        System.out.getClass();
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        try {
            AudioProperties audioProperties = TagLib.INSTANCE.getAudioProperties(parcelFileDescriptorOpen.dup().detachFd(), AudioPropertiesReadStyle.Fast);
            int bitrate = audioProperties != null ? audioProperties.getBitrate() : -1;
            int sampleRate = audioProperties != null ? audioProperties.getSampleRate() : -1;
            parcelFileDescriptorOpen.close();
            if (bitrate == -1 || sampleRate == -1) {
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        System.out.getClass();
                        mediaExtractor.setDataSource(str);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
                        AbstractC1209k.e(trackFormat, "getTrackFormat(...)");
                        if (bitrate == -1) {
                            bitrate = trackFormat.getInteger("bitrate");
                        }
                        if (sampleRate == -1) {
                            sampleRate = trackFormat.getInteger("sample-rate");
                        }
                    } catch (Throwable th) {
                        mediaExtractor.release();
                        throw th;
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                mediaExtractor.release();
            }
            return new h(Integer.valueOf(bitrate), Integer.valueOf(sampleRate));
        } finally {
        }
    }

    public static final long F(Z z6, C1893c c1893c, int i7) {
        g gVar = C0611G.f9919b;
        E0 e0D = z6.d();
        C0630o c0630o = e0D != null ? e0D.f4386a.f9930b : null;
        C c7 = z6.c();
        return (c0630o == null || c7 == null) ? L.f9943b : c0630o.h(c1893c.i(c7.x(0L)), i7, gVar);
    }

    public static final boolean I(j jVar) {
        return true;
    }

    public static final boolean J(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean L(int i7) {
        return Character.isWhitespace(i7) || i7 == 160;
    }

    public static final boolean M(int i7) {
        int type;
        return (!L(i7) || (type = Character.getType(i7)) == 14 || type == 13 || i7 == 10) ? false : true;
    }

    public static e N(f fVar, InterfaceC1180a interfaceC1180a) {
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return new m(interfaceC1180a);
        }
        n nVar = n.f8735a;
        if (iOrdinal == 1) {
            l lVar = new l();
            lVar.f8730o = interfaceC1180a;
            lVar.f8731p = nVar;
            return lVar;
        }
        if (iOrdinal != 2) {
            throw new W();
        }
        p pVar = new p();
        pVar.f8737o = interfaceC1180a;
        pVar.f8738p = nVar;
        return pVar;
    }

    public static m O(InterfaceC1180a interfaceC1180a) {
        AbstractC1209k.f(interfaceC1180a, "initializer");
        return new m(interfaceC1180a);
    }

    public static D4.j P(D4.j jVar) {
        if ((jVar instanceof D4.l) || (jVar instanceof k)) {
            return jVar;
        }
        if (jVar instanceof Serializable) {
            return new k(jVar);
        }
        D4.l lVar = new D4.l();
        lVar.f1589o = jVar;
        return lVar;
    }

    public static float R(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f7, f8);
        }
        b.a(edgeEffect, f7, f8);
        return f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F5.c S(F5.m r26) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0509a.S(F5.m):F5.c");
    }

    public static void U() throws ClassNotFoundException {
        if (f8825o == null || f8826p == null || f8827q == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f8825o = cls.getConstructor(new Class[0]);
            f8826p = cls.getMethod("setRotationDegrees", Float.TYPE);
            f8827q = cls.getMethod("build", new Class[0]);
        }
    }

    public static String W(String str) {
        return (AbstractC1545g.l0(str, '(') && AbstractC1545g.S(str, ')')) ? AbstractC1545g.h0(str, "(", ")") : AbstractC1545g.l0(str, '(') ? AbstractC1545g.P(1, str) : AbstractC1545g.S(str, ')') ? AbstractC1545g.Q(str) : str;
    }

    public static final void X(H1.e eVar, Y0.o oVar) {
        Object objG = oVar.k().f8473o.g(t.f8535f);
        if (objG == null) {
            objG = null;
        }
        Y0.b bVar = (Y0.b) objG;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2969a;
        if (bVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f8432a, bVar.f8433b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = oVar.k().f8473o.g(t.f8534e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = Y0.o.j(4, oVar);
            int size = listJ.size();
            for (int i7 = 0; i7 < size; i7++) {
                Y0.o oVar2 = (Y0.o) listJ.get(i7);
                if (oVar2.k().f8473o.c(t.f8522H)) {
                    arrayList.add(oVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM = m(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM ? 1 : arrayList.size(), zM ? arrayList.size() : 1, false, 0));
    }

    public static final void Y(H1.e eVar, Y0.o oVar) {
        Object objG = oVar.k().f8473o.g(t.f8536g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        Y0.o oVarL = oVar.l();
        if (oVarL == null) {
            return;
        }
        Object objG2 = oVarL.k().f8473o.g(t.f8534e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = oVarL.k().f8473o.g(t.f8535f);
            Y0.b bVar = (Y0.b) (objG3 != null ? objG3 : null);
            if (bVar == null || (bVar.f8432a >= 0 && bVar.f8433b >= 0)) {
                if (oVar.k().f8473o.c(t.f8522H)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = Y0.o.j(4, oVarL);
                    int size = listJ.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        Y0.o oVar2 = (Y0.o) listJ.get(i8);
                        if (oVar2.k().f8473o.c(t.f8522H)) {
                            arrayList.add(oVar2);
                            if (oVar2.f8483c.x() < oVar.f8483c.x()) {
                                i7++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM = m(arrayList);
                    int i9 = zM ? 0 : i7;
                    int i10 = zM ? i7 : 0;
                    Object objG4 = oVar.k().f8473o.g(t.f8522H);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    eVar.f2969a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, 1, i10, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final boolean Z(i iVar) {
        if (iVar instanceof C0632B) {
            return true;
        }
        if (!(iVar instanceof Z1.k)) {
            return false;
        }
        ArrayList arrayList = ((Z1.k) iVar).f8780b;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Z((i) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final String a0(String str) {
        AbstractC1209k.f(str, "<this>");
        int i7 = 0;
        int i8 = -1;
        if (!AbstractC1545g.N(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC1209k.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                AbstractC1209k.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC1209k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = lowerCase.charAt(i9);
                    if (AbstractC1209k.g(cCharAt, 31) <= 0 || AbstractC1209k.g(cCharAt, 127) >= 0 || AbstractC1545g.W(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressS = (AbstractC1552n.K(str, "[", false) && AbstractC1552n.E(str, "]", false)) ? s(str, 1, str.length() - 1) : s(str, 0, str.length());
        if (inetAddressS == null) {
            return null;
        }
        byte[] address = inetAddressS.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressS.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < address.length) {
            int i12 = i10;
            while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        C0427g c0427g = new C0427g();
        while (i7 < address.length) {
            if (i7 == i8) {
                c0427g.D(58);
                i7 += i11;
                if (i7 == 16) {
                    c0427g.D(58);
                }
            } else {
                if (i7 > 0) {
                    c0427g.D(58);
                }
                byte b7 = address[i7];
                byte[] bArr = G5.b.f2765a;
                c0427g.E(((b7 & 255) << 8) | (address[i7 + 1] & 255));
                i7 += 2;
            }
        }
        return c0427g.u(c0427g.f6785p, AbstractC1539a.f17313a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b0(B2.g r5, i2.w r6, e5.AbstractC0865c r7) {
        /*
            boolean r0 = r7 instanceof i2.N
            if (r0 == 0) goto L13
            r0 = r7
            i2.N r0 = (i2.N) r0
            int r1 = r0.f13352q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13352q = r1
            goto L18
        L13:
            i2.N r0 = new i2.N
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13351p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13352q
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            l5.e r6 = r0.f13350o
            android.support.v4.media.session.b.K(r7)     // Catch: i2.H -> L2a
            return r7
        L2a:
            r5 = move-exception
            goto L48
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            android.support.v4.media.session.b.K(r7)
            r0.f13350o = r6     // Catch: i2.H -> L2a
            r0.f13352q = r4     // Catch: i2.H -> L2a
            i2.M r7 = new i2.M     // Catch: i2.H -> L2a
            r7.<init>(r6, r5, r3)     // Catch: i2.H -> L2a
            java.lang.Object r5 = w5.AbstractC1767D.h(r7, r0)     // Catch: i2.H -> L2a
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        L48:
            int r6 = r6.hashCode()
            int r7 = r5.f13324p
            if (r7 != r6) goto L51
            return r3
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0509a.b0(B2.g, i2.w, e5.c):java.lang.Object");
    }

    public static final void d(int i7, int i8, int i9, Z1.o oVar, C0912t c0912t, n0.d dVar) {
        int i10;
        c0912t.Z(-1883910253);
        int i11 = (c0912t.f(oVar) ? 4 : 2) | i8;
        int i12 = i9 & 2;
        if (i12 != 0) {
            i10 = i11 | 48;
        } else {
            i10 = i11 | (c0912t.d(i7) ? 32 : 16);
        }
        if (((i10 | 384) & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            if (i12 != 0) {
                i7 = 0;
            }
            g2.g gVar = g2.g.f12430w;
            c0912t.Y(578571862);
            c0912t.Y(-548224868);
            if (!(c0912t.f11893a instanceof Z1.b)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(gVar);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, oVar, g2.e.f12418s);
            C0879c.y(c0912t, new C0985a(0), g2.e.f12419t);
            C0879c.y(c0912t, new C0986b(i7), g2.e.f12420u);
            dVar.d(g2.i.f12436a, c0912t, 54);
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
        }
        int i13 = i7;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new g2.h(oVar, i13, dVar, i8, i9);
        }
    }

    public static final void e(int i7, C0912t c0912t) {
        c0912t.Z(1257244356);
        if (i7 == 0 && c0912t.z()) {
            c0912t.Q();
        } else {
            int i8 = C0662h0.f10192w;
            c0912t.Y(-1115894518);
            c0912t.Y(1886828752);
            if (!(c0912t.f11893a instanceof Z1.b)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(new C0679u(0, 1));
            } else {
                c0912t.l0();
            }
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new o0(i7);
        }
    }

    public static final void g(r rVar, Z1.o oVar, int i7, C0912t c0912t, int i8, int i9) {
        int i10;
        c0912t.Z(491792371);
        if ((i8 & 6) == 0) {
            int i11 = i8 & 8;
            i10 = (c0912t.f(rVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= c0912t.f(null) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= c0912t.f(oVar) ? 256 : 128;
        }
        int i12 = i9 & 8;
        if (i12 != 0) {
            i10 |= 3072;
        } else if ((i8 & 3072) == 0) {
            i10 |= c0912t.d(i7) ? 2048 : 1024;
        }
        if (((i10 | 24576) & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
        } else {
            if (i12 != 0) {
                i7 = 1;
            }
            c0912t.Y(135631275);
            c0912t.p(false);
            Z1.p pVar = Z1.p.f8782w;
            c0912t.Y(-1115894518);
            c0912t.Y(1886828752);
            if (!(c0912t.f11893a instanceof Z1.b)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(new K(pVar));
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, rVar, Z1.e.f8757r);
            C0879c.y(c0912t, oVar, Z1.e.f8758s);
            C0879c.y(c0912t, new g2.j(i7), Z1.e.f8759t);
            C0879c.y(c0912t, null, Z1.e.f8760u);
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
        }
        int i13 = i7;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new q(rVar, oVar, i13, i8, i9);
        }
    }

    public static final int h(Z z6, long j3, S0 s02) {
        long jX;
        int iB;
        E0 e0D = z6.d();
        if (e0D != null) {
            C0630o c0630o = e0D.f4386a.f9930b;
            C c7 = z6.c();
            if (c7 != null && (iB = B(c0630o, (jX = c7.x(j3)), s02)) != -1) {
                return c0630o.g(C1892b.a(jX, (c0630o.b(iB) + c0630o.f(iB)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long i(Z z6, C1893c c1893c, C1893c c1893c2, int i7) {
        long jF = F(z6, c1893c, i7);
        if (L.c(jF)) {
            return L.f9943b;
        }
        long jF2 = F(z6, c1893c2, i7);
        if (L.c(jF2)) {
            return L.f9943b;
        }
        int i8 = (int) (jF >> 32);
        int i9 = (int) (jF2 & 4294967295L);
        return AbstractC0607C.b(Math.min(i8, i8), Math.max(i9, i9));
    }

    public static final boolean k(C0613I c0613i, int i7) {
        C0630o c0630o = c0613i.f9930b;
        int iD = c0630o.d(i7);
        return i7 == c0613i.h(iD) || i7 == c0630o.c(iD, false) ? c0613i.i(i7) != c0613i.a(i7) : c0613i.a(i7) != c0613i.a(i7 - 1);
    }

    public static final long l(PointF pointF) {
        float f7 = pointF.x;
        float f8 = pointF.y;
        return (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
    }

    public static final boolean m(ArrayList arrayList) {
        List list;
        long j3;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = v.f8818o;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iD0 = Z4.o.d0(arrayList);
                int i7 = 0;
                while (i7 < iD0) {
                    i7++;
                    Object obj2 = arrayList.get(i7);
                    Y0.o oVar = (Y0.o) obj2;
                    Y0.o oVar2 = (Y0.o) obj;
                    arrayList2.add(new C1892b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (oVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (oVar.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (oVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (oVar.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j3 = ((C1892b) Z4.n.q0(list)).f19867a;
            } else {
                if (list.isEmpty()) {
                    p1.a.b("Empty collection can't be reduced.");
                }
                Object objQ0 = Z4.n.q0(list);
                int iD02 = Z4.o.d0(list);
                if (1 <= iD02) {
                    int i8 = 1;
                    while (true) {
                        objQ0 = new C1892b(C1892b.h(((C1892b) objQ0).f19867a, ((C1892b) list.get(i8)).f19867a));
                        if (i8 == iD02) {
                            break;
                        }
                        i8++;
                    }
                }
                j3 = ((C1892b) objQ0).f19867a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j3)) >= Float.intBitsToFloat((int) (j3 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static List p(d6.e[] eVarArr, boolean z6) {
        d6.a aVar;
        if (eVarArr == null) {
            return v.f8818o;
        }
        ArrayList arrayList = new ArrayList(eVarArr.length);
        int length = eVarArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            d6.e eVar = eVarArr[i7];
            int i9 = i8 + 1;
            String str = eVar.f11288c;
            AbstractC1209k.e(str, "Word");
            if (AbstractC1552n.E(str, " ", false)) {
                String str2 = eVar.f11288c;
                AbstractC1209k.e(str2, "Word");
                String strQ = AbstractC1545g.Q(str2);
                aVar = (z6 && (i8 == 0 || i8 == eVarArr.length + (-1))) ? new d6.a(eVar.f11286a, eVar.f11287b, W(strQ), true) : new d6.a(eVar.f11286a, eVar.f11287b, strQ, true);
            } else if (z6 && (i8 == 0 || i8 == eVarArr.length - 1)) {
                long j3 = eVar.f11286a;
                long j7 = eVar.f11287b;
                String str3 = eVar.f11288c;
                AbstractC1209k.e(str3, "Word");
                aVar = new d6.a(j3, j7, W(str3), eVar.f11289d);
            } else {
                long j8 = eVar.f11286a;
                long j9 = eVar.f11287b;
                String str4 = eVar.f11288c;
                if (str4 == null) {
                    str4 = "";
                }
                aVar = new d6.a(j8, j9, str4, eVar.f11289d);
            }
            arrayList.add(aVar);
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    public static T1.r q(Context context) {
        ProviderInfo providerInfo;
        C1.f fVar;
        ApplicationInfo applicationInfo;
        z cVar = Build.VERSION.SDK_INT >= 28 ? new T1.c() : new z();
        PackageManager packageManager = context.getPackageManager();
        N5.d.r(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            fVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrR = cVar.r(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrR) {
                    arrayList.add(signature.toByteArray());
                }
                fVar = new C1.f(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                fVar = null;
            }
        }
        if (fVar == null) {
            return null;
        }
        return new T1.r(new T1.q(context, fVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress s(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0509a.s(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final void t(A0.f fVar, B0.d dVar) {
        boolean z6;
        boolean z7;
        Canvas canvas;
        boolean z8;
        float f7;
        InterfaceC1985r interfaceC1985rS = fVar.A().S();
        B0.d dVar2 = (B0.d) fVar.A().f51q;
        if (dVar.f631s) {
            return;
        }
        dVar.a();
        B0.f fVar2 = dVar.f615a;
        if (!fVar2.J()) {
            try {
                fVar2.c(dVar.f616b, dVar.f617c, dVar, dVar.f619e);
            } catch (Throwable unused) {
            }
        }
        boolean z9 = fVar2.I() > 0.0f;
        if (z9) {
            interfaceC1985rS.s();
        }
        Canvas canvasA = AbstractC1970c.a(interfaceC1985rS);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j3 = dVar.f632t;
            float f8 = (int) (j3 >> 32);
            float f9 = (int) (j3 & 4294967295L);
            long j7 = dVar.f633u;
            float f10 = ((int) (j7 >> 32)) + f8;
            float f11 = ((int) (j7 & 4294967295L)) + f9;
            float fA = fVar2.a();
            C1980m c1980mX = fVar2.x();
            int iM = fVar2.M();
            if (fA < 1.0f || iM != 3 || c1980mX != null || fVar2.v() == 1) {
                w2.l lVarG = dVar.f628p;
                if (lVarG == null) {
                    lVarG = AbstractC1959I.g();
                    dVar.f628p = lVarG;
                }
                lVarG.f(fA);
                lVarG.g(iM);
                lVarG.i(c1980mX);
                canvasA = canvasA;
                f7 = f8;
                canvasA.saveLayer(f7, f9, f10, f11, (Paint) lVarG.f18861b);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f7 = f8;
            }
            canvasA.translate(f7, f9);
            canvasA.concat(fVar2.D());
        }
        boolean z10 = !zIsHardwareAccelerated && dVar.f635w;
        if (z10) {
            interfaceC1985rS.l();
            AbstractC1959I abstractC1959ID = dVar.d();
            if (abstractC1959ID instanceof C1955E) {
                interfaceC1985rS.a(((C1955E) abstractC1959ID).f20176e);
            } else if (abstractC1959ID instanceof C1956F) {
                C1976i c1976iA = dVar.f625m;
                if (c1976iA != null) {
                    c1976iA.f20241a.rewind();
                } else {
                    c1976iA = AbstractC1978k.a();
                    dVar.f625m = c1976iA;
                }
                n1.c.m(c1976iA, ((C1956F) abstractC1959ID).f20177e);
                interfaceC1985rS.b(c1976iA);
            } else {
                if (!(abstractC1959ID instanceof C1954D)) {
                    throw new W();
                }
                interfaceC1985rS.b(((C1954D) abstractC1959ID).f20175e);
            }
        }
        if (dVar2 != null) {
            B0.a aVar = dVar2.f630r;
            if (!aVar.f605a) {
                AbstractC1951A.a("Only add dependencies during a tracking");
            }
            t.K k7 = (t.K) aVar.f608d;
            if (k7 != null) {
                k7.a(dVar);
            } else if (((B0.d) aVar.f606b) != null) {
                t.K k8 = S.f16033a;
                t.K k9 = new t.K();
                B0.d dVar3 = (B0.d) aVar.f606b;
                AbstractC1209k.c(dVar3);
                k9.a(dVar3);
                k9.a(dVar);
                aVar.f608d = k9;
                aVar.f606b = null;
            } else {
                aVar.f606b = dVar;
            }
            t.K k10 = (t.K) aVar.f609e;
            if (k10 != null) {
                z8 = !k10.l(dVar);
            } else if (((B0.d) aVar.f607c) != dVar) {
                z8 = true;
            } else {
                aVar.f607c = null;
                z8 = false;
            }
            if (z8) {
                dVar.f629q++;
            }
        }
        if (AbstractC1970c.a(interfaceC1985rS).isHardwareAccelerated()) {
            z6 = z9;
            z7 = z10;
            canvas = canvasA;
            fVar2.E(interfaceC1985rS);
        } else {
            A0.c cVar = dVar.f627o;
            if (cVar == null) {
                cVar = new A0.c();
                dVar.f627o = cVar;
            }
            n1.d dVar4 = dVar.f616b;
            n1.n nVar = dVar.f617c;
            long jE = AbstractC1107a.E(dVar.f633u);
            A0.b bVar = cVar.f54p;
            n1.d dVarU = bVar.U();
            n1.n nVarV = bVar.V();
            InterfaceC1985r interfaceC1985rS2 = bVar.S();
            z7 = z10;
            canvas = canvasA;
            long jW = bVar.W();
            z6 = z9;
            B0.d dVar5 = (B0.d) bVar.f51q;
            bVar.n0(dVar4);
            bVar.o0(nVar);
            bVar.m0(interfaceC1985rS);
            bVar.p0(jE);
            bVar.f51q = dVar;
            interfaceC1985rS.l();
            try {
                dVar.c(cVar);
            } finally {
                interfaceC1985rS.k();
                bVar.n0(dVarU);
                bVar.o0(nVarV);
                bVar.m0(interfaceC1985rS2);
                bVar.p0(jW);
                bVar.f51q = dVar5;
            }
        }
        if (z7) {
            interfaceC1985rS.k();
        }
        if (z6) {
            interfaceC1985rS.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static final long u(long j3, boolean z6, int i7, float f7) {
        int iH = ((z6 || i7 == 2 || i7 == 4 || i7 == 5) && n1.a.d(j3)) ? n1.a.h(j3) : Integer.MAX_VALUE;
        if (n1.a.j(j3) != iH) {
            iH = i6.h.q(V.k(f7), n1.a.j(j3), iH);
        }
        return AbstractC1110d.y(0, iH, 0, n1.a.g(j3));
    }

    public static final C0218j w(N n7, int i7, long j3, w wVar, long j7, C1389g c1389g, n1.n nVar, int i8, y yVar) {
        List list;
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        Object objB = wVar.b(i7);
        List list2 = (List) yVar.b(i7);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = n7.a(i7);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(((Y) listA.get(i9)).d(j3));
            }
            yVar.h(i7, arrayList);
            list = arrayList;
        }
        return new C0218j(i7, i8, list, j7, objB, c1389g, nVar);
    }

    public static final int x(f1.k kVar, int i7) {
        boolean z6 = AbstractC1209k.g(kVar.f12008o, f1.k.f11998p.f12008o) >= 0;
        boolean z7 = i7 == 1;
        if (z7 && z6) {
            return 3;
        }
        if (z6) {
            return 1;
        }
        return z7 ? 2 : 0;
    }

    public static int z(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public abstract String[] G(Class cls);

    public U0.a H(Context context, Cloneable cloneable) {
        return null;
    }

    public abstract boolean K(Class cls);

    public abstract int Q(int i7);

    public abstract Object T(Intent intent, int i7);

    public abstract int V(int i7);

    @Override // d1.d
    public int f(int i7) {
        return V(i7);
    }

    @Override // d1.d
    public int j(int i7) {
        return Q(i7);
    }

    @Override // d1.d
    public int n(int i7) {
        int iQ = Q(i7);
        if (iQ == -1 || Q(iQ) == -1) {
            return -1;
        }
        return iQ;
    }

    @Override // d1.d
    public int o(int i7) {
        int iV = V(i7);
        if (iV == -1 || V(iV) == -1) {
            return -1;
        }
        return iV;
    }

    public abstract Intent r(Context context, Cloneable cloneable);

    public abstract Method v(Class cls, Field field);

    public abstract Constructor y(Class cls);

    @Override // G1.O
    public void b() {
    }

    @Override // G1.O
    public void c() {
    }
}
