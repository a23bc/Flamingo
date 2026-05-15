package t3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f16884f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f16889e;

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f16885a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f16889e;
            int length = bArr2.length;
            int i10 = this.f16887c + i9;
            if (length < i10) {
                this.f16889e = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i7, this.f16889e, this.f16887c, i9);
            this.f16887c += i9;
        }
    }
}
