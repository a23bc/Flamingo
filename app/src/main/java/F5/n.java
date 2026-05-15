package F5;

import java.util.ArrayList;
import java.util.Iterator;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a */
    public String f2386a;

    /* JADX INFO: renamed from: d */
    public String f2389d;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2391f;

    /* JADX INFO: renamed from: g */
    public ArrayList f2392g;
    public String h;

    /* JADX INFO: renamed from: b */
    public String f2387b = "";

    /* JADX INFO: renamed from: c */
    public String f2388c = "";

    /* JADX INFO: renamed from: e */
    public int f2390e = -1;

    public n() {
        ArrayList arrayList = new ArrayList();
        this.f2391f = arrayList;
        arrayList.add("");
    }

    public final o a() {
        ArrayList arrayList;
        String str = this.f2386a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = b.e(this.f2387b, 0, 0, 7);
        String strE2 = b.e(this.f2388c, 0, 0, 7);
        String str2 = this.f2389d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f2391f;
        ArrayList arrayList3 = new ArrayList(Z4.p.j0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(b.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f2392g;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(Z4.p.j0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new o(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? b.e(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i7 = this.f2390e;
        if (i7 != -1) {
            return i7;
        }
        String str = this.f2386a;
        AbstractC1209k.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(F5.o r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.n.c(F5.o, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.n.toString():java.lang.String");
    }
}
