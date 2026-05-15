package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.Iterator;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: u6.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1581y extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f17926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p0.s f17928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0.s f17929r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581y(p0.s sVar, p0.s sVar2, c5.d dVar) {
        super(2, dVar);
        this.f17928q = sVar;
        this.f17929r = sVar2;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1581y(this.f17928q, this.f17929r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1581y) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17927p;
        p0.s sVar = this.f17928q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            it = sVar.f14960r.iterator();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f17926o;
            android.support.v4.media.session.b.K(obj);
        }
        while (it.hasNext()) {
            C1670c c1670c = (C1670c) it.next();
            this.f17926o = it;
            this.f17927p = 1;
            if (c1670c.h(this) == enumC0830a) {
                return enumC0830a;
            }
        }
        sVar.clear();
        this.f17929r.clear();
        return Y4.o.f8736a;
    }
}
