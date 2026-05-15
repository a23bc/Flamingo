package B5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w5.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends c implements u0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f915d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f916c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j3, s sVar, int i7) {
        super(sVar);
        this.f916c = j3;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // B5.c
    public final boolean d() {
        return f915d.get(this) == g() && b() != null;
    }

    public final boolean f() {
        return f915d.addAndGet(this, -65536) == g() && b() != null;
    }

    public abstract int g();

    public abstract void h(int i7, c5.i iVar);

    public final void i() {
        if (f915d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f915d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == g() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
