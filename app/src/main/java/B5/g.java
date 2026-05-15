package B5;

import e5.AbstractC0865c;
import e5.InterfaceC0866d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w5.A0;
import w5.AbstractC1767D;
import w5.AbstractC1801t;
import w5.AbstractC1805x;
import w5.C1800s;
import w5.L;
import w5.W;

/* JADX INFO: loaded from: classes.dex */
public final class g extends L implements InterfaceC0866d, c5.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f888v = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC1805x f889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0865c f890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f892u;

    public g(AbstractC1805x abstractC1805x, AbstractC0865c abstractC0865c) {
        super(-1);
        this.f889r = abstractC1805x;
        this.f890s = abstractC0865c;
        this.f891t = a.f878c;
        this.f892u = a.l(abstractC0865c.getContext());
    }

    @Override // w5.L
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC1801t) {
            ((AbstractC1801t) obj).getClass();
            throw null;
        }
    }

    @Override // e5.InterfaceC0866d
    public final InterfaceC0866d getCallerFrame() {
        AbstractC0865c abstractC0865c = this.f890s;
        if (abstractC0865c instanceof InterfaceC0866d) {
            return abstractC0865c;
        }
        return null;
    }

    @Override // c5.d
    public final c5.i getContext() {
        return this.f890s.getContext();
    }

    @Override // w5.L
    public final Object h() {
        Object obj = this.f891t;
        this.f891t = a.f878c;
        return obj;
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        AbstractC0865c abstractC0865c = this.f890s;
        c5.i context = abstractC0865c.getContext();
        Throwable thA = Y4.k.a(obj);
        Object c1800s = thA == null ? obj : new C1800s(thA, false);
        AbstractC1805x abstractC1805x = this.f889r;
        if (abstractC1805x.C()) {
            this.f891t = c1800s;
            this.f19496q = 0;
            abstractC1805x.A(context, this);
            return;
        }
        W wA = A0.a();
        if (wA.f19512q >= 4294967296L) {
            this.f891t = c1800s;
            this.f19496q = 0;
            wA.F(this);
            return;
        }
        wA.H(true);
        try {
            c5.i context2 = abstractC0865c.getContext();
            Object objM = a.m(context2, this.f892u);
            try {
                abstractC0865c.resumeWith(obj);
                while (wA.J()) {
                }
            } finally {
                a.g(context2, objM);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f889r + ", " + AbstractC1767D.z(this.f890s) + ']';
    }

    @Override // w5.L
    public final c5.d c() {
        return this;
    }
}
