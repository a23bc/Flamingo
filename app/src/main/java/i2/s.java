package i2;

import androidx.glance.session.SessionWorker;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w.C1670c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13415o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f13416p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f13417q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, c5.d dVar, int i7) {
        super(1, dVar);
        this.f13415o = i7;
        this.f13416p = obj;
        this.f13417q = obj2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f13415o) {
            case 0:
                s sVar = new s((K) this.f13416p, (SessionWorker) this.f13417q, dVar, 0);
                Y4.o oVar = Y4.o.f8736a;
                sVar.invokeSuspend(oVar);
                return oVar;
            default:
                s sVar2 = new s((C1670c) this.f13416p, this.f13417q, dVar, 1);
                Y4.o oVar2 = Y4.o.f8736a;
                sVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj2 = this.f13417q;
        Object obj3 = this.f13416p;
        switch (this.f13415o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                ((K) obj3).b(((SessionWorker) obj2).f9675y.f13327c);
                break;
            default:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                C1670c c1670c = (C1670c) obj3;
                C1670c.a(c1670c);
                Object objD = c1670c.d(obj2);
                c1670c.f18630c.f18710p.setValue(objD);
                c1670c.f18632e.setValue(objD);
                break;
        }
        return oVar;
    }
}
