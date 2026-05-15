package D5;

import N3.p;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Runnable f1624q;

    public j(Runnable runnable, long j3, p pVar) {
        super(j3, pVar);
        this.f1624q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1624q.run();
        } finally {
            this.f1623p.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1624q;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1767D.m(runnable));
        sb.append(", ");
        sb.append(this.f1622o);
        sb.append(", ");
        sb.append(this.f1623p);
        sb.append(']');
        return sb.toString();
    }
}
