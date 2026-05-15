package e4;

import Y4.o;
import android.graphics.Bitmap;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import k4.C1155j;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: e4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0860i extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p4.h f11588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0862k f11589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q4.h f11590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0854c f11591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f11592t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0860i(p4.h hVar, C0862k c0862k, q4.h hVar2, C0854c c0854c, Bitmap bitmap, c5.d dVar) {
        super(2, dVar);
        this.f11588p = hVar;
        this.f11589q = c0862k;
        this.f11590r = hVar2;
        this.f11591s = c0854c;
        this.f11592t = bitmap;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0860i(this.f11588p, this.f11589q, this.f11590r, this.f11591s, this.f11592t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0860i) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11587o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        ArrayList arrayList = this.f11589q.f11600g;
        boolean z6 = this.f11592t != null;
        p4.h hVar = this.f11588p;
        C1155j c1155j = new C1155j(hVar, arrayList, 0, hVar, this.f11590r, this.f11591s, z6);
        this.f11587o = 1;
        Object objB = c1155j.b(hVar, this);
        return objB == enumC0830a ? enumC0830a : objB;
    }
}
