package u2;

import E4.b0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17201b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f17202c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17203d;

    public a(b0 b0Var) {
        this.f17200a = b0Var;
        b bVar = b.f17204e;
        this.f17203d = false;
    }

    public final b a(b bVar) {
        if (bVar.equals(b.f17204e)) {
            throw new c(bVar);
        }
        int i7 = 0;
        while (true) {
            b0 b0Var = this.f17200a;
            if (i7 >= b0Var.f1915r) {
                return bVar;
            }
            d dVar = (d) b0Var.get(i7);
            b bVarG = dVar.g(bVar);
            if (dVar.b()) {
                AbstractC1697a.i(!bVarG.equals(b.f17204e));
                bVar = bVarG;
            }
            i7++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f17201b;
        arrayList.clear();
        this.f17203d = false;
        int i7 = 0;
        while (true) {
            b0 b0Var = this.f17200a;
            if (i7 >= b0Var.f1915r) {
                break;
            }
            d dVar = (d) b0Var.get(i7);
            dVar.flush();
            if (dVar.b()) {
                arrayList.add(dVar);
            }
            i7++;
        }
        this.f17202c = new ByteBuffer[arrayList.size()];
        for (int i8 = 0; i8 <= c(); i8++) {
            this.f17202c[i8] = ((d) arrayList.get(i8)).c();
        }
    }

    public final int c() {
        return this.f17202c.length - 1;
    }

    public final boolean d() {
        return this.f17203d && ((d) this.f17201b.get(c())).f() && !this.f17202c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f17201b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b0 b0Var = this.f17200a;
            if (b0Var.f1915r == aVar.f17200a.f1915r) {
                for (int i7 = 0; i7 < b0Var.f1915r; i7++) {
                    if (b0Var.get(i7) == aVar.f17200a.get(i7)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z6;
        for (boolean z7 = true; z7; z7 = z6) {
            z6 = false;
            int i7 = 0;
            while (i7 <= c()) {
                if (!this.f17202c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f17201b;
                    d dVar = (d) arrayList.get(i7);
                    if (!dVar.f()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f17202c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : d.f17209a;
                        long jRemaining = byteBuffer2.remaining();
                        dVar.h(byteBuffer2);
                        this.f17202c[i7] = dVar.c();
                        z6 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f17202c[i7].hasRemaining();
                    } else if (!this.f17202c[i7].hasRemaining() && i7 < c()) {
                        ((d) arrayList.get(i7 + 1)).e();
                    }
                }
                i7++;
            }
        }
    }

    public final int hashCode() {
        return this.f17200a.hashCode();
    }
}
