package Z4;

import java.util.AbstractList;
import java.util.List;
import n5.InterfaceC1239c;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractList implements List, InterfaceC1239c {
    public abstract int b();

    public abstract Object c(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return c(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
