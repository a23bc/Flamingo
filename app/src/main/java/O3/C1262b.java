package o3;

import A2.I;
import Z1.l;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d2.C0821i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.C1145a;
import k3.m;
import v2.C1635b;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: o3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1262b implements m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f14666u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1261a f14668p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashMap f14670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14671s = -3.4028235E38f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f14672t = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w2.m f14669q = new w2.m();

    public C1262b(List list) {
        if (list == null || list.isEmpty()) {
            this.f14667o = false;
            this.f14668p = null;
            return;
        }
        this.f14667o = true;
        String strK = t.k((byte[]) list.get(0));
        AbstractC1697a.d(strK.startsWith("Format:"));
        C1261a c1261aA = C1261a.a(strK);
        c1261aA.getClass();
        this.f14668p = c1261aA;
        b(new w2.m((byte[]) list.get(1)), D4.d.f1569c);
    }

    public static int a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j3) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j3) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, Long.valueOf(j3));
        arrayList2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i7 - 1)));
        return i7;
    }

    public static long c(String str) {
        Matcher matcher = f14666u.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i7 = t.f18881a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r37, java.nio.charset.Charset r38) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C1262b.b(w2.m, java.nio.charset.Charset):void");
    }

    @Override // k3.m
    public final /* synthetic */ void d() {
    }

    @Override // k3.m
    public final /* synthetic */ k3.d i(byte[] bArr, int i7, int i8) {
        return l.e(this, bArr, i8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // k3.m
    public final void l(byte[] bArr, int i7, int i8, k3.l lVar, w2.c cVar) {
        Charset charset;
        C1261a c1261a;
        w2.m mVar;
        int i9;
        int i10;
        float f7;
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        PointF pointF;
        int i13;
        int i14;
        float f8;
        float f9;
        float f10;
        float f11;
        int i15;
        float f12;
        int i16;
        int i17;
        Integer num;
        int iA;
        int i18;
        C1262b c1262b = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w2.m mVar2 = c1262b.f14669q;
        mVar2.E(i7 + i8, bArr);
        mVar2.G(i7);
        Charset charsetC = mVar2.C();
        if (charsetC == null) {
            charsetC = D4.d.f1569c;
        }
        boolean z6 = c1262b.f14667o;
        if (!z6) {
            c1262b.b(mVar2, charsetC);
        }
        C1261a c1261aA = z6 ? c1262b.f14668p : null;
        while (true) {
            String strH = mVar2.h(charsetC);
            if (strH == null) {
                long j3 = lVar.f14045a;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !lVar.f14046b) ? null : new ArrayList();
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    List list = (List) arrayList.get(i19);
                    if (!list.isEmpty() || i19 == 0) {
                        if (i19 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i19)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i19 + 1)).longValue() - ((Long) arrayList2.get(i19)).longValue();
                        if (j3 == -9223372036854775807L || jLongValue >= j3) {
                            cVar.c(new C1145a(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C1145a(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        cVar.c((C1145a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                c1261aA = C1261a.a(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (c1261aA == null) {
                    AbstractC1697a.w("Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    AbstractC1697a.d(strH.startsWith("Dialogue:"));
                    String strSubstring = strH.substring(9);
                    int i20 = c1261aA.f14665e;
                    String[] strArrSplit = strSubstring.split(",", i20);
                    if (strArrSplit.length != i20) {
                        AbstractC1697a.w("Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jC = c(strArrSplit[c1261aA.f14661a]);
                        if (jC == -9223372036854775807L) {
                            AbstractC1697a.w("Skipping invalid timing: ".concat(strH));
                        } else {
                            long jC2 = c(strArrSplit[c1261aA.f14662b]);
                            if (jC2 == -9223372036854775807L) {
                                AbstractC1697a.w("Skipping invalid timing: ".concat(strH));
                            } else {
                                LinkedHashMap linkedHashMap = c1262b.f14670r;
                                C1265e c1265e = (linkedHashMap == null || (i18 = c1261aA.f14663c) == -1) ? null : (C1265e) linkedHashMap.get(strArrSplit[i18].trim());
                                String str = strArrSplit[c1261aA.f14664d];
                                Matcher matcher = C1264d.f14683a.matcher(str);
                                int i21 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    Charset charset2 = charsetC;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = C1264d.a(strGroup);
                                        if (pointFA != null) {
                                            pointF2 = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = C1264d.f14686d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = C1265e.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i21 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    charsetC = charset2;
                                }
                                charset = charsetC;
                                String strReplace = C1264d.f14683a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f13 = c1262b.f14671s;
                                float f14 = c1262b.f14672t;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (c1265e != null) {
                                    Integer num2 = c1265e.f14689c;
                                    if (num2 != null) {
                                        c1261a = c1261aA;
                                        mVar = mVar2;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        c1261a = c1261aA;
                                        mVar = mVar2;
                                    }
                                    if (c1265e.f14695j == 3 && (num = c1265e.f14690d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f15 = c1265e.f14691e;
                                    if (f15 == -3.4028235E38f || f14 == -3.4028235E38f) {
                                        f11 = -3.4028235E38f;
                                        i15 = Integer.MIN_VALUE;
                                    } else {
                                        f11 = f15 / f14;
                                        i15 = 1;
                                    }
                                    boolean z7 = c1265e.f14693g;
                                    boolean z8 = c1265e.f14692f;
                                    if (z8 && z7) {
                                        f12 = f11;
                                        i16 = i15;
                                        i9 = 0;
                                        i17 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f12 = f11;
                                        i16 = i15;
                                        i9 = 0;
                                        i17 = 33;
                                        if (z8) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z7) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (c1265e.h) {
                                        spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i17);
                                    }
                                    if (c1265e.f14694i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i17);
                                    }
                                    i10 = i21;
                                    i11 = i16;
                                    f7 = f12;
                                } else {
                                    c1261a = c1261aA;
                                    mVar = mVar2;
                                    i9 = 0;
                                    i10 = i21;
                                    f7 = -3.4028235E38f;
                                    i11 = Integer.MIN_VALUE;
                                }
                                int i22 = -1;
                                if (i10 != -1) {
                                    i22 = i10;
                                } else if (c1265e != null) {
                                    i22 = c1265e.f14688b;
                                }
                                switch (i22) {
                                    case 0:
                                    default:
                                        n1.c.x(i22, "Unknown alignment: ");
                                    case -1:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case 6:
                                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i23 = Integer.MIN_VALUE;
                                switch (i22) {
                                    case 0:
                                    default:
                                        n1.c.x(i22, "Unknown alignment: ");
                                    case -1:
                                        i12 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i12 = i9;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i12 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                                        i12 = 2;
                                        break;
                                }
                                switch (i22) {
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 0:
                                    default:
                                        n1.c.x(i22, "Unknown alignment: ");
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i23 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        pointF = pointF2;
                                        i23 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                                        i23 = i9;
                                        pointF = pointF2;
                                        break;
                                }
                                if (pointF == null || f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
                                    if (i12 != 0) {
                                        i14 = 1;
                                        if (i12 != 1) {
                                            i13 = 2;
                                            f8 = i12 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i13 = 2;
                                            f8 = 0.5f;
                                        }
                                    } else {
                                        i13 = 2;
                                        i14 = 1;
                                        f8 = 0.05f;
                                    }
                                    f9 = i23 != 0 ? i23 != i14 ? i23 != i13 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f10 = f8;
                                } else {
                                    float f16 = pointF.x / f13;
                                    f9 = pointF.y / f14;
                                    f10 = f16;
                                }
                                C1635b c1635b = new C1635b(spannableString, alignment2, null, null, f9, 0, i23, f10, i12, i11, f7, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(c1635b);
                                }
                                c1262b = this;
                                charsetC = charset;
                                c1261aA = c1261a;
                                mVar2 = mVar;
                            }
                        }
                    }
                }
                charset = charsetC;
                c1261a = c1261aA;
                mVar = mVar2;
                c1262b = this;
                charsetC = charset;
                c1261aA = c1261a;
                mVar2 = mVar;
            } else {
                charset = charsetC;
                c1261a = c1261aA;
                mVar = mVar2;
                c1262b = this;
                charsetC = charset;
                c1261aA = c1261a;
                mVar2 = mVar;
            }
        }
    }

    @Override // k3.m
    public final /* synthetic */ void r(byte[] bArr, k3.l lVar, I i7) {
        l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public final int s() {
        return 1;
    }
}
