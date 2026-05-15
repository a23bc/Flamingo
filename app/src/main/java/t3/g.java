package t3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f16864e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f16868d;

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f16865a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f16868d;
            int length = bArr2.length;
            int i10 = this.f16866b + i9;
            if (length < i10) {
                this.f16868d = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i7, this.f16868d, this.f16866b, i9);
            this.f16866b += i9;
        }
    }
}
