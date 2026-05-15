package B5;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f905e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f906f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final u f907g = new u("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f908a;

    /* JADX INFO: renamed from: b */
    public final boolean f909b;

    /* JADX INFO: renamed from: c */
    public final int f910c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f911d;

    public m(int i7, boolean z6) {
        this.f908a = i7;
        this.f909b = z6;
        int i8 = i7 - 1;
        this.f910c = i8;
        this.f911d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f906f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (2305843009213693952L & j3) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j3);
            int i8 = (int) ((1152921503533105152L & j3) >> 30);
            int i9 = this.f910c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f911d;
            if (!this.f909b && atomicReferenceArray.get(i8 & i9) != null) {
                int i10 = this.f908a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((long) ((i8 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i8 & i9, runnable);
                m mVarC = this;
                while ((atomicLongFieldUpdater.get(mVarC) & 1152921504606846976L) != 0) {
                    mVarC = mVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = mVarC.f911d;
                    int i11 = mVarC.f910c & i8;
                    Object obj = atomicReferenceArray2.get(i11);
                    if ((obj instanceof l) && ((l) obj).f904a == i8) {
                        atomicReferenceArray2.set(i11, runnable);
                    } else {
                        mVarC = null;
                    }
                    if (mVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f906f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f906f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j7 = 1152921504606846976L | j3;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j3, j7)) {
                j3 = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f905e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f908a * 2, mVar.f909b);
            int i7 = (int) (1073741823 & j3);
            int i8 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i9 = mVar.f910c;
                int i10 = i7 & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object lVar = mVar.f911d.get(i10);
                if (lVar == null) {
                    lVar = new l(i7);
                }
                mVar3.f911d.set(mVar3.f910c & i7, lVar);
                i7++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f906f;
            long j3 = atomicLongFieldUpdater.get(mVarC);
            if ((j3 & 1152921504606846976L) != 0) {
                return f907g;
            }
            int i7 = (int) (j3 & 1073741823);
            int i8 = mVarC.f910c;
            int i9 = ((int) ((1152921503533105152L & j3) >> 30)) & i8;
            int i10 = i8 & i7;
            if (i9 == i10) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVarC.f911d;
            Object obj = atomicReferenceArray.get(i10);
            boolean z6 = mVarC.f909b;
            if (obj == null) {
                if (z6) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j7 = (i7 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(mVarC, j3, (j3 & (-1073741824)) | j7)) {
                    atomicReferenceArray.set(i10, null);
                    return obj;
                }
                mVarC = this;
                if (z6) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f906f;
                        long j8 = atomicLongFieldUpdater2.get(mVarC);
                        int i11 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            mVarC = mVarC.c();
                        } else {
                            m mVar = mVarC;
                            mVarC = mVar;
                            if (atomicLongFieldUpdater2.compareAndSet(mVar, j8, (j8 & (-1073741824)) | j7)) {
                                mVarC.f911d.set(mVarC.f910c & i11, null);
                                mVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (mVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
