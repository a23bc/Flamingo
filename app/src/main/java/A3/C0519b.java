package a3;

import A0.e;
import K1.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import t2.C1487p;
import t2.I;
import t2.K;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: a3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0519b implements K {
    public static final Parcelable.Creator<C0519b> CREATOR = new h(11);

    /* JADX INFO: renamed from: o */
    public final int f8841o;

    /* JADX INFO: renamed from: p */
    public final String f8842p;

    /* JADX INFO: renamed from: q */
    public final String f8843q;

    /* JADX INFO: renamed from: r */
    public final String f8844r;

    /* JADX INFO: renamed from: s */
    public final boolean f8845s;

    /* JADX INFO: renamed from: t */
    public final int f8846t;

    public C0519b(int i7, int i8, String str, String str2, String str3, boolean z6) {
        AbstractC1697a.d(i8 == -1 || i8 > 0);
        this.f8841o = i7;
        this.f8842p = str;
        this.f8843q = str2;
        this.f8844r = str3;
        this.f8845s = z6;
        this.f8846t = i8;
    }

    public static C0519b a(Map map) {
        boolean z6;
        int i7;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i8;
        List list = (List) map.get("icy-br");
        boolean z7 = true;
        int i9 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i8 = Integer.parseInt(str4) * 1000;
                if (i8 > 0) {
                    z6 = true;
                } else {
                    try {
                        AbstractC1697a.w("Invalid bitrate: " + str4);
                        z6 = false;
                        i8 = -1;
                    } catch (NumberFormatException unused) {
                        e.H("Invalid bitrate header: ", str4);
                        z6 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i8 = -1;
            }
            i7 = i8;
        } else {
            z6 = false;
            i7 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z6 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z6 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z6 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z6 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i10 = Integer.parseInt(str5);
                if (i10 > 0) {
                    i9 = i10;
                } else {
                    try {
                        AbstractC1697a.w("Invalid metadata interval: " + str5);
                        z7 = z6;
                    } catch (NumberFormatException unused3) {
                        i9 = i10;
                        e.H("Invalid metadata interval: ", str5);
                    }
                }
                z6 = z7;
            } catch (NumberFormatException unused4) {
            }
        }
        int i11 = i9;
        if (z6) {
            return new C0519b(i7, i11, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // t2.K
    public final void b(I i7) {
        String str = this.f8843q;
        if (str != null) {
            i7.f16236F = str;
        }
        String str2 = this.f8842p;
        if (str2 != null) {
            i7.f16234D = str2;
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
        if (obj != null && C0519b.class == obj.getClass()) {
            C0519b c0519b = (C0519b) obj;
            if (this.f8841o == c0519b.f8841o && t.a(this.f8842p, c0519b.f8842p) && t.a(this.f8843q, c0519b.f8843q) && t.a(this.f8844r, c0519b.f8844r) && this.f8845s == c0519b.f8845s && this.f8846t == c0519b.f8846t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.f8841o) * 31;
        String str = this.f8842p;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8843q;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8844r;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f8845s ? 1 : 0)) * 31) + this.f8846t;
    }

    @Override // t2.K
    public final /* synthetic */ C1487p i() {
        return null;
    }

    @Override // t2.K
    public final /* synthetic */ byte[] n() {
        return null;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f8843q + "\", genre=\"" + this.f8842p + "\", bitrate=" + this.f8841o + ", metadataInterval=" + this.f8846t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8841o);
        parcel.writeString(this.f8842p);
        parcel.writeString(this.f8843q);
        parcel.writeString(this.f8844r);
        int i8 = t.f18881a;
        parcel.writeInt(this.f8845s ? 1 : 0);
        parcel.writeInt(this.f8846t);
    }

    public C0519b(Parcel parcel) {
        this.f8841o = parcel.readInt();
        this.f8842p = parcel.readString();
        this.f8843q = parcel.readString();
        this.f8844r = parcel.readString();
        int i7 = t.f18881a;
        this.f8845s = parcel.readInt() != 0;
        this.f8846t = parcel.readInt();
    }
}
