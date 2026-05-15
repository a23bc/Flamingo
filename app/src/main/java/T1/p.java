package T1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a */
    public int f6876a = 1;

    /* JADX INFO: renamed from: b */
    public final s f6877b;

    /* JADX INFO: renamed from: c */
    public s f6878c;

    /* JADX INFO: renamed from: d */
    public s f6879d;

    /* JADX INFO: renamed from: e */
    public int f6880e;

    /* JADX INFO: renamed from: f */
    public int f6881f;

    public p(s sVar) {
        this.f6877b = sVar;
        this.f6878c = sVar;
    }

    public final void a() {
        this.f6876a = 1;
        this.f6878c = this.f6877b;
        this.f6881f = 0;
    }

    public final boolean b() {
        U1.a aVarB = this.f6878c.f6895b.b();
        int iB = aVarB.b(6);
        return !(iB == 0 || ((ByteBuffer) aVarB.f2745r).get(iB + aVarB.f2742o) == 0) || this.f6880e == 65039;
    }
}
