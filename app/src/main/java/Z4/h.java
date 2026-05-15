package Z4;

import java.util.AbstractSet;
import java.util.Set;
import n5.InterfaceC1242f;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractSet implements Set, InterfaceC1242f {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
