package A;

import Y4.o;
import l5.InterfaceC1182c;
import m5.C1217s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1217s f9p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f10q;

    public /* synthetic */ d(C1217s c1217s, InterfaceC1182c interfaceC1182c, int i7) {
        this.f8o = i7;
        this.f9p = c1217s;
        this.f10q = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        int i7 = this.f8o;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i7) {
            case 0:
                C1217s c1217s = this.f9p;
                float f7 = c1217s.f14436o - fFloatValue;
                c1217s.f14436o = f7;
                this.f10q.b(Float.valueOf(f7));
                break;
            default:
                C1217s c1217s2 = this.f9p;
                float f8 = c1217s2.f14436o - fFloatValue;
                c1217s2.f14436o = f8;
                this.f10q.b(Float.valueOf(f8));
                break;
        }
        return o.f8736a;
    }
}
