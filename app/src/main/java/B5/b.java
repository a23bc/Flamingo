package B5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f882a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f876a;

    @Override // B5.o
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f882a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        u uVar = a.f876a;
        if (obj2 == uVar) {
            u uVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == uVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                        obj2 = uVarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract u c(Object obj);
}
