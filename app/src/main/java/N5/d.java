package N5;

import B5.r;
import F5.q;
import G1.AbstractC0144k;
import K0.C0235c;
import S5.C0427g;
import V4.J;
import Z4.p;
import Z4.t;
import Z4.v;
import a.AbstractC0509a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import b1.C0622g;
import b1.L;
import b2.C0631A;
import b2.C0633C;
import b2.M0;
import b2.o0;
import b2.p0;
import b2.u0;
import b2.y0;
import d.C0747M;
import d2.C0820h;
import d2.C0821i;
import d2.EnumC0813a;
import d2.EnumC0814b;
import d2.EnumC0815c;
import d2.EnumC0822j;
import d2.EnumC0823k;
import d5.EnumC0830a;
import e4.C0853b;
import e4.C0855d;
import e4.C0856e;
import e4.C0862k;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0881d;
import f0.L0;
import g1.C0980v;
import g2.C0985a;
import g2.C0986b;
import g2.s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C1139a;
import l2.AbstractC1166f;
import l2.C1162b;
import l2.C1163c;
import l2.C1164d;
import l2.C1165e;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import p4.C1296b;
import r0.C1385c;
import r0.InterfaceC1398p;
import u5.AbstractC1545g;
import u5.AbstractC1552n;
import w2.AbstractC1697a;
import w5.AbstractC1767D;
import w5.AbstractC1805x;
import w5.C1800s;
import x0.C1892b;
import y3.x;
import z3.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0049, code lost:
    
        if (r8 > 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004c, code lost:
    
        if (r8 < 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            int[] r9 = G4.d.f2762a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.d.A(long, long, java.math.RoundingMode):long");
    }

    public static final float B(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f7 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            f7 += fArr[i7] * fArr2[i7];
        }
        return f7;
    }

    public static final String C(long j3) {
        String str;
        if (j3 <= -999500000) {
            str = ((j3 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j3 <= -999500) {
            str = ((j3 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j3 <= 0) {
            str = ((j3 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j3 < 999500) {
            str = ((j3 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j3 < 999500000) {
            str = ((j3 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j3 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static long D(long j3, long j7) {
        l.o("a", j3);
        l.o("b", j7);
        if (j3 == 0) {
            return j7;
        }
        if (j7 == 0) {
            return j3;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long jNumberOfTrailingZeros = j3 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j7);
        long j8 = j7 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j8) {
            long j9 = jNumberOfTrailingZeros - j8;
            long j10 = (j9 >> 63) & j9;
            long j11 = (j9 - j10) - j10;
            j8 += j10;
            jNumberOfTrailingZeros = j11 >> Long.numberOfTrailingZeros(j11);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static q E(String str) {
        AbstractC1209k.f(str, "<this>");
        Matcher matcher = q.f2402b.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        AbstractC1209k.e(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC1209k.e(locale, "US");
        AbstractC1209k.e(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        AbstractC1209k.e(strGroup2, "typeSubtype.group(2)");
        AbstractC1209k.e(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = q.f2403c.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                AbstractC1209k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(Z1.l.s(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC1552n.K(strGroup4, "'", false) && AbstractC1552n.E(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    AbstractC1209k.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new q(str);
    }

    public static U0.a F(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new U0.a(AbstractC0144k.b(view));
        }
        return null;
    }

    public static final int G(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        }
        return i8;
    }

    public static final C0622g H(C0980v c0980v) {
        C0622g c0622g = c0980v.f12384a;
        c0622g.getClass();
        long j3 = c0980v.f12385b;
        return c0622g.subSequence(L.f(j3), L.e(j3));
    }

    public static final C0622g I(C0980v c0980v, int i7) {
        C0622g c0622g = c0980v.f12384a;
        long j3 = c0980v.f12385b;
        return c0622g.subSequence(L.e(j3), Math.min(L.e(j3) + i7, c0980v.f12384a.f9970p.length()));
    }

    public static final C0622g J(C0980v c0980v, int i7) {
        C0622g c0622g = c0980v.f12384a;
        long j3 = c0980v.f12385b;
        return c0622g.subSequence(Math.max(0, L.f(j3) - i7), L.f(j3));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0084 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:62:0x002d, B:77:0x007c, B:79:0x0084, B:74:0x006b, B:73:0x0065), top: B:94:0x0021, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0091 A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:81:0x0091, B:86:0x009c, B:87:0x009f, B:62:0x002d, B:77:0x007c, B:79:0x0084, B:74:0x006b, B:73:0x0065, B:84:0x009a), top: B:94:0x0021, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0079 -> B:77:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object K(e5.AbstractC0865c r9) {
        /*
            boolean r0 = r9 instanceof i2.C1068c
            if (r0 == 0) goto L13
            r0 = r9
            i2.c r0 = (i2.C1068c) r0
            int r1 = r0.f13360t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13360t = r1
            goto L18
        L13:
            i2.c r0 = new i2.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f13359s
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13360t
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            y5.b r2 = r0.f13358r
            y5.q r6 = r0.f13357q
            A2.I r7 = r0.f13356p
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f13355o
            android.support.v4.media.session.b.K(r9)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L31:
            r9 = move-exception
            goto L9a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            android.support.v4.media.session.b.K(r9)
            r9 = 6
            y5.c r6 = y5.j.a(r4, r9, r5)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r3)
            K0.A r2 = new K0.A
            r7 = 15
            r2.<init>(r9, r7, r6)
            java.lang.Object r7 = p0.l.f14941c
            monitor-enter(r7)
            java.lang.Object r8 = p0.l.f14946i     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r8 = Z4.n.C0(r8, r2)     // Catch: java.lang.Throwable -> La5
            p0.l.f14946i = r8     // Catch: java.lang.Throwable -> La5
            monitor-exit(r7)
            p0.l.a()
            A2.I r7 = new A2.I
            r8 = 19
            r7.<init>(r8, r2)
            y5.b r2 = new y5.b     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r9
        L6b:
            r0.f13355o = r8     // Catch: java.lang.Throwable -> L31
            r0.f13356p = r7     // Catch: java.lang.Throwable -> L31
            r0.f13357q = r6     // Catch: java.lang.Throwable -> L31
            r0.f13358r = r2     // Catch: java.lang.Throwable -> L31
            r0.f13360t = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r2.b(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L7c
            return r1
        L7c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L91
            java.lang.Object r9 = r2.c()     // Catch: java.lang.Throwable -> L31
            Y4.o r9 = (Y4.o) r9     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            d.C0746L.C()     // Catch: java.lang.Throwable -> L31
            goto L6b
        L91:
            r6.c(r5)     // Catch: java.lang.Throwable -> La0
            r7.k()
            Y4.o r9 = Y4.o.f8736a
            return r9
        L9a:
            throw r9     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            y5.j.b(r6, r9)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r9 = move-exception
            r7.k()
            throw r9
        La5:
            r9 = move-exception
            monitor-exit(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.d.K(e5.c):java.lang.Object");
    }

    public static final void L(BroadcastReceiver broadcastReceiver, AbstractC1805x abstractC1805x, l5.e eVar) {
        B5.d dVarA = AbstractC1767D.a(I0.c.L(AbstractC1767D.c(), abstractC1805x));
        AbstractC1767D.t(dVarA, null, new C0631A(eVar, dVarA, broadcastReceiver.goAsync(), null), 3);
    }

    public static final boolean M(String str) {
        if (AbstractC1552n.E(str, ":", false) || AbstractC1552n.E(str, "：", false)) {
            Pattern patternCompile = Pattern.compile("\\[(\\d+:\\d+(?:[.:]\\d{2,3})?)]");
            AbstractC1209k.e(patternCompile, "compile(...)");
            if (patternCompile.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(byte b7) {
        return b7 > -65;
    }

    public static final long O(String str) {
        List listK0;
        if (AbstractC1545g.N(str, ".", false)) {
            List listK02 = AbstractC1545g.k0(str, new String[]{":"});
            listK0 = new ArrayList();
            Iterator it = listK02.iterator();
            while (it.hasNext()) {
                t.l0(listK0, AbstractC1545g.k0((String) it.next(), new String[]{"."}));
            }
        } else {
            listK0 = AbstractC1545g.N(str, ":", false) ? AbstractC1545g.k0(str, new String[]{":"}) : I0.c.G(str);
        }
        int size = listK0.size();
        if (size == 2) {
            long j3 = 1000;
            return (Long.parseLong((String) listK0.get(1)) * j3) + (Long.parseLong((String) listK0.get(0)) * ((long) 60) * j3);
        }
        if (size != 3) {
            return 0L;
        }
        long j7 = 1000;
        return (Long.parseLong((String) listK0.get(1)) * j7) + (Long.parseLong((String) listK0.get(0)) * ((long) 60) * j7) + (((String) listK0.get(2)).length() == 2 ? Long.parseLong((String) listK0.get(2)) * ((long) 10) : Long.parseLong((String) listK0.get(2)));
    }

    public static final void P(float[] fArr, float[] fArr2, int i7, float[] fArr3) {
        if (i7 == 0) {
            N0.a.a("At least one point must be provided");
        }
        int i8 = 2 >= i7 ? i7 - 1 : 2;
        int i9 = i8 + 1;
        float[][] fArr4 = new float[i9][];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = new float[i7];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i9; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i9][];
        for (int i13 = 0; i13 < i9; i13++) {
            fArr5[i13] = new float[i7];
        }
        float[][] fArr6 = new float[i9][];
        for (int i14 = 0; i14 < i9; i14++) {
            fArr6[i14] = new float[i9];
        }
        int i15 = 0;
        while (i15 < i9) {
            float[] fArr7 = fArr5[i15];
            float[] fArr8 = fArr4[i15];
            AbstractC1209k.f(fArr8, "<this>");
            AbstractC1209k.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i7);
            for (int i16 = 0; i16 < i15; i16++) {
                float[] fArr9 = fArr5[i16];
                float fB = B(fArr7, fArr9);
                for (int i17 = 0; i17 < i7; i17++) {
                    fArr7[i17] = fArr7[i17] - (fArr9[i17] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(B(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f7 = 1.0f / fSqrt;
            for (int i18 = 0; i18 < i7; i18++) {
                fArr7[i18] = fArr7[i18] * f7;
            }
            float[] fArr10 = fArr6[i15];
            int i19 = 0;
            while (i19 < i9) {
                fArr10[i19] = i19 < i15 ? 0.0f : B(fArr7, fArr4[i19]);
                i19++;
            }
            i15++;
        }
        for (int i20 = i8; -1 < i20; i20--) {
            float fB2 = B(fArr5[i20], fArr2);
            float[] fArr11 = fArr6[i20];
            int i21 = i20 + 1;
            if (i21 <= i8) {
                int i22 = i8;
                while (true) {
                    fB2 -= fArr11[i22] * fArr3[i22];
                    if (i22 != i21) {
                        i22--;
                    }
                }
            }
            fArr3[i20] = fB2 / fArr11[i20];
        }
    }

    public static final void Q(L0 l02, InterfaceC0881d interfaceC0881d, int i7) {
        while (true) {
            int i8 = l02.f11713v;
            if (i7 > i8 && i7 < l02.f11712u) {
                return;
            }
            if (i8 == 0 && i7 == 0) {
                return;
            }
            l02.L();
            if (l02.x(l02.f11713v)) {
                interfaceC0881d.G();
            }
            l02.j();
        }
    }

    public static long T(long j3, long j7) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j7) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (iNumberOfLeadingZeros > 65) {
            return j3 * j7;
        }
        long j8 = ((j3 ^ j7) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j7 == Long.MIN_VALUE) & (j3 < 0)))) {
            long j9 = j3 * j7;
            if (j3 == 0 || j9 / j3 == j7) {
                return j9;
            }
        }
        return j8;
    }

    public static final Object V(r rVar, r rVar2, l5.e eVar) throws Throwable {
        Object c1800s;
        Object objV;
        try {
            AbstractC1223y.c(2, eVar);
            c1800s = eVar.invoke(rVar2, rVar);
        } catch (Throwable th) {
            c1800s = new C1800s(th, false);
        }
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        if (c1800s == enumC0830a || (objV = rVar.V(c1800s)) == AbstractC1767D.f19477e) {
            return enumC0830a;
        }
        if (objV instanceof C1800s) {
            throw ((C1800s) objV).f19570a;
        }
        return AbstractC1767D.A(objV);
    }

    public static final EnumC0814b W(AbstractC1166f abstractC1166f) {
        if (Build.VERSION.SDK_INT >= 31) {
            return M0.f10098a.a(abstractC1166f);
        }
        Object obj = p0.f10273a;
        if (abstractC1166f instanceof C1162b) {
            return EnumC0814b.EXACT;
        }
        if (abstractC1166f instanceof C1165e) {
            return EnumC0814b.WRAP;
        }
        if (abstractC1166f instanceof C1164d) {
            return EnumC0814b.FILL;
        }
        if (abstractC1166f instanceof C1163c) {
            return EnumC0814b.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    public static final EnumC0823k X(int i7) {
        if (i7 == 0) {
            return EnumC0823k.TOP;
        }
        if (i7 == 1) {
            return EnumC0823k.CENTER_VERTICALLY;
        }
        if (i7 == 2) {
            return EnumC0823k.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) C0986b.b(i7))).toString());
    }

    public static final EnumC0815c Y(int i7) {
        if (i7 == 0) {
            return EnumC0815c.START;
        }
        if (i7 == 1) {
            return EnumC0815c.CENTER_HORIZONTALLY;
        }
        if (i7 == 2) {
            return EnumC0815c.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) C0985a.b(i7))).toString());
    }

    public static final void a(x xVar, InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1182c interfaceC1182c3, InterfaceC1182c interfaceC1182c4, InterfaceC1182c interfaceC1182c5, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        AbstractC1209k.f(interfaceC1182c5, "builder");
        c0912t.Z(1786657914);
        u.a(xVar, "HomePage", interfaceC1398p, C1385c.f15616s, null, interfaceC1182c, interfaceC1182c2, interfaceC1182c3, interfaceC1182c4, interfaceC1182c5, c0912t, 56, 0);
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new A4.a(xVar, interfaceC1398p, interfaceC1182c, interfaceC1182c2, interfaceC1182c3, interfaceC1182c4, interfaceC1182c5, i7);
    }

    public static final long b(int i7) {
        if (!(i7 > 0)) {
            C.b.a("The span value should be higher than 0");
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(float r34, int r35, int r36, int r37, A.h r38, A.m r39, D.k0 r40, I.C0209a r41, I.C0211c r42, I.InterfaceC0221m r43, f0.C0912t r44, l5.InterfaceC1182c r45, n0.d r46, r0.C1389g r47, r0.InterfaceC1398p r48, x.C1875s r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.d.c(float, int, int, int, A.h, A.m, D.k0, I.a, I.c, I.m, f0.t, l5.c, n0.d, r0.g, r0.p, x.s, boolean):void");
    }

    public static final void d(int i7, C0912t c0912t, boolean z6) {
        c0912t.Z(-646130027);
        if ((i7 & 1) == 0 && c0912t.z()) {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new J(i7, z6);
        }
    }

    public static final int e(float[] fArr) {
        int i7 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i8 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i7 = 1;
        }
        return (i8 << 1) | i7;
    }

    public static final void f(I5.a aVar, I5.c cVar, String str) {
        I5.d.h.getClass();
        I5.d.f3555j.fine(cVar.f3549b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3542a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0082 -> B:73:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0085 -> B:73:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(java.util.List r6, O1.x r7, e5.AbstractC0865c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof O1.C0332d
            if (r0 == 0) goto L13
            r0 = r8
            O1.d r0 = (O1.C0332d) r0
            int r1 = r0.f5523r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5523r = r1
            goto L18
        L13:
            O1.d r0 = new O1.d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5522q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f5523r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f5521p
            java.io.Serializable r7 = r0.f5520o
            m5.v r7 = (m5.C1220v) r7
            android.support.v4.media.session.b.K(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f5520o
            java.util.List r6 = (java.util.List) r6
            android.support.v4.media.session.b.K(r8)
            goto L5c
        L42:
            android.support.v4.media.session.b.K(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            O1.f r2 = new O1.f
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f5520o = r8
            r0.f5523r = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            m5.v r7 = new m5.v
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            l5.c r8 = (l5.InterfaceC1182c) r8
            r0.f5520o = r7     // Catch: java.lang.Throwable -> L30
            r0.f5521p = r6     // Catch: java.lang.Throwable -> L30
            r0.f5523r = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f14439o
            if (r2 != 0) goto L85
            r7.f14439o = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            N5.l.k(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f14439o
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            Y4.o r1 = Y4.o.f8736a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.d.g(java.util.List, O1.x, e5.c):java.lang.Object");
    }

    public static final void h(K1.l lVar, K0.u uVar, long j3) {
        boolean zA = K0.t.a(uVar);
        L0.d dVar = (L0.d) lVar.f3974c;
        L0.d dVar2 = (L0.d) lVar.f3973b;
        if (zA) {
            L0.a[] aVarArr = dVar2.f4098d;
            Z4.l.d0(aVarArr, 0, aVarArr.length);
            dVar2.f4099e = 0;
            L0.a[] aVarArr2 = dVar.f4098d;
            Z4.l.d0(aVarArr2, 0, aVarArr2.length);
            dVar.f4099e = 0;
            lVar.f3972a = 0L;
        }
        boolean zC = K0.t.c(uVar);
        long j7 = uVar.f3911b;
        if (!zC) {
            List list = uVar.f3919k;
            if (list == null) {
                list = v.f8818o;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0235c c0235c = (C0235c) list.get(i7);
                long j8 = c0235c.f3862a;
                long jH = C1892b.h(c0235c.f3864c, j3);
                dVar2.a(j8, Float.intBitsToFloat((int) (jH >> 32)));
                dVar = dVar;
                dVar.a(j8, Float.intBitsToFloat((int) (jH & 4294967295L)));
            }
            long jH2 = C1892b.h(uVar.l, j3);
            dVar2.a(j7, Float.intBitsToFloat((int) (jH2 >> 32)));
            dVar.a(j7, Float.intBitsToFloat((int) (jH2 & 4294967295L)));
        }
        if (K0.t.c(uVar) && j7 - lVar.f3972a > 40) {
            L0.a[] aVarArr3 = dVar2.f4098d;
            Z4.l.d0(aVarArr3, 0, aVarArr3.length);
            dVar2.f4099e = 0;
            L0.a[] aVarArr4 = dVar.f4098d;
            Z4.l.d0(aVarArr4, 0, aVarArr4.length);
            dVar.f4099e = 0;
            lVar.f3972a = 0L;
        }
        lVar.f3972a = j7;
    }

    public static String j(String str, int i7, int i8) {
        if (i7 < 0) {
            return l.K("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return l.K("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(n1.c.s(i8, "negative size: "));
    }

    public static void k(long j3, C0427g c0427g, int i7, ArrayList arrayList, int i8, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        ArrayList arrayList3;
        long j7;
        int i12;
        int i13 = i7;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i8 >= i9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i14 = i8; i14 < i9; i14++) {
            if (((S5.j) arrayList4.get(i14)).c() < i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        S5.j jVar = (S5.j) arrayList.get(i8);
        S5.j jVar2 = (S5.j) arrayList4.get(i9 - 1);
        if (i13 == jVar.c()) {
            int iIntValue = ((Number) arrayList5.get(i8)).intValue();
            int i15 = i8 + 1;
            S5.j jVar3 = (S5.j) arrayList4.get(i15);
            i10 = i15;
            i11 = iIntValue;
            jVar = jVar3;
        } else {
            i10 = i8;
            i11 = -1;
        }
        if (jVar.h(i13) == jVar2.h(i13)) {
            int iMin = Math.min(jVar.c(), jVar2.c());
            int i16 = 0;
            for (int i17 = i13; i17 < iMin && jVar.h(i17) == jVar2.h(i17); i17++) {
                i16++;
            }
            long j8 = 4;
            long j9 = (c0427g.f6785p / j8) + j3 + ((long) 2) + ((long) i16) + 1;
            c0427g.F(-i16);
            c0427g.F(i11);
            int i18 = i13 + i16;
            while (i13 < i18) {
                c0427g.F(jVar.h(i13) & 255);
                i13++;
            }
            if (i10 + 1 == i9) {
                if (i18 != ((S5.j) arrayList4.get(i10)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0427g.F(((Number) arrayList5.get(i10)).intValue());
                return;
            } else {
                C0427g c0427g2 = new C0427g();
                c0427g.F(((int) ((c0427g2.f6785p / j8) + j9)) * (-1));
                k(j9, c0427g2, i18, arrayList4, i10, i9, arrayList5);
                c0427g.C(c0427g2);
                return;
            }
        }
        int i19 = 1;
        for (int i20 = i10 + 1; i20 < i9; i20++) {
            if (((S5.j) arrayList4.get(i20 - 1)).h(i13) != ((S5.j) arrayList4.get(i20)).h(i13)) {
                i19++;
            }
        }
        long j10 = 4;
        long j11 = (c0427g.f6785p / j10) + j3 + ((long) 2) + ((long) (i19 * 2));
        c0427g.F(i19);
        c0427g.F(i11);
        for (int i21 = i10; i21 < i9; i21++) {
            int iH = ((S5.j) arrayList4.get(i21)).h(i13);
            if (i21 == i10 || iH != ((S5.j) arrayList4.get(i21 - 1)).h(i13)) {
                c0427g.F(iH & 255);
            }
        }
        C0427g c0427g3 = new C0427g();
        int i22 = i10;
        while (i22 < i9) {
            byte bH = ((S5.j) arrayList4.get(i22)).h(i13);
            int i23 = i22 + 1;
            int i24 = i23;
            while (true) {
                if (i24 >= i9) {
                    i24 = i9;
                    break;
                } else if (bH != ((S5.j) arrayList4.get(i24)).h(i13)) {
                    break;
                } else {
                    i24++;
                }
            }
            if (i23 == i24 && i13 + 1 == ((S5.j) arrayList4.get(i22)).c()) {
                c0427g.F(((Number) arrayList5.get(i22)).intValue());
                arrayList3 = arrayList5;
                j7 = j11;
                i12 = i24;
            } else {
                c0427g.F(((int) ((c0427g3.f6785p / j10) + j11)) * (-1));
                arrayList3 = arrayList5;
                j7 = j11;
                i12 = i24;
                k(j7, c0427g3, i13 + 1, arrayList, i22, i12, arrayList3);
                arrayList4 = arrayList;
            }
            j11 = j7;
            i22 = i12;
            arrayList5 = arrayList3;
        }
        c0427g.C(c0427g3);
    }

    public static void o(long j3, String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(l.K(str, Long.valueOf(j3)));
        }
    }

    public static void p(int i7, int i8) {
        String strK;
        if (i7 < 0 || i7 >= i8) {
            if (i7 < 0) {
                strK = l.K("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i8 < 0) {
                    throw new IllegalArgumentException(n1.c.s(i8, "negative size: "));
                }
                strK = l.K("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void s(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(j("index", i7, i8));
        }
    }

    public static void t(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? j("start index", i7, i9) : (i8 < 0 || i8 > i9) ? j("end index", i8, i9) : l.K("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    public static long u(long j3, long j7) {
        long j8 = j3 + j7;
        if (((j3 ^ j7) < 0) || ((j3 ^ j8) >= 0)) {
            return j8;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j3 + ", " + j7 + ")");
    }

    public static final C0862k w(Context context) {
        A0.b bVar = new A0.b(context);
        Y4.m mVarO = AbstractC0509a.O(new C0855d(bVar, 0));
        Y4.m mVarO2 = AbstractC0509a.O(new C0855d(bVar, 1));
        Y4.m mVarO3 = AbstractC0509a.O(C0856e.f11571p);
        v vVar = v.f8818o;
        return new C0862k((Context) bVar.f50p, (C1296b) bVar.f51q, mVarO, mVarO2, mVarO3, new C0853b(vVar, vVar, vVar, vVar, vVar), (s4.h) bVar.f52r);
    }

    public static final C0821i x(Z1.i iVar) {
        EnumC0822j enumC0822j;
        EnumC0813a enumC0813a;
        C0820h c0820hW = C0821i.w();
        if (iVar instanceof g2.k) {
            enumC0822j = EnumC0822j.BOX;
        } else {
            boolean z6 = iVar instanceof g2.m;
            u0 u0Var = u0.f10337v;
            if (z6) {
                enumC0822j = ((g2.m) iVar).f12443c.d(u0Var) ? EnumC0822j.RADIO_ROW : EnumC0822j.ROW;
            } else if (iVar instanceof g2.l) {
                enumC0822j = ((g2.l) iVar).f12440c.d(u0Var) ? EnumC0822j.RADIO_COLUMN : EnumC0822j.COLUMN;
            } else if (iVar instanceof C1139a) {
                enumC0822j = EnumC0822j.TEXT;
            } else if (iVar instanceof Z1.j) {
                enumC0822j = EnumC0822j.IMAGE;
            } else if (iVar instanceof y0) {
                enumC0822j = EnumC0822j.REMOTE_VIEWS_ROOT;
            } else {
                if (!(iVar instanceof C0633C)) {
                    throw new IllegalArgumentException("Unknown element type " + iVar.getClass().getCanonicalName());
                }
                enumC0822j = EnumC0822j.SIZE_BOX;
            }
        }
        c0820hW.c();
        C0821i.k((C0821i) c0820hW.f9655p, enumC0822j);
        s sVar = (s) iVar.b().b(null, o0.f10258M);
        AbstractC1166f abstractC1166f = C1165e.f14165a;
        EnumC0814b enumC0814bW = W(sVar != null ? sVar.f12457a : abstractC1166f);
        c0820hW.c();
        C0821i.l((C0821i) c0820hW.f9655p, enumC0814bW);
        g2.n nVar = (g2.n) iVar.b().b(null, o0.f10259N);
        if (nVar != null) {
            abstractC1166f = nVar.f12446a;
        }
        EnumC0814b enumC0814bW2 = W(abstractC1166f);
        c0820hW.c();
        C0821i.m((C0821i) c0820hW.f9655p, enumC0814bW2);
        boolean z7 = iVar.b().b(null, o0.f10256K) != null;
        c0820hW.c();
        C0821i.r((C0821i) c0820hW.f9655p, z7);
        if (iVar.b().b(null, o0.f10257L) != null) {
            c0820hW.c();
            C0821i.q((C0821i) c0820hW.f9655p);
        }
        if (iVar instanceof Z1.j) {
            Z1.j jVar = (Z1.j) iVar;
            int i7 = jVar.f8778c;
            if (i7 == 1) {
                enumC0813a = EnumC0813a.FIT;
            } else if (i7 == 0) {
                enumC0813a = EnumC0813a.CROP;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException(("Unknown content scale " + ((Object) g2.j.a(jVar.f8778c))).toString());
                }
                enumC0813a = EnumC0813a.FILL_BOUNDS;
            }
            c0820hW.c();
            C0821i.p((C0821i) c0820hW.f9655p, enumC0813a);
            boolean z8 = !AbstractC0509a.I(jVar);
            c0820hW.c();
            C0821i.t((C0821i) c0820hW.f9655p, z8);
            c0820hW.c();
            C0821i.u((C0821i) c0820hW.f9655p);
        } else if (iVar instanceof g2.l) {
            EnumC0815c enumC0815cY = Y(((g2.l) iVar).f12442e);
            c0820hW.c();
            C0821i.n((C0821i) c0820hW.f9655p, enumC0815cY);
        } else if (iVar instanceof g2.m) {
            EnumC0823k enumC0823kX = X(((g2.m) iVar).f12445e);
            c0820hW.c();
            C0821i.o((C0821i) c0820hW.f9655p, enumC0823kX);
        } else if (iVar instanceof g2.k) {
            g2.k kVar = (g2.k) iVar;
            EnumC0815c enumC0815cY2 = Y(kVar.f12439d.f12413a);
            c0820hW.c();
            C0821i.n((C0821i) c0820hW.f9655p, enumC0815cY2);
            EnumC0823k enumC0823kX2 = X(kVar.f12439d.f12414b);
            c0820hW.c();
            C0821i.o((C0821i) c0820hW.f9655p, enumC0823kX2);
        }
        if (iVar instanceof Z1.k) {
            ArrayList arrayList = ((Z1.k) iVar).f8780b;
            ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(x((Z1.i) it.next()));
            }
            c0820hW.c();
            C0821i.s((C0821i) c0820hW.f9655p, arrayList2);
        }
        return (C0821i) c0820hW.a();
    }

    public abstract void R(Y3.g gVar, Y3.g gVar2);

    public abstract void S(Y3.g gVar, Thread thread);

    public abstract void U(C0747M c0747m, C0747M c0747m2, Window window, View view, boolean z6, boolean z7);

    public abstract boolean l(Y3.h hVar, Y3.c cVar, Y3.c cVar2);

    public abstract boolean m(Y3.h hVar, Object obj, Object obj2);

    public abstract boolean n(Y3.h hVar, Y3.g gVar, Y3.g gVar2);

    public abstract List v(String str, List list);

    public t2.L y(W2.a aVar) {
        ByteBuffer byteBuffer = aVar.f21115s;
        byteBuffer.getClass();
        AbstractC1697a.d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return z(aVar, byteBuffer);
    }

    public abstract t2.L z(W2.a aVar, ByteBuffer byteBuffer);

    public void i(Window window) {
    }
}
