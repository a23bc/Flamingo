package com.hchen.superlyricapi;

import B3.l;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import t2.C1485n;
import w2.AbstractC1697a;
import w2.i;
import w2.j;
import w3.C1710a0;
import w3.C1716c0;
import w3.U;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f10711o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f10712p;

    public /* synthetic */ a(int i7, Object obj) {
        this.f10711o = i7;
        this.f10712p = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f10711o) {
            case 0:
                break;
            case 1:
                j jVar = (j) this.f10712p;
                for (i iVar : jVar.f18853d) {
                    if (!iVar.f18849d && iVar.f18848c) {
                        C1485n c1485nD = iVar.f18847b.d();
                        iVar.f18847b = new l();
                        iVar.f18848c = false;
                        jVar.f18852c.d(iVar.f18846a, c1485nD);
                    }
                    if (jVar.f18851b.f18876a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            case 2:
                V1.a aVar = (V1.a) this.f10712p;
                aVar.getClass();
                if (message.what == 1) {
                    try {
                        U u7 = (U) aVar.f7390p;
                        u7.f19079w.L0(u7.f19061c);
                    } catch (RemoteException unused) {
                        AbstractC1697a.w("Error in sending flushCommandQueue");
                    }
                }
                break;
            default:
                C1710a0 c1710a0 = (C1710a0) this.f10712p;
                c1710a0.getClass();
                if (message.what == 1) {
                    C1716c0 c1716c0 = c1710a0.f19134e;
                    c1716c0.R0(false, c1716c0.l);
                }
                break;
        }
        return true;
        return true;
    }
}
