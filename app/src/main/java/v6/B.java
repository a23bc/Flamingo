package v6;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f18332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Context context, c5.d dVar) {
        super(2, dVar);
        this.f18332o = context;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new B(this.f18332o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        B b7 = (B) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        b7.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        Context context = this.f18332o;
        AbstractC1209k.f(context, "context");
        Object systemService = context.getSystemService("vibrator");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(0));
        } else {
            vibrator.vibrate(30L);
        }
        return Y4.o.f8736a;
    }
}
