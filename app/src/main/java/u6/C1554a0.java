package u6;

import f0.C0879c;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u6.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1554a0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d6.f f17561p;

    public /* synthetic */ C1554a0(d6.f fVar, int i7) {
        this.f17560o = i7;
        this.f17561p = fVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f17560o) {
            case 0:
                d6.f fVar = this.f17561p;
                AbstractC1209k.f(fVar, "$line");
                float f7 = fVar.f11291p;
                float fH = E0.f17384b.h() - f7;
                if (fH < 0.0f) {
                    fH = 0.0f;
                }
                float f8 = fH / (fVar.f11292q - f7);
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
                return Float.valueOf(f8);
            default:
                d6.f fVar2 = this.f17561p;
                AbstractC1209k.f(fVar2, "$line");
                return C0879c.t(Z4.n.r0(fVar2.f11296u));
        }
    }
}
