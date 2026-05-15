package M5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n extends I5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i7, long j3) {
        super(str, true);
        this.f4874e = oVar;
        this.f4875f = i7;
        this.f4876g = j3;
    }

    @Override // I5.a
    public final long a() {
        o oVar = this.f4874e;
        try {
            oVar.f4888K.o(this.f4876g, this.f4875f);
            return -1L;
        } catch (IOException e7) {
            oVar.b(2, 2, e7);
            return -1L;
        }
    }
}
