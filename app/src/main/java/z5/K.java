package z5;

import A5.AbstractC0026b;
import A5.AbstractC0027c;
import A5.AbstractC0028d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0028d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f21270a = new AtomicReference(null);

    @Override // A5.AbstractC0028d
    public final boolean a(AbstractC0026b abstractC0026b) {
        AtomicReference atomicReference = this.f21270a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(z.f21345b);
        return true;
    }

    @Override // A5.AbstractC0028d
    public final c5.d[] b(AbstractC0026b abstractC0026b) {
        this.f21270a.set(null);
        return AbstractC0027c.f537a;
    }
}
