package K0;

import java.util.ArrayList;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3916g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f3919k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f3922o;

    public u(long j3, long j7, long j8, boolean z6, float f7, long j9, long j10, boolean z7, boolean z8, int i7, long j11) {
        this.f3910a = j3;
        this.f3911b = j7;
        this.f3912c = j8;
        this.f3913d = z6;
        this.f3914e = f7;
        this.f3915f = j9;
        this.f3916g = j10;
        this.h = z7;
        this.f3917i = i7;
        this.f3918j = j11;
        this.l = 0L;
        this.f3920m = z8;
        this.f3921n = z8;
    }

    public final void a() {
        u uVar = this.f3922o;
        if (uVar == null) {
            this.f3920m = true;
            this.f3921n = true;
        } else if (uVar != null) {
            uVar.a();
        }
    }

    public final boolean b() {
        u uVar = this.f3922o;
        return uVar != null ? uVar.b() : this.f3920m || this.f3921n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f3910a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f3911b);
        sb.append(", position=");
        sb.append((Object) C1892b.j(this.f3912c));
        sb.append(", pressed=");
        sb.append(this.f3913d);
        sb.append(", pressure=");
        sb.append(this.f3914e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f3915f);
        sb.append(", previousPosition=");
        sb.append((Object) C1892b.j(this.f3916g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i7 = this.f3917i;
        sb.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f3919k;
        if (obj == null) {
            obj = Z4.v.f8818o;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C1892b.j(this.f3918j));
        sb.append(')');
        return sb.toString();
    }

    public u(long j3, long j7, long j8, boolean z6, float f7, long j9, long j10, boolean z7, int i7, ArrayList arrayList, long j11, long j12) {
        this(j3, j7, j8, z6, f7, j9, j10, z7, false, i7, j11);
        this.f3919k = arrayList;
        this.l = j12;
    }
}
