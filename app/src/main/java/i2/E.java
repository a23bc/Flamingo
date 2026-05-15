package i2;

import android.content.Context;
import b2.C0671m;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0671m f13317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f13318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Throwable f13319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f13320s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C0671m c0671m, Context context, Throwable th, K k7, c5.d dVar) {
        super(2, dVar);
        this.f13317p = c0671m;
        this.f13318q = context;
        this.f13319r = th;
        this.f13320s = k7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new E(this.f13317p, this.f13318q, this.f13319r, this.f13320s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13316o;
        Y4.o oVar = Y4.o.f8736a;
        Throwable th = this.f13319r;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f13316o = 1;
            this.f13317p.a(this.f13318q, th);
            if (oVar == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        CancellationException cancellationException = new CancellationException("Error in composition effect coroutine");
        cancellationException.initCause(th);
        AbstractC1767D.f(this.f13320s, cancellationException);
        return oVar;
    }
}
