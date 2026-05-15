package u6;

import b1.C0613I;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1559d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0613I f17577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0613I f17578g;
    public final C0613I h;

    public C1559d(float f7, float f8, String str, String str2, String str3, C0613I c0613i, C0613I c0613i2, C0613I c0613i3) {
        this.f17572a = f7;
        this.f17573b = f8;
        this.f17574c = str;
        this.f17575d = str2;
        this.f17576e = str3;
        this.f17577f = c0613i;
        this.f17578g = c0613i2;
        this.h = c0613i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559d)) {
            return false;
        }
        C1559d c1559d = (C1559d) obj;
        return Float.compare(this.f17572a, c1559d.f17572a) == 0 && Float.compare(this.f17573b, c1559d.f17573b) == 0 && AbstractC1209k.a(this.f17574c, c1559d.f17574c) && AbstractC1209k.a(this.f17575d, c1559d.f17575d) && AbstractC1209k.a(this.f17576e, c1559d.f17576e) && AbstractC1209k.a(this.f17577f, c1559d.f17577f) && AbstractC1209k.a(this.f17578g, c1559d.f17578g) && AbstractC1209k.a(this.h, c1559d.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.f17578g.hashCode() + ((this.f17577f.hashCode() + A0.e.C(this.f17576e, A0.e.C(this.f17575d, A0.e.C(this.f17574c, n1.c.n(this.f17573b, Float.floatToIntBits(this.f17572a) * 31, 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LineState(time=" + this.f17572a + ", lastTime=" + this.f17573b + ", leading=" + this.f17574c + ", content=" + this.f17575d + ", aftering=" + this.f17576e + ", leadingLayout=" + this.f17577f + ", contentLayout=" + this.f17578g + ", afteringLayout=" + this.h + ')';
    }
}
