package w5;

/* JADX INFO: renamed from: w5.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1769F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1772I f19488a;

    static {
        String property;
        InterfaceC1772I interfaceC1772I;
        int i7 = B5.v.f920a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            D5.e eVar = M.f19497a;
            x5.d dVar = B5.n.f912a;
            x5.d dVar2 = dVar.f20145t;
            boolean z6 = dVar instanceof InterfaceC1772I;
            interfaceC1772I = dVar;
            if (!z6) {
                interfaceC1772I = RunnableC1768E.f19483x;
            }
        } else {
            interfaceC1772I = RunnableC1768E.f19483x;
        }
        f19488a = interfaceC1772I;
    }
}
