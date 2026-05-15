package t5;

import java.util.Iterator;
import n5.InterfaceC1237a;
import u5.C1540b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1523g f17108o;

    public l(C1523g c1523g) {
        this.f17108o = c1523g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1540b(this.f17108o);
    }
}
