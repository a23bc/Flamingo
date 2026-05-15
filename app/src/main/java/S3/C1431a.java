package s3;

import java.util.regex.Pattern;
import w2.m;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1431a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f15867c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f15868d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f15869a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f15870b = new StringBuilder();

    public static String a(m mVar, StringBuilder sb) {
        boolean z6 = false;
        sb.setLength(0);
        int i7 = mVar.f18868b;
        int i8 = mVar.f18869c;
        while (i7 < i8 && !z6) {
            char c7 = (char) mVar.f18867a[i7];
            if ((c7 < 'A' || c7 > 'Z') && ((c7 < 'a' || c7 > 'z') && !((c7 >= '0' && c7 <= '9') || c7 == '#' || c7 == '-' || c7 == '.' || c7 == '_'))) {
                z6 = true;
            } else {
                i7++;
                sb.append(c7);
            }
        }
        mVar.H(i7 - mVar.f18868b);
        return sb.toString();
    }

    public static String b(m mVar, StringBuilder sb) {
        c(mVar);
        if (mVar.a() == 0) {
            return null;
        }
        String strA = a(mVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) mVar.u());
    }

    public static void c(m mVar) {
        while (true) {
            for (boolean z6 = true; mVar.a() > 0 && z6; z6 = false) {
                int i7 = mVar.f18868b;
                byte[] bArr = mVar.f18867a;
                byte b7 = bArr[i7];
                char c7 = (char) b7;
                if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
                    mVar.H(1);
                } else {
                    int i8 = mVar.f18869c;
                    int i9 = i7 + 2;
                    if (i9 <= i8) {
                        int i10 = i7 + 1;
                        if (b7 == 47 && bArr[i10] == 42) {
                            while (true) {
                                int i11 = i9 + 1;
                                if (i11 >= i8) {
                                    break;
                                }
                                if (((char) bArr[i9]) == '*' && ((char) bArr[i11]) == '/') {
                                    i9 += 2;
                                    i8 = i9;
                                } else {
                                    i9 = i11;
                                }
                            }
                            mVar.H(i8 - mVar.f18868b);
                        }
                    }
                }
            }
            return;
        }
    }
}
