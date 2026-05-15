package k4;

import Y4.o;
import d5.EnumC0830a;
import e4.C0853b;
import e4.C0854c;
import e5.AbstractC0871i;
import j4.m;
import m5.C1220v;
import p4.l;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: k4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1153h f14084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1220v f14085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1220v f14086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p4.h f14087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1220v f14089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0854c f14090v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149d(C1153h c1153h, C1220v c1220v, C1220v c1220v2, p4.h hVar, Object obj, C1220v c1220v3, C0854c c0854c, c5.d dVar) {
        super(2, dVar);
        this.f14084p = c1153h;
        this.f14085q = c1220v;
        this.f14086r = c1220v2;
        this.f14087s = hVar;
        this.f14088t = obj;
        this.f14089u = c1220v3;
        this.f14090v = c0854c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1149d(this.f14084p, this.f14085q, this.f14086r, this.f14087s, this.f14088t, this.f14089u, this.f14090v, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1149d) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f14083o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        m mVar = (m) this.f14085q.f14439o;
        C0853b c0853b = (C0853b) this.f14086r.f14439o;
        l lVar = (l) this.f14089u.f14439o;
        this.f14083o = 1;
        Object objA = C1153h.a(this.f14084p, mVar, c0853b, this.f14087s, this.f14088t, lVar, this.f14090v, this);
        return objA == enumC0830a ? enumC0830a : objA;
    }
}
