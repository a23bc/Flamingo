package I4;

/* JADX INFO: renamed from: I4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0227b extends Throwable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3502o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227b(String str, int i7) {
        super(str);
        this.f3502o = i7;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f3502o) {
            case 0:
                a();
                break;
            default:
                b();
                break;
        }
        return this;
    }
}
