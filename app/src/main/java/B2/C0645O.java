package b2;

import K0.C0236d;
import O1.C0331c;
import android.content.Context;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.C1200b;
import m5.C1214p;
import s5.InterfaceC1438c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: b2.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0645O {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC1438c[] f10104a;

    static {
        C1214p c1214p = new C1214p(C1200b.f14418o, C0645O.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        AbstractC1221w.f14440a.getClass();
        f10104a = new InterfaceC1438c[]{c1214p};
    }

    public static final R1.d a(C0645O c0645o, Context context) {
        R1.d dVar;
        c0645o.getClass();
        Q1.b bVar = W.f10125e;
        InterfaceC1438c interfaceC1438c = f10104a[0];
        bVar.getClass();
        AbstractC1209k.f(context, "thisRef");
        AbstractC1209k.f(interfaceC1438c, "property");
        R1.d dVar2 = bVar.f6105d;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (bVar.f6104c) {
            try {
                if (bVar.f6105d == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC1182c interfaceC1182c = bVar.f6102a;
                    AbstractC1209k.e(applicationContext, "applicationContext");
                    List list = (List) interfaceC1182c.b(applicationContext);
                    InterfaceC1765B interfaceC1765B = bVar.f6103b;
                    C0236d c0236d = new C0236d(applicationContext, 3, bVar);
                    AbstractC1209k.f(list, "migrations");
                    R1.h hVar = R1.h.f6662a;
                    bVar.f6105d = new R1.d(new O1.F(new F5.k(c0236d, 1), hVar, I0.c.G(new C0331c(list, null)), new N2.z(), interfaceC1765B));
                }
                dVar = bVar.f6105d;
                AbstractC1209k.c(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static final R1.e b(C0645O c0645o, String str) {
        c0645o.getClass();
        String str2 = "provider:" + str;
        AbstractC1209k.f(str2, "name");
        return new R1.e(str2);
    }
}
