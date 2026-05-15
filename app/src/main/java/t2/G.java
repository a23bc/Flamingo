package t2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import q.S0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: g */
    public static final G f16218g;
    public static final String h;

    /* JADX INFO: renamed from: i */
    public static final String f16219i;

    /* JADX INFO: renamed from: j */
    public static final String f16220j;

    /* JADX INFO: renamed from: k */
    public static final String f16221k;
    public static final String l;

    /* JADX INFO: renamed from: m */
    public static final String f16222m;

    /* JADX INFO: renamed from: a */
    public final String f16223a;

    /* JADX INFO: renamed from: b */
    public final C1469B f16224b;

    /* JADX INFO: renamed from: c */
    public final C1468A f16225c;

    /* JADX INFO: renamed from: d */
    public final J f16226d;

    /* JADX INFO: renamed from: e */
    public final C1494x f16227e;

    /* JADX INFO: renamed from: f */
    public final C1470C f16228f;

    static {
        C1492v c1492v = new C1492v();
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var2 = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        f16218g = new G("", new C1494x(c1492v), null, new C1468A(c1496z), J.f16263J, C1470C.f16192d);
        h = Integer.toString(0, 36);
        f16219i = Integer.toString(1, 36);
        f16220j = Integer.toString(2, 36);
        f16221k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        f16222m = Integer.toString(5, 36);
    }

    public G(String str, C1494x c1494x, C1469B c1469b, C1468A c1468a, J j3, C1470C c1470c) {
        this.f16223a = str;
        this.f16224b = c1469b;
        this.f16225c = c1468a;
        this.f16226d = j3;
        this.f16227e = c1494x;
        this.f16228f = c1470c;
    }

    public static G a(Bundle bundle) {
        C1494x c1494x;
        C1470C c1470c;
        Map mapB;
        C1495y c1495y;
        C1491u c1491u;
        E4.b0 b0VarF;
        E4.b0 b0VarO;
        C1469B c1469b;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f16219i);
        C1468A c1468aB = bundle2 == null ? C1468A.f16168f : C1468A.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f16220j);
        J jB = bundle3 == null ? J.f16263J : J.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f16221k);
        if (bundle4 == null) {
            c1494x = C1494x.f16757p;
        } else {
            C1492v c1492v = new C1492v();
            C1493w c1493w = C1493w.h;
            long jD = w2.t.D(bundle4.getLong(C1493w.f16744i, c1493w.f16750a));
            AbstractC1697a.d(jD >= 0);
            c1492v.f16739a = jD;
            long jD2 = w2.t.D(bundle4.getLong(C1493w.f16745j, c1493w.f16752c));
            AbstractC1697a.d(jD2 == Long.MIN_VALUE || jD2 >= 0);
            c1492v.f16740b = jD2;
            c1492v.f16741c = bundle4.getBoolean(C1493w.f16746k, c1493w.f16754e);
            c1492v.f16742d = bundle4.getBoolean(C1493w.l, c1493w.f16755f);
            c1492v.f16743e = bundle4.getBoolean(C1493w.f16747m, c1493w.f16756g);
            String str = C1493w.f16748n;
            long j3 = c1493w.f16751b;
            long j7 = bundle4.getLong(str, j3);
            if (j7 != j3) {
                AbstractC1697a.d(j7 >= 0);
                c1492v.f16739a = j7;
            }
            String str2 = C1493w.f16749o;
            long j8 = c1493w.f16753d;
            long j9 = bundle4.getLong(str2, j8);
            if (j9 != j8) {
                AbstractC1697a.d(j9 == Long.MIN_VALUE || j9 >= 0);
                c1492v.f16740b = j9;
            }
            c1494x = new C1494x(c1492v);
        }
        C1494x c1494x2 = c1494x;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            c1470c = C1470C.f16192d;
        } else {
            S0 s02 = new S0();
            s02.f15225p = (Uri) bundle5.getParcelable(C1470C.f16193e);
            s02.f15226q = bundle5.getString(C1470C.f16194f);
            s02.f15227r = bundle5.getBundle(C1470C.f16195g);
            c1470c = new C1470C(s02);
        }
        C1470C c1470c2 = c1470c;
        Bundle bundle6 = bundle.getBundle(f16222m);
        if (bundle6 == null) {
            c1469b = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(C1469B.f16180k);
            if (bundle7 == null) {
                c1495y = null;
            } else {
                String string2 = bundle7.getString(C1495y.f16758i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(C1495y.f16759j);
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(C1495y.f16760k);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapB = E4.g0.f1938u;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapB = E4.K.b(map);
                }
                boolean z6 = bundle7.getBoolean(C1495y.l, false);
                boolean z7 = bundle7.getBoolean(C1495y.f16761m, false);
                boolean z8 = bundle7.getBoolean(C1495y.f16762n, false);
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(C1495y.f16763o);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                E4.I iP = E4.I.p(arrayList);
                byte[] byteArray = bundle7.getByteArray(C1495y.f16764p);
                C2.I i7 = new C2.I(2);
                i7.f984d = uuidFromString;
                i7.f985e = uri;
                i7.f986f = E4.K.b(mapB);
                i7.f981a = z6;
                i7.f983c = z8;
                i7.f982b = z7;
                i7.f987g = E4.I.p(iP);
                i7.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                c1495y = new C1495y(i7);
            }
            Bundle bundle10 = bundle6.getBundle(C1469B.l);
            if (bundle10 == null) {
                c1491u = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(C1491u.f16737b);
                uri2.getClass();
                S s7 = new S();
                s7.f16352a = uri2;
                c1491u = new C1491u(s7);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(C1469B.f16181m);
            if (parcelableArrayList == null) {
                E4.G g6 = E4.I.f1870p;
                b0VarF = E4.b0.f1913s;
            } else {
                E4.F fO = E4.I.o();
                for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i8);
                    bundle11.getClass();
                    fO.a(new a0(bundle11.getInt(a0.f16392r, 0), bundle11.getInt(a0.f16393s, 0), bundle11.getInt(a0.f16394t, 0)));
                }
                b0VarF = fO.f();
            }
            E4.b0 b0Var = b0VarF;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(C1469B.f16183o);
            if (parcelableArrayList2 == null) {
                E4.G g7 = E4.I.f1870p;
                b0VarO = E4.b0.f1913s;
            } else {
                b0VarO = AbstractC1697a.o(new B2.g(29), parcelableArrayList2);
            }
            E4.b0 b0Var2 = b0VarO;
            long j10 = bundle6.getLong(C1469B.f16184p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(C1469B.f16178i);
            uri3.getClass();
            c1469b = new C1469B(uri3, bundle6.getString(C1469B.f16179j), c1495y, c1491u, b0Var, bundle6.getString(C1469B.f16182n), b0Var2, j10);
        }
        return new G(string, c1494x2, c1469b, c1468aB, jB, c1470c2);
    }

    public final Bundle b(boolean z6) {
        C1469B c1469b;
        Bundle bundle = new Bundle();
        String str = this.f16223a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        C1468A c1468a = C1468A.f16168f;
        C1468A c1468a2 = this.f16225c;
        if (!c1468a2.equals(c1468a)) {
            bundle.putBundle(f16219i, c1468a2.c());
        }
        J j3 = J.f16263J;
        J j7 = this.f16226d;
        if (!j7.equals(j3)) {
            bundle.putBundle(f16220j, j7.c());
        }
        C1493w c1493w = C1493w.h;
        C1494x c1494x = this.f16227e;
        if (!c1494x.equals(c1493w)) {
            Bundle bundle2 = new Bundle();
            long j8 = c1493w.f16750a;
            long j9 = c1494x.f16750a;
            if (j9 != j8) {
                bundle2.putLong(C1493w.f16744i, j9);
            }
            long j10 = c1493w.f16752c;
            long j11 = c1494x.f16752c;
            if (j11 != j10) {
                bundle2.putLong(C1493w.f16745j, j11);
            }
            long j12 = c1493w.f16751b;
            long j13 = c1494x.f16751b;
            if (j13 != j12) {
                bundle2.putLong(C1493w.f16748n, j13);
            }
            long j14 = c1493w.f16753d;
            long j15 = c1494x.f16753d;
            if (j15 != j14) {
                bundle2.putLong(C1493w.f16749o, j15);
            }
            boolean z7 = c1493w.f16754e;
            boolean z8 = c1494x.f16754e;
            if (z8 != z7) {
                bundle2.putBoolean(C1493w.f16746k, z8);
            }
            boolean z9 = c1493w.f16755f;
            boolean z10 = c1494x.f16755f;
            if (z10 != z9) {
                bundle2.putBoolean(C1493w.l, z10);
            }
            boolean z11 = c1493w.f16756g;
            boolean z12 = c1494x.f16756g;
            if (z12 != z11) {
                bundle2.putBoolean(C1493w.f16747m, z12);
            }
            bundle.putBundle(f16221k, bundle2);
        }
        C1470C c1470c = C1470C.f16192d;
        C1470C c1470c2 = this.f16228f;
        if (!c1470c2.equals(c1470c)) {
            Bundle bundle3 = new Bundle();
            Uri uri = c1470c2.f16196a;
            if (uri != null) {
                bundle3.putParcelable(C1470C.f16193e, uri);
            }
            String str2 = c1470c2.f16197b;
            if (str2 != null) {
                bundle3.putString(C1470C.f16194f, str2);
            }
            Bundle bundle4 = c1470c2.f16198c;
            if (bundle4 != null) {
                bundle3.putBundle(C1470C.f16195g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z6 && (c1469b = this.f16224b) != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(C1469B.f16178i, c1469b.f16185a);
            String str3 = c1469b.f16186b;
            if (str3 != null) {
                bundle5.putString(C1469B.f16179j, str3);
            }
            C1495y c1495y = c1469b.f16187c;
            if (c1495y != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(C1495y.f16758i, c1495y.f16765a.toString());
                Uri uri2 = c1495y.f16766b;
                if (uri2 != null) {
                    bundle6.putParcelable(C1495y.f16759j, uri2);
                }
                E4.K k7 = c1495y.f16767c;
                if (!k7.isEmpty()) {
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k7.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(C1495y.f16760k, bundle7);
                }
                boolean z13 = c1495y.f16768d;
                if (z13) {
                    bundle6.putBoolean(C1495y.l, z13);
                }
                boolean z14 = c1495y.f16769e;
                if (z14) {
                    bundle6.putBoolean(C1495y.f16761m, z14);
                }
                boolean z15 = c1495y.f16770f;
                if (z15) {
                    bundle6.putBoolean(C1495y.f16762n, z15);
                }
                E4.I i7 = c1495y.f16771g;
                if (!i7.isEmpty()) {
                    bundle6.putIntegerArrayList(C1495y.f16763o, new ArrayList<>(i7));
                }
                byte[] bArr = c1495y.h;
                if (bArr != null) {
                    bundle6.putByteArray(C1495y.f16764p, bArr);
                }
                bundle5.putBundle(C1469B.f16180k, bundle6);
            }
            C1491u c1491u = c1469b.f16188d;
            if (c1491u != null) {
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(C1491u.f16737b, c1491u.f16738a);
                bundle5.putBundle(C1469B.l, bundle8);
            }
            List list = c1469b.f16189e;
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(C1469B.f16181m, AbstractC1697a.v(list, new B2.g(27)));
            }
            String str4 = c1469b.f16190f;
            if (str4 != null) {
                bundle5.putString(C1469B.f16182n, str4);
            }
            E4.I i8 = c1469b.f16191g;
            if (!i8.isEmpty()) {
                bundle5.putParcelableArrayList(C1469B.f16183o, AbstractC1697a.v(i8, new B2.g(28)));
            }
            long j16 = c1469b.h;
            if (j16 != -9223372036854775807L) {
                bundle5.putLong(C1469B.f16184p, j16);
            }
            bundle.putBundle(f16222m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g6 = (G) obj;
        return w2.t.a(this.f16223a, g6.f16223a) && this.f16227e.equals(g6.f16227e) && w2.t.a(this.f16224b, g6.f16224b) && w2.t.a(this.f16225c, g6.f16225c) && w2.t.a(this.f16226d, g6.f16226d) && w2.t.a(this.f16228f, g6.f16228f);
    }

    public final int hashCode() {
        int iHashCode = this.f16223a.hashCode() * 31;
        C1469B c1469b = this.f16224b;
        return this.f16228f.hashCode() + ((this.f16226d.hashCode() + ((this.f16227e.hashCode() + ((this.f16225c.hashCode() + ((iHashCode + (c1469b != null ? c1469b.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
