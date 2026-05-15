package W3;

import N3.v;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f7799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N3.h f7800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f7802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f7803f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7801d != hVar.f7801d) {
            return false;
        }
        String str = this.f7798a;
        if (str != null) {
            if (!str.equals(hVar.f7798a)) {
                return false;
            }
        } else if (hVar.f7798a != null) {
            return false;
        }
        if (this.f7799b != hVar.f7799b) {
            return false;
        }
        N3.h hVar2 = this.f7800c;
        if (hVar2 != null) {
            if (!hVar2.equals(hVar.f7800c)) {
                return false;
            }
        } else if (hVar.f7800c != null) {
            return false;
        }
        ArrayList arrayList = this.f7802e;
        if (arrayList != null) {
            if (!arrayList.equals(hVar.f7802e)) {
                return false;
            }
        } else if (hVar.f7802e != null) {
            return false;
        }
        ArrayList arrayList2 = this.f7803f;
        ArrayList arrayList3 = hVar.f7803f;
        return arrayList2 != null ? arrayList2.equals(arrayList3) : arrayList3 == null;
    }

    public final int hashCode() {
        String str = this.f7798a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        v vVar = this.f7799b;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        N3.h hVar = this.f7800c;
        int iHashCode3 = (((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f7801d) * 31;
        ArrayList arrayList = this.f7802e;
        int iHashCode4 = (iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList arrayList2 = this.f7803f;
        return iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }
}
