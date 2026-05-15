package R1;

import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f6653p = new a(1);

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC1209k.f(entry, "entry");
        return "  " + ((e) entry.getKey()).f6660a + " = " + entry.getValue();
    }
}
