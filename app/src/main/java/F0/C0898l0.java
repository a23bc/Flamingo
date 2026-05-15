package f0;

import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: f0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0898l0 {

    /* JADX INFO: renamed from: a */
    public final C0924z f11826a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0918w f11827b;

    /* JADX INFO: renamed from: c */
    public final C0912t f11828c;

    /* JADX INFO: renamed from: d */
    public final l5.e f11829d;

    /* JADX INFO: renamed from: e */
    public final boolean f11830e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0875a f11831f;

    /* JADX INFO: renamed from: g */
    public final Object f11832g;
    public final AtomicReference h = new AtomicReference(EnumC0900m0.f11842q);

    /* JADX INFO: renamed from: i */
    public t.K f11833i;

    /* JADX INFO: renamed from: j */
    public final n0.j f11834j;

    /* JADX INFO: renamed from: k */
    public final A0.b f11835k;

    public C0898l0(C0924z c0924z, AbstractC0918w abstractC0918w, C0912t c0912t, t.M m7, l5.e eVar, boolean z6, AbstractC0875a abstractC0875a, Object obj) {
        this.f11826a = c0924z;
        this.f11827b = abstractC0918w;
        this.f11828c = c0912t;
        this.f11829d = eVar;
        this.f11830e = z6;
        this.f11831f = abstractC0875a;
        this.f11832g = obj;
        t.K k7 = t.S.f16033a;
        AbstractC1209k.d(k7, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f11833i = k7;
        n0.j jVar = new n0.j();
        jVar.g(m7, c0912t.y());
        this.f11834j = jVar;
        this.f11835k = new A0.b(abstractC0875a.f11788q);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((EnumC0900m0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    EnumC0900m0 enumC0900m0 = EnumC0900m0.f11845t;
                    EnumC0900m0 enumC0900m02 = EnumC0900m0.f11846u;
                    while (!atomicReference.compareAndSet(enumC0900m0, enumC0900m02)) {
                        if (atomicReference.get() != enumC0900m0) {
                            AbstractC0908q0.b("Unexpected state change from: " + enumC0900m0 + " to: " + enumC0900m02 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new A2.W();
            }
        } catch (Exception e7) {
            atomicReference.set(EnumC0900m0.f11840o);
            throw e7;
        }
    }

    public final void b() {
        synchronized (this.f11832g) {
            try {
                this.f11835k.g0(this.f11831f, this.f11834j);
                this.f11834j.c();
                this.f11834j.d();
            } finally {
                this.f11834j.b();
                this.f11826a.f11960E = null;
            }
        }
    }

    public final boolean c() {
        return ((EnumC0900m0) this.h.get()).compareTo(EnumC0900m0.f11845t) >= 0;
    }

    public final void d() {
        boolean z6;
        EnumC0900m0 enumC0900m0 = EnumC0900m0.f11843r;
        EnumC0900m0 enumC0900m02 = EnumC0900m0.f11845t;
        AtomicReference atomicReference = this.h;
        while (true) {
            if (atomicReference.compareAndSet(enumC0900m0, enumC0900m02)) {
                z6 = true;
                break;
            } else if (atomicReference.get() != enumC0900m0) {
                z6 = false;
                break;
            }
        }
        if (z6) {
            return;
        }
        AbstractC0908q0.b("Unexpected state change from: " + enumC0900m0 + " to: " + enumC0900m02 + '.');
    }

    public final void e() {
        boolean z6;
        AtomicReference atomicReference = this.h;
        Object obj = atomicReference.get();
        EnumC0900m0 enumC0900m0 = EnumC0900m0.f11843r;
        if (obj == enumC0900m0) {
            return;
        }
        EnumC0900m0 enumC0900m02 = EnumC0900m0.f11845t;
        while (true) {
            if (atomicReference.compareAndSet(enumC0900m02, enumC0900m0)) {
                z6 = true;
                break;
            } else if (atomicReference.get() != enumC0900m02) {
                z6 = false;
                break;
            }
        }
        if (z6) {
            return;
        }
        AbstractC0908q0.b("Unexpected state change from: " + enumC0900m02 + " to: " + enumC0900m0 + '.');
    }

    public final boolean f(B2.g gVar) throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((EnumC0900m0) atomicReference.get()).ordinal();
            C0924z c0924z = this.f11826a;
            AbstractC0918w abstractC0918w = this.f11827b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C0912t c0912t = this.f11828c;
                    boolean z6 = this.f11830e;
                    if (z6) {
                        c0912t.f11916z = 100;
                        c0912t.f11915y = true;
                    }
                    try {
                        this.f11833i = abstractC0918w.b(c0924z, gVar, this.f11829d);
                        EnumC0900m0 enumC0900m0 = EnumC0900m0.f11842q;
                        EnumC0900m0 enumC0900m02 = EnumC0900m0.f11843r;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC0900m0, enumC0900m02)) {
                                if (atomicReference.get() != enumC0900m0) {
                                    AbstractC0908q0.b("Unexpected state change from: " + enumC0900m0 + " to: " + enumC0900m02 + '.');
                                }
                            }
                        }
                        if (this.f11833i.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z6) {
                            c0912t.s();
                        }
                    }
                case 3:
                    EnumC0900m0 enumC0900m03 = EnumC0900m0.f11843r;
                    EnumC0900m0 enumC0900m04 = EnumC0900m0.f11844s;
                    while (true) {
                        if (!atomicReference.compareAndSet(enumC0900m03, enumC0900m04)) {
                            if (atomicReference.get() != enumC0900m03) {
                                AbstractC0908q0.b("Unexpected state change from: " + enumC0900m03 + " to: " + enumC0900m04 + '.');
                            }
                        }
                    }
                    try {
                        this.f11833i = abstractC0918w.m(c0924z, gVar, this.f11833i);
                        EnumC0900m0 enumC0900m05 = EnumC0900m0.f11844s;
                        EnumC0900m0 enumC0900m06 = EnumC0900m0.f11843r;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC0900m05, enumC0900m06)) {
                                if (atomicReference.get() != enumC0900m05) {
                                    AbstractC0908q0.b("Unexpected state change from: " + enumC0900m05 + " to: " + enumC0900m06 + '.');
                                }
                            }
                        }
                        if (this.f11833i.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        EnumC0900m0 enumC0900m07 = EnumC0900m0.f11844s;
                        EnumC0900m0 enumC0900m08 = EnumC0900m0.f11843r;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC0900m07, enumC0900m08)) {
                                if (atomicReference.get() != enumC0900m07) {
                                    AbstractC0908q0.b("Unexpected state change from: " + enumC0900m07 + " to: " + enumC0900m08 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    AbstractC0914u.d("Recursive call to resume()");
                    throw new A2.W();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new A2.W();
            }
        } catch (Exception e7) {
            atomicReference.set(EnumC0900m0.f11840o);
            throw e7;
        }
    }
}
