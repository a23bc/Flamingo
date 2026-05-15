package A0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: b */
    public final float f60b;

    /* JADX INFO: renamed from: c */
    public final float f61c;

    /* JADX INFO: renamed from: d */
    public final int f62d;

    /* JADX INFO: renamed from: e */
    public final int f63e;

    public i(float f7, float f8, int i7, int i8, int i9) {
        f8 = (i9 & 2) != 0 ? 4.0f : f8;
        i7 = (i9 & 4) != 0 ? 0 : i7;
        i8 = (i9 & 8) != 0 ? 0 : i8;
        this.f60b = f7;
        this.f61c = f8;
        this.f62d = i7;
        this.f63e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f60b == iVar.f60b && this.f61c == iVar.f61c) {
            if (this.f62d == iVar.f62d) {
                if (this.f63e == iVar.f63e) {
                    iVar.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((n1.c.n(this.f61c, Float.floatToIntBits(this.f60b) * 31, 31) + this.f62d) * 31) + this.f63e) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f60b);
        sb.append(", miter=");
        sb.append(this.f61c);
        sb.append(", cap=");
        String str = "Unknown";
        int i7 = this.f62d;
        sb.append((Object) (i7 == 0 ? "Butt" : i7 == 1 ? "Round" : i7 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i8 = this.f63e;
        if (i8 == 0) {
            str = "Miter";
        } else if (i8 == 1) {
            str = "Round";
        } else if (i8 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
