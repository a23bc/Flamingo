package c5;

import d5.EnumC0830a;
import e5.InterfaceC0866d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d, InterfaceC0866d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10686p = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f10687o;
    private volatile Object result;

    public k(d dVar) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        this.f10687o = dVar;
        this.result = enumC0830a;
    }

    @Override // e5.InterfaceC0866d
    public final InterfaceC0866d getCallerFrame() {
        d dVar = this.f10687o;
        if (dVar instanceof InterfaceC0866d) {
            return (InterfaceC0866d) dVar;
        }
        return null;
    }

    @Override // c5.d
    public final i getContext() {
        return this.f10687o.getContext();
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC0830a enumC0830a = EnumC0830a.f11265p;
            if (obj2 == enumC0830a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10686p;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0830a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC0830a) {
                        break;
                    }
                }
                return;
            }
            EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
            if (obj2 != enumC0830a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10686p;
            EnumC0830a enumC0830a3 = EnumC0830a.f11266q;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC0830a2, enumC0830a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC0830a2) {
                    break;
                }
            }
            this.f10687o.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f10687o;
    }
}
