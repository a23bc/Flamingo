package h3;

/* JADX INFO: renamed from: h3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1001c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12565o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12566p;

    public /* synthetic */ AbstractC1001c() {
    }

    public static String b(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int e(int i7) {
        return (i7 >> 24) & 255;
    }

    public void a(int i7) {
        this.f12566p = i7 | this.f12566p;
    }

    public boolean c(int i7) {
        return (this.f12566p & i7) == i7;
    }

    public String toString() {
        switch (this.f12565o) {
            case 0:
                return b(this.f12566p);
            default:
                return super.toString();
        }
    }

    public AbstractC1001c(int i7) {
        this.f12566p = i7;
    }
}
