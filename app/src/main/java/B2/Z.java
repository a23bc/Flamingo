package b2;

import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TwoByTwoReceiver f10148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f10149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10151t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(TwoByTwoReceiver twoByTwoReceiver, Context context, int i7, String str, c5.d dVar) {
        super(2, dVar);
        this.f10148q = twoByTwoReceiver;
        this.f10149r = context;
        this.f10150s = i7;
        this.f10151t = str;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        Z z6 = new Z(this.f10148q, this.f10149r, this.f10150s, this.f10151t, dVar);
        z6.f10147p = obj;
        return z6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10146o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10147p;
        TwoByTwoReceiver twoByTwoReceiver = this.f10148q;
        TwoByTwoReceiver.a(twoByTwoReceiver, interfaceC1765B, this.f10149r);
        this.f10146o = 1;
        A0.b bVar = twoByTwoReceiver.f20579b;
        bVar.getClass();
        Object objA = ((i2.p) bVar.f50p).a(new C0640J(this.f10149r, new C0651c(this.f10150s), bVar, null, new C0641K(this.f10151t, (c5.d) null, 1), null), this);
        if (objA != enumC0830a) {
            objA = oVar;
        }
        if (objA != enumC0830a) {
            objA = oVar;
        }
        return objA == enumC0830a ? enumC0830a : oVar;
    }
}
