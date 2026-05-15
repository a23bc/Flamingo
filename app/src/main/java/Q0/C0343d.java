package Q0;

/* JADX INFO: renamed from: Q0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343d implements P0.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5972o;

    public static final int a(long j3, int i7) {
        int i8 = D0.f5782b;
        return ((int) (j3 >> (i7 * 15))) & 32767;
    }

    public static long c(int i7, int i8, int i9, int i10) {
        return (((long) (i8 & 32767)) << 15) | ((long) (i7 & 32767)) | (((long) (i9 & 32767)) << 30) | (((long) (i10 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f5972o) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    @Override // P0.e
    public Object y(P0.f fVar) {
        return fVar.f5709a.a();
    }
}
