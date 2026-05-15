package f0;

/* JADX INFO: renamed from: f0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11870b;

    public /* synthetic */ C0910s(int i7, Object obj) {
        this.f11869a = i7;
        this.f11870b = obj;
    }

    public final void a() {
        switch (this.f11869a) {
            case 0:
                C0912t c0912t = (C0912t) this.f11870b;
                c0912t.f11872A--;
                break;
            default:
                p0.t tVar = (p0.t) this.f11870b;
                tVar.f14969j--;
                break;
        }
    }

    public final void b() {
        switch (this.f11869a) {
            case 0:
                ((C0912t) this.f11870b).f11872A++;
                break;
            default:
                ((p0.t) this.f11870b).f14969j++;
                break;
        }
    }
}
