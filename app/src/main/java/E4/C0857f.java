package e4;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: e4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0857f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0862k f11573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p4.h f11574q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0857f(c5.d dVar, C0862k c0862k, p4.h hVar) {
        super(2, dVar);
        this.f11573p = c0862k;
        this.f11574q = hVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0857f(dVar, this.f11573p, this.f11574q);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0857f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11572o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        this.f11572o = 1;
        Object objA = C0862k.a(this.f11573p, this.f11574q, 1, this);
        return objA == enumC0830a ? enumC0830a : objA;
    }
}
