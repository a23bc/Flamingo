package M5;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    public static final S5.j f4854a;

    /* JADX INFO: renamed from: b */
    public static final String[] f4855b;

    /* JADX INFO: renamed from: c */
    public static final String[] f4856c;

    /* JADX INFO: renamed from: d */
    public static final String[] f4857d;

    static {
        S5.j jVar = S5.j.f6786r;
        f4854a = N2.z.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f4855b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f4856c = new String[64];
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            AbstractC1209k.e(binaryString, "toBinaryString(it)");
            String strReplace = G5.b.g("%8s", binaryString).replace(' ', '0');
            AbstractC1209k.e(strReplace, "replace(...)");
            strArr[i7] = strReplace;
        }
        f4857d = strArr;
        String[] strArr2 = f4856c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = Z1.l.t(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f4856c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = Z1.l.t(sb, strArr3[i10], "|PADDED");
        }
        int length = f4856c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f4856c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f4857d[i13];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            java.lang.String[] r6 = M5.f.f4855b
            int r7 = r6.length
            if (r13 >= r7) goto Le
            r6 = r6[r13]
            goto L1c
        Le:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r3] = r6
            java.lang.String r6 = "0x%02x"
            java.lang.String r6 = G5.b.g(r6, r7)
        L1c:
            if (r14 != 0) goto L21
            java.lang.String r13 = ""
            goto L6a
        L21:
            java.lang.String[] r7 = M5.f.f4857d
            if (r13 == r2) goto L68
            if (r13 == r1) goto L68
            if (r13 == r4) goto L60
            r8 = 6
            if (r13 == r8) goto L60
            r8 = 7
            if (r13 == r8) goto L68
            r8 = 8
            if (r13 == r8) goto L68
            java.lang.String[] r8 = M5.f.f4856c
            int r9 = r8.length
            if (r14 >= r9) goto L3e
            r7 = r8[r14]
            m5.AbstractC1209k.c(r7)
            goto L40
        L3e:
            r7 = r7[r14]
        L40:
            if (r13 != r0) goto L4f
            r8 = r14 & 4
            if (r8 == 0) goto L4f
            java.lang.String r13 = "PUSH_PROMISE"
            java.lang.String r14 = "HEADERS"
            java.lang.String r13 = u5.AbstractC1552n.I(r7, r14, r13)
            goto L6a
        L4f:
            if (r13 != 0) goto L5e
            r13 = r14 & 32
            if (r13 == 0) goto L5e
            java.lang.String r13 = "COMPRESSED"
            java.lang.String r14 = "PRIORITY"
            java.lang.String r13 = u5.AbstractC1552n.I(r7, r14, r13)
            goto L6a
        L5e:
            r13 = r7
            goto L6a
        L60:
            if (r14 != r5) goto L65
            java.lang.String r13 = "ACK"
            goto L6a
        L65:
            r13 = r7[r14]
            goto L6a
        L68:
            r13 = r7[r14]
        L6a:
            if (r10 == 0) goto L6f
            java.lang.String r10 = "<<"
            goto L71
        L6f:
            java.lang.String r10 = ">>"
        L71:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r3] = r10
            r14[r5] = r11
            r14[r2] = r12
            r14[r1] = r6
            r14[r4] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = G5.b.g(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.f.a(boolean, int, int, int, int):java.lang.String");
    }
}
