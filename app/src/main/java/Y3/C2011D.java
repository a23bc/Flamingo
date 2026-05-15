package y3;

import java.util.LinkedHashMap;
import k.AbstractC1113a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: y3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2011D {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f20391b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f20392a = new LinkedHashMap();

    public final void a(AbstractC2010C abstractC2010C) {
        AbstractC1209k.f(abstractC2010C, "navigator");
        String strI = AbstractC1113a.I(abstractC2010C.getClass());
        if (strI.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f20392a;
        AbstractC2010C abstractC2010C2 = (AbstractC2010C) linkedHashMap.get(strI);
        if (AbstractC1209k.a(abstractC2010C2, abstractC2010C)) {
            return;
        }
        boolean z6 = false;
        if (abstractC2010C2 != null && abstractC2010C2.f20390b) {
            z6 = true;
        }
        if (z6) {
            throw new IllegalStateException(("Navigator " + abstractC2010C + " is replacing an already attached " + abstractC2010C2).toString());
        }
        if (!abstractC2010C.f20390b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + abstractC2010C + " is already attached to another NavController").toString());
    }

    public final AbstractC2010C b(String str) {
        AbstractC1209k.f(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC2010C abstractC2010C = (AbstractC2010C) this.f20392a.get(str);
        if (abstractC2010C != null) {
            return abstractC2010C;
        }
        throw new IllegalStateException(Z1.l.q("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
