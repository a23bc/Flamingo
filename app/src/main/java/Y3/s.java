package y3;

import Z4.C0508b;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import q.S0;
import t.AbstractC1464t;
import t.U;
import u5.AbstractC1545g;
import v.C1628y;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f20461v = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f20462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f20463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f20464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U f20465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f20466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f20468u;

    static {
        new LinkedHashMap();
    }

    public s(AbstractC2010C abstractC2010C) {
        AbstractC1209k.f(abstractC2010C, "navigator");
        LinkedHashMap linkedHashMap = C2011D.f20391b;
        this.f20462o = AbstractC1113a.I(abstractC2010C.getClass());
        this.f20464q = new ArrayList();
        this.f20465r = new U(0);
        this.f20466s = new LinkedHashMap();
    }

    public final void b(q qVar) {
        AbstractC1209k.f(qVar, "navDeepLink");
        ArrayList arrayListA = j0.k.A(Z4.y.p0(this.f20466s), new C1628y(9, qVar));
        if (arrayListA.isEmpty()) {
            this.f20464q.add(qVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + qVar.f20446a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListA).toString());
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f20466s;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return bundle2;
    }

    public final r e(String str) {
        AbstractC1209k.f(str, "route");
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        AbstractC1209k.b(uri);
        S0 s02 = new S0(uri, null, null);
        return this instanceof u ? ((u) this).p(s02) : g(s02);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126 A[EDGE_INSN: B:73:0x0126->B:54:0x0126 BREAK  A[LOOP:2: B:38:0x00ac->B:75:?], EDGE_INSN: B:74:0x0126->B:54:0x0126 BREAK  A[LOOP:2: B:38:0x00ac->B:75:?], EDGE_INSN: B:54:0x0126->B:55:0x0127 BREAK  A[LOOP:3: B:46:0x00f3->B:79:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.s.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y3.q] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r12v15, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y3.r g(q.S0 r18) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.s.g(q.S0):y3.r");
    }

    public int hashCode() {
        int i7 = this.f20467t * 31;
        String str = this.f20468u;
        int iHashCode = i7 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f20464q.iterator();
        while (it.hasNext()) {
            iHashCode = (((q) it.next()).f20446a.hashCode() + (iHashCode * 31)) * 961;
        }
        C0508b c0508bD = AbstractC1464t.d(this.f20465r);
        if (c0508bD.hasNext()) {
            c0508bD.next().getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f20466s;
        for (String str2 : Z4.y.p0(linkedHashMap).keySet()) {
            int iC = A0.e.C(str2, iHashCode * 31, 31);
            Object obj = Z4.y.p0(linkedHashMap).get(str2);
            iHashCode = iC + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(String str) {
        Object next;
        if (str == null) {
            this.f20467t = 0;
        } else {
            if (AbstractC1545g.Z(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            this.f20467t = strConcat.hashCode();
            b(new q(strConcat));
        }
        ArrayList arrayList = this.f20464q;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = ((q) next).f20446a;
            String str3 = this.f20468u;
            if (str2.equals(str3 != null ? "android-app://androidx.navigation/".concat(str3) : "")) {
                break;
            }
        }
        AbstractC1223y.a(arrayList);
        arrayList.remove(next);
        this.f20468u = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f20467t));
        sb.append(")");
        String str = this.f20468u;
        if (str != null && !AbstractC1545g.Z(str)) {
            sb.append(" route=");
            sb.append(this.f20468u);
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "sb.toString()");
        return string;
    }
}
