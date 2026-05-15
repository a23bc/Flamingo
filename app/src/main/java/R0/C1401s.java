package r0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: r0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1401s extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f15652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1210l f15653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f15654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f15655s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1401s(InterfaceC1182c interfaceC1182c, AtomicReference atomicReference, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f15653q = (AbstractC1210l) interfaceC1182c;
        this.f15654r = atomicReference;
        this.f15655s = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e5.i, l5.e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l5.c, m5.l] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1401s c1401s = new C1401s(this.f15653q, this.f15654r, this.f15655s, dVar);
        c1401s.f15652p = obj;
        return c1401s;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1401s) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r9v9, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1400r c1400r;
        C1400r c1400r2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f15651o;
        AtomicReference atomicReference = this.f15654r;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f15652p;
                c1400r = new C1400r(AbstractC1767D.n(interfaceC1765B.g()), this.f15653q.b(interfaceC1765B));
                C1400r c1400r3 = (C1400r) atomicReference.getAndSet(c1400r);
                if (c1400r3 != null) {
                    InterfaceC1786g0 interfaceC1786g0 = c1400r3.f15649a;
                    this.f15652p = c1400r;
                    this.f15651o = 1;
                    if (AbstractC1767D.g(interfaceC1786g0, this) != enumC0830a) {
                    }
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1400r2 = (C1400r) this.f15652p;
                    try {
                        android.support.v4.media.session.b.K(obj);
                        while (!atomicReference.compareAndSet(c1400r2, null) && atomicReference.get() == c1400r2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(c1400r2, null)) {
                        }
                        throw th;
                    }
                }
                c1400r = (C1400r) this.f15652p;
                android.support.v4.media.session.b.K(obj);
            }
            ?? r9 = this.f15655s;
            Object obj2 = c1400r.f15650b;
            this.f15652p = c1400r;
            this.f15651o = 2;
            obj = r9.invoke(obj2, this);
            if (obj != enumC0830a) {
                c1400r2 = c1400r;
                while (!atomicReference.compareAndSet(c1400r2, null)) {
                }
                return obj;
            }
            return enumC0830a;
        } catch (Throwable th2) {
            th = th2;
            c1400r2 = c1400r;
            while (!atomicReference.compareAndSet(c1400r2, null) && atomicReference.get() == c1400r2) {
            }
            throw th;
        }
    }
}
