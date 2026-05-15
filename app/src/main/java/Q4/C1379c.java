package q4;

import android.content.Context;
import android.util.DisplayMetrics;
import e4.C0859h;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: q4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1379c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15584a;

    public C1379c(Context context) {
        this.f15584a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1379c) {
            return AbstractC1209k.a(this.f15584a, ((C1379c) obj).f15584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15584a.hashCode();
    }

    @Override // q4.i
    public final Object k(C0859h c0859h) {
        DisplayMetrics displayMetrics = this.f15584a.getResources().getDisplayMetrics();
        C1377a c1377a = new C1377a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(c1377a, c1377a);
    }
}
