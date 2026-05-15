package p0;

import j5.AbstractC1107a;
import java.util.ArrayList;
import java.util.Iterator;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: s */
    public static final j f14931s = new j(0, 0, 0, null);

    /* JADX INFO: renamed from: o */
    public final long f14932o;

    /* JADX INFO: renamed from: p */
    public final long f14933p;

    /* JADX INFO: renamed from: q */
    public final long f14934q;

    /* JADX INFO: renamed from: r */
    public final long[] f14935r;

    public j(long j3, long j7, long j8, long[] jArr) {
        this.f14932o = j3;
        this.f14933p = j7;
        this.f14934q = j8;
        this.f14935r = jArr;
    }

    public final j b(j jVar) {
        j jVarC;
        long[] jArr;
        j jVar2 = f14931s;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        long j3 = jVar.f14934q;
        long j7 = this.f14934q;
        long[] jArr2 = jVar.f14935r;
        long j8 = jVar.f14933p;
        long j9 = jVar.f14932o;
        if (j3 == j7 && jArr2 == (jArr = this.f14935r)) {
            return new j(this.f14932o & (~j9), (~j8) & this.f14933p, j7, jArr);
        }
        if (jArr2 != null) {
            jVarC = this;
            for (long j10 : jArr2) {
                jVarC = jVarC.c(j10);
            }
        } else {
            jVarC = this;
        }
        long j11 = 0;
        long j12 = jVar.f14934q;
        if (j8 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if ((j8 & (1 << i7)) != 0) {
                    jVarC = jVarC.c(((long) i7) + j12);
                }
            }
        }
        if (j9 != 0) {
            int i8 = 0;
            while (i8 < 64) {
                if (((1 << i8) & j9) != j11) {
                    jVarC = jVarC.c(((long) i8) + j12 + ((long) 64));
                }
                i8++;
                j11 = 0;
            }
        }
        return jVarC;
    }

    public final j c(long j3) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j7 = j3 - this.f14934q;
        long j8 = 0;
        if (AbstractC1209k.h(j7, j8) >= 0 && AbstractC1209k.h(j7, 64) < 0) {
            long j9 = 1 << ((int) j7);
            long j10 = this.f14933p;
            if ((j10 & j9) != 0) {
                return new j(this.f14932o, j10 & (~j9), this.f14934q, this.f14935r);
            }
        } else if (AbstractC1209k.h(j7, 64) >= 0 && AbstractC1209k.h(j7, 128) < 0) {
            long j11 = 1 << (((int) j7) - 64);
            long j12 = this.f14932o;
            if ((j12 & j11) != 0) {
                return new j(j12 & (~j11), this.f14933p, this.f14934q, this.f14935r);
            }
        } else if (AbstractC1209k.h(j7, j8) < 0 && (jArr = this.f14935r) != null && (iC = q.c(jArr, j3)) >= 0) {
            int length = jArr.length;
            int i7 = length - 1;
            if (i7 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i7];
                if (iC > 0) {
                    Z4.l.Y(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i7) {
                    Z4.l.Y(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.f14932o, this.f14933p, this.f14934q, jArr2);
        }
        return this;
    }

    public final boolean e(long j3) {
        long[] jArr;
        long j7 = j3 - this.f14934q;
        long j8 = 0;
        return (AbstractC1209k.h(j7, j8) < 0 || AbstractC1209k.h(j7, (long) 64) >= 0) ? (AbstractC1209k.h(j7, (long) 64) < 0 || AbstractC1209k.h(j7, (long) 128) >= 0) ? AbstractC1209k.h(j7, j8) <= 0 && (jArr = this.f14935r) != null && q.c(jArr, j3) >= 0 : ((1 << (((int) j7) - 64)) & this.f14932o) != 0 : ((1 << ((int) j7)) & this.f14933p) != 0;
    }

    public final j g(j jVar) {
        long j3;
        j jVarI;
        j jVarI2 = jVar;
        j jVar2 = f14931s;
        if (jVarI2 == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVarI2;
        }
        long j7 = jVarI2.f14934q;
        long j8 = this.f14934q;
        long j9 = this.f14933p;
        long j10 = this.f14932o;
        long[] jArr = jVarI2.f14935r;
        long j11 = jVarI2.f14933p;
        long j12 = jVarI2.f14932o;
        if (j7 == j8) {
            long[] jArr2 = this.f14935r;
            j3 = j9;
            if (jArr == jArr2) {
                return new j(j10 | j12, j3 | j11, j8, jArr2);
            }
        } else {
            j3 = j9;
        }
        int i7 = 0;
        long[] jArr3 = this.f14935r;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j13 : jArr3) {
                    jVarI2 = jVarI2.i(j13);
                }
            }
            long j14 = this.f14934q;
            if (j3 != 0) {
                for (int i8 = 0; i8 < 64; i8++) {
                    if (((1 << i8) & j3) != 0) {
                        jVarI2 = jVarI2.i(((long) i8) + j14);
                    }
                }
            }
            if (j10 != 0) {
                while (i7 < 64) {
                    if (((1 << i7) & j10) != 0) {
                        jVarI2 = jVarI2.i(((long) i7) + j14 + ((long) 64));
                    }
                    i7++;
                }
            }
            return jVarI2;
        }
        if (jArr != null) {
            jVarI = this;
            for (long j15 : jArr) {
                jVarI = jVarI.i(j15);
            }
        } else {
            jVarI = this;
        }
        long j16 = jVarI2.f14934q;
        if (j11 != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if (((1 << i9) & j11) != 0) {
                    jVarI = jVarI.i(((long) i9) + j16);
                }
            }
        }
        if (j12 != 0) {
            while (i7 < 64) {
                if (((1 << i7) & j12) != 0) {
                    jVarI = jVarI.i(((long) i7) + j16 + ((long) 64));
                }
                i7++;
            }
        }
        return jVarI;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p0.j i(long r34) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j.i(long):p0.j");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC1107a.t(new i(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(Z4.p.j0(this));
        Iterator it = iterator();
        while (true) {
            t5.i iVar = (t5.i) it;
            if (!iVar.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) iVar.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            i7++;
            if (i7 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
