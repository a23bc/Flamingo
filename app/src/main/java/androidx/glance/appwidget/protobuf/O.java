package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f9589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9590d;

    public O(r rVar, String str, Object[] objArr) {
        this.f9587a = rVar;
        this.f9588b = str;
        this.f9589c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9590d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f9590d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final int a() {
        int i7 = this.f9590d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
