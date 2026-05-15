package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5.e f8558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8559c;

    public w(String str, l5.e eVar) {
        this.f8557a = str;
        this.f8558b = eVar;
    }

    public final void a(j jVar, Object obj) {
        jVar.i(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f8557a;
    }

    public /* synthetic */ w(String str) {
        this(str, s.f8502H);
    }

    public w(String str, int i7) {
        this(str);
        this.f8559c = true;
    }

    public w(String str, boolean z6, l5.e eVar) {
        this(str, eVar);
        this.f8559c = z6;
    }
}
