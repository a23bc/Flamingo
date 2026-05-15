package m1;

import j5.AbstractC1109c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b */
    public static final int f14331b = AbstractC1109c.k(1, 3);

    /* JADX INFO: renamed from: a */
    public final int f14332a;

    public /* synthetic */ e(int i7) {
        this.f14332a = i7;
    }

    public static String a(int i7) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i8 = i7 & 255;
        String str = "Invalid";
        sb.append((Object) (i8 == 1 ? "Strategy.Simple" : i8 == 2 ? "Strategy.HighQuality" : i8 == 3 ? "Strategy.Balanced" : i8 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i9 = (i7 >> 8) & 255;
        sb.append((Object) (i9 == 1 ? "Strictness.None" : i9 == 2 ? "Strictness.Loose" : i9 == 3 ? "Strictness.Normal" : i9 == 4 ? "Strictness.Strict" : i9 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i10 = (i7 >> 16) & 255;
        if (i10 == 1) {
            str = "WordBreak.None";
        } else if (i10 == 2) {
            str = "WordBreak.Phrase";
        } else if (i10 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f14332a == ((e) obj).f14332a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14332a;
    }

    public final String toString() {
        return a(this.f14332a);
    }
}
