package d;

import D.D0;
import N2.C0293j;
import a.AbstractC0509a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0593p;
import i1.C1058a;
import i1.C1059b;
import i1.InterfaceC1060c;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o3.C1262b;
import p0.AbstractC1289f;
import p0.C1282C;
import p0.C1283D;
import p0.C1285b;
import p3.C1294a;
import q3.C1374e;
import r3.C1416a;
import t.C1465u;
import t.Q;
import t2.C1487p;
import v2.C1635b;
import w2.AbstractC1697a;
import w3.C1760y;
import w3.InterfaceC1756w;
import w3.v1;
import w3.z1;
import y0.C1952B;
import y0.C1987t;
import y3.C2019h;

/* JADX INFO: renamed from: d.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0746L implements InterfaceC1060c, i3.g, k3.k, o4.e, p.w, c5.h, InterfaceC1756w {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f10748o;

    public /* synthetic */ C0746L(int i7) {
        this.f10748o = i7;
    }

    public static void C() {
        boolean z6;
        synchronized (p0.l.f14941c) {
            t.K k7 = p0.l.f14947j.h;
            z6 = false;
            if (k7 != null) {
                if (k7.h()) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p0.l.a();
        }
    }

    public static C1952B D(int i7, List list) {
        return new C1952B(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    public static final float i(float f7, float[] fArr, float[] fArr2) {
        float f8;
        float f9;
        float f10;
        float f11;
        float fAbs = Math.abs(f7);
        float fSignum = Math.signum(f7);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i7 = -(iBinarySearch + 1);
        int i8 = i7 - 1;
        if (i8 >= fArr.length - 1) {
            float f12 = fArr[fArr.length - 1];
            float f13 = fArr2[fArr.length - 1];
            if (f12 == 0.0f) {
                return 0.0f;
            }
            return (f13 / f12) * f7;
        }
        if (i8 == -1) {
            float f14 = fArr[0];
            f10 = fArr2[0];
            f11 = f14;
            f9 = 0.0f;
            f8 = 0.0f;
        } else {
            float f15 = fArr[i8];
            float f16 = fArr[i7];
            f8 = fArr2[i8];
            f9 = f15;
            f10 = fArr2[i7];
            f11 = f16;
        }
        return (((f10 - f8) * Math.max(0.0f, Math.min(1.0f, f9 == f11 ? 0.0f : (fAbs - f9) / (f11 - f9)))) + f8) * fSignum;
    }

    public static C2019h j(Context context, y3.s sVar, Bundle bundle, EnumC0593p enumC0593p, y3.m mVar) {
        String string = UUID.randomUUID().toString();
        AbstractC1209k.e(string, "randomUUID().toString()");
        AbstractC1209k.f(sVar, "destination");
        AbstractC1209k.f(enumC0593p, "hostLifecycleState");
        return new C2019h(context, sVar, bundle, enumC0593p, mVar, string, null);
    }

    public static Typeface l(String str, f1.k kVar, int i7) {
        if (i7 == 0 && AbstractC1209k.a(kVar, f1.k.f12002t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f12008o, i7 == 1);
    }

    public static Typeface n(String str, f1.k kVar, int i7) {
        if (i7 == 0 && AbstractC1209k.a(kVar, f1.k.f12002t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iX = AbstractC0509a.x(kVar, i7);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iX) : Typeface.create(str, iX);
    }

    public static byte[] p(E4.I i7, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i7.size());
        Iterator<E> it = i7.iterator();
        while (it.hasNext()) {
            C1635b c1635b = (C1635b) it.next();
            Bundle bundleB = c1635b.b();
            Bitmap bitmap = c1635b.f18259d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AbstractC1697a.i(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleB.putByteArray(C1635b.f18252w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleB);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static AbstractC1289f q() {
        return (AbstractC1289f) p0.l.f14940b.R();
    }

    public static C1952B r(Y4.h[] hVarArr) {
        Y4.h[] hVarArr2 = (Y4.h[]) Arrays.copyOf(hVarArr, hVarArr.length);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        ArrayList arrayList = new ArrayList(hVarArr2.length);
        for (Y4.h hVar : hVarArr2) {
            arrayList.add(new C1987t(((C1987t) hVar.f8727p).f20264a));
        }
        ArrayList arrayList2 = new ArrayList(hVarArr2.length);
        for (Y4.h hVar2 : hVarArr2) {
            arrayList2.add(Float.valueOf(((Number) hVar2.f8726o).floatValue()));
        }
        return new C1952B(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2);
    }

    public static C1952B t(List list) {
        return new C1952B(list, null, 0L, 9187343241974906880L);
    }

    public static AbstractC1289f w(AbstractC1289f abstractC1289f) {
        if (abstractC1289f instanceof C1282C) {
            C1282C c1282c = (C1282C) abstractC1289f;
            if (c1282c.f14900t == n0.e.c()) {
                c1282c.f14898r = null;
                return abstractC1289f;
            }
        }
        if (abstractC1289f instanceof C1283D) {
            C1283D c1283d = (C1283D) abstractC1289f;
            if (c1283d.f14904i == n0.e.c()) {
                c1283d.h = null;
                return abstractC1289f;
            }
        }
        AbstractC1289f abstractC1289fH = p0.l.h(abstractC1289f, null, false);
        abstractC1289fH.j();
        return abstractC1289fH;
    }

    public static Object x(InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c) {
        AbstractC1289f c1282c;
        if (interfaceC1182c == null) {
            return interfaceC1180a.a();
        }
        AbstractC1289f abstractC1289f = (AbstractC1289f) p0.l.f14940b.R();
        if (abstractC1289f instanceof C1282C) {
            C1282C c1282c2 = (C1282C) abstractC1289f;
            if (c1282c2.f14900t == n0.e.c()) {
                InterfaceC1182c interfaceC1182c2 = c1282c2.f14898r;
                InterfaceC1182c interfaceC1182c3 = c1282c2.f14899s;
                try {
                    ((C1282C) abstractC1289f).f14898r = p0.l.l(interfaceC1182c, interfaceC1182c2, true);
                    ((C1282C) abstractC1289f).f14899s = interfaceC1182c3;
                    return interfaceC1180a.a();
                } finally {
                    c1282c2.f14898r = interfaceC1182c2;
                    c1282c2.f14899s = interfaceC1182c3;
                }
            }
        }
        if (abstractC1289f == null || (abstractC1289f instanceof C1285b)) {
            c1282c = new C1282C(abstractC1289f instanceof C1285b ? (C1285b) abstractC1289f : null, interfaceC1182c, null, true, false);
        } else {
            if (interfaceC1182c == null) {
                return interfaceC1180a.a();
            }
            c1282c = abstractC1289f.u(interfaceC1182c);
        }
        try {
            AbstractC1289f abstractC1289fJ = c1282c.j();
            try {
                Object objA = interfaceC1180a.a();
                AbstractC1289f.q(abstractC1289fJ);
                return objA;
            } catch (Throwable th) {
                AbstractC1289f.q(abstractC1289fJ);
                throw th;
            }
        } finally {
            c1282c.c();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public static A2.I y(D0 d02) {
        p0.l.f(p0.l.f14939a);
        synchronized (p0.l.f14941c) {
            p0.l.h = Z4.n.C0(p0.l.h, d02);
        }
        return new A2.I(20, d02);
    }

    public static void z(AbstractC1289f abstractC1289f, AbstractC1289f abstractC1289f2, InterfaceC1182c interfaceC1182c) {
        if (abstractC1289f != abstractC1289f2) {
            abstractC1289f2.getClass();
            AbstractC1289f.q(abstractC1289f);
            abstractC1289f2.c();
        } else if (abstractC1289f instanceof C1282C) {
            ((C1282C) abstractC1289f).f14898r = interfaceC1182c;
        } else if (abstractC1289f instanceof C1283D) {
            ((C1283D) abstractC1289f).h = interfaceC1182c;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC1289f).toString());
        }
    }

    @Override // w3.InterfaceC1756w
    public I4.v A(C1760y c1760y, v1 v1Var, Bundle bundle) {
        return M3.a.U(new z1(-6));
    }

    @Override // p.w
    public boolean B(p.l lVar) {
        return false;
    }

    @Override // i1.InterfaceC1060c
    public Locale I(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        AbstractC1209k.a(localeForLanguageTag.toLanguageTag(), "und");
        return localeForLanguageTag;
    }

    @Override // w3.InterfaceC1756w
    public /* synthetic */ void a() {
    }

    @Override // k3.k
    public int c(C1487p c1487p) {
        switch (this.f10748o) {
            case 12:
                String str = c1487p.f16701m;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                        case "application/pgs":
                        case "application/x-mp4-vtt":
                        case "application/x-quicktime-tx3g":
                            return 2;
                        case "text/vtt":
                        case "text/x-ssa":
                        case "application/x-subrip":
                        case "application/ttml+xml":
                            return 1;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: " + str);
            default:
                return 1;
        }
    }

    @Override // k3.k
    public k3.m d(C1487p c1487p) {
        List list;
        k3.m hVar;
        switch (this.f10748o) {
            case 12:
                String str = c1487p.f16701m;
                if (str != null) {
                    list = c1487p.f16704p;
                    switch (str) {
                        case "application/dvbsubs":
                            hVar = new m3.h(list);
                            break;
                        case "application/pgs":
                            return new U3.h(9);
                        case "application/x-mp4-vtt":
                            return new N2.w(1);
                        case "text/vtt":
                            return new V1.a(17);
                        case "application/x-quicktime-tx3g":
                            hVar = new C1416a(list);
                            break;
                        case "text/x-ssa":
                            hVar = new C1262b(list);
                            break;
                        case "application/x-subrip":
                            return new C1294a();
                        case "application/ttml+xml":
                            return new C1374e();
                    }
                    return hVar;
                }
                throw new IllegalArgumentException("Unsupported MIME type: " + str);
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // i3.g
    public long e(C0293j c0293j) {
        return -1L;
    }

    @Override // i3.g
    public N2.B f() {
        return new N2.r(-9223372036854775807L);
    }

    @Override // k3.k
    public boolean g(C1487p c1487p) {
        switch (this.f10748o) {
            case 12:
                String str = c1487p.f16701m;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // w3.InterfaceC1756w
    public /* synthetic */ void k() {
    }

    @Override // w3.InterfaceC1756w
    public I4.v m(C1760y c1760y, List list) {
        return M3.a.U(new z1(-6));
    }

    public Typeface o(f1.m mVar, f1.k kVar, int i7) {
        switch (this.f10748o) {
            case 4:
                return l(mVar.f12010d, kVar, i7);
            default:
                String strConcat = mVar.f12010d;
                int i8 = kVar.f12008o / 100;
                if (i8 >= 0 && i8 < 2) {
                    strConcat = strConcat.concat("-thin");
                } else if (2 <= i8 && i8 < 4) {
                    strConcat = strConcat.concat("-light");
                } else if (i8 != 4) {
                    if (i8 == 5) {
                        strConcat = strConcat.concat("-medium");
                    } else if ((6 > i8 || i8 >= 8) && 8 <= i8 && i8 < 11) {
                        strConcat = strConcat.concat("-black");
                    }
                }
                Typeface typeface = null;
                if (strConcat.length() != 0) {
                    Typeface typefaceN = n(strConcat, kVar, i7);
                    if (!AbstractC1209k.a(typefaceN, Typeface.create(Typeface.DEFAULT, AbstractC0509a.x(kVar, i7))) && !AbstractC1209k.a(typefaceN, n(null, kVar, i7))) {
                        typeface = typefaceN;
                    }
                }
                return typeface == null ? n(mVar.f12010d, kVar, i7) : typeface;
        }
    }

    @Override // i1.InterfaceC1060c
    public C1059b s() {
        return new C1059b(I0.c.G(new C1058a(Locale.getDefault())));
    }

    public String toString() {
        switch (this.f10748o) {
            case 18:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // w3.InterfaceC1756w
    public /* synthetic */ void u() {
    }

    @Override // o4.e
    public boolean v() {
        return true;
    }

    public C0746L() {
        this.f10748o = 3;
        new C1465u(16);
        long[] jArr = Q.f16032a;
        new t.J();
    }

    @Override // o4.e
    public void shutdown() {
    }

    @Override // i3.g
    public void h(long j3) {
    }

    @Override // p.w
    public void b(p.l lVar, boolean z6) {
    }
}
