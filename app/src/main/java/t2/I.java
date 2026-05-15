package t2;

import android.net.Uri;
import android.os.Bundle;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: A */
    public CharSequence f16231A;

    /* JADX INFO: renamed from: B */
    public Integer f16232B;

    /* JADX INFO: renamed from: C */
    public Integer f16233C;

    /* JADX INFO: renamed from: D */
    public CharSequence f16234D;

    /* JADX INFO: renamed from: E */
    public CharSequence f16235E;

    /* JADX INFO: renamed from: F */
    public CharSequence f16236F;

    /* JADX INFO: renamed from: G */
    public Integer f16237G;

    /* JADX INFO: renamed from: H */
    public Bundle f16238H;

    /* JADX INFO: renamed from: a */
    public CharSequence f16239a;

    /* JADX INFO: renamed from: b */
    public CharSequence f16240b;

    /* JADX INFO: renamed from: c */
    public CharSequence f16241c;

    /* JADX INFO: renamed from: d */
    public CharSequence f16242d;

    /* JADX INFO: renamed from: e */
    public CharSequence f16243e;

    /* JADX INFO: renamed from: f */
    public CharSequence f16244f;

    /* JADX INFO: renamed from: g */
    public CharSequence f16245g;
    public Long h;

    /* JADX INFO: renamed from: i */
    public Y f16246i;

    /* JADX INFO: renamed from: j */
    public Y f16247j;

    /* JADX INFO: renamed from: k */
    public byte[] f16248k;
    public Integer l;

    /* JADX INFO: renamed from: m */
    public Uri f16249m;

    /* JADX INFO: renamed from: n */
    public Integer f16250n;

    /* JADX INFO: renamed from: o */
    public Integer f16251o;

    /* JADX INFO: renamed from: p */
    public Integer f16252p;

    /* JADX INFO: renamed from: q */
    public Boolean f16253q;

    /* JADX INFO: renamed from: r */
    public Boolean f16254r;

    /* JADX INFO: renamed from: s */
    public Integer f16255s;

    /* JADX INFO: renamed from: t */
    public Integer f16256t;

    /* JADX INFO: renamed from: u */
    public Integer f16257u;

    /* JADX INFO: renamed from: v */
    public Integer f16258v;

    /* JADX INFO: renamed from: w */
    public Integer f16259w;

    /* JADX INFO: renamed from: x */
    public Integer f16260x;

    /* JADX INFO: renamed from: y */
    public CharSequence f16261y;

    /* JADX INFO: renamed from: z */
    public CharSequence f16262z;

    public final void a(int i7, byte[] bArr) {
        if (this.f16248k != null) {
            Integer numValueOf = Integer.valueOf(i7);
            int i8 = w2.t.f18881a;
            if (!numValueOf.equals(3) && w2.t.a(this.l, 3)) {
                return;
            }
        }
        this.f16248k = (byte[]) bArr.clone();
        this.l = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        this.f16248k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void c(Long l) {
        AbstractC1697a.d(l == null || l.longValue() >= 0);
        this.h = l;
    }
}
