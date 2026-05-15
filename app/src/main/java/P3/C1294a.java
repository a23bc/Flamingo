package p3;

import E4.I;
import Z1.l;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.C1145a;
import k3.d;
import k3.m;
import v2.C1635b;
import w2.AbstractC1697a;
import w2.c;

/* JADX INFO: renamed from: p3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1294a implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f14995r = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f14996s = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f14997o = new StringBuilder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f14998p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w2.m f14999q = new w2.m();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C1635b a(Spanned spanned, String str) {
        byte b7;
        byte b8;
        float f7;
        if (str == null) {
            return new C1635b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                b7 = !str.equals("{\\an1}") ? (byte) -1 : (byte) 0;
                break;
            case -685620679:
                b7 = !str.equals("{\\an2}") ? (byte) -1 : (byte) 6;
                break;
            case -685620648:
                b7 = !str.equals("{\\an3}") ? (byte) -1 : (byte) 3;
                break;
            case -685620617:
                b7 = !str.equals("{\\an4}") ? (byte) -1 : (byte) 1;
                break;
            case -685620586:
                b7 = !str.equals("{\\an5}") ? (byte) -1 : (byte) 7;
                break;
            case -685620555:
                b7 = !str.equals("{\\an6}") ? (byte) -1 : (byte) 4;
                break;
            case -685620524:
                b7 = !str.equals("{\\an7}") ? (byte) -1 : (byte) 2;
                break;
            case -685620493:
                b7 = !str.equals("{\\an8}") ? (byte) -1 : (byte) 8;
                break;
            case -685620462:
                b7 = !str.equals("{\\an9}") ? (byte) -1 : (byte) 5;
                break;
            default:
                b7 = -1;
                break;
        }
        int i7 = (b7 == 0 || b7 == 1 || b7 == 2) ? 0 : (b7 == 3 || b7 == 4 || b7 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                b8 = !str.equals("{\\an1}") ? (byte) -1 : (byte) 0;
                break;
            case -685620679:
                b8 = !str.equals("{\\an2}") ? (byte) -1 : (byte) 1;
                break;
            case -685620648:
                b8 = !str.equals("{\\an3}") ? (byte) -1 : (byte) 2;
                break;
            case -685620617:
                b8 = !str.equals("{\\an4}") ? (byte) -1 : (byte) 6;
                break;
            case -685620586:
                b8 = !str.equals("{\\an5}") ? (byte) -1 : (byte) 7;
                break;
            case -685620555:
                b8 = !str.equals("{\\an6}") ? (byte) -1 : (byte) 8;
                break;
            case -685620524:
                b8 = !str.equals("{\\an7}") ? (byte) -1 : (byte) 3;
                break;
            case -685620493:
                b8 = !str.equals("{\\an8}") ? (byte) -1 : (byte) 4;
                break;
            case -685620462:
                b8 = !str.equals("{\\an9}") ? (byte) -1 : (byte) 5;
                break;
            default:
                b8 = -1;
                break;
        }
        int i8 = (b8 == 0 || b8 == 1 || b8 == 2) ? 2 : (b8 == 3 || b8 == 4 || b8 == 5) ? 0 : 1;
        float f8 = 0.92f;
        if (i7 == 0) {
            f7 = 0.08f;
        } else if (i7 == 1) {
            f7 = 0.5f;
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException();
            }
            f7 = 0.92f;
        }
        if (i8 == 0) {
            f8 = 0.08f;
        } else if (i8 == 1) {
            f8 = 0.5f;
        } else if (i8 != 2) {
            throw new IllegalArgumentException();
        }
        return new C1635b(spanned, null, null, null, f8, 0, i8, f7, i7, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long b(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7 + 1);
        long j3 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i7 + 2);
        strGroup2.getClass();
        long j7 = (Long.parseLong(strGroup2) * 60000) + j3;
        String strGroup3 = matcher.group(i7 + 3);
        strGroup3.getClass();
        long j8 = (Long.parseLong(strGroup3) * 1000) + j7;
        String strGroup4 = matcher.group(i7 + 4);
        if (strGroup4 != null) {
            j8 += Long.parseLong(strGroup4);
        }
        return j8 * 1000;
    }

    @Override // k3.m
    public final /* synthetic */ void d() {
    }

    @Override // k3.m
    public final /* synthetic */ d i(byte[] bArr, int i7, int i8) {
        return l.e(this, bArr, i8);
    }

    @Override // k3.m
    public final void l(byte[] bArr, int i7, int i8, k3.l lVar, c cVar) {
        String strH;
        String str;
        C1294a c1294a = this;
        w2.m mVar = c1294a.f14999q;
        mVar.E(i7 + i8, bArr);
        mVar.G(i7);
        Charset charsetC = mVar.C();
        if (charsetC == null) {
            charsetC = D4.d.f1569c;
        }
        long j3 = lVar.f14045a;
        long j7 = -9223372036854775807L;
        ArrayList arrayList = (j3 == -9223372036854775807L || !lVar.f14046b) ? null : new ArrayList();
        while (true) {
            String strH2 = mVar.h(charsetC);
            if (strH2 == null) {
                break;
            }
            if (strH2.length() != 0) {
                try {
                    Integer.parseInt(strH2);
                    strH = mVar.h(charsetC);
                } catch (NumberFormatException unused) {
                    AbstractC1697a.w("Skipping invalid index: ".concat(strH2));
                }
                if (strH == null) {
                    AbstractC1697a.w("Unexpected end");
                    break;
                }
                Matcher matcher = f14995r.matcher(strH);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = c1294a.f14997o;
                    sb.setLength(0);
                    long j8 = j7;
                    ArrayList arrayList2 = c1294a.f14998p;
                    arrayList2.clear();
                    String strH3 = mVar.h(charsetC);
                    while (!TextUtils.isEmpty(strH3)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strH3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f14996s.matcher(strTrim);
                        int i9 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i9;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i9 += length;
                            j3 = j3;
                        }
                        sb.append(sb2.toString());
                        strH3 = mVar.h(charsetC);
                        j3 = j3;
                    }
                    long j9 = j3;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i10);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (j9 == j8 || jB >= j9) {
                        cVar.c(new C1145a(I.t(a(spannedFromHtml, str)), jB, jB2 - jB));
                    } else if (arrayList != null) {
                        arrayList.add(new C1145a(I.t(a(spannedFromHtml, str)), jB, jB2 - jB));
                    }
                    c1294a = this;
                    j7 = j8;
                    j3 = j9;
                } else {
                    AbstractC1697a.w("Skipping invalid timing: ".concat(strH));
                    c1294a = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar.c((C1145a) it.next());
            }
        }
    }

    @Override // k3.m
    public final /* synthetic */ void r(byte[] bArr, k3.l lVar, A2.I i7) {
        l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public final int s() {
        return 1;
    }
}
