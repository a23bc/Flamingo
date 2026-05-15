package V4;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r5.C1420a;
import s5.InterfaceC1438c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f7556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1420a f7557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f7558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f7559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z6, C1420a c1420a, float f7, InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f7556p = z6;
        this.f7557q = c1420a;
        this.f7558r = f7;
        this.f7559s = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y0.j jVar = (Y0.j) obj;
        AbstractC1209k.f(jVar, "$this$semantics");
        boolean z6 = this.f7556p;
        Y4.o oVar = Y4.o.f8736a;
        if (!z6) {
            InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
            jVar.i(Y0.t.f8537i, oVar);
        }
        r rVar = new r(this.f7557q, this.f7558r, this.f7559s);
        InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
        jVar.i(Y0.i.h, new Y0.a(null, rVar));
        return oVar;
    }
}
