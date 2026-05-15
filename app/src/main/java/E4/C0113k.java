package E4;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: E4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0113k extends C0105c implements ListIterator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C0114l f1955s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113k(C0114l c0114l) {
        super(c0114l);
        this.f1955s = c0114l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0114l c0114l = this.f1955s;
        boolean zIsEmpty = c0114l.isEmpty();
        b().add(obj);
        c0114l.f1963t.f1896s++;
        if (zIsEmpty) {
            c0114l.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f1917p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113k(C0114l c0114l, int i7) {
        super(c0114l, ((List) c0114l.f1959p).listIterator(i7));
        this.f1955s = c0114l;
    }
}
