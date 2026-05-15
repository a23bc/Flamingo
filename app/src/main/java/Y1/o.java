package Y1;

import Z4.y;
import a.AbstractC0509a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import g.C0934a;
import g.C0940g;
import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0509a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8615u;

    public /* synthetic */ o(int i7) {
        this.f8615u = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0509a
    public U0.a H(Context context, Cloneable cloneable) {
        switch (this.f8615u) {
            case 1:
                String[] strArr = (String[]) cloneable;
                if (strArr.length == 0) {
                    return new U0.a(Z4.w.f8819o);
                }
                for (String str : strArr) {
                    if (AbstractC1109c.n(context, str) != 0) {
                        return null;
                    }
                }
                int iK0 = y.k0(strArr.length);
                if (iK0 < 16) {
                    iK0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new U0.a(linkedHashMap);
            default:
                return super.H(context, cloneable);
        }
    }

    @Override // a.AbstractC0509a
    public final Object T(Intent intent, int i7) {
        switch (this.f8615u) {
            case 0:
                return new C0934a(intent, i7);
            case 1:
                Z4.w wVar = Z4.w.f8819o;
                if (i7 != -1 || intent == null) {
                    return wVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return wVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i8 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i8 == 0));
                }
                ArrayList arrayListG0 = Z4.l.g0(stringArrayExtra);
                Iterator it = arrayListG0.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(Z4.p.j0(arrayListG0), Z4.p.j0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new Y4.h(it.next(), it2.next()));
                }
                return y.o0(arrayList2);
            default:
                return new C0934a(intent, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0509a
    public final Intent r(Context context, Cloneable cloneable) {
        Bundle bundleExtra;
        switch (this.f8615u) {
            case 0:
                C0940g c0940g = (C0940g) cloneable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0940g.f12259p;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0940g = new C0940g(c0940g.f12258o, null, c0940g.f12260q, c0940g.f12261r);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0940g);
                if (q.h(2)) {
                    intent.toString();
                }
                return intent;
            case 1:
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) cloneable);
                AbstractC1209k.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            default:
                return (Intent) cloneable;
        }
    }
}
