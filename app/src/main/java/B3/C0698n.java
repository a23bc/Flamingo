package b3;

import E4.I;
import E4.b0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: b3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698n extends AbstractC0693i {
    public static final Parcelable.Creator<C0698n> CREATOR = new K1.h(26);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I f10398q;

    public C0698n(String str, String str2, b0 b0Var) {
        super(str);
        AbstractC1697a.d(!b0Var.isEmpty());
        this.f10397p = str2;
        I iP = I.p(b0Var);
        this.f10398q = iP;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b6  */
    @Override // b3.AbstractC0693i, t2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(t2.I r25) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0698n.b(t2.I):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0698n.class == obj.getClass()) {
            C0698n c0698n = (C0698n) obj;
            if (t.a(this.f10385o, c0698n.f10385o) && t.a(this.f10397p, c0698n.f10397p) && this.f10398q.equals(c0698n.f10398q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = A0.e.C(this.f10385o, 527, 31);
        String str = this.f10397p;
        return this.f10398q.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": description=" + this.f10397p + ": values=" + this.f10398q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10385o);
        parcel.writeString(this.f10397p);
        parcel.writeStringArray((String[]) this.f10398q.toArray(new String[0]));
    }
}
