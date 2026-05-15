package Z4;

import java.util.Iterator;
import m5.AbstractC1209k;
import t5.InterfaceC1524h;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC1524h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8816b;

    public /* synthetic */ m(int i7, Object obj) {
        this.f8815a = i7;
        this.f8816b = obj;
    }

    @Override // t5.InterfaceC1524h
    public final Iterator iterator() {
        switch (this.f8815a) {
            case 0:
                return AbstractC1209k.j((Object[]) this.f8816b);
            case 1:
                return ((Iterable) this.f8816b).iterator();
            default:
                return (Iterator) this.f8816b;
        }
    }
}
