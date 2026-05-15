package D3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f1556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f1557r;

    public c(String str, int i7, int i8, String str2) {
        this.f1554o = i7;
        this.f1555p = i8;
        this.f1556q = str;
        this.f1557r = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i7 = this.f1554o - cVar.f1554o;
        return i7 == 0 ? this.f1555p - cVar.f1555p : i7;
    }
}
