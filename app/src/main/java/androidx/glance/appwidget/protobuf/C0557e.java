package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0557e extends C0558f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9616t;

    public C0557e(byte[] bArr, int i7, int i8) {
        super(bArr);
        C0558f.b(i7, i7 + i8, bArr.length);
        this.f9615s = i7;
        this.f9616t = i8;
    }

    @Override // androidx.glance.appwidget.protobuf.C0558f
    public final byte a(int i7) {
        int i8 = this.f9616t;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f9620p[this.f9615s + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(n1.c.s(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(Z1.l.p("Index > length: ", i7, i8, ", "));
    }

    @Override // androidx.glance.appwidget.protobuf.C0558f
    public final int e() {
        return this.f9615s;
    }

    @Override // androidx.glance.appwidget.protobuf.C0558f
    public final byte g(int i7) {
        return this.f9620p[this.f9615s + i7];
    }

    @Override // androidx.glance.appwidget.protobuf.C0558f
    public final int size() {
        return this.f9616t;
    }
}
