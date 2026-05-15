package w;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: w.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1672e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f18650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f18651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f18652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f18653s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672e(Object obj, C1670c c1670c, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f18650p = obj;
        this.f18651q = c1670c;
        this.f18652r = interfaceC0878b0;
        this.f18653s = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1672e(this.f18650p, this.f18651q, this.f18652r, this.f18653s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1672e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        C1672e c1672e;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f18649o;
        C1670c c1670c = this.f18651q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            if (AbstractC1209k.a(this.f18650p, c1670c.f18632e.getValue())) {
                return Y4.o.f8736a;
            }
            S s7 = AbstractC1674g.f18676a;
            InterfaceC1679l interfaceC1679l = (InterfaceC1679l) this.f18652r.getValue();
            this.f18649o = 1;
            c1672e = this;
            if (C1670c.c(this.f18651q, this.f18650p, interfaceC1679l, null, null, c1672e, 12) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            c1672e = this;
        }
        S s8 = AbstractC1674g.f18676a;
        InterfaceC1182c interfaceC1182c = (InterfaceC1182c) c1672e.f18653s.getValue();
        if (interfaceC1182c != null) {
            interfaceC1182c.b(c1670c.e());
        }
        return Y4.o.f8736a;
    }
}
