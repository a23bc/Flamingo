package C2;

/* JADX INFO: renamed from: C2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0042n {

    /* JADX INFO: renamed from: a */
    public boolean f1138a;

    /* JADX INFO: renamed from: b */
    public boolean f1139b;

    /* JADX INFO: renamed from: c */
    public boolean f1140c;

    public final C0043o a() {
        if (this.f1138a || !(this.f1139b || this.f1140c)) {
            return new C0043o(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
