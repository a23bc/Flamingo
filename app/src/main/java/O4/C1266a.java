package o4;

import F5.q;
import a.AbstractC0509a;
import java.util.regex.Pattern;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: o4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1266a extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f14696p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ b f14697q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1266a(b bVar, int i7) {
        super(0);
        this.f14696p = i7;
        this.f14697q = bVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        b bVar = this.f14697q;
        switch (this.f14696p) {
            case 0:
                F5.c cVar = F5.c.f2324n;
                return AbstractC0509a.S(bVar.f14703f);
            default:
                String strB = bVar.f14703f.b("Content-Type");
                if (strB == null) {
                    return null;
                }
                Pattern pattern = q.f2402b;
                try {
                    return N5.d.E(strB);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
