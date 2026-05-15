package A2;

import java.util.function.IntConsumer;
import t2.C1476e;

/* JADX INFO: renamed from: A2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0003d implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f248q;

    public /* synthetic */ RunnableC0003d(int i7, int i8, Object obj) {
        this.f246o = i8;
        this.f248q = obj;
        this.f247p = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f246o) {
            case 0:
                C0005f c0005f = ((C0004e) this.f248q).f254b;
                c0005f.getClass();
                int i7 = this.f247p;
                if (i7 == -3 || i7 == -2) {
                    if (i7 != -2) {
                        C1476e c1476e = c0005f.f271d;
                        if (!(c1476e != null && c1476e.f16417a == 1)) {
                            c0005f.c(4);
                        }
                    }
                    K k7 = c0005f.f270c;
                    if (k7 != null) {
                        N n7 = k7.f83a;
                        n7.u1(0, 1, n7.C());
                    }
                    c0005f.c(3);
                } else if (i7 == -1) {
                    K k8 = c0005f.f270c;
                    if (k8 != null) {
                        N n8 = k8.f83a;
                        n8.u1(-1, 2, n8.C());
                    }
                    c0005f.a();
                    c0005f.c(1);
                } else if (i7 == 1) {
                    c0005f.c(2);
                    K k9 = c0005f.f270c;
                    if (k9 != null) {
                        N n9 = k9.f83a;
                        n9.u1(1, 1, n9.C());
                    }
                } else {
                    n1.c.x(i7, "Unknown focus change type: ");
                }
                break;
            case 1:
                ((IntConsumer) this.f248q).accept(this.f247p);
                break;
            default:
                ((w3.U) this.f248q).f19067j.remove(Integer.valueOf(this.f247p));
                break;
        }
    }
}
