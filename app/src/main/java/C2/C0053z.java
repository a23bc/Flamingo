package C2;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: C2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0053z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f1169A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1170B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f1171C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f1172D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f1173E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f1174F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f1175G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f1176H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f1177I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public w2.o f1178J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.b f1179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f1180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f1181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0052y f1184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1185g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1188k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f1190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1202z;

    public C0053z(A.b bVar) {
        this.f1179a = bVar;
        try {
            this.f1190n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f1180b = new long[10];
        this.f1178J = w2.o.f18873a;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236 A[Catch: Exception -> 0x024c, TRY_LEAVE, TryCatch #0 {Exception -> 0x024c, blocks: (B:93:0x020f, B:95:0x0236), top: B:146:0x020f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r29) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0053z.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r11 = this;
            w2.o r0 = r11.f1178J
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.f1201y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L46
            android.media.AudioTrack r2 = r11.f1181c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L23
            long r0 = r11.f1169A
            return r0
        L23:
            long r0 = w2.t.D(r0)
            long r2 = r11.f1201y
            long r0 = r0 - r2
            float r2 = r11.f1187j
            long r3 = w2.t.r(r0, r2)
            int r0 = r11.f1185g
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.CEILING
            long r0 = w2.t.J(r3, r5, r7, r9)
            long r2 = r11.f1170B
            long r4 = r11.f1169A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r6 = r11.f1195s
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Lb7
            android.media.AudioTrack r2 = r11.f1181c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L5d
            goto Lb5
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r2 = r11.h
            r9 = 0
            if (r2 == 0) goto L7b
            if (r6 != r3) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r2 = r11.f1196t
            r11.f1198v = r2
        L78:
            long r2 = r11.f1198v
            long r7 = r7 + r2
        L7b:
            int r2 = w2.t.f18881a
            r3 = 29
            if (r2 > r3) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r2 = r11.f1196t
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r6 != r2) goto L97
            long r2 = r11.f1202z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb5
            r11.f1202z = r0
            goto Lb5
        L97:
            r11.f1202z = r4
        L99:
            long r2 = r11.f1196t
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r11.f1176H
            if (r4 == 0) goto Lac
            long r4 = r11.f1177I
            long r4 = r4 + r2
            r11.f1177I = r4
            r2 = 0
            r11.f1176H = r2
            goto Lb3
        Lac:
            long r2 = r11.f1197u
            r4 = 1
            long r2 = r2 + r4
            r11.f1197u = r2
        Lb3:
            r11.f1196t = r7
        Lb5:
            r11.f1195s = r0
        Lb7:
            long r0 = r11.f1196t
            long r2 = r11.f1177I
            long r0 = r0 + r2
            long r2 = r11.f1197u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0053z.b():long");
    }

    public final boolean c(long j3) {
        long jA = a(false);
        int i7 = this.f1185g;
        int i8 = w2.t.f18881a;
        if (j3 > w2.t.J(jA, i7, 1000000L, RoundingMode.CEILING)) {
            return true;
        }
        if (this.h) {
            AudioTrack audioTrack = this.f1181c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.l = 0L;
        this.f1200x = 0;
        this.f1199w = 0;
        this.f1189m = 0L;
        this.f1172D = 0L;
        this.f1175G = 0L;
        this.f1188k = false;
    }
}
