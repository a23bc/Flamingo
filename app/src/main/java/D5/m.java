package D5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1633b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1634c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1635d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1636e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1637a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1634c;
        if (atomicIntegerFieldUpdater.get(this) - f1635d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f1623p.f5144o == 1) {
            f1636e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1637a;
            if (atomicReferenceArray.get(i7) == null) {
                atomicReferenceArray.lazySet(i7, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1635d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f1634c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (iVar = (i) this.f1637a.getAndSet(i8, null)) != null) {
                if (iVar.f1623p.f5144o == 1) {
                    f1636e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i7, boolean z6) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1637a;
        i iVar = (i) atomicReferenceArray.get(i8);
        if (iVar != null) {
            if ((iVar.f1623p.f5144o == 1) == z6) {
                while (!atomicReferenceArray.compareAndSet(i8, iVar, null)) {
                    if (atomicReferenceArray.get(i8) != iVar) {
                    }
                }
                if (z6) {
                    f1636e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
