package K1;

import I4.s;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import m5.AbstractC1209k;
import w2.AbstractC1697a;
import w3.InterfaceC1728h0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements s {

    /* JADX INFO: renamed from: o */
    public final int f3968o;

    /* JADX INFO: renamed from: p */
    public boolean f3969p;

    /* JADX INFO: renamed from: q */
    public final Object f3970q;

    /* JADX INFO: renamed from: r */
    public final Object f3971r;

    public k(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f3970q = jArr;
        this.f3971r = remoteViewsArr;
        this.f3969p = false;
        this.f3968o = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = Z4.n.K0(Z4.n.N0(arrayList)).size();
        if (size > 1) {
            throw new IllegalArgumentException(Z1.l.o(size, "View type count is set to 1, but the collection contains ", " different layout ids").toString());
        }
    }

    @Override // I4.s
    public void f(Throwable th) {
        if (this.f3969p) {
            return;
        }
        AbstractC1697a.w("Failed to load bitmap: " + th.getMessage());
    }

    @Override // I4.s
    public void g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (this.f3969p) {
            return;
        }
        u1.i iVar = (u1.i) this.f3970q;
        iVar.c(bitmap);
        ((InterfaceC1728h0) this.f3971r).a(new C1.k(this.f3968o, iVar.a()));
    }

    public k(Parcel parcel) {
        AbstractC1209k.f(parcel, "parcel");
        int i7 = parcel.readInt();
        long[] jArr = new long[i7];
        this.f3970q = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        AbstractC1209k.e(creator, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[i7];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i8 = 0; i8 < i7; i8++) {
            if (remoteViewsArr[i8] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.f3971r = remoteViewsArr;
        this.f3969p = parcel.readInt() == 1;
        this.f3968o = parcel.readInt();
    }

    public k(int i7, u1.i iVar, InterfaceC1728h0 interfaceC1728h0) {
        this.f3968o = i7;
        this.f3970q = iVar;
        this.f3971r = interfaceC1728h0;
    }
}
