package b2;

import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import w5.AbstractC1767D;
import w5.C1777c;
import w5.C1779d;
import w5.C1781e;
import w5.C1793k;
import w5.InterfaceC1765B;
import w5.InterfaceC1770G;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: renamed from: b2.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0650b0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TwoByTwoReceiver f10160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f10161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int[] f10162s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650b0(TwoByTwoReceiver twoByTwoReceiver, Context context, int[] iArr, c5.d dVar) {
        super(2, dVar);
        this.f10160q = twoByTwoReceiver;
        this.f10161r = context;
        this.f10162s = iArr;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0650b0 c0650b0 = new C0650b0(this.f10160q, this.f10161r, this.f10162s, dVar);
        c0650b0.f10159p = obj;
        return c0650b0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0650b0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10158o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10159p;
            TwoByTwoReceiver twoByTwoReceiver = this.f10160q;
            Context context = this.f10161r;
            TwoByTwoReceiver.a(twoByTwoReceiver, interfaceC1765B, context);
            int[] iArr = this.f10162s;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i8 : iArr) {
                arrayList.add(AbstractC1767D.d(interfaceC1765B, null, new C0648a0(twoByTwoReceiver, context, i8, null), 3));
            }
            this.f10158o = 1;
            if (arrayList.isEmpty()) {
                objQ = Z4.v.f8818o;
            } else {
                InterfaceC1770G[] interfaceC1770GArr = (InterfaceC1770G[]) arrayList.toArray(new InterfaceC1770G[0]);
                C1781e c1781e = new C1781e(interfaceC1770GArr);
                C1793k c1793k = new C1793k(1, I0.c.D(this));
                c1793k.r();
                int length = interfaceC1770GArr.length;
                C1777c[] c1777cArr = new C1777c[length];
                for (int i9 = 0; i9 < length; i9++) {
                    w5.D0 d02 = interfaceC1770GArr[i9];
                    d02.start();
                    C1777c c1777c = new C1777c(c1781e, c1793k);
                    c1777c.f19522t = AbstractC1767D.q(d02, false, c1777c, 3);
                    c1777cArr[i9] = c1777c;
                }
                C1779d c1779d = new C1779d(c1777cArr);
                for (int i10 = 0; i10 < length; i10++) {
                    C1777c c1777c2 = c1777cArr[i10];
                    c1777c2.getClass();
                    C1777c.f19520v.set(c1777c2, c1779d);
                }
                if (C1793k.f19540u.get(c1793k) instanceof w5.u0) {
                    c1793k.u(c1779d);
                } else {
                    c1779d.a();
                }
                objQ = c1793k.q();
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
            }
            if (objQ == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
