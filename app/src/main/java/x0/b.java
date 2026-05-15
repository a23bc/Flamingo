package X0;

import Y4.o;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.function.Consumer;
import n1.l;
import w5.InterfaceC1765B;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f8226o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ f f8227p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ScrollCaptureSession f8228q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Rect f8229r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Consumer f8230s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, c5.d dVar) {
        super(2, dVar);
        this.f8227p = fVar;
        this.f8228q = scrollCaptureSession;
        this.f8229r = rect;
        this.f8230s = consumer;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new b(this.f8227p, this.f8228q, this.f8229r, this.f8230s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8226o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            ScrollCaptureSession scrollCaptureSession = this.f8228q;
            Rect rect = this.f8229r;
            l lVar = new l(rect.left, rect.top, rect.right, rect.bottom);
            this.f8226o = 1;
            obj = f.a(this.f8227p, scrollCaptureSession, lVar, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        this.f8230s.accept(AbstractC1959I.t((l) obj));
        return o.f8736a;
    }
}
