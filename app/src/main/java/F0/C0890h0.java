package f0;

import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;
import p0.AbstractC1280A;
import p0.AbstractC1289f;
import p0.C1284a;

/* JADX INFO: renamed from: f0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890h0 extends p0.z implements Parcelable, p0.n, InterfaceC0878b0, Z0 {
    public static final Parcelable.Creator<C0890h0> CREATOR = new C0884e0(2);

    /* JADX INFO: renamed from: p */
    public O0 f11809p;

    public C0890h0(long j3) {
        AbstractC1289f abstractC1289fK = p0.l.k();
        O0 o02 = new O0(abstractC1289fK.g(), j3);
        if (!(abstractC1289fK instanceof C1284a)) {
            o02.f14890b = new O0(1, j3);
        }
        this.f11809p = o02;
    }

    @Override // p0.n
    public final Q0 a() {
        return W.f11767t;
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f11809p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p0.z, p0.y
    public final AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        if (((O0) abstractC1280A2).f11727c == ((O0) abstractC1280A3).f11727c) {
            return abstractC1280A2;
        }
        return null;
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f11809p = (O0) abstractC1280A;
    }

    @Override // f0.Z0
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((O0) p0.l.u(this.f11809p, this)).f11727c;
    }

    public final void j(long j3) {
        AbstractC1289f abstractC1289fK;
        O0 o02 = (O0) p0.l.i(this.f11809p);
        if (o02.f11727c != j3) {
            O0 o03 = this.f11809p;
            synchronized (p0.l.f14941c) {
                abstractC1289fK = p0.l.k();
                ((O0) p0.l.p(o03, this, abstractC1289fK, o02)).f11727c = j3;
            }
            p0.l.o(abstractC1289fK, this);
        }
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        j(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((O0) p0.l.i(this.f11809p)).f11727c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(h());
    }
}
