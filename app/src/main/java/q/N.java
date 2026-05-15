package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class N extends View.BaseSavedState {
    public static final Parcelable.Creator<N> CREATOR = new c3.b(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15206o;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f15206o ? (byte) 1 : (byte) 0);
    }
}
