package b2;

import android.content.Context;
import android.os.Bundle;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TwoByTwoReceiver f10133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f10134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f10136t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(TwoByTwoReceiver twoByTwoReceiver, Context context, int i7, Bundle bundle, c5.d dVar) {
        super(2, dVar);
        this.f10133q = twoByTwoReceiver;
        this.f10134r = context;
        this.f10135s = i7;
        this.f10136t = bundle;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        X x6 = new X(this.f10133q, this.f10134r, this.f10135s, this.f10136t, dVar);
        x6.f10132p = obj;
        return x6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10131o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10132p;
        TwoByTwoReceiver twoByTwoReceiver = this.f10133q;
        TwoByTwoReceiver.a(twoByTwoReceiver, interfaceC1765B, this.f10134r);
        this.f10131o = 1;
        A0.b bVar = twoByTwoReceiver.f20579b;
        bVar.getClass();
        Object obj2 = bVar.f52r;
        C0651c c0651c = new C0651c(this.f10135s);
        Bundle bundle = this.f10136t;
        Object objA = ((i2.p) bVar.f50p).a(new C0640J(this.f10134r, c0651c, bVar, bundle, new C0641K(bundle, (c5.d) null, 0), null), this);
        if (objA != enumC0830a) {
            objA = oVar;
        }
        if (objA != enumC0830a) {
            objA = oVar;
        }
        return objA == enumC0830a ? enumC0830a : oVar;
    }
}
