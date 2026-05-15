package R0;

import android.view.View;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0919w0;
import w5.InterfaceC1765B;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0.B0 f6385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f6386q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(f0.B0 b0, View view, c5.d dVar) {
        super(2, dVar);
        this.f6385p = b0;
        this.f6386q = view;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new X0(this.f6385p, this.f6386q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((X0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f6384o;
        Y4.o oVar = Y4.o.f8736a;
        f0.B0 b0 = this.f6385p;
        View view = this.f6386q;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                this.f6384o = 1;
                Object objH = z5.z.h(b0.f11639u, new C0919w0(2, null), this);
                if (objH != enumC0830a) {
                    objH = oVar;
                }
                if (objH == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
            }
            if (h1.b(view) == b0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return oVar;
        } finally {
            if (h1.b(view) == b0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
