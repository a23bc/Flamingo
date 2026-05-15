package f0;

import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;
import p0.AbstractC1280A;
import p0.AbstractC1289f;
import p0.C1284a;

/* JADX INFO: renamed from: f0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0886f0 extends p0.z implements Parcelable, p0.n, InterfaceC0878b0, Z0 {
    public static final Parcelable.Creator<C0886f0> CREATOR = new C0884e0(0);

    /* JADX INFO: renamed from: p */
    public M0 f11800p;

    public C0886f0(float f7) {
        AbstractC1289f abstractC1289fK = p0.l.k();
        M0 m02 = new M0(abstractC1289fK.g(), f7);
        if (!(abstractC1289fK instanceof C1284a)) {
            m02.f14890b = new M0(1, f7);
        }
        this.f11800p = m02;
    }

    @Override // p0.n
    public final Q0 a() {
        return W.f11767t;
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f11800p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p0.z, p0.y
    public final AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        if (((M0) abstractC1280A2).f11719c == ((M0) abstractC1280A3).f11719c) {
            return abstractC1280A2;
        }
        return null;
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f11800p = (M0) abstractC1280A;
    }

    @Override // f0.Z0
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((M0) p0.l.u(this.f11800p, this)).f11719c;
    }

    public final void j(float f7) {
        AbstractC1289f abstractC1289fK;
        M0 m02 = (M0) p0.l.i(this.f11800p);
        if (m02.f11719c == f7) {
            return;
        }
        M0 m03 = this.f11800p;
        synchronized (p0.l.f14941c) {
            abstractC1289fK = p0.l.k();
            ((M0) p0.l.p(m03, this, abstractC1289fK, m02)).f11719c = f7;
        }
        p0.l.o(abstractC1289fK, this);
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        j(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((M0) p0.l.i(this.f11800p)).f11719c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(h());
    }
}
