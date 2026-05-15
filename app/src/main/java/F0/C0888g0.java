package f0;

import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;
import p0.AbstractC1280A;
import p0.AbstractC1289f;
import p0.C1284a;

/* JADX INFO: renamed from: f0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0888g0 extends p0.z implements Parcelable, p0.n, InterfaceC0878b0, Z0 {
    public static final Parcelable.Creator<C0888g0> CREATOR = new C0884e0(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public N0 f11807p;

    public C0888g0(int i7) {
        AbstractC1289f abstractC1289fK = p0.l.k();
        N0 n02 = new N0(abstractC1289fK.g(), i7);
        if (!(abstractC1289fK instanceof C1284a)) {
            n02.f14890b = new N0(1, i7);
        }
        this.f11807p = n02;
    }

    @Override // p0.n
    public final Q0 a() {
        return W.f11767t;
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f11807p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p0.z, p0.y
    public final AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        if (((N0) abstractC1280A2).f11725c == ((N0) abstractC1280A3).f11725c) {
            return abstractC1280A2;
        }
        return null;
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f11807p = (N0) abstractC1280A;
    }

    @Override // f0.Z0
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((N0) p0.l.u(this.f11807p, this)).f11725c;
    }

    public final void j(int i7) {
        AbstractC1289f abstractC1289fK;
        N0 n02 = (N0) p0.l.i(this.f11807p);
        if (n02.f11725c != i7) {
            N0 n03 = this.f11807p;
            synchronized (p0.l.f14941c) {
                abstractC1289fK = p0.l.k();
                ((N0) p0.l.p(n03, this, abstractC1289fK, n02)).f11725c = i7;
            }
            p0.l.o(abstractC1289fK, this);
        }
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        j(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((N0) p0.l.i(this.f11807p)).f11725c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(h());
    }
}
