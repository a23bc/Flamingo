package f0;

import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;
import p0.AbstractC1280A;
import p0.AbstractC1289f;
import p0.C1284a;

/* JADX INFO: renamed from: f0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0894j0 extends p0.z implements Parcelable, p0.n {
    public static final Parcelable.Creator<C0894j0> CREATOR = new C0892i0();

    /* JADX INFO: renamed from: p */
    public final Q0 f11814p;

    /* JADX INFO: renamed from: q */
    public P0 f11815q;

    public C0894j0(Object obj, Q0 q02) {
        this.f11814p = q02;
        AbstractC1289f abstractC1289fK = p0.l.k();
        P0 p02 = new P0(abstractC1289fK.g(), obj);
        if (!(abstractC1289fK instanceof C1284a)) {
            p02.f14890b = new P0(1, obj);
        }
        this.f11815q = p02;
    }

    @Override // p0.n
    public final Q0 a() {
        return this.f11814p;
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f11815q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p0.z, p0.y
    public final AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        if (this.f11814p.a(((P0) abstractC1280A2).f11731c, ((P0) abstractC1280A3).f11731c)) {
            return abstractC1280A2;
        }
        return null;
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f11815q = (P0) abstractC1280A;
    }

    @Override // f0.Z0
    public final Object getValue() {
        return ((P0) p0.l.u(this.f11815q, this)).f11731c;
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        AbstractC1289f abstractC1289fK;
        P0 p02 = (P0) p0.l.i(this.f11815q);
        if (this.f11814p.a(p02.f11731c, obj)) {
            return;
        }
        P0 p03 = this.f11815q;
        synchronized (p0.l.f14941c) {
            abstractC1289fK = p0.l.k();
            ((P0) p0.l.p(p03, this, abstractC1289fK, p02)).f11731c = obj;
        }
        p0.l.o(abstractC1289fK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((P0) p0.l.i(this.f11815q)).f11731c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        parcel.writeValue(getValue());
        W w7 = W.f11764q;
        Q0 q02 = this.f11814p;
        if (AbstractC1209k.a(q02, w7)) {
            i8 = 0;
        } else if (AbstractC1209k.a(q02, W.f11767t)) {
            i8 = 1;
        } else {
            if (!AbstractC1209k.a(q02, W.f11765r)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i8 = 2;
        }
        parcel.writeInt(i8);
    }
}
