package M5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends I5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4864g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i7, int i8, int i9) {
        super(str, true);
        this.f4862e = i9;
        this.f4863f = oVar;
        this.f4864g = i7;
        this.h = i8;
    }

    @Override // I5.a
    public final long a() {
        switch (this.f4862e) {
            case 0:
                int i7 = this.f4864g;
                int i8 = this.h;
                o oVar = this.f4863f;
                oVar.getClass();
                try {
                    oVar.f4888K.i(i7, i8, true);
                    return -1L;
                } catch (IOException e7) {
                    oVar.b(2, 2, e7);
                    return -1L;
                }
            case 1:
                A a4 = this.f4863f.f4901y;
                int i9 = this.h;
                a4.getClass();
                Z1.l.w(i9, "errorCode");
                synchronized (this.f4863f) {
                    this.f4863f.f4890M.remove(Integer.valueOf(this.f4864g));
                }
                return -1L;
            default:
                o oVar2 = this.f4863f;
                try {
                    int i10 = this.f4864g;
                    int i11 = this.h;
                    oVar2.getClass();
                    Z1.l.w(i11, "statusCode");
                    oVar2.f4888K.j(i10, i11);
                    return -1L;
                } catch (IOException e8) {
                    oVar2.b(2, 2, e8);
                    return -1L;
                }
        }
    }
}
