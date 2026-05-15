package X;

import b1.C0613I;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0613I f7878f;

    public B(long j3, int i7, int i8, int i9, int i10, C0613I c0613i) {
        this.f7873a = j3;
        this.f7874b = i7;
        this.f7875c = i8;
        this.f7876d = i9;
        this.f7877e = i10;
        this.f7878f = c0613i;
    }

    public final D a(int i7) {
        return new D(AbstractC0498r0.u(this.f7878f, i7), i7, this.f7873a);
    }

    public final EnumC0482j b() {
        int i7 = this.f7875c;
        int i8 = this.f7876d;
        return i7 < i8 ? EnumC0482j.f8087p : i7 > i8 ? EnumC0482j.f8086o : EnumC0482j.f8088q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f7873a);
        sb.append(", range=(");
        int i7 = this.f7875c;
        sb.append(i7);
        sb.append('-');
        C0613I c0613i = this.f7878f;
        sb.append(AbstractC0498r0.u(c0613i, i7));
        sb.append(',');
        int i8 = this.f7876d;
        sb.append(i8);
        sb.append('-');
        sb.append(AbstractC0498r0.u(c0613i, i8));
        sb.append("), prevOffset=");
        return Z1.l.r(sb, this.f7877e, ')');
    }
}
