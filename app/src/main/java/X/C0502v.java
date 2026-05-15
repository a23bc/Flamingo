package X;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: X.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0502v extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0505y f8183o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502v(C0505y c0505y, c5.d dVar) {
        super(2, dVar);
        this.f8183o = c0505y;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0502v(this.f8183o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0502v) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        C0505y c0505y = this.f8183o;
        Class clsM = r.m();
        Context context = c0505y.f8206b;
        TextClassificationManager textClassificationManagerK = r.k(context.getSystemService(clsM));
        int iOrdinal = c0505y.f8207c.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                throw new A2.W();
            }
            str = "textview";
        }
        AbstractC0496q.A();
        TextClassifier textClassifierCreateTextClassificationSession = textClassificationManagerK.createTextClassificationSession(AbstractC0496q.h(context.getPackageName(), str).build());
        c0505y.f8210f = textClassifierCreateTextClassificationSession;
        return textClassifierCreateTextClassificationSession;
    }
}
