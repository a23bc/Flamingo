package M5;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends I5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4871e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4873g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i7, List list) {
        super(str, true);
        this.f4872f = oVar;
        this.f4873g = i7;
    }

    private final long b() {
        this.f4872f.f4901y.getClass();
        try {
            this.f4872f.f4888K.j(this.f4873g, 9);
            synchronized (this.f4872f) {
                this.f4872f.f4890M.remove(Integer.valueOf(this.f4873g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // I5.a
    public final long a() {
        switch (this.f4871e) {
            case 0:
                return b();
            default:
                this.f4872f.f4901y.getClass();
                try {
                    this.f4872f.f4888K.j(this.f4873g, 9);
                    synchronized (this.f4872f) {
                        this.f4872f.f4890M.remove(Integer.valueOf(this.f4873g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i7, List list, boolean z6) {
        super(str, true);
        this.f4872f = oVar;
        this.f4873g = i7;
    }
}
