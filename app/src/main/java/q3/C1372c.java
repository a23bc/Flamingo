package q3;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import v2.C1634a;

/* JADX INFO: renamed from: q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1372c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1376g f15538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f15539g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1372c f15541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f15542k;
    public final HashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f15543m;

    public C1372c(String str, String str2, long j3, long j7, C1376g c1376g, String[] strArr, String str3, String str4, C1372c c1372c) {
        this.f15533a = str;
        this.f15534b = str2;
        this.f15540i = str4;
        this.f15538f = c1376g;
        this.f15539g = strArr;
        this.f15535c = str2 != null;
        this.f15536d = j3;
        this.f15537e = j7;
        str3.getClass();
        this.h = str3;
        this.f15541j = c1372c;
        this.f15542k = new HashMap();
        this.l = new HashMap();
    }

    public static C1372c a(String str) {
        return new C1372c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C1634a c1634a = new C1634a();
            c1634a.f18222a = new SpannableStringBuilder();
            treeMap.put(str, c1634a);
        }
        CharSequence charSequence = ((C1634a) treeMap.get(str)).f18222a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C1372c b(int i7) {
        ArrayList arrayList = this.f15543m;
        if (arrayList != null) {
            return (C1372c) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f15543m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z6) {
        String str = this.f15533a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z6 || zEquals || (zEquals2 && this.f15540i != null)) {
            long j3 = this.f15536d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j7 = this.f15537e;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
        }
        if (this.f15543m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f15543m.size(); i7++) {
            ((C1372c) this.f15543m.get(i7)).d(treeSet, z6 || zEquals);
        }
    }

    public final boolean f(long j3) {
        long j7 = this.f15536d;
        long j8 = this.f15537e;
        if (j7 == -9223372036854775807L && j8 == -9223372036854775807L) {
            return true;
        }
        if (j7 <= j3 && j8 == -9223372036854775807L) {
            return true;
        }
        if (j7 != -9223372036854775807L || j3 >= j8) {
            return j7 <= j3 && j3 < j8;
        }
        return true;
    }

    public final void g(long j3, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j3) && "div".equals(this.f15533a) && (str2 = this.f15540i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j3, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r19, java.util.Map r21, java.util.HashMap r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C1372c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j3, boolean z6, String str, TreeMap treeMap) {
        boolean z7;
        TreeMap treeMap2;
        long j7;
        HashMap map = this.f15542k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.f15533a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f15535c && z6) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f15534b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z6) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j3)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C1634a) entry.getValue()).f18222a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                C1372c c1372cB = b(i7);
                if (z6 || zEquals) {
                    z7 = true;
                    treeMap2 = treeMap;
                    j7 = j3;
                } else {
                    z7 = false;
                    j7 = j3;
                    treeMap2 = treeMap;
                }
                c1372cB.i(j7, z7, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C1634a) entry2.getValue()).f18222a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
