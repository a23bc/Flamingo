package x;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: x.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1872q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f19823a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E5.d f19824b = new E5.d();

    public static final void a(C1872q0 c1872q0, C1866n0 c1866n0) {
        while (true) {
            AtomicReference atomicReference = c1872q0.f19823a;
            C1866n0 c1866n02 = (C1866n0) atomicReference.get();
            if (c1866n02 != null && c1866n0.f19779a.compareTo(c1866n02.f19779a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c1866n02, c1866n0)) {
                if (atomicReference.get() != c1866n02) {
                    break;
                }
            }
            if (c1866n02 != null) {
                c1866n02.f19780b.c(new C1864m0("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
