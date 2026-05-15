package g1;

import i1.C1059b;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0969k {

    /* JADX INFO: renamed from: g */
    public static final C0969k f12361g = new C0969k(false, 0, true, 1, 1, C1059b.f13289q);

    /* JADX INFO: renamed from: a */
    public final boolean f12362a;

    /* JADX INFO: renamed from: b */
    public final int f12363b;

    /* JADX INFO: renamed from: c */
    public final boolean f12364c;

    /* JADX INFO: renamed from: d */
    public final int f12365d;

    /* JADX INFO: renamed from: e */
    public final int f12366e;

    /* JADX INFO: renamed from: f */
    public final C1059b f12367f;

    public C0969k(boolean z6, int i7, boolean z7, int i8, int i9, C1059b c1059b) {
        this.f12362a = z6;
        this.f12363b = i7;
        this.f12364c = z7;
        this.f12365d = i8;
        this.f12366e = i9;
        this.f12367f = c1059b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0969k)) {
            return false;
        }
        C0969k c0969k = (C0969k) obj;
        return this.f12362a == c0969k.f12362a && this.f12363b == c0969k.f12363b && this.f12364c == c0969k.f12364c && this.f12365d == c0969k.f12365d && this.f12366e == c0969k.f12366e && AbstractC1209k.a(this.f12367f, c0969k.f12367f);
    }

    public final int hashCode() {
        return this.f12367f.f13290o.hashCode() + ((((((((((this.f12362a ? 1231 : 1237) * 31) + this.f12363b) * 31) + (this.f12364c ? 1231 : 1237)) * 31) + this.f12365d) * 31) + this.f12366e) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f12362a);
        sb.append(", capitalization=");
        int i7 = this.f12363b;
        sb.append((Object) (i7 == -1 ? "Unspecified" : i7 == 0 ? "None" : i7 == 1 ? "Characters" : i7 == 2 ? "Words" : i7 == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f12364c);
        sb.append(", keyboardType=");
        sb.append((Object) C0970l.a(this.f12365d));
        sb.append(", imeAction=");
        sb.append((Object) C0968j.a(this.f12366e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f12367f);
        sb.append(')');
        return sb.toString();
    }
}
