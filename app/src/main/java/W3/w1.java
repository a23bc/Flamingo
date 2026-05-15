package w3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w1 f19385b = new w1(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19386c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.M f19387a;

    static {
        int i7 = w2.t.f18881a;
        f19386c = Integer.toString(0, 36);
    }

    public w1(HashSet hashSet) {
        this.f19387a = E4.M.p(hashSet);
    }

    public static w1 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19386c);
        if (parcelableArrayList == null) {
            AbstractC1697a.w("Missing commands. Creating an empty SessionCommands");
            return f19385b;
        }
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
            hashSet.add(v1.a((Bundle) parcelableArrayList.get(i7)));
        }
        return new w1(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f19387a.equals(((w1) obj).f19387a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19387a);
    }
}
