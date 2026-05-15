package t5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: t5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1517a implements InterfaceC1524h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17090a;

    public C1517a(InterfaceC1524h interfaceC1524h) {
        this.f17090a = new AtomicReference(interfaceC1524h);
    }

    @Override // t5.InterfaceC1524h
    public final Iterator iterator() {
        InterfaceC1524h interfaceC1524h = (InterfaceC1524h) this.f17090a.getAndSet(null);
        if (interfaceC1524h != null) {
            return interfaceC1524h.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
