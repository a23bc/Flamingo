package H2;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f3113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3115c;

    public Y() {
        this(new Random());
    }

    public final Y a(int i7, int i8) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i8];
        int[] iArr3 = new int[i8];
        int i9 = 0;
        while (true) {
            iArr = this.f3114b;
            random = this.f3113a;
            if (i9 >= i8) {
                break;
            }
            iArr2[i9] = random.nextInt(iArr.length + 1);
            int i10 = i9 + 1;
            int iNextInt = random.nextInt(i10);
            iArr3[i9] = iArr3[iNextInt];
            iArr3[iNextInt] = i9 + i7;
            i9 = i10;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i8];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length + i8; i13++) {
            if (i11 >= i8 || i12 != iArr2[i11]) {
                int i14 = i12 + 1;
                int i15 = iArr[i12];
                iArr4[i13] = i15;
                if (i15 >= i7) {
                    iArr4[i13] = i15 + i8;
                }
                i12 = i14;
            } else {
                iArr4[i13] = iArr3[i11];
                i11++;
            }
        }
        return new Y(iArr4, new Random(random.nextLong()));
    }

    public Y(int[] iArr, Random random) {
        this.f3114b = iArr;
        this.f3113a = random;
        this.f3115c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f3115c[iArr[i7]] = i7;
        }
    }

    public Y(Random random) {
        this(new int[0], random);
    }
}
