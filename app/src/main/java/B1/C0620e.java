package b1;

import h1.AbstractC0996a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9967d;

    public C0620e(Object obj, int i7, int i8, String str) {
        this.f9964a = obj;
        this.f9965b = i7;
        this.f9966c = i8;
        this.f9967d = str;
        if (i7 <= i8) {
            return;
        }
        AbstractC0996a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0620e)) {
            return false;
        }
        C0620e c0620e = (C0620e) obj;
        return AbstractC1209k.a(this.f9964a, c0620e.f9964a) && this.f9965b == c0620e.f9965b && this.f9966c == c0620e.f9966c && AbstractC1209k.a(this.f9967d, c0620e.f9967d);
    }

    public final int hashCode() {
        Object obj = this.f9964a;
        return this.f9967d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f9965b) * 31) + this.f9966c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f9964a);
        sb.append(", start=");
        sb.append(this.f9965b);
        sb.append(", end=");
        sb.append(this.f9966c);
        sb.append(", tag=");
        return Z1.l.s(sb, this.f9967d, ')');
    }

    public C0620e(int i7, int i8, Object obj) {
        this(obj, i7, i8, "");
    }
}
