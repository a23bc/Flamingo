package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractList implements A, RandomAccess {

    /* JADX INFO: renamed from: o */
    public final C0552z f9491o;

    public j0(C0552z c0552z) {
        this.f9491o = c0552z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f9491o.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final void h(C0533f c0533f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        i0 i0Var = new i0();
        i0Var.f9484o = this.f9491o.iterator();
        return i0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final A j() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final Object l(int i7) {
        return this.f9491o.f9550p.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        h0 h0Var = new h0();
        h0Var.f9483o = this.f9491o.listIterator(i7);
        return h0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final List m() {
        return Collections.unmodifiableList(this.f9491o.f9550p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9491o.size();
    }
}
