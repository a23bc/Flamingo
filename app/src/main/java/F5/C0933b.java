package f5;

import Z1.l;
import Z4.e;
import java.io.Serializable;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: f5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0933b extends e implements InterfaceC0932a, Serializable {

    /* JADX INFO: renamed from: o */
    public final Enum[] f12242o;

    public C0933b(Enum[] enumArr) {
        AbstractC1209k.f(enumArr, "entries");
        this.f12242o = enumArr;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        return this.f12242o.length;
    }

    @Override // Z4.AbstractC0507a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        AbstractC1209k.f(r42, "element");
        int iOrdinal = r42.ordinal();
        Enum[] enumArr = this.f12242o;
        AbstractC1209k.f(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f12242o;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, length, ", size: "));
        }
        return enumArr[i7];
    }

    @Override // Z4.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        AbstractC1209k.f(r42, "element");
        int iOrdinal = r42.ordinal();
        Enum[] enumArr = this.f12242o;
        AbstractC1209k.f(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // Z4.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        AbstractC1209k.f(r22, "element");
        return indexOf(r22);
    }
}
