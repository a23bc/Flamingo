package E0;

import f0.C0879c;
import f0.C0894j0;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import x0.C1895e;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class F extends D {

    /* JADX INFO: renamed from: b */
    public final C0092c f1645b;

    /* JADX INFO: renamed from: c */
    public String f1646c;

    /* JADX INFO: renamed from: d */
    public boolean f1647d;

    /* JADX INFO: renamed from: e */
    public final C0090a f1648e;

    /* JADX INFO: renamed from: f */
    public AbstractC1210l f1649f;

    /* JADX INFO: renamed from: g */
    public final C0894j0 f1650g;
    public C1980m h;

    /* JADX INFO: renamed from: i */
    public final C0894j0 f1651i;

    /* JADX INFO: renamed from: j */
    public long f1652j;

    /* JADX INFO: renamed from: k */
    public float f1653k;
    public float l;

    /* JADX INFO: renamed from: m */
    public final E f1654m;

    public F(C0092c c0092c) {
        this.f1645b = c0092c;
        c0092c.f1704i = new E(this, 0);
        this.f1646c = "";
        this.f1647d = true;
        this.f1648e = new C0090a();
        this.f1649f = C0097h.f1745r;
        this.f1650g = C0879c.t(null);
        this.f1651i = C0879c.t(new C1895e(0L));
        this.f1652j = 9205357640488583168L;
        this.f1653k = 1.0f;
        this.l = 1.0f;
        this.f1654m = new E(this, 1);
    }

    @Override // E0.D
    public final void a(A0.f fVar) {
        e(fVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(A0.f r31, float r32, y0.C1980m r33) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.F.e(A0.f, float, y0.m):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f1646c);
        sb.append("\n\tviewportWidth: ");
        C0894j0 c0894j0 = this.f1651i;
        sb.append(Float.intBitsToFloat((int) (((C1895e) c0894j0.getValue()).f19880a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C1895e) c0894j0.getValue()).f19880a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
