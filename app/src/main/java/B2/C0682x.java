package b2;

import g2.C0985a;
import g2.C0986b;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0682x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f10346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0985a f10348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0986b f10349d;

    public C0682x(s0 s0Var, int i7, C0985a c0985a, C0986b c0986b) {
        this.f10346a = s0Var;
        this.f10347b = i7;
        this.f10348c = c0985a;
        this.f10349d = c0986b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0682x)) {
            return false;
        }
        C0682x c0682x = (C0682x) obj;
        return this.f10346a == c0682x.f10346a && this.f10347b == c0682x.f10347b && AbstractC1209k.a(this.f10348c, c0682x.f10348c) && AbstractC1209k.a(this.f10349d, c0682x.f10349d);
    }

    public final int hashCode() {
        int iHashCode = ((this.f10346a.hashCode() * 31) + this.f10347b) * 31;
        C0985a c0985a = this.f10348c;
        int i7 = (iHashCode + (c0985a == null ? 0 : c0985a.f12408a)) * 31;
        C0986b c0986b = this.f10349d;
        return i7 + (c0986b != null ? c0986b.f12409a : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f10346a + ", numChildren=" + this.f10347b + ", horizontalAlignment=" + this.f10348c + ", verticalAlignment=" + this.f10349d + ')';
    }

    public /* synthetic */ C0682x(s0 s0Var, int i7, C0985a c0985a, C0986b c0986b, int i8) {
        this(s0Var, i7, (i8 & 4) != 0 ? null : c0985a, (i8 & 8) != 0 ? null : c0986b);
    }
}
