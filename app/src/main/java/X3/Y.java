package x3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Parcelable {
    public static final Parcelable.Creator<Y> CREATOR = new c3.b(27);

    /* JADX INFO: renamed from: p */
    public final Object f20021p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1923h f20022q;

    /* JADX INFO: renamed from: o */
    public final Object f20020o = new Object();

    /* JADX INFO: renamed from: r */
    public M3.d f20023r = null;

    public Y(Object obj, InterfaceC1923h interfaceC1923h) {
        this.f20021p = obj;
        this.f20022q = interfaceC1923h;
    }

    public final InterfaceC1923h a() {
        InterfaceC1923h interfaceC1923h;
        synchronized (this.f20020o) {
            interfaceC1923h = this.f20022q;
        }
        return interfaceC1923h;
    }

    public final void c(InterfaceC1923h interfaceC1923h) {
        synchronized (this.f20020o) {
            this.f20022q = interfaceC1923h;
        }
    }

    public final void d(M3.d dVar) {
        synchronized (this.f20020o) {
            this.f20023r = dVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        Object obj2 = this.f20021p;
        if (obj2 == null) {
            return y6.f20021p == null;
        }
        Object obj3 = y6.f20021p;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f20021p;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable((Parcelable) this.f20021p, i7);
    }
}
