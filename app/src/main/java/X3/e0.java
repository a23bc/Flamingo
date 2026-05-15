package x3;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20038c;

    public e0(String str, int i7, int i8) {
        this.f20036a = str;
        this.f20037b = i7;
        this.f20038c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        int i7 = this.f20038c;
        String str = this.f20036a;
        int i8 = this.f20037b;
        return (i8 < 0 || e0Var.f20037b < 0) ? TextUtils.equals(str, e0Var.f20036a) && i7 == e0Var.f20038c : TextUtils.equals(str, e0Var.f20036a) && i8 == e0Var.f20037b && i7 == e0Var.f20038c;
    }

    public final int hashCode() {
        return Objects.hash(this.f20036a, Integer.valueOf(this.f20038c));
    }
}
