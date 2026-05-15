package t2;

import android.net.Uri;
import android.os.Bundle;
import q.S0;

/* JADX INFO: renamed from: t2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1470C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1470C f16192d = new C1470C(new S0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16195g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f16198c;

    static {
        int i7 = w2.t.f18881a;
        f16193e = Integer.toString(0, 36);
        f16194f = Integer.toString(1, 36);
        f16195g = Integer.toString(2, 36);
    }

    public C1470C(S0 s02) {
        this.f16196a = (Uri) s02.f15225p;
        this.f16197b = (String) s02.f15226q;
        this.f16198c = (Bundle) s02.f15227r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1470C)) {
            return false;
        }
        C1470C c1470c = (C1470C) obj;
        if (w2.t.a(this.f16196a, c1470c.f16196a) && w2.t.a(this.f16197b, c1470c.f16197b)) {
            if ((this.f16198c == null) == (c1470c.f16198c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f16196a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f16197b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f16198c != null ? 1 : 0);
    }
}
