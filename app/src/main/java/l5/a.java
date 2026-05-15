package L5;

import J5.k;
import S5.C0427g;
import S5.E;
import S5.G;
import S5.n;
import S5.y;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n f4316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J5.n f4318q;

    public a(J5.n nVar) {
        this.f4318q = nVar;
        G gA = ((y) nVar.f3810d).f6822o.a();
        AbstractC1209k.f(gA, "delegate");
        n nVar2 = new n();
        nVar2.f6795e = gA;
        this.f4316o = nVar2;
    }

    @Override // S5.E
    public final G a() {
        return this.f4316o;
    }

    public final void b() {
        J5.n nVar = this.f4318q;
        int i7 = nVar.f3807a;
        if (i7 == 6) {
            return;
        }
        if (i7 != 5) {
            throw new IllegalStateException("state: " + nVar.f3807a);
        }
        n nVar2 = this.f4316o;
        G g6 = nVar2.f6795e;
        nVar2.f6795e = G.f6762d;
        g6.a();
        g6.b();
        nVar.f3807a = 6;
    }

    @Override // S5.E
    public long k(long j3, C0427g c0427g) throws IOException {
        J5.n nVar = this.f4318q;
        AbstractC1209k.f(c0427g, "sink");
        try {
            return ((y) nVar.f3810d).k(j3, c0427g);
        } catch (IOException e7) {
            ((k) nVar.f3809c).l();
            b();
            throw e7;
        }
    }
}
