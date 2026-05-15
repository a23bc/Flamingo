package M;

import b1.AbstractC0607C;
import b1.C0622g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0622g f4589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1.M f4590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1.d f4595g;
    public final f1.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public F5.t f4597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n1.n f4598k;

    public i0(C0622g c0622g, b1.M m7, boolean z6, n1.d dVar, f1.d dVar2, int i7) {
        Z4.v vVar = Z4.v.f8818o;
        this.f4589a = c0622g;
        this.f4590b = m7;
        this.f4591c = Integer.MAX_VALUE;
        this.f4592d = 1;
        this.f4593e = z6;
        this.f4594f = 1;
        this.f4595g = dVar;
        this.h = dVar2;
        this.f4596i = vVar;
    }

    public final void a(n1.n nVar) {
        F5.t tVar = this.f4597j;
        if (tVar == null || nVar != this.f4598k || tVar.b()) {
            this.f4598k = nVar;
            tVar = new F5.t(this.f4589a, AbstractC0607C.i(this.f4590b, nVar), this.f4596i, this.f4595g, this.h);
        }
        this.f4597j = tVar;
    }
}
