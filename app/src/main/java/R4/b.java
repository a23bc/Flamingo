package R4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f6687w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f6688x = new String[128];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f6689y;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Writer f6690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f6691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f6693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f6696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6697v;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f6688x[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f6688x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f6689y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f6691p = iArr;
        this.f6692q = 0;
        if (iArr.length == 0) {
            this.f6691p = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f6691p;
        int i7 = this.f6692q;
        this.f6692q = i7 + 1;
        iArr2[i7] = 6;
        this.f6693r = ":";
        this.f6697v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f6690o = writer;
    }

    public final void b() throws IOException {
        int iQ = q();
        if (iQ == 1) {
            this.f6691p[this.f6692q - 1] = 2;
            n();
            return;
        }
        Writer writer = this.f6690o;
        if (iQ == 2) {
            writer.append(',');
            n();
        } else {
            if (iQ == 4) {
                writer.append((CharSequence) this.f6693r);
                this.f6691p[this.f6692q - 1] = 5;
                return;
            }
            if (iQ != 6) {
                if (iQ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f6694s) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f6691p[this.f6692q - 1] = 7;
        }
    }

    public void c() throws IOException {
        z();
        b();
        int i7 = this.f6692q;
        int[] iArr = this.f6691p;
        if (i7 == iArr.length) {
            this.f6691p = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f6691p;
        int i8 = this.f6692q;
        this.f6692q = i8 + 1;
        iArr2[i8] = 1;
        this.f6690o.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6690o.close();
        int i7 = this.f6692q;
        if (i7 > 1 || (i7 == 1 && this.f6691p[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6692q = 0;
    }

    public void d() throws IOException {
        z();
        b();
        int i7 = this.f6692q;
        int[] iArr = this.f6691p;
        if (i7 == iArr.length) {
            this.f6691p = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f6691p;
        int i8 = this.f6692q;
        this.f6692q = i8 + 1;
        iArr2[i8] = 3;
        this.f6690o.write(123);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f6692q == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6690o.flush();
    }

    public final void g(int i7, int i8, char c7) throws IOException {
        int iQ = q();
        if (iQ != i8 && iQ != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6696u != null) {
            throw new IllegalStateException("Dangling name: " + this.f6696u);
        }
        this.f6692q--;
        if (iQ == i8) {
            n();
        }
        this.f6690o.write(c7);
    }

    public void h() throws IOException {
        g(1, 2, ']');
    }

    public void i() throws IOException {
        g(3, 5, '}');
    }

    public void j(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6696u != null) {
            throw new IllegalStateException();
        }
        if (this.f6692q == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6696u = str;
    }

    public b o() throws IOException {
        if (this.f6696u != null) {
            if (!this.f6697v) {
                this.f6696u = null;
                return this;
            }
            z();
        }
        b();
        this.f6690o.write("null");
        return this;
    }

    public final int q() {
        int i7 = this.f6692q;
        if (i7 != 0) {
            return this.f6691p[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f6695t
            if (r0 == 0) goto L7
            java.lang.String[] r0 = R4.b.f6689y
            goto L9
        L7:
            java.lang.String[] r0 = R4.b.f6688x
        L9:
            java.io.Writer r1 = r8.f6690o
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.b.r(java.lang.String):void");
    }

    public void s(double d4) throws IOException {
        z();
        if (this.f6694s || !(Double.isNaN(d4) || Double.isInfinite(d4))) {
            b();
            this.f6690o.append((CharSequence) Double.toString(d4));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
    }

    public void t(long j3) throws IOException {
        z();
        b();
        this.f6690o.write(Long.toString(j3));
    }

    public void u(Number number) throws IOException {
        if (number == null) {
            o();
            return;
        }
        z();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f6687w.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f6694s) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        b();
        this.f6690o.append((CharSequence) string);
    }

    public void w(String str) throws IOException {
        if (str == null) {
            o();
            return;
        }
        z();
        b();
        r(str);
    }

    public void y(boolean z6) throws IOException {
        z();
        b();
        this.f6690o.write(z6 ? "true" : "false");
    }

    public final void z() throws IOException {
        if (this.f6696u != null) {
            int iQ = q();
            if (iQ == 5) {
                this.f6690o.write(44);
            } else if (iQ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            n();
            this.f6691p[this.f6692q - 1] = 4;
            r(this.f6696u);
            this.f6696u = null;
        }
    }

    public final void n() {
    }
}
