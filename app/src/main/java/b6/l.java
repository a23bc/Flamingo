package b6;

import android.database.Cursor;
import android.os.Build;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10438g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10441k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f10442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f10443n;

    public l(Cursor cursor) {
        Integer numValueOf;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("title");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("artist");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("album");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("album_artist");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("_data");
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("mime_type");
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("duration");
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("track");
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("album_id");
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("year");
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("date_modified");
        int i7 = Build.VERSION.SDK_INT;
        int i8 = 30;
        if (i7 >= 30) {
            numValueOf = Integer.valueOf(cursor.getColumnIndexOrThrow("genre"));
            i8 = 30;
        } else {
            numValueOf = null;
        }
        Integer numValueOf2 = i7 >= i8 ? Integer.valueOf(cursor.getColumnIndexOrThrow("disc_number")) : null;
        this.f10432a = columnIndexOrThrow;
        this.f10433b = columnIndexOrThrow2;
        this.f10434c = columnIndexOrThrow3;
        this.f10435d = columnIndexOrThrow4;
        this.f10436e = columnIndexOrThrow5;
        this.f10437f = columnIndexOrThrow6;
        this.f10438g = columnIndexOrThrow7;
        this.h = columnIndexOrThrow8;
        this.f10439i = columnIndexOrThrow9;
        this.f10440j = columnIndexOrThrow10;
        this.f10441k = columnIndexOrThrow11;
        this.l = columnIndexOrThrow12;
        this.f10442m = numValueOf;
        this.f10443n = numValueOf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f10432a == lVar.f10432a && this.f10433b == lVar.f10433b && this.f10434c == lVar.f10434c && this.f10435d == lVar.f10435d && this.f10436e == lVar.f10436e && this.f10437f == lVar.f10437f && this.f10438g == lVar.f10438g && this.h == lVar.h && this.f10439i == lVar.f10439i && this.f10440j == lVar.f10440j && this.f10441k == lVar.f10441k && this.l == lVar.l && AbstractC1209k.a(this.f10442m, lVar.f10442m) && AbstractC1209k.a(this.f10443n, lVar.f10443n);
    }

    public final int hashCode() {
        int i7 = ((((((((((((((((((((((this.f10432a * 31) + this.f10433b) * 31) + this.f10434c) * 31) + this.f10435d) * 31) + this.f10436e) * 31) + this.f10437f) * 31) + this.f10438g) * 31) + this.h) * 31) + this.f10439i) * 31) + this.f10440j) * 31) + this.f10441k) * 31) + this.l) * 31;
        Integer num = this.f10442m;
        int iHashCode = (i7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10443n;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ColumnIndices(id=" + this.f10432a + ", title=" + this.f10433b + ", artist=" + this.f10434c + ", album=" + this.f10435d + ", albumArtist=" + this.f10436e + ", path=" + this.f10437f + ", mimeType=" + this.f10438g + ", duration=" + this.h + ", trackNumber=" + this.f10439i + ", albumId=" + this.f10440j + ", year=" + this.f10441k + ", dateModified=" + this.l + ", genre=" + this.f10442m + ", discNumber=" + this.f10443n + ')';
    }
}
