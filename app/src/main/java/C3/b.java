package c3;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import d3.C0825a;
import d3.C0829e;
import d3.f;
import d3.i;
import d3.j;
import e3.C0851a;
import g.C0934a;
import g.C0940g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;
import n4.C1230a;
import q.N;
import t2.C1483l;
import t2.C1484m;
import t2.L;
import t2.a0;
import x2.C1897a;
import x2.C1898b;
import x3.C1910L;
import x3.C1911M;
import x3.C1927l;
import x3.W;
import x3.X;
import x3.Y;
import x3.h0;
import x3.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10669a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10669a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, c.class.getClassLoader());
                return new d(arrayList);
            case 1:
                return new c(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 2:
                return new e(parcel);
            case 3:
                return new C0825a(parcel);
            case 4:
                return new C0829e(parcel);
            case 5:
                return new f();
            case 6:
                return new i(parcel);
            case 7:
                return new j(parcel.readLong(), parcel.readLong());
            case 8:
                AbstractC1209k.f(parcel, "parcel");
                return new d6.a(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC1209k.f(parcel, "parcel");
                String string = parcel.readString();
                long j3 = parcel.readLong();
                long j7 = parcel.readLong();
                String string2 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList2.add(d6.a.CREATOR.createFromParcel(parcel));
                }
                String string3 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList3.add(d6.f.CREATOR.createFromParcel(parcel));
                }
                return new d6.f(string, j3, j7, string2, arrayList2, string3, arrayList3);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return new C0851a(parcel);
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                AbstractC1209k.f(parcel, "parcel");
                return new C0934a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 12:
                AbstractC1209k.f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC1209k.c(parcelable);
                return new C0940g((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 13:
                String string4 = parcel.readString();
                AbstractC1209k.c(string4);
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    String string5 = parcel.readString();
                    AbstractC1209k.c(string5);
                    String string6 = parcel.readString();
                    AbstractC1209k.c(string6);
                    linkedHashMap.put(string5, string6);
                }
                return new C1230a(string4, linkedHashMap);
            case 14:
                N n7 = new N(parcel);
                n7.f15206o = parcel.readByte() != 0;
                return n7;
            case 15:
                return new C1484m(parcel);
            case 16:
                return new C1483l(parcel);
            case 17:
                return new L(parcel);
            case 18:
                return new a0(parcel);
            case 19:
                return new C1897a(parcel);
            case BuildConfig.API_VERSION /* 20 */:
                return new C1898b(parcel);
            case 21:
                return new x2.c(parcel);
            case 22:
                return new C1927l(parcel);
            case 23:
                C1910L c1910lA = C1910L.a(MediaDescription.CREATOR.createFromParcel(parcel));
                c1910lA.getClass();
                return c1910lA;
            case 24:
                return new C1911M(parcel);
            case 25:
                return new W(parcel);
            case 26:
                X x6 = new X();
                x6.f20019o = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return x6;
            case 27:
                Parcelable parcelable2 = parcel.readParcelable(null);
                parcelable2.getClass();
                return new Y(parcelable2, null);
            case 28:
                h0 h0Var = new h0();
                h0Var.f20045o = parcel.readInt();
                h0Var.f20047q = parcel.readInt();
                h0Var.f20048r = parcel.readInt();
                h0Var.f20049s = parcel.readInt();
                h0Var.f20046p = parcel.readInt();
                return h0Var;
            default:
                return new m0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f10669a) {
            case 0:
                return new d[i7];
            case 1:
                return new c[i7];
            case 2:
                return new e[i7];
            case 3:
                return new C0825a[i7];
            case 4:
                return new C0829e[i7];
            case 5:
                return new f[i7];
            case 6:
                return new i[i7];
            case 7:
                return new j[i7];
            case 8:
                return new d6.a[i7];
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return new d6.f[i7];
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return new C0851a[i7];
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new C0934a[i7];
            case 12:
                return new C0940g[i7];
            case 13:
                return new C1230a[i7];
            case 14:
                return new N[i7];
            case 15:
                return new C1484m[i7];
            case 16:
                return new C1483l[i7];
            case 17:
                return new L[i7];
            case 18:
                return new a0[i7];
            case 19:
                return new C1897a[i7];
            case BuildConfig.API_VERSION /* 20 */:
                return new C1898b[i7];
            case 21:
                return new x2.c[i7];
            case 22:
                return new C1927l[i7];
            case 23:
                return new C1910L[i7];
            case 24:
                return new C1911M[i7];
            case 25:
                return new W[i7];
            case 26:
                return new X[i7];
            case 27:
                return new Y[i7];
            case 28:
                return new h0[i7];
            default:
                return new m0[i7];
        }
    }
}
