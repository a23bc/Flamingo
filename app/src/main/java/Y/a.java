package Y;

import f0.C0894j0;
import f0.W;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public final C0894j0 f8346a;

    /* JADX INFO: renamed from: b */
    public final C0894j0 f8347b;

    /* JADX INFO: renamed from: c */
    public final C0894j0 f8348c;

    /* JADX INFO: renamed from: d */
    public final C0894j0 f8349d;

    /* JADX INFO: renamed from: e */
    public final C0894j0 f8350e;

    /* JADX INFO: renamed from: f */
    public final C0894j0 f8351f;

    /* JADX INFO: renamed from: g */
    public final C0894j0 f8352g;
    public final C0894j0 h;

    /* JADX INFO: renamed from: i */
    public final C0894j0 f8353i;

    /* JADX INFO: renamed from: j */
    public final C0894j0 f8354j;

    /* JADX INFO: renamed from: k */
    public final C0894j0 f8355k;
    public final C0894j0 l;

    /* JADX INFO: renamed from: m */
    public final C0894j0 f8356m;

    public a(long j3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        C1987t c1987t = new C1987t(j3);
        W w7 = W.f11767t;
        this.f8346a = new C0894j0(c1987t, w7);
        this.f8347b = new C0894j0(new C1987t(j7), w7);
        this.f8348c = new C0894j0(new C1987t(j8), w7);
        this.f8349d = new C0894j0(new C1987t(j9), w7);
        this.f8350e = new C0894j0(new C1987t(j10), w7);
        this.f8351f = new C0894j0(new C1987t(j11), w7);
        this.f8352g = new C0894j0(new C1987t(j12), w7);
        this.h = new C0894j0(new C1987t(j13), w7);
        this.f8353i = new C0894j0(new C1987t(j14), w7);
        this.f8354j = new C0894j0(new C1987t(j15), w7);
        this.f8355k = new C0894j0(new C1987t(j16), w7);
        this.l = new C0894j0(new C1987t(j17), w7);
        this.f8356m = new C0894j0(Boolean.TRUE, w7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        n1.c.z(((C1987t) this.f8346a.getValue()).f20264a, sb, ", primaryVariant=");
        n1.c.z(((C1987t) this.f8347b.getValue()).f20264a, sb, ", secondary=");
        n1.c.z(((C1987t) this.f8348c.getValue()).f20264a, sb, ", secondaryVariant=");
        n1.c.z(((C1987t) this.f8349d.getValue()).f20264a, sb, ", background=");
        n1.c.z(((C1987t) this.f8350e.getValue()).f20264a, sb, ", surface=");
        n1.c.z(((C1987t) this.f8351f.getValue()).f20264a, sb, ", error=");
        n1.c.z(((C1987t) this.f8352g.getValue()).f20264a, sb, ", onPrimary=");
        n1.c.z(((C1987t) this.h.getValue()).f20264a, sb, ", onSecondary=");
        n1.c.z(((C1987t) this.f8353i.getValue()).f20264a, sb, ", onBackground=");
        n1.c.z(((C1987t) this.f8354j.getValue()).f20264a, sb, ", onSurface=");
        n1.c.z(((C1987t) this.f8355k.getValue()).f20264a, sb, ", onError=");
        n1.c.z(((C1987t) this.l.getValue()).f20264a, sb, ", isLight=");
        sb.append(((Boolean) this.f8356m.getValue()).booleanValue());
        sb.append(')');
        return sb.toString();
    }
}
