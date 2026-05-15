package y3;

import android.os.Bundle;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: o */
    public final s f20456o;

    /* JADX INFO: renamed from: p */
    public final Bundle f20457p;

    /* JADX INFO: renamed from: q */
    public final boolean f20458q;

    /* JADX INFO: renamed from: r */
    public final int f20459r;

    /* JADX INFO: renamed from: s */
    public final boolean f20460s;

    public r(s sVar, Bundle bundle, boolean z6, int i7, boolean z7) {
        AbstractC1209k.f(sVar, "destination");
        this.f20456o = sVar;
        this.f20457p = bundle;
        this.f20458q = z6;
        this.f20459r = i7;
        this.f20460s = z7;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(r rVar) {
        AbstractC1209k.f(rVar, "other");
        boolean z6 = rVar.f20458q;
        boolean z7 = this.f20458q;
        if (z7 && !z6) {
            return 1;
        }
        if (!z7 && z6) {
            return -1;
        }
        int i7 = this.f20459r - rVar.f20459r;
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        Bundle bundle = rVar.f20457p;
        Bundle bundle2 = this.f20457p;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            AbstractC1209k.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z8 = rVar.f20460s;
        boolean z9 = this.f20460s;
        if (!z9 || z8) {
            return (z9 || !z8) ? 0 : -1;
        }
        return 1;
    }
}
