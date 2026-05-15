package p5;

import java.util.Random;

/* JADX INFO: renamed from: p5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1298a extends d {
    @Override // p5.d
    public final int a(int i7) {
        return ((-i7) >> 31) & (e().nextInt() >>> (32 - i7));
    }

    @Override // p5.d
    public final int b() {
        return e().nextInt();
    }

    @Override // p5.d
    public final int c(int i7) {
        return e().nextInt(i7);
    }

    public abstract Random e();
}
