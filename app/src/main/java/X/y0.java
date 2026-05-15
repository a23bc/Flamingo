package X;

import android.view.textclassifier.TextClassification;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClassification f8214c;

    public y0(CharSequence charSequence, long j3, TextClassification textClassification) {
        this.f8212a = charSequence;
        this.f8213b = j3;
        this.f8214c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return AbstractC1209k.a(this.f8212a, y0Var.f8212a) && b1.L.b(this.f8213b, y0Var.f8213b) && AbstractC1209k.a(this.f8214c, y0Var.f8214c);
    }

    public final int hashCode() {
        int iHashCode = this.f8212a.hashCode() * 31;
        int i7 = b1.L.f9944c;
        long j3 = this.f8213b;
        return this.f8214c.hashCode() + ((((int) (j3 ^ (j3 >>> 32))) + iHashCode) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f8212a) + ", selection=" + ((Object) b1.L.h(this.f8213b)) + ", textClassification=" + this.f8214c + ')';
    }
}
