package o4;

import F5.m;
import F5.t;
import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    public final t f14704a;

    /* JADX INFO: renamed from: b */
    public final b f14705b;

    /* JADX INFO: renamed from: c */
    public final Date f14706c;

    /* JADX INFO: renamed from: d */
    public final String f14707d;

    /* JADX INFO: renamed from: e */
    public final Date f14708e;

    /* JADX INFO: renamed from: f */
    public final String f14709f;

    /* JADX INFO: renamed from: g */
    public final Date f14710g;
    public final long h;

    /* JADX INFO: renamed from: i */
    public final long f14711i;

    /* JADX INFO: renamed from: j */
    public final String f14712j;

    /* JADX INFO: renamed from: k */
    public final int f14713k;

    public c(t tVar, b bVar) {
        int i7;
        this.f14704a = tVar;
        this.f14705b = bVar;
        this.f14713k = -1;
        if (bVar != null) {
            this.h = bVar.f14700c;
            this.f14711i = bVar.f14701d;
            m mVar = bVar.f14703f;
            int size = mVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                String strE = mVar.e(i8);
                if (AbstractC1552n.F(strE, "Date")) {
                    String strB = mVar.b("Date");
                    Date date = null;
                    if (strB != null) {
                        K5.c cVar = K5.d.f4074a;
                        if (strB.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date date2 = ((DateFormat) K5.d.f4074a.get()).parse(strB, parsePosition);
                            if (parsePosition.getIndex() == strB.length()) {
                                date = date2;
                            } else {
                                String[] strArr = K5.d.f4075b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= length) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr = K5.d.f4076c;
                                            DateFormat simpleDateFormat = dateFormatArr[i9];
                                            if (simpleDateFormat == null) {
                                                simpleDateFormat = new SimpleDateFormat(K5.d.f4075b[i9], Locale.US);
                                                simpleDateFormat.setTimeZone(G5.b.f2768d);
                                                dateFormatArr[i9] = simpleDateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date date3 = simpleDateFormat.parse(strB, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = date3;
                                                break;
                                            }
                                            i9++;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    this.f14706c = date;
                    this.f14707d = mVar.i(i8);
                } else if (AbstractC1552n.F(strE, "Expires")) {
                    this.f14710g = mVar.c("Expires");
                } else if (AbstractC1552n.F(strE, "Last-Modified")) {
                    this.f14708e = mVar.c("Last-Modified");
                    this.f14709f = mVar.i(i8);
                } else if (AbstractC1552n.F(strE, "ETag")) {
                    this.f14712j = mVar.i(i8);
                } else if (AbstractC1552n.F(strE, "Age")) {
                    String strI = mVar.i(i8);
                    Bitmap.Config config = s4.e.f15919a;
                    Long lM = AbstractC1552n.M(strI);
                    if (lM != null) {
                        long jLongValue = lM.longValue();
                        i7 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i7 = -1;
                    }
                    this.f14713k = i7;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00d9  */
    /* JADX WARN: Type inference failed for: r5v1, types: [Y4.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o4.d a() {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.c.a():o4.d");
    }
}
