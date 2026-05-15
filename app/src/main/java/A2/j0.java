package A2;

import H2.C0205w;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H2.r f329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0205w f330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ IOException f331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f334u;

    public /* synthetic */ j0(Object obj, Object obj2, H2.r rVar, C0205w c0205w, IOException iOException, boolean z6, int i7) {
        this.f328o = i7;
        this.f333t = obj;
        this.f334u = obj2;
        this.f329p = rVar;
        this.f330q = c0205w;
        this.f331r = iOException;
        this.f332s = z6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [H2.E, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f328o) {
            case 0:
                B2.i iVar = ((n0) ((V.o) this.f333t).f7343q).h;
                Pair pair = (Pair) this.f334u;
                iVar.M(((Integer) pair.first).intValue(), (H2.A) pair.second, this.f329p, this.f330q, this.f331r, this.f332s);
                break;
            default:
                D4.i iVar2 = (D4.i) this.f333t;
                int i7 = iVar2.f1582p;
                this.f334u.M(i7, (H2.A) iVar2.f1583q, this.f329p, this.f330q, this.f331r, this.f332s);
                break;
        }
    }
}
