package u6;

import android.content.Context;
import d5.EnumC0830a;
import e4.C0862k;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.Objects;
import l5.InterfaceC1180a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f17415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0862k f17416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17418t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, c5.d dVar, C0862k c0862k, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC1180a interfaceC1180a) {
        super(2, dVar);
        this.f17414p = interfaceC1180a;
        this.f17415q = context;
        this.f17416r = c0862k;
        this.f17417s = interfaceC0878b0;
        this.f17418t = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new K(this.f17415q, dVar, this.f17416r, this.f17417s, this.f17418t, this.f17414p);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17413o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1180a interfaceC1180a = this.f17414p;
        Objects.toString(interfaceC1180a.a());
        System.out.getClass();
        if (interfaceC1180a.a() != null) {
            D5.d dVar = w5.M.f19498b;
            J j3 = new J(this.f17415q, null, this.f17416r, this.f17417s, this.f17418t, this.f17414p);
            this.f17413o = 1;
            if (AbstractC1767D.C(dVar, j3, this) == enumC0830a) {
                return enumC0830a;
            }
        }
        return oVar;
    }
}
