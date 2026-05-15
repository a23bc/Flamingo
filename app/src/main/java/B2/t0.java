package b2;

import O1.InterfaceC0335g;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f10329p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, c5.d dVar) {
        super(2, dVar);
        this.f10329p = context;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new t0(this.f10329p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10328o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        Context context = this.f10329p;
        W w7 = new W(context);
        this.f10328o = 1;
        String packageName = context.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = w7.f10129b.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : installedProviders) {
            if (AbstractC1209k.a(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(Z4.p.j0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object objA = ((InterfaceC0335g) w7.f10130c.getValue()).a(new S(Z4.n.O0(arrayList2), null), this);
        if (objA != EnumC0830a.f11264o) {
            objA = oVar;
        }
        return objA == enumC0830a ? enumC0830a : oVar;
    }
}
