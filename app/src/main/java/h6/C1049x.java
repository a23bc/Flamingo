package h6;

import android.content.Context;
import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: h6.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1049x implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f13267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f13269s;

    public /* synthetic */ C1049x(InterfaceC1180a interfaceC1180a, Context context, InterfaceC1182c interfaceC1182c, float f7, int i7, int i8) {
        this.f13265o = i8;
        this.f13266p = interfaceC1180a;
        this.f13267q = context;
        this.f13268r = interfaceC1182c;
        this.f13269s = f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13265o) {
            case 0:
                ((Integer) obj2).getClass();
                InterfaceC1180a interfaceC1180a = this.f13266p;
                AbstractC1209k.f(interfaceC1180a, "$shuffleModeEnabledLambda");
                Context context = this.f13267q;
                AbstractC1209k.f(context, "$context");
                InterfaceC1182c interfaceC1182c = this.f13268r;
                AbstractC1209k.f(interfaceC1182c, "$shuffleModeOnChanged");
                int iB = C0879c.B(3073);
                M3.a.t(interfaceC1180a, context, interfaceC1182c, this.f13269s, (C0912t) obj, iB);
                break;
            default:
                ((Integer) obj2).getClass();
                InterfaceC1180a interfaceC1180a2 = this.f13266p;
                AbstractC1209k.f(interfaceC1180a2, "$repeatModeLambda");
                Context context2 = this.f13267q;
                AbstractC1209k.f(context2, "$context");
                InterfaceC1182c interfaceC1182c2 = this.f13268r;
                AbstractC1209k.f(interfaceC1182c2, "$repeatModeOnChanged");
                int iB2 = C0879c.B(3073);
                M3.a.s(interfaceC1180a2, context2, interfaceC1182c2, this.f13269s, (C0912t) obj, iB2);
                break;
        }
        return Y4.o.f8736a;
    }
}
