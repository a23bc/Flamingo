package b1;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0618c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9961d;

    public C0618c(Object obj, int i7, int i8, String str) {
        this.f9958a = obj;
        this.f9959b = i7;
        this.f9960c = i8;
        this.f9961d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0618c)) {
            return false;
        }
        C0618c c0618c = (C0618c) obj;
        return AbstractC1209k.a(this.f9958a, c0618c.f9958a) && this.f9959b == c0618c.f9959b && this.f9960c == c0618c.f9960c && AbstractC1209k.a(this.f9961d, c0618c.f9961d);
    }

    public final int hashCode() {
        Object obj = this.f9958a;
        return this.f9961d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f9959b) * 31) + this.f9960c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f9958a);
        sb.append(", start=");
        sb.append(this.f9959b);
        sb.append(", end=");
        sb.append(this.f9960c);
        sb.append(", tag=");
        return Z1.l.s(sb, this.f9961d, ')');
    }
}
