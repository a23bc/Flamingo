package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0546t f9427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f9429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9430d;

    public W(AbstractC0546t abstractC0546t, String str, Object[] objArr) {
        this.f9427a = abstractC0546t;
        this.f9428b = str;
        this.f9429c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9430d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f9430d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }
}
