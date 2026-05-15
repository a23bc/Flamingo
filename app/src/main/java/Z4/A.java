package Z4;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m5.AbstractC1209k;
import r5.C1423d;
import u5.C1541c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8800o = 0;

    /* JADX INFO: renamed from: p */
    public final Object f8801p;

    public A(List list) {
        AbstractC1209k.f(list, "delegate");
        this.f8801p = list;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        switch (this.f8800o) {
            case 0:
                return ((List) this.f8801p).size();
            default:
                return ((C1541c) this.f8801p).f17319a.groupCount() + 1;
        }
    }

    @Override // Z4.AbstractC0507a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f8800o) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f8800o) {
            case 0:
                if (i7 >= 0 && i7 <= o.d0(this)) {
                    return ((List) this.f8801p).get(o.d0(this) - i7);
                }
                StringBuilder sbV = n1.c.v(i7, "Element index ", " must be in range [");
                sbV.append(new C1423d(0, o.d0(this), 1));
                sbV.append("].");
                throw new IndexOutOfBoundsException(sbV.toString());
            default:
                String strGroup = ((C1541c) this.f8801p).f17319a.group(i7);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // Z4.e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f8800o) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // Z4.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f8800o) {
            case 0:
                return new z(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // Z4.e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f8800o) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // Z4.e, java.util.List
    public ListIterator listIterator() {
        switch (this.f8800o) {
            case 0:
                return new z(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // Z4.e, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f8800o) {
            case 0:
                return new z(this, i7);
            default:
                return super.listIterator(i7);
        }
    }

    public A(C1541c c1541c) {
        this.f8801p = c1541c;
    }
}
