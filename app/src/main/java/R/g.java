package R;

import A2.d0;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import b2.C0641K;
import d0.C0792i;
import d0.C0794j;
import d0.C0801p;
import d0.H;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f6176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6177r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, c5.d dVar, int i7) {
        super(1, dVar);
        this.f6174o = i7;
        this.f6176q = obj;
        this.f6177r = obj2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f6174o) {
            case 0:
                return new g((h) this.f6176q, (T.e) this.f6177r, dVar, 0).invokeSuspend(Y4.o.f8736a);
            case 1:
                return new g((T.c) this.f6176q, (T.b) this.f6177r, dVar, 1).invokeSuspend(Y4.o.f8736a);
            default:
                return new g((C0801p) this.f6176q, (C0641K) this.f6177r, dVar, 2).invokeSuspend(Y4.o.f8736a);
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        ActionMode actionMode;
        e eVar;
        switch (this.f6174o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                int i7 = this.f6175p;
                Y4.o oVar = Y4.o.f8736a;
                h hVar = (h) this.f6176q;
                try {
                    if (i7 == 0) {
                        android.support.v4.media.session.b.K(obj);
                        f fVar = new f();
                        hVar.getClass();
                        T.e eVar2 = (T.e) this.f6177r;
                        b bVar = new b(hVar, eVar2, 0);
                        b bVar2 = new b(hVar, eVar2, 1);
                        View view = hVar.f6178a;
                        e eVar3 = new e(fVar, bVar, bVar2, view);
                        InterfaceC1182c interfaceC1182c = hVar.f6179b;
                        if (interfaceC1182c != null && (eVar = (e) interfaceC1182c.b(eVar3)) != null) {
                            eVar3 = eVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper == (handler != null ? handler.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new q(eVar3), 1);
                            if (actionModeStartActionMode != null) {
                                hVar.h = actionModeStartActionMode;
                            }
                            return oVar;
                        }
                        d0 d0Var = hVar.f6185i;
                        if (d0Var == null) {
                            d0Var = new d0(hVar, eVar3, fVar, 5);
                            hVar.f6185i = d0Var;
                        }
                        view.post(d0Var);
                        this.f6175p = 1;
                        Object objA = fVar.f6173a.a(this);
                        if (objA != enumC0830a) {
                            objA = oVar;
                        }
                        if (objA == enumC0830a) {
                            return enumC0830a;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        android.support.v4.media.session.b.K(obj);
                    }
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    d0 d0Var2 = hVar.f6185i;
                    if (d0Var2 != null) {
                        hVar.f6178a.removeCallbacks(d0Var2);
                    }
                    hVar.h = null;
                    return oVar;
                } finally {
                    hVar.f6182e.a();
                    actionMode = hVar.h;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    d0 d0Var3 = hVar.f6185i;
                    if (d0Var3 != null) {
                        hVar.f6178a.removeCallbacks(d0Var3);
                    }
                    hVar.h = null;
                }
            case 1:
                T.b bVar3 = (T.b) this.f6177r;
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                int i8 = this.f6175p;
                Y4.o oVar2 = Y4.o.f8736a;
                T.c cVar = (T.c) this.f6176q;
                try {
                    if (i8 == 0) {
                        android.support.v4.media.session.b.K(obj);
                        cVar.f6839c.setValue(bVar3);
                        this.f6175p = 1;
                        Object objA2 = bVar3.f6836b.a(this);
                        if (objA2 != enumC0830a2) {
                            objA2 = oVar2;
                        }
                        if (objA2 == enumC0830a2) {
                            return enumC0830a2;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        android.support.v4.media.session.b.K(obj);
                    }
                    return oVar2;
                } finally {
                    cVar.f6839c.setValue(null);
                }
            default:
                EnumC0830a enumC0830a3 = EnumC0830a.f11264o;
                int i9 = this.f6175p;
                if (i9 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    C0801p c0801p = (C0801p) this.f6176q;
                    C0792i c0792i = new C0792i(c0801p, 0);
                    C0794j c0794j = new C0794j((C0641K) this.f6177r, c0801p, null);
                    this.f6175p = 1;
                    if (H.e(c0792i, c0794j, this) == enumC0830a3) {
                        return enumC0830a3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                return Y4.o.f8736a;
        }
    }
}
