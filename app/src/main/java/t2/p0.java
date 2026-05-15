package t2;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: b */
    public static final p0 f16715b;

    /* JADX INFO: renamed from: c */
    public static final String f16716c;

    /* JADX INFO: renamed from: a */
    public final E4.I f16717a;

    static {
        E4.G g6 = E4.I.f1870p;
        f16715b = new p0(E4.b0.f1913s);
        int i7 = w2.t.f18881a;
        f16716c = Integer.toString(0, 36);
    }

    public p0(E4.I i7) {
        this.f16717a = E4.I.p(i7);
    }

    public final boolean a(int i7) {
        int i8 = 0;
        while (true) {
            E4.I i9 = this.f16717a;
            if (i8 >= i9.size()) {
                return false;
            }
            o0 o0Var = (o0) i9.get(i8);
            boolean[] zArr = o0Var.f16648e;
            int length = zArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (!zArr[i10]) {
                    i10++;
                } else if (o0Var.f16645b.f16492c == i7) {
                    return true;
                }
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        return this.f16717a.equals(((p0) obj).f16717a);
    }

    public final int hashCode() {
        return this.f16717a.hashCode();
    }
}
