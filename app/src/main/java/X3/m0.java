package x3;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new c3.b(29);

    /* JADX INFO: renamed from: o */
    public final int f20068o;

    /* JADX INFO: renamed from: p */
    public final long f20069p;

    /* JADX INFO: renamed from: q */
    public final long f20070q;

    /* JADX INFO: renamed from: r */
    public final float f20071r;

    /* JADX INFO: renamed from: s */
    public final long f20072s;

    /* JADX INFO: renamed from: t */
    public final int f20073t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f20074u;

    /* JADX INFO: renamed from: v */
    public final long f20075v;

    /* JADX INFO: renamed from: w */
    public final AbstractCollection f20076w;

    /* JADX INFO: renamed from: x */
    public final long f20077x;

    /* JADX INFO: renamed from: y */
    public final Bundle f20078y;

    /* JADX INFO: renamed from: z */
    public PlaybackState f20079z;

    public m0(int i7, long j3, long j7, float f7, long j8, int i8, CharSequence charSequence, long j9, ArrayList arrayList, long j10, Bundle bundle) {
        AbstractCollection arrayList2;
        this.f20068o = i7;
        this.f20069p = j3;
        this.f20070q = j7;
        this.f20071r = f7;
        this.f20072s = j8;
        this.f20073t = i8;
        this.f20074u = charSequence;
        this.f20075v = j9;
        if (arrayList == null) {
            E4.G g6 = E4.I.f1870p;
            arrayList2 = E4.b0.f1913s;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f20076w = arrayList2;
        this.f20077x = j10;
        this.f20078y = bundle;
    }

    public static m0 a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> listJ = i0.j(playbackState);
        if (listJ != null) {
            arrayList = new ArrayList(listJ.size());
            for (PlaybackState.CustomAction customAction : listJ) {
                if (customAction != null) {
                    PlaybackState.CustomAction customAction2 = customAction;
                    Bundle bundleL = i0.l(customAction2);
                    Z.a(bundleL);
                    l0 l0Var = new l0(i0.f(customAction2), i0.o(customAction2), i0.m(customAction2), bundleL);
                    l0Var.f20065s = customAction2;
                    arrayList.add(l0Var);
                }
            }
        }
        Bundle bundleA = j0.a(playbackState);
        Z.a(bundleA);
        m0 m0Var = new m0(i0.r(playbackState), i0.q(playbackState), i0.i(playbackState), i0.p(playbackState), i0.g(playbackState), 0, i0.k(playbackState), i0.n(playbackState), arrayList, i0.h(playbackState), bundleA);
        m0Var.f20079z = playbackState;
        return m0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f20068o + ", position=" + this.f20069p + ", buffered position=" + this.f20070q + ", speed=" + this.f20071r + ", updated=" + this.f20075v + ", actions=" + this.f20072s + ", error code=" + this.f20073t + ", error message=" + this.f20074u + ", custom actions=" + this.f20076w + ", active item id=" + this.f20077x + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f20068o);
        parcel.writeLong(this.f20069p);
        parcel.writeFloat(this.f20071r);
        parcel.writeLong(this.f20075v);
        parcel.writeLong(this.f20070q);
        parcel.writeLong(this.f20072s);
        TextUtils.writeToParcel(this.f20074u, parcel, i7);
        parcel.writeTypedList(this.f20076w);
        parcel.writeLong(this.f20077x);
        parcel.writeBundle(this.f20078y);
        parcel.writeInt(this.f20073t);
    }

    public m0(Parcel parcel) {
        this.f20068o = parcel.readInt();
        this.f20069p = parcel.readLong();
        this.f20071r = parcel.readFloat();
        this.f20075v = parcel.readLong();
        this.f20070q = parcel.readLong();
        this.f20072s = parcel.readLong();
        this.f20074u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection abstractCollectionCreateTypedArrayList = parcel.createTypedArrayList(l0.CREATOR);
        if (abstractCollectionCreateTypedArrayList == null) {
            E4.G g6 = E4.I.f1870p;
            abstractCollectionCreateTypedArrayList = E4.b0.f1913s;
        }
        this.f20076w = abstractCollectionCreateTypedArrayList;
        this.f20077x = parcel.readLong();
        this.f20078y = parcel.readBundle(Z.class.getClassLoader());
        this.f20073t = parcel.readInt();
    }
}
