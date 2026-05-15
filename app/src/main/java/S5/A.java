package S5;

import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6756a = new z(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f6758c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f6757b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f6758c = atomicReferenceArr;
    }

    public static final void a(z zVar) {
        AbstractC1209k.f(zVar, "segment");
        if (zVar.f6830f != null || zVar.f6831g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (zVar.f6828d) {
            return;
        }
        AtomicReference atomicReference = f6758c[(int) (Thread.currentThread().getId() & (((long) f6757b) - 1))];
        z zVar2 = f6756a;
        z zVar3 = (z) atomicReference.getAndSet(zVar2);
        if (zVar3 == zVar2) {
            return;
        }
        int i7 = zVar3 != null ? zVar3.f6827c : 0;
        if (i7 >= 65536) {
            atomicReference.set(zVar3);
            return;
        }
        zVar.f6830f = zVar3;
        zVar.f6826b = 0;
        zVar.f6827c = i7 + 8192;
        atomicReference.set(zVar);
    }

    public static final z b() {
        AtomicReference atomicReference = f6758c[(int) (Thread.currentThread().getId() & (((long) f6757b) - 1))];
        z zVar = f6756a;
        z zVar2 = (z) atomicReference.getAndSet(zVar);
        if (zVar2 == zVar) {
            return new z();
        }
        if (zVar2 == null) {
            atomicReference.set(null);
            return new z();
        }
        atomicReference.set(zVar2.f6830f);
        zVar2.f6830f = null;
        zVar2.f6827c = 0;
        return zVar2;
    }
}
