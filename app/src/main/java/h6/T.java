package h6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0890h0;
import f0.InterfaceC0878b0;
import m5.AbstractC1209k;
import t4.AbstractC1515j;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f12940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f12941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f12942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12943s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C0890h0 c0890h0, long j3, String str, boolean z6, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f12939o = c0890h0;
        this.f12940p = j3;
        this.f12941q = str;
        this.f12942r = z6;
        this.f12943s = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new T(this.f12939o, this.f12940p, this.f12941q, this.f12942r, this.f12943s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        T t7 = (T) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        t7.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        int i7 = AbstractC1515j.f17082a;
        if (System.currentTimeMillis() - this.f12939o.h() >= this.f12940p && AbstractC1209k.a(this.f12941q, "Lyric") && this.f12942r) {
            this.f12943s.setValue(Boolean.FALSE);
        }
        return Y4.o.f8736a;
    }
}
