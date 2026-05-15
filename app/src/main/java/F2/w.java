package F2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2310c;

    public w(String str, boolean z6, boolean z7) {
        this.f2308a = str;
        this.f2309b = z6;
        this.f2310c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == w.class) {
            w wVar = (w) obj;
            if (TextUtils.equals(this.f2308a, wVar.f2308a) && this.f2309b == wVar.f2309b && this.f2310c == wVar.f2310c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((A0.e.C(this.f2308a, 31, 31) + (this.f2309b ? 1231 : 1237)) * 31) + (this.f2310c ? 1231 : 1237);
    }
}
