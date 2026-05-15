package u6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d5.EnumC0830a;
import e4.C0858g;
import e4.C0862k;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f17408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0862k f17410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17412t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Context context, c5.d dVar, C0862k c0862k, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC1180a interfaceC1180a) {
        super(2, dVar);
        this.f17408p = context;
        this.f17409q = interfaceC1180a;
        this.f17410r = c0862k;
        this.f17411s = interfaceC0878b0;
        this.f17412t = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new J(this.f17408p, dVar, this.f17410r, this.f17411s, this.f17412t, this.f17409q);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapL;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17407o;
        C0862k c0862k = this.f17410r;
        Context context = this.f17408p;
        Bitmap bitmapA = null;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            p4.g gVar = new p4.g(context);
            gVar.f15027c = this.f17409q.a();
            p4.h hVarA = gVar.a();
            this.f17407o = 1;
            obj = AbstractC1767D.h(new C0858g(null, c0862k, hVarA), this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        Drawable drawableA = ((p4.i) obj).a();
        if (drawableA != null && (bitmapL = i6.h.L(drawableA)) != null) {
            bitmapA = e6.a.a(bitmapL, 6);
        }
        InterfaceC0878b0 interfaceC0878b0 = this.f17412t;
        if (bitmapA != null) {
            Bitmap bitmapE = L.e(bitmapA, false);
            Resources resources = context.getResources();
            AbstractC1209k.e(resources, "getResources(...)");
            this.f17411s.setValue(new BitmapDrawable(resources, bitmapE));
            bitmapA.recycle();
            interfaceC0878b0.setValue(Boolean.FALSE);
        } else {
            interfaceC0878b0.setValue(Boolean.TRUE);
        }
        c0862k.c();
        return Y4.o.f8736a;
    }
}
