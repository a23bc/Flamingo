package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0888g0;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import o5.AbstractC1267a;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f17876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G f17877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17878s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(InterfaceC1180a interfaceC1180a, List list, G g6, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f17875p = interfaceC1180a;
        this.f17876q = list;
        this.f17877r = g6;
        this.f17878s = interfaceC1182c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new u0(this.f17875p, this.f17876q, this.f17877r, this.f17878s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        int i7;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i8 = this.f17874o;
        Y4.o oVar = Y4.o.f8736a;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        C0888g0 c0888g0 = a6.b.f8883a;
        if (c0888g0.h() == -1) {
            long jLongValue = ((Number) this.f17875p.a()).longValue();
            List list = this.f17876q;
            Long l = new Long(jLongValue);
            int size = list.size();
            Z4.o.h0(list.size(), size);
            int i9 = size - 1;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 > i9) {
                    i7 = -(i11 + 1);
                    break;
                }
                i7 = (i11 + i9) >>> 1;
                int iR = N5.l.r(Long.valueOf(((d6.f) list.get(i7)).f11291p), l);
                if (iR >= 0) {
                    if (iR <= 0) {
                        break;
                    }
                    i9 = i7 - 1;
                } else {
                    i11 = i7 + 1;
                }
            }
            if (i7 < 0) {
                i7 = (-i7) - 2;
            }
            if (i7 >= 0) {
                c0888g0.j(i7);
                G g6 = this.f17877r;
                int i12 = i7 + 1;
                if (i12 >= 0) {
                    i10 = i12;
                }
                int iH = AbstractC1267a.H(((Number) this.f17878s.b(new Integer(i7))).floatValue());
                this.f17874o = 1;
                if (g6.a(i10, iH, true, this) == enumC0830a) {
                    return enumC0830a;
                }
            }
        }
        return oVar;
    }
}
