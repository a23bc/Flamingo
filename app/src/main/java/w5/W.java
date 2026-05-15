package w5;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends AbstractC1805x {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f19511t = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f19512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Z4.k f19514s;

    public final void E(boolean z6) {
        long j3 = this.f19512q - (z6 ? 4294967296L : 1L);
        this.f19512q = j3;
        if (j3 <= 0 && this.f19513r) {
            shutdown();
        }
    }

    public final void F(L l) {
        Z4.k kVar = this.f19514s;
        if (kVar == null) {
            kVar = new Z4.k();
            this.f19514s = kVar;
        }
        kVar.addLast(l);
    }

    public abstract Thread G();

    public final void H(boolean z6) {
        this.f19512q = (z6 ? 4294967296L : 1L) + this.f19512q;
        if (z6) {
            return;
        }
        this.f19513r = true;
    }

    public abstract long I();

    public final boolean J() throws IllegalAccessException, InvocationTargetException {
        Z4.k kVar = this.f19514s;
        if (kVar == null) {
            return false;
        }
        L l = (L) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (l == null) {
            return false;
        }
        l.run();
        return true;
    }

    public void K(long j3, T t7) {
        RunnableC1768E.f19483x.O(j3, t7);
    }

    public abstract void shutdown();
}
