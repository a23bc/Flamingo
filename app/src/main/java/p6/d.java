package p6;

import Y4.o;
import android.content.Context;
import android.widget.Toast;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f15108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f15109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f15110q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC0878b0 interfaceC0878b0, Context context, InterfaceC1765B interfaceC1765B, c5.d dVar) {
        super(2, dVar);
        this.f15108o = interfaceC0878b0;
        this.f15109p = context;
        this.f15110q = interfaceC1765B;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new d(this.f15108o, this.f15109p, this.f15110q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((InterfaceC1765B) obj, (c5.d) obj2);
        o oVar = o.f8736a;
        dVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        a6.c.f8889a.clear();
        InterfaceC0878b0 interfaceC0878b0 = this.f15108o;
        Toast toast = (Toast) interfaceC0878b0.getValue();
        if (toast != null) {
            toast.cancel();
        }
        Context context = this.f15109p;
        Toast toastMakeText = Toast.makeText(context, R.string.tip_scanning, 0);
        toastMakeText.show();
        interfaceC0878b0.setValue(toastMakeText);
        AbstractC1767D.t(this.f15110q, null, new c(context, interfaceC0878b0, null), 3);
        return o.f8736a;
    }
}
