package b2;

import android.util.Log;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: b2.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0654d0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10168o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0660g0 f10169p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0654d0(C0660g0 c0660g0, c5.d dVar) {
        super(2, dVar);
        this.f10169p = c0660g0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0654d0(this.f10169p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0654d0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10168o;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                C0660g0 c0660g0 = this.f10169p;
                C0651c c0651c = new C0651c(c0660g0.f10183b);
                this.f10168o = 1;
                if (C0660g0.a(c0660g0, c0651c, this) == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
            }
            return Y4.o.f8736a;
        } catch (y5.m e7) {
            return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e7));
        }
    }
}
