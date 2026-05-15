package y3;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0593p;
import m5.AbstractC1209k;
import x3.k0;

/* JADX INFO: renamed from: y3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2020i implements Parcelable {
    public static final Parcelable.Creator<C2020i> CREATOR = new k0(2);

    /* JADX INFO: renamed from: o */
    public final String f20418o;

    /* JADX INFO: renamed from: p */
    public final int f20419p;

    /* JADX INFO: renamed from: q */
    public final Bundle f20420q;

    /* JADX INFO: renamed from: r */
    public final Bundle f20421r;

    public C2020i(C2019h c2019h) {
        AbstractC1209k.f(c2019h, "entry");
        this.f20418o = c2019h.f20411t;
        this.f20419p = c2019h.f20407p.f20467t;
        this.f20420q = c2019h.c();
        Bundle bundle = new Bundle();
        this.f20421r = bundle;
        c2019h.f20414w.E(bundle);
    }

    public final C2019h a(Context context, s sVar, EnumC0593p enumC0593p, m mVar) {
        AbstractC1209k.f(context, "context");
        AbstractC1209k.f(enumC0593p, "hostLifecycleState");
        Bundle bundle = this.f20420q;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f20418o;
        AbstractC1209k.f(str, "id");
        return new C2019h(context, sVar, bundle2, enumC0593p, mVar, str, this.f20421r);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "parcel");
        parcel.writeString(this.f20418o);
        parcel.writeInt(this.f20419p);
        parcel.writeBundle(this.f20420q);
        parcel.writeBundle(this.f20421r);
    }

    public C2020i(Parcel parcel) {
        String string = parcel.readString();
        AbstractC1209k.c(string);
        this.f20418o = string;
        this.f20419p = parcel.readInt();
        this.f20420q = parcel.readBundle(C2020i.class.getClassLoader());
        Bundle bundle = parcel.readBundle(C2020i.class.getClassLoader());
        AbstractC1209k.c(bundle);
        this.f20421r = bundle;
    }
}
