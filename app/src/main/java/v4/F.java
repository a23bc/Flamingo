package V4;

import d0.C0801p;
import d0.D0;
import z.C2043j;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7462b;

    public /* synthetic */ F(int i7, Object obj) {
        this.f7461a = i7;
        this.f7462b = obj;
    }

    public final void a(float f7) {
        switch (this.f7461a) {
            case 0:
                ((G) this.f7462b).f7463a.b(Float.valueOf(f7));
                break;
            case 1:
                C0801p c0801p = (C0801p) this.f7462b;
                Z1.l.g(c0801p.f11066m, c0801p.e(f7));
                break;
            case 2:
                ((D0) this.f7462b).b(f7);
                break;
            default:
                ((C2043j) this.f7462b).f20866a.b(Float.valueOf(f7));
                break;
        }
    }
}
