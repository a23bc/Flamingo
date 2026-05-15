package A2;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import d.C0757j;
import g.C0936c;
import g.InterfaceC0935b;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import m5.AbstractC1209k;
import w2.AbstractC1697a;
import w3.InterfaceC1741o;
import w3.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f337o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f338p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f339q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f340r;

    public /* synthetic */ k0(Object obj, int i7, Object obj2, int i8) {
        this.f337o = i8;
        this.f339q = obj;
        this.f338p = i7;
        this.f340r = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [D2.o, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        z1 z1Var;
        switch (this.f337o) {
            case 0:
                B2.i iVar = ((n0) ((V.o) this.f339q).f7343q).h;
                Pair pair = (Pair) this.f340r;
                iVar.A(((Integer) pair.first).intValue(), (H2.A) pair.second, this.f338p);
                break;
            case 1:
                ((A3.e) ((A3.b) this.f339q).f479c).e(this.f338p, (Serializable) this.f340r);
                break;
            case 2:
                D2.n nVar = (D2.n) this.f339q;
                this.f340r.A(nVar.f1527a, nVar.f1528b, this.f338p);
                break;
            case 3:
                C0757j c0757j = (C0757j) this.f339q;
                AbstractC1209k.f(c0757j, "this$0");
                Object obj = ((U0.a) this.f340r).f7026a;
                String str = (String) c0757j.f10768a.get(Integer.valueOf(this.f338p));
                if (str != null) {
                    C0936c c0936c = (C0936c) c0757j.f10772e.get(str);
                    if ((c0936c != null ? c0936c.f12252a : null) == null) {
                        c0757j.f10774g.remove(str);
                        c0757j.f10773f.put(str, obj);
                    } else {
                        InterfaceC0935b interfaceC0935b = c0936c.f12252a;
                        if (c0757j.f10771d.remove(str)) {
                            interfaceC0935b.d(obj);
                        }
                    }
                    break;
                }
                break;
            case 4:
                C0757j c0757j2 = (C0757j) this.f339q;
                AbstractC1209k.f(c0757j2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f340r;
                AbstractC1209k.f(sendIntentException, "$e");
                c0757j2.a(this.f338p, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            case 5:
                for (w2.i iVar2 : (CopyOnWriteArraySet) this.f339q) {
                    if (!iVar2.f18849d) {
                        int i7 = this.f338p;
                        if (i7 != -1) {
                            iVar2.f18847b.a(i7);
                        }
                        iVar2.f18848c = true;
                        ((w2.g) this.f340r).b(iVar2.f18846a);
                    }
                }
                break;
            default:
                I4.y yVar = (I4.y) this.f340r;
                int i8 = this.f338p;
                w3.U u7 = (w3.U) this.f339q;
                u7.getClass();
                try {
                    z1Var = (z1) yVar.get();
                    AbstractC1697a.g(z1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    AbstractC1697a.x("Session operation failed", e);
                    z1Var = new z1(-1);
                } catch (CancellationException e8) {
                    AbstractC1697a.x("Session operation cancelled", e8);
                    z1Var = new z1(1);
                } catch (ExecutionException e9) {
                    e = e9;
                    AbstractC1697a.x("Session operation failed", e);
                    z1Var = new z1(-1);
                }
                InterfaceC1741o interfaceC1741o = u7.f19079w;
                if (interfaceC1741o != null) {
                    try {
                        interfaceC1741o.b0(u7.f19061c, i8, z1Var.b());
                    } catch (RemoteException unused) {
                        AbstractC1697a.w("Error in sending");
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, int i7, int i8) {
        this.f337o = i8;
        this.f339q = obj;
        this.f340r = obj2;
        this.f338p = i7;
    }
}
