package b2;

import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: renamed from: b2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648a0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TwoByTwoReceiver f10154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f10155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10156r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648a0(TwoByTwoReceiver twoByTwoReceiver, Context context, int i7, c5.d dVar) {
        super(2, dVar);
        this.f10154p = twoByTwoReceiver;
        this.f10155q = context;
        this.f10156r = i7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0648a0(this.f10154p, this.f10155q, this.f10156r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0648a0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10153o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            TwoByTwoReceiver twoByTwoReceiver = this.f10154p;
            this.f10153o = 1;
            if (A0.b.r0(twoByTwoReceiver.f20579b, this.f10155q, this.f10156r, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
