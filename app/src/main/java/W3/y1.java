package w3;

import android.os.Bundle;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: k */
    public static final t2.W f19407k;
    public static final y1 l;

    /* JADX INFO: renamed from: m */
    public static final String f19408m;

    /* JADX INFO: renamed from: n */
    public static final String f19409n;

    /* JADX INFO: renamed from: o */
    public static final String f19410o;

    /* JADX INFO: renamed from: p */
    public static final String f19411p;

    /* JADX INFO: renamed from: q */
    public static final String f19412q;

    /* JADX INFO: renamed from: r */
    public static final String f19413r;

    /* JADX INFO: renamed from: s */
    public static final String f19414s;

    /* JADX INFO: renamed from: t */
    public static final String f19415t;

    /* JADX INFO: renamed from: u */
    public static final String f19416u;

    /* JADX INFO: renamed from: v */
    public static final String f19417v;

    /* JADX INFO: renamed from: a */
    public final t2.W f19418a;

    /* JADX INFO: renamed from: b */
    public final boolean f19419b;

    /* JADX INFO: renamed from: c */
    public final long f19420c;

    /* JADX INFO: renamed from: d */
    public final long f19421d;

    /* JADX INFO: renamed from: e */
    public final long f19422e;

    /* JADX INFO: renamed from: f */
    public final int f19423f;

    /* JADX INFO: renamed from: g */
    public final long f19424g;
    public final long h;

    /* JADX INFO: renamed from: i */
    public final long f19425i;

    /* JADX INFO: renamed from: j */
    public final long f19426j;

    static {
        t2.W w7 = new t2.W(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f19407k = w7;
        l = new y1(w7, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        int i7 = w2.t.f18881a;
        f19408m = Integer.toString(0, 36);
        f19409n = Integer.toString(1, 36);
        f19410o = Integer.toString(2, 36);
        f19411p = Integer.toString(3, 36);
        f19412q = Integer.toString(4, 36);
        f19413r = Integer.toString(5, 36);
        f19414s = Integer.toString(6, 36);
        f19415t = Integer.toString(7, 36);
        f19416u = Integer.toString(8, 36);
        f19417v = Integer.toString(9, 36);
    }

    public y1(t2.W w7, boolean z6, long j3, long j7, long j8, int i7, long j9, long j10, long j11, long j12) {
        AbstractC1697a.d(z6 == (w7.h != -1));
        this.f19418a = w7;
        this.f19419b = z6;
        this.f19420c = j3;
        this.f19421d = j7;
        this.f19422e = j8;
        this.f19423f = i7;
        this.f19424g = j9;
        this.h = j10;
        this.f19425i = j11;
        this.f19426j = j12;
    }

    public static y1 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f19408m);
        return new y1(bundle2 == null ? f19407k : t2.W.c(bundle2), bundle.getBoolean(f19409n, false), bundle.getLong(f19410o, -9223372036854775807L), bundle.getLong(f19411p, -9223372036854775807L), bundle.getLong(f19412q, 0L), bundle.getInt(f19413r, 0), bundle.getLong(f19414s, 0L), bundle.getLong(f19415t, -9223372036854775807L), bundle.getLong(f19416u, -9223372036854775807L), bundle.getLong(f19417v, 0L));
    }

    public final y1 a(boolean z6, boolean z7) {
        if (z6 && z7) {
            return this;
        }
        return new y1(this.f19418a.b(z6, z7), z6 && this.f19419b, this.f19420c, z6 ? this.f19421d : -9223372036854775807L, z6 ? this.f19422e : 0L, z6 ? this.f19423f : 0, z6 ? this.f19424g : 0L, z6 ? this.h : -9223372036854775807L, z6 ? this.f19425i : -9223372036854775807L, z6 ? this.f19426j : 0L);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        t2.W w7 = this.f19418a;
        if (i7 < 3 || !f19407k.a(w7)) {
            bundle.putBundle(f19408m, w7.d(i7));
        }
        boolean z6 = this.f19419b;
        if (z6) {
            bundle.putBoolean(f19409n, z6);
        }
        long j3 = this.f19420c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f19410o, j3);
        }
        long j7 = this.f19421d;
        if (j7 != -9223372036854775807L) {
            bundle.putLong(f19411p, j7);
        }
        long j8 = this.f19422e;
        if (i7 < 3 || j8 != 0) {
            bundle.putLong(f19412q, j8);
        }
        int i8 = this.f19423f;
        if (i8 != 0) {
            bundle.putInt(f19413r, i8);
        }
        long j9 = this.f19424g;
        if (j9 != 0) {
            bundle.putLong(f19414s, j9);
        }
        long j10 = this.h;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f19415t, j10);
        }
        long j11 = this.f19425i;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f19416u, j11);
        }
        long j12 = this.f19426j;
        if (i7 >= 3 && j12 == 0) {
            return bundle;
        }
        bundle.putLong(f19417v, j12);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y1.class == obj.getClass()) {
            y1 y1Var = (y1) obj;
            if (this.f19420c == y1Var.f19420c && this.f19418a.equals(y1Var.f19418a) && this.f19419b == y1Var.f19419b && this.f19421d == y1Var.f19421d && this.f19422e == y1Var.f19422e && this.f19423f == y1Var.f19423f && this.f19424g == y1Var.f19424g && this.h == y1Var.h && this.f19425i == y1Var.f19425i && this.f19426j == y1Var.f19426j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19418a, Boolean.valueOf(this.f19419b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        t2.W w7 = this.f19418a;
        sb.append(w7.f16364b);
        sb.append(", periodIndex=");
        sb.append(w7.f16367e);
        sb.append(", positionMs=");
        sb.append(w7.f16368f);
        sb.append(", contentPositionMs=");
        sb.append(w7.f16369g);
        sb.append(", adGroupIndex=");
        sb.append(w7.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(w7.f16370i);
        sb.append("}, isPlayingAd=");
        sb.append(this.f19419b);
        sb.append(", eventTimeMs=");
        sb.append(this.f19420c);
        sb.append(", durationMs=");
        sb.append(this.f19421d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.f19422e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f19423f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.f19424g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.f19425i);
        sb.append(", contentBufferedPositionMs=");
        sb.append(this.f19426j);
        sb.append("}");
        return sb.toString();
    }
}
