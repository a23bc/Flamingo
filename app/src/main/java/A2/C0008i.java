package A2;

import android.text.TextUtils;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: A2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0008i {

    /* JADX INFO: renamed from: a */
    public final String f306a;

    /* JADX INFO: renamed from: b */
    public final C1487p f307b;

    /* JADX INFO: renamed from: c */
    public final C1487p f308c;

    /* JADX INFO: renamed from: d */
    public final int f309d;

    /* JADX INFO: renamed from: e */
    public final int f310e;

    public C0008i(String str, C1487p c1487p, C1487p c1487p2, int i7, int i8) {
        AbstractC1697a.d(i7 == 0 || i8 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f306a = str;
        c1487p.getClass();
        this.f307b = c1487p;
        c1487p2.getClass();
        this.f308c = c1487p2;
        this.f309d = i7;
        this.f310e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0008i.class == obj.getClass()) {
            C0008i c0008i = (C0008i) obj;
            if (this.f309d == c0008i.f309d && this.f310e == c0008i.f310e && this.f306a.equals(c0008i.f306a) && this.f307b.equals(c0008i.f307b) && this.f308c.equals(c0008i.f308c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f308c.hashCode() + ((this.f307b.hashCode() + A0.e.C(this.f306a, (((527 + this.f309d) * 31) + this.f310e) * 31, 31)) * 31);
    }
}
