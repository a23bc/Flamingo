package p4;

import android.graphics.drawable.Drawable;
import m5.AbstractC1209k;
import n4.C1230a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f15092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g4.f f15094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1230a f15095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15098g;

    public n(Drawable drawable, h hVar, g4.f fVar, C1230a c1230a, String str, boolean z6, boolean z7) {
        this.f15092a = drawable;
        this.f15093b = hVar;
        this.f15094c = fVar;
        this.f15095d = c1230a;
        this.f15096e = str;
        this.f15097f = z6;
        this.f15098g = z7;
    }

    @Override // p4.i
    public final Drawable a() {
        return this.f15092a;
    }

    @Override // p4.i
    public final h b() {
        return this.f15093b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC1209k.a(this.f15092a, nVar.f15092a)) {
            return AbstractC1209k.a(this.f15093b, nVar.f15093b) && this.f15094c == nVar.f15094c && AbstractC1209k.a(this.f15095d, nVar.f15095d) && AbstractC1209k.a(this.f15096e, nVar.f15096e) && this.f15097f == nVar.f15097f && this.f15098g == nVar.f15098g;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f15094c.hashCode() + ((this.f15093b.hashCode() + (this.f15092a.hashCode() * 31)) * 31)) * 31;
        C1230a c1230a = this.f15095d;
        int iHashCode2 = (iHashCode + (c1230a != null ? c1230a.hashCode() : 0)) * 31;
        String str = this.f15096e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f15097f ? 1231 : 1237)) * 31) + (this.f15098g ? 1231 : 1237);
    }
}
