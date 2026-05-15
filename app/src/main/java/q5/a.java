package q5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import m5.AbstractC1209k;
import p5.AbstractC1298a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1298a {
    @Override // p5.d
    public final int d(int i7, int i8) {
        return ThreadLocalRandom.current().nextInt(i7, i8);
    }

    @Override // p5.AbstractC1298a
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC1209k.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
