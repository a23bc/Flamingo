package y3;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: y3.c */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC2009B("activity")
public class C2014c extends AbstractC2010C {

    /* JADX INFO: renamed from: c */
    public final Activity f20400c;

    public C2014c(Context context) {
        Object next;
        AbstractC1209k.f(context, "context");
        Iterator it = t5.j.H(context, C2013b.f20393q).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f20400c = (Activity) next;
    }

    @Override // y3.AbstractC2010C
    public final s a() {
        return new C2012a(this);
    }

    @Override // y3.AbstractC2010C
    public final s c(s sVar) {
        throw new IllegalStateException(("Destination " + ((C2012a) sVar).f20467t + " does not have an Intent set.").toString());
    }

    @Override // y3.AbstractC2010C
    public final boolean f() {
        Activity activity = this.f20400c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
