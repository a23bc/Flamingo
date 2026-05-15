package w2;

import A2.RunnableC0022x;
import A2.d0;
import I4.E;
import I4.y;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.X;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a */
    public static final int f18881a;

    /* JADX INFO: renamed from: b */
    public static final String f18882b;

    /* JADX INFO: renamed from: c */
    public static final String f18883c;

    /* JADX INFO: renamed from: d */
    public static final String f18884d;

    /* JADX INFO: renamed from: e */
    public static final String f18885e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f18886f;

    /* JADX INFO: renamed from: g */
    public static final long[] f18887g;
    public static final Pattern h;

    /* JADX INFO: renamed from: i */
    public static HashMap f18888i;

    /* JADX INFO: renamed from: j */
    public static final String[] f18889j;

    /* JADX INFO: renamed from: k */
    public static final String[] f18890k;
    public static final int[] l;

    /* JADX INFO: renamed from: m */
    public static final int[] f18891m;

    /* JADX INFO: renamed from: n */
    public static final int[] f18892n;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f18881a = i7;
        String str = Build.DEVICE;
        f18882b = str;
        String str2 = Build.MANUFACTURER;
        f18883c = str2;
        String str3 = Build.MODEL;
        f18884d = str3;
        f18885e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f18886f = new byte[0];
        f18887g = new long[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f18889j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f18890k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f18891m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f18892n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(Context context) {
        int i7 = f18881a;
        if (i7 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i7 != 30) {
            return false;
        }
        String str = f18884d;
        return I0.c.r(str, "moto g(20)") || I0.c.r(str, "rmx3231");
    }

    public static boolean B(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void C(ArrayList arrayList, int i7, int i8, int i9) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i10 = (i8 - i7) - 1; i10 >= 0; i10--) {
            arrayDeque.addFirst(arrayList.remove(i7 + i10));
        }
        arrayList.addAll(Math.min(i9, arrayList.size()), arrayDeque);
    }

    public static long D(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static String E(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strV = I0.c.V(str);
        int i7 = 0;
        String str2 = strV.split("-", 2)[0];
        if (f18888i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f18889j;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                map.put(strArr[i8], strArr[i8 + 1]);
            }
            f18888i = map;
        }
        String str4 = (String) f18888i.get(str2);
        if (str4 != null) {
            strV = str4 + strV.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strV;
        }
        while (true) {
            String[] strArr2 = f18890k;
            if (i7 >= strArr2.length) {
                return strV;
            }
            if (strV.startsWith(strArr2[i7])) {
                return strArr2[i7 + 1] + strV.substring(strArr2[i7].length());
            }
            i7 += 2;
        }
    }

    public static Object[] F(int i7, Object[] objArr) {
        AbstractC1697a.d(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static void G(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static long H(long j3, int i7) {
        return J(j3, 1000000L, i7, RoundingMode.FLOOR);
    }

    public static void I(long[] jArr, long j3) {
        long j7;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i7 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long jA = N5.d.A(j3, 1000000L, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = N5.d.A(jArr[i7], jA, roundingMode);
                i7++;
            }
            return;
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            long jA2 = N5.d.A(1000000L, j3, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = N5.d.T(jArr[i7], jA2);
                i7++;
            }
            return;
        }
        int i8 = 0;
        while (i8 < jArr.length) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                if (j3 >= j8 && j3 % j8 == 0) {
                    jArr[i8] = N5.d.A(1000000L, N5.d.A(j3, j8, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j3 >= j8 || j8 % j3 != 0) {
                    j7 = j3;
                    jArr[i8] = K(j8, 1000000L, j7, roundingMode);
                } else {
                    jArr[i8] = N5.d.T(1000000L, N5.d.A(j8, j3, RoundingMode.UNNECESSARY));
                }
                j7 = j3;
            } else {
                j7 = j3;
            }
            i8++;
            j3 = j7;
        }
    }

    public static long J(long j3, long j7, long j8, RoundingMode roundingMode) {
        if (j3 == 0 || j7 == 0) {
            return 0L;
        }
        return (j8 < j7 || j8 % j7 != 0) ? (j8 >= j7 || j7 % j8 != 0) ? (j8 < j3 || j8 % j3 != 0) ? (j8 >= j3 || j3 % j8 != 0) ? K(j3, j7, j8, roundingMode) : N5.d.T(j7, N5.d.A(j3, j8, RoundingMode.UNNECESSARY)) : N5.d.A(j7, N5.d.A(j8, j3, RoundingMode.UNNECESSARY), roundingMode) : N5.d.T(j3, N5.d.A(j7, j8, RoundingMode.UNNECESSARY)) : N5.d.A(j3, N5.d.A(j8, j7, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long K(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.K(long, long, long, java.math.RoundingMode):long");
    }

    public static boolean L(X x6, boolean z6) {
        return x6 == null || !x6.C() || x6.d() == 1 || x6.d() == 4 || (z6 && x6.i0() != 0);
    }

    public static E M(y yVar, I4.q qVar) {
        E e7 = new E();
        RunnableC0022x runnableC0022x = new RunnableC0022x(e7, 12, yVar);
        I4.r rVar = I4.r.f3531o;
        e7.b(runnableC0022x, rVar);
        yVar.b(new d0(yVar, e7, qVar, 8), rVar);
        return e7;
    }

    public static long N(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j3, boolean z6) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j3);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i7 = iBinarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j3) {
                break;
            }
            iBinarySearch = i7;
        }
        return z6 ? iBinarySearch : i7;
    }

    public static int c(int[] iArr, int i7, boolean z6, boolean z7) {
        int i8;
        int i9;
        int iBinarySearch = Arrays.binarySearch(iArr, i7);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i8 = iBinarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                iBinarySearch = i8;
            }
            i9 = z6 ? iBinarySearch : i8;
        }
        return z7 ? Math.max(0, i9) : i9;
    }

    public static int d(long[] jArr, long j3, boolean z6) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j3);
        if (iBinarySearch < 0) {
            i7 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i8 = iBinarySearch - 1;
                if (i8 < 0 || jArr[i8] != j3) {
                    break;
                }
                iBinarySearch = i8;
            }
            i7 = iBinarySearch;
        }
        return z6 ? Math.max(0, i7) : i7;
    }

    public static int e(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static float f(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    public static int g(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static long h(long j3, long j7, long j8) {
        return Math.max(j7, Math.min(j3, j8));
    }

    public static int i(int i7, int i8, int i9, byte[] bArr) {
        while (i7 < i8) {
            i9 = l[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static Handler j(L2.l lVar) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC1697a.j(looperMyLooper);
        return new Handler(looperMyLooper, lVar);
    }

    public static String k(byte[] bArr) {
        return new String(bArr, D4.d.f1569c);
    }

    public static int l(int i7) {
        if (i7 == 20) {
            return 30;
        }
        if (i7 == 22) {
            return 31;
        }
        if (i7 == 30) {
            return 34;
        }
        switch (i7) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
            case 12:
                return 28;
            default:
                switch (i7) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static AudioFormat m(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int n(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = w2.t.f18881a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.n(int):int");
    }

    public static Looper o() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int p(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case BuildConfig.API_VERSION /* 20 */:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int q(String str) {
        String[] strArrSplit;
        int length;
        int i7 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z6 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i7 = Integer.parseInt(str2);
            if (z6) {
                return -i7;
            }
        } catch (NumberFormatException unused) {
        }
        return i7;
    }

    public static long r(long j3, float f7) {
        return f7 == 1.0f ? j3 : Math.round(j3 * ((double) f7));
    }

    public static int s(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static C1487p t(int i7, int i8, int i9) {
        C1486o c1486o = new C1486o();
        c1486o.l = M.j("audio/raw");
        c1486o.f16640z = i8;
        c1486o.f16608A = i9;
        c1486o.f16609B = i7;
        return new C1487p(c1486o);
    }

    public static int u(int i7, int i8) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i8;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i8 * 3;
            }
            return i8 * 4;
        }
        return i8 * 2;
    }

    public static String v(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            AbstractC1697a.n("Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String w(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i7 >= 10000 ? Z1.l.o(i7, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean x(t2.X r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.d()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.K0(r3)
            if (r3 == 0) goto L17
            r4.b()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.K0(r3)
            if (r1 == 0) goto L24
            r4.S()
            goto L15
        L24:
            boolean r1 = r4.K0(r2)
            if (r1 == 0) goto L2e
            r4.e()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.x(t2.X):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int y(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.t.y(android.net.Uri, java.lang.String):int");
    }

    public static boolean z(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }
}
