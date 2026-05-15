package M5;

import S5.C0427g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends I5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0427g f4870g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i7, C0427g c0427g, int i8, boolean z6) {
        super(str, true);
        this.f4868e = oVar;
        this.f4869f = i7;
        this.f4870g = c0427g;
        this.h = i8;
    }

    @Override // I5.a
    public final long a() {
        try {
            A a4 = this.f4868e.f4901y;
            C0427g c0427g = this.f4870g;
            int i7 = this.h;
            a4.getClass();
            c0427g.w(i7);
            this.f4868e.f4888K.j(this.f4869f, 9);
            synchronized (this.f4868e) {
                this.f4868e.f4890M.remove(Integer.valueOf(this.f4869f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
