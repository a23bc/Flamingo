package b2;

import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: renamed from: b2.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652c0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10164o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f10165p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ TwoByTwoReceiver f10166q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652c0(Context context, TwoByTwoReceiver twoByTwoReceiver, c5.d dVar) {
        super(2, dVar);
        this.f10165p = context;
        this.f10166q = twoByTwoReceiver;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0652c0(this.f10165p, this.f10166q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0652c0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10164o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            Context context = this.f10165p;
            TwoByTwoReceiver twoByTwoReceiver = this.f10166q;
            W w7 = new W(context);
            A0.b bVar = twoByTwoReceiver.f20579b;
            this.f10164o = 1;
            if (w7.c(twoByTwoReceiver, bVar, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                android.support.v4.media.session.b.K(obj);
            } catch (Throwable unused) {
            }
        }
        return Y4.o.f8736a;
    }
}
