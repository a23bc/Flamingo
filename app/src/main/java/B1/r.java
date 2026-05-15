package b1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.c f10003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10005c;

    public r(j1.c cVar, int i7, int i8) {
        this.f10003a = cVar;
        this.f10004b = i7;
        this.f10005c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f10003a.equals(rVar.f10003a) && this.f10004b == rVar.f10004b && this.f10005c == rVar.f10005c;
    }

    public final int hashCode() {
        return (((this.f10003a.hashCode() * 31) + this.f10004b) * 31) + this.f10005c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f10003a);
        sb.append(", startIndex=");
        sb.append(this.f10004b);
        sb.append(", endIndex=");
        return Z1.l.r(sb, this.f10005c, ')');
    }
}
