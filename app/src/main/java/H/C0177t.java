package H;

import android.app.PendingIntent;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w.C1670c;
import y0.C1960J;

/* JADX INFO: renamed from: H.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0177t implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2924q;

    public /* synthetic */ C0177t(int i7, long j3, Object obj) {
        this.f2922o = i7;
        this.f2924q = obj;
        this.f2923p = j3;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) throws PendingIntent.CanceledException {
        long j3 = this.f2923p;
        Y4.o oVar = Y4.o.f8736a;
        Object obj2 = this.f2924q;
        switch (this.f2922o) {
            case 0:
                long jC = n1.k.c(((n1.k) ((C1670c) obj).e()).f14514a, j3);
                int i7 = C0183z.f2939r;
                C0183z c0183z = (C0183z) obj2;
                c0183z.e(jC);
                c0183z.f2942c.a();
                break;
            case 1:
                A0.f fVar = (A0.f) obj;
                M.Z z6 = (M.Z) obj2;
                if (((Boolean) z6.f4513s.getValue()).booleanValue() || ((Boolean) z6.f4514t.getValue()).booleanValue()) {
                    A0.e.x(0.0f, 126, this.f2923p, 0L, fVar);
                }
                break;
            default:
                C1960J c1960j = (C1960J) obj;
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj2;
                AbstractC1209k.f(interfaceC1180a, "$scaleProvider");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.i(((Number) interfaceC1180a.a()).floatValue());
                c1960j.j(((Number) interfaceC1180a.a()).floatValue());
                c1960j.q(j3);
                break;
        }
        return oVar;
    }
}
