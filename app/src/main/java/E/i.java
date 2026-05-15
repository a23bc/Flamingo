package e;

import Y4.o;
import a.AbstractC0509a;
import d.C0757j;
import g.C0938e;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends M3.a {

    /* JADX INFO: renamed from: c */
    public final C0835a f11316c;

    public i(C0835a c0835a) {
        this.f11316c = c0835a;
    }

    public final void k0(Cloneable cloneable) {
        o oVar;
        C0938e c0938e = this.f11316c.f11303a;
        if (c0938e != null) {
            C0757j c0757j = c0938e.f12255c;
            LinkedHashMap linkedHashMap = c0757j.f10769b;
            String str = c0938e.f12256d;
            Object obj = linkedHashMap.get(str);
            AbstractC0509a abstractC0509a = c0938e.f12257e;
            if (obj == null) {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0509a + " and input " + cloneable + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
            int iIntValue = ((Number) obj).intValue();
            ArrayList arrayList = c0757j.f10771d;
            arrayList.add(str);
            try {
                c0757j.b(iIntValue, abstractC0509a, cloneable);
                oVar = o.f8736a;
            } catch (Exception e7) {
                arrayList.remove(str);
                throw e7;
            }
        } else {
            oVar = null;
        }
        if (oVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
