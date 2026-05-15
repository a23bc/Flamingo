package b2;

/* JADX INFO: renamed from: b2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0651c {

    /* JADX INFO: renamed from: a */
    public final int f10163a;

    public C0651c(int i7) {
        this.f10163a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0651c) && this.f10163a == ((C0651c) obj).f10163a;
    }

    public final int hashCode() {
        return this.f10163a;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("AppWidgetId(appWidgetId="), this.f10163a, ')');
    }
}
