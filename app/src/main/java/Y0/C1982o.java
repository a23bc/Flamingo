package y0;

import android.graphics.RenderEffect;

/* JADX INFO: renamed from: y0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1982o extends H.P {

    /* JADX INFO: renamed from: c */
    public final float f20250c;

    /* JADX INFO: renamed from: d */
    public final float f20251d;

    /* JADX INFO: renamed from: e */
    public final int f20252e;

    public C1982o(float f7, float f8, int i7) {
        super(5);
        this.f20250c = f7;
        this.f20251d = f8;
        this.f20252e = i7;
    }

    @Override // H.P
    public final RenderEffect Q0() {
        float f7 = this.f20250c;
        float f8 = this.f20251d;
        return (f7 == 0.0f && f8 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f7, f8, AbstractC1959I.w(this.f20252e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1982o)) {
            return false;
        }
        C1982o c1982o = (C1982o) obj;
        return this.f20250c == c1982o.f20250c && this.f20251d == c1982o.f20251d && this.f20252e == c1982o.f20252e;
    }

    public final int hashCode() {
        return n1.c.n(this.f20251d, Float.floatToIntBits(this.f20250c) * 31, 31) + this.f20252e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurEffect(renderEffect=null, radiusX=");
        sb.append(this.f20250c);
        sb.append(", radiusY=");
        sb.append(this.f20251d);
        sb.append(", edgeTreatment=");
        int i7 = this.f20252e;
        sb.append((Object) (i7 == 0 ? "Clamp" : i7 == 1 ? "Repeated" : i7 == 2 ? "Mirror" : i7 == 3 ? "Decal" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
