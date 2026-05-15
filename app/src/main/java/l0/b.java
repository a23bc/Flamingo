package L0;

import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f4091c;

    public b(int i7) {
        this.f4089a = i7;
        switch (i7) {
            case 1:
                this.f4091c = new long[32];
                break;
        }
    }

    public final void a(long j3) {
        switch (this.f4089a) {
            case 0:
                if (!b(j3)) {
                    int i7 = this.f4090b;
                    long[] jArrCopyOf = this.f4091c;
                    if (i7 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i7 + 1, jArrCopyOf.length * 2));
                        AbstractC1209k.e(jArrCopyOf, "copyOf(...)");
                        this.f4091c = jArrCopyOf;
                    }
                    jArrCopyOf[i7] = j3;
                    if (i7 >= this.f4090b) {
                        this.f4090b = i7 + 1;
                    }
                }
                break;
            default:
                int i8 = this.f4090b;
                long[] jArr = this.f4091c;
                if (i8 == jArr.length) {
                    this.f4091c = Arrays.copyOf(jArr, i8 * 2);
                }
                long[] jArr2 = this.f4091c;
                int i9 = this.f4090b;
                this.f4090b = i9 + 1;
                jArr2[i9] = j3;
                break;
        }
    }

    public boolean b(long j3) {
        int i7 = this.f4090b;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f4091c[i8] == j3) {
                return true;
            }
        }
        return false;
    }

    public long c(int i7) {
        if (i7 >= 0 && i7 < this.f4090b) {
            return this.f4091c[i7];
        }
        StringBuilder sbV = n1.c.v(i7, "Invalid index ", ", size is ");
        sbV.append(this.f4090b);
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    public void d(long j3) {
        int i7 = this.f4090b;
        int i8 = 0;
        while (i8 < i7) {
            if (j3 == this.f4091c[i8]) {
                int i9 = this.f4090b - 1;
                while (i8 < i9) {
                    long[] jArr = this.f4091c;
                    int i10 = i8 + 1;
                    jArr[i8] = jArr[i10];
                    i8 = i10;
                }
                this.f4090b--;
                return;
            }
            i8++;
        }
    }
}
