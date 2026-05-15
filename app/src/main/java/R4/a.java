package R4;

import A0.e;
import N2.z;
import d2.C0821i;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String[] f6673B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f6674C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringReader f6675o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f6683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f6685y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f6686z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6676p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final char[] f6677q = new char[1024];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6678r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6679s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6680t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6681u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6682v = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6672A = 1;

    static {
        z.f5106o = new z();
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f6686z = iArr;
        iArr[0] = 6;
        this.f6673B = new String[32];
        this.f6674C = new int[32];
        this.f6675o = stringReader;
    }

    public final void A() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 7) {
            throw new IllegalStateException("Expected null but was " + e.O(E()) + r());
        }
        this.f6682v = 0;
        int[] iArr = this.f6674C;
        int i7 = this.f6672A - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f6678r = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r10.f6678r = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String B(char r11) throws R4.c {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f6678r
            int r3 = r10.f6679s
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f6677q
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f6678r = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f6678r = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.G()
            r1.append(r2)
            int r2 = r10.f6678r
            int r3 = r10.f6679s
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f6680t
            int r2 = r2 + r6
            r10.f6680t = r2
            r10.f6681u = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f6678r = r2
            boolean r2 = r10.j(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.L(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.a.B(char):java.lang.String");
    }

    public final String C() {
        String str;
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = D();
        } else if (iG == 8) {
            str = B('\'');
        } else if (iG == 9) {
            str = B('\"');
        } else if (iG == 11) {
            str = this.f6685y;
            this.f6685y = null;
        } else if (iG == 15) {
            str = Long.toString(this.f6683w);
        } else {
            if (iG != 16) {
                throw new IllegalStateException("Expected a string but was " + e.O(E()) + r());
            }
            str = new String(this.f6677q, this.f6678r, this.f6684x);
            this.f6678r += this.f6684x;
        }
        this.f6682v = 0;
        int[] iArr = this.f6674C;
        int i7 = this.f6672A - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String D() throws R4.c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f6678r
            int r4 = r3 + r2
            int r5 = r7.f6679s
            char[] r6 = r7.f6677q
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.d()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.j(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f6678r
            r0.append(r6, r3, r2)
            int r3 = r7.f6678r
            int r3 = r3 + r2
            r7.f6678r = r3
            r2 = 1
            boolean r2 = r7.j(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f6678r
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f6678r
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f6678r
            int r2 = r2 + r1
            r7.f6678r = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.a.D():java.lang.String");
    }

    public final int E() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void F(int i7) {
        int i8 = this.f6672A;
        int[] iArr = this.f6686z;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f6686z = Arrays.copyOf(iArr, i9);
            this.f6674C = Arrays.copyOf(this.f6674C, i9);
            this.f6673B = (String[]) Arrays.copyOf(this.f6673B, i9);
        }
        int[] iArr2 = this.f6686z;
        int i10 = this.f6672A;
        this.f6672A = i10 + 1;
        iArr2[i10] = i7;
    }

    public final char G() throws c {
        int i7;
        if (this.f6678r == this.f6679s && !j(1)) {
            L("Unterminated escape sequence");
            throw null;
        }
        int i8 = this.f6678r;
        int i9 = i8 + 1;
        this.f6678r = i9;
        char[] cArr = this.f6677q;
        char c7 = cArr[i8];
        if (c7 == '\n') {
            this.f6680t++;
            this.f6681u = i9;
            return c7;
        }
        if (c7 == '\"' || c7 == '\'' || c7 == '/' || c7 == '\\') {
            return c7;
        }
        if (c7 == 'b') {
            return '\b';
        }
        if (c7 == 'f') {
            return '\f';
        }
        if (c7 == 'n') {
            return '\n';
        }
        if (c7 == 'r') {
            return '\r';
        }
        if (c7 == 't') {
            return '\t';
        }
        if (c7 != 'u') {
            L("Invalid escape sequence");
            throw null;
        }
        if (i8 + 5 > this.f6679s && !j(4)) {
            L("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f6678r;
        int i11 = i10 + 4;
        char c8 = 0;
        while (i10 < i11) {
            char c9 = cArr[i10];
            char c10 = (char) (c8 << 4);
            if (c9 >= '0' && c9 <= '9') {
                i7 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i7 = c9 - 'W';
            } else {
                if (c9 < 'A' || c9 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f6678r, 4)));
                }
                i7 = c9 - '7';
            }
            c8 = (char) (i7 + c10);
            i10++;
        }
        this.f6678r += 4;
        return c8;
    }

    public final void H(char c7) throws c {
        do {
            int i7 = this.f6678r;
            int i8 = this.f6679s;
            while (i7 < i8) {
                int i9 = i7 + 1;
                char c8 = this.f6677q[i7];
                if (c8 == c7) {
                    this.f6678r = i9;
                    return;
                }
                if (c8 == '\\') {
                    this.f6678r = i9;
                    G();
                    i7 = this.f6678r;
                    i8 = this.f6679s;
                } else {
                    if (c8 == '\n') {
                        this.f6680t++;
                        this.f6681u = i9;
                    }
                    i7 = i9;
                }
            }
            this.f6678r = i7;
        } while (j(1));
        L("Unterminated string");
        throw null;
    }

    public final void I() {
        char c7;
        do {
            if (this.f6678r >= this.f6679s && !j(1)) {
                return;
            }
            int i7 = this.f6678r;
            int i8 = i7 + 1;
            this.f6678r = i8;
            c7 = this.f6677q[i7];
            if (c7 == '\n') {
                this.f6680t++;
                this.f6681u = i8;
                return;
            }
        } while (c7 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() throws R4.c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f6678r
            int r2 = r1 + r0
            int r3 = r4.f6679s
            if (r2 >= r3) goto L51
            char[] r2 = r4.f6677q
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.d()
        L4b:
            int r1 = r4.f6678r
            int r1 = r1 + r0
            r4.f6678r = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f6678r = r1
            r0 = 1
            boolean r0 = r4.j(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.a.J():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void K() throws IOException {
        int i7 = 0;
        do {
            int iG = this.f6682v;
            if (iG == 0) {
                iG = g();
            }
            switch (iG) {
                case 1:
                    F(3);
                    i7++;
                    this.f6682v = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f6673B[this.f6672A - 1] = null;
                    }
                    this.f6672A--;
                    i7--;
                    this.f6682v = 0;
                    break;
                case 3:
                    F(1);
                    i7++;
                    this.f6682v = 0;
                    break;
                case 4:
                    this.f6672A--;
                    i7--;
                    this.f6682v = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                case 15:
                default:
                    this.f6682v = 0;
                    break;
                case 8:
                    H('\'');
                    this.f6682v = 0;
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    H('\"');
                    this.f6682v = 0;
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    J();
                    this.f6682v = 0;
                    break;
                case 12:
                    H('\'');
                    if (i7 == 0) {
                        this.f6673B[this.f6672A - 1] = "<skipped>";
                    }
                    this.f6682v = 0;
                    break;
                case 13:
                    H('\"');
                    if (i7 == 0) {
                        this.f6673B[this.f6672A - 1] = "<skipped>";
                    }
                    this.f6682v = 0;
                    break;
                case 14:
                    J();
                    if (i7 == 0) {
                        this.f6673B[this.f6672A - 1] = "<skipped>";
                    }
                    this.f6682v = 0;
                    break;
                case 16:
                    this.f6678r += this.f6684x;
                    this.f6682v = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i7 > 0);
        int[] iArr = this.f6674C;
        int i8 = this.f6672A - 1;
        iArr[i8] = iArr[i8] + 1;
    }

    public final void L(String str) throws c {
        throw new c(str + r());
    }

    public final void b() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 3) {
            F(1);
            this.f6674C[this.f6672A - 1] = 0;
            this.f6682v = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + e.O(E()) + r());
        }
    }

    public final void c() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 1) {
            F(3);
            this.f6682v = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + e.O(E()) + r());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6682v = 0;
        this.f6686z[0] = 8;
        this.f6672A = 1;
        this.f6675o.close();
    }

    public final void d() throws c {
        if (this.f6676p) {
            return;
        }
        L("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x020f, code lost:
    
        if (q(r7) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.a.g():int");
    }

    public final void h() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + e.O(E()) + r());
        }
        int i7 = this.f6672A;
        this.f6672A = i7 - 1;
        int[] iArr = this.f6674C;
        int i8 = i7 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f6682v = 0;
    }

    public final void i() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + e.O(E()) + r());
        }
        int i7 = this.f6672A;
        int i8 = i7 - 1;
        this.f6672A = i8;
        this.f6673B[i8] = null;
        int[] iArr = this.f6674C;
        int i9 = i7 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f6682v = 0;
    }

    public final boolean j(int i7) throws IOException {
        int i8;
        int i9;
        int i10 = this.f6681u;
        int i11 = this.f6678r;
        this.f6681u = i10 - i11;
        int i12 = this.f6679s;
        char[] cArr = this.f6677q;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f6679s = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f6679s = 0;
        }
        this.f6678r = 0;
        do {
            int i14 = this.f6679s;
            int i15 = this.f6675o.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i8 = this.f6679s + i15;
            this.f6679s = i8;
            if (this.f6680t == 0 && (i9 = this.f6681u) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f6678r++;
                this.f6681u = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    public final String n(boolean z6) {
        StringBuilder sb = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i8 = this.f6672A;
            if (i7 >= i8) {
                return sb.toString();
            }
            int i9 = this.f6686z[i7];
            if (i9 == 1 || i9 == 2) {
                int i10 = this.f6674C[i7];
                if (z6 && i10 > 0 && i7 == i8 - 1) {
                    i10--;
                }
                sb.append('[');
                sb.append(i10);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = this.f6673B[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
            i7++;
        }
    }

    public final boolean o() throws IOException {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4 || iG == 17) ? false : true;
    }

    public final boolean q(char c7) throws c {
        if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
            return false;
        }
        if (c7 != '#') {
            if (c7 == ',') {
                return false;
            }
            if (c7 != '/' && c7 != '=') {
                if (c7 == '{' || c7 == '}' || c7 == ':') {
                    return false;
                }
                if (c7 != ';') {
                    switch (c7) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public final String r() {
        return " at line " + (this.f6680t + 1) + " column " + ((this.f6678r - this.f6681u) + 1) + " path " + n(false);
    }

    public final boolean s() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.f6682v = 0;
            int[] iArr = this.f6674C;
            int i7 = this.f6672A - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iG != 6) {
            throw new IllegalStateException("Expected a boolean but was " + e.O(E()) + r());
        }
        this.f6682v = 0;
        int[] iArr2 = this.f6674C;
        int i8 = this.f6672A - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return false;
    }

    public final double t() throws IOException {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f6682v = 0;
            int[] iArr = this.f6674C;
            int i7 = this.f6672A - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f6683w;
        }
        if (iG == 16) {
            this.f6685y = new String(this.f6677q, this.f6678r, this.f6684x);
            this.f6678r += this.f6684x;
        } else if (iG == 8 || iG == 9) {
            this.f6685y = B(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.f6685y = D();
        } else if (iG != 11) {
            throw new IllegalStateException("Expected a double but was " + e.O(E()) + r());
        }
        this.f6682v = 11;
        double d4 = Double.parseDouble(this.f6685y);
        if (!this.f6676p && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new c("JSON forbids NaN and infinities: " + d4 + r());
        }
        this.f6685y = null;
        this.f6682v = 0;
        int[] iArr2 = this.f6674C;
        int i8 = this.f6672A - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return d4;
    }

    public final String toString() {
        return a.class.getSimpleName() + r();
    }

    public final int u() {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j3 = this.f6683w;
            int i7 = (int) j3;
            if (j3 != i7) {
                throw new NumberFormatException("Expected an int but was " + this.f6683w + r());
            }
            this.f6682v = 0;
            int[] iArr = this.f6674C;
            int i8 = this.f6672A - 1;
            iArr[i8] = iArr[i8] + 1;
            return i7;
        }
        if (iG == 16) {
            this.f6685y = new String(this.f6677q, this.f6678r, this.f6684x);
            this.f6678r += this.f6684x;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected an int but was " + e.O(E()) + r());
            }
            if (iG == 10) {
                this.f6685y = D();
            } else {
                this.f6685y = B(iG == 8 ? '\'' : '\"');
            }
            try {
                int i9 = Integer.parseInt(this.f6685y);
                this.f6682v = 0;
                int[] iArr2 = this.f6674C;
                int i10 = this.f6672A - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i9;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6682v = 11;
        double d4 = Double.parseDouble(this.f6685y);
        int i11 = (int) d4;
        if (i11 != d4) {
            throw new NumberFormatException("Expected an int but was " + this.f6685y + r());
        }
        this.f6685y = null;
        this.f6682v = 0;
        int[] iArr3 = this.f6674C;
        int i12 = this.f6672A - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    public final long w() throws IOException {
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f6682v = 0;
            int[] iArr = this.f6674C;
            int i7 = this.f6672A - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f6683w;
        }
        if (iG == 16) {
            this.f6685y = new String(this.f6677q, this.f6678r, this.f6684x);
            this.f6678r += this.f6684x;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected a long but was " + e.O(E()) + r());
            }
            if (iG == 10) {
                this.f6685y = D();
            } else {
                this.f6685y = B(iG == 8 ? '\'' : '\"');
            }
            try {
                long j3 = Long.parseLong(this.f6685y);
                this.f6682v = 0;
                int[] iArr2 = this.f6674C;
                int i8 = this.f6672A - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return j3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6682v = 11;
        double d4 = Double.parseDouble(this.f6685y);
        long j7 = (long) d4;
        if (j7 != d4) {
            throw new NumberFormatException("Expected a long but was " + this.f6685y + r());
        }
        this.f6685y = null;
        this.f6682v = 0;
        int[] iArr3 = this.f6674C;
        int i9 = this.f6672A - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return j7;
    }

    public final String y() {
        String strB;
        int iG = this.f6682v;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strB = D();
        } else if (iG == 12) {
            strB = B('\'');
        } else {
            if (iG != 13) {
                throw new IllegalStateException("Expected a name but was " + e.O(E()) + r());
            }
            strB = B('\"');
        }
        this.f6682v = 0;
        this.f6673B[this.f6672A - 1] = strB;
        return strB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int z(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.a.z(boolean):int");
    }
}
