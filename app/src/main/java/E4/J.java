package E4;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1873c;

    public J(Object obj, Object obj2, Object obj3) {
        this.f1871a = obj;
        this.f1872b = obj2;
        this.f1873c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f1871a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f1872b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f1873c);
        return new IllegalArgumentException(sb.toString());
    }
}
