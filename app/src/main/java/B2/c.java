package B2;

import t2.P;
import t2.V;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P f741p;

    public /* synthetic */ c(int i7, P p7) {
        this.f740o = i7;
        this.f741p = p7;
    }

    @Override // w2.g
    public final void b(Object obj) {
        switch (this.f740o) {
            case 0:
                ((n) obj).f793n = this.f741p;
                break;
            case 1:
                ((V) obj).v(this.f741p);
                break;
            case 2:
                ((V) obj).y(this.f741p);
                break;
            case 3:
                ((V) obj).v(this.f741p);
                break;
            default:
                ((V) obj).y(this.f741p);
                break;
        }
    }

    public /* synthetic */ c(a aVar, P p7) {
        this.f740o = 0;
        this.f741p = p7;
    }
}
