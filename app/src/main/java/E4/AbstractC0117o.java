package E4;

/* JADX INFO: renamed from: E4.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0117o {

    /* JADX INFO: renamed from: o */
    public transient C0107e f1967o;

    /* JADX INFO: renamed from: p */
    public transient C0116n f1968p;

    /* JADX INFO: renamed from: q */
    public transient C0106d f1969q;

    public abstract C0106d a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0117o) {
            return ((W) this).a().equals(((W) ((AbstractC0117o) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f1923q.hashCode();
    }

    public final String toString() {
        return a().f1923q.toString();
    }
}
