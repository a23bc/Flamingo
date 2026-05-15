package b2;

import android.content.Context;
import d2.C0821i;
import d5.EnumC0830a;
import j2.C1103f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: b2.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670l0 {

    /* JADX INFO: renamed from: g */
    public static final C0683y f10219g = new C0683y();

    /* JADX INFO: renamed from: a */
    public final Context f10220a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f10221b;

    /* JADX INFO: renamed from: c */
    public int f10222c;

    /* JADX INFO: renamed from: d */
    public final int f10223d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f10224e;

    /* JADX INFO: renamed from: f */
    public final Set f10225f;

    public C0670l0(Context context, LinkedHashMap linkedHashMap, int i7, int i8, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f10220a = context;
        this.f10221b = linkedHashMap;
        this.f10222c = i7;
        this.f10223d = i8;
        this.f10224e = linkedHashSet;
        this.f10225f = set;
    }

    public final int a(Z1.k kVar) {
        C0821i c0821iX = N5.d.x(kVar);
        synchronized (this) {
            Integer num = (Integer) this.f10221b.get(c0821iX);
            if (num != null) {
                int iIntValue = num.intValue();
                this.f10224e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i7 = this.f10222c;
            while (this.f10225f.contains(Integer.valueOf(i7))) {
                i7 = (i7 + 1) % p0.f10275c;
                if (i7 == this.f10222c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.f10222c = (i7 + 1) % p0.f10275c;
            this.f10224e.add(Integer.valueOf(i7));
            this.f10225f.add(Integer.valueOf(i7));
            this.f10221b.put(c0821iX, Integer.valueOf(i7));
            return i7;
        }
    }

    public final Object b(C0661h c0661h) throws Throwable {
        Object objD = C1103f.f13698a.d(this.f10220a, r0.f10285a, "appWidgetLayout-" + this.f10223d, new C0668k0(this, null), c0661h);
        return objD == EnumC0830a.f11264o ? objD : Y4.o.f8736a;
    }
}
