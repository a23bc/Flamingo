package F2;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        C2.C.l();
        r4 = C2.C.c();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r5 >= r6.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (C2.C.e(r6.get(r5)).covers(r4) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r7 != 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = C2.C.k(r3)
            r0 = 0
            if (r3 == 0) goto Lc5
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc5
        Lf:
            C2.C.l()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = C2.C.d(r4, r5, r6)
            r5 = r0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = C2.C.e(r6)
            boolean r6 = C2.C.t(r6, r4)
            if (r6 == 0) goto L30
            r3 = r7
            goto L34
        L30:
            int r5 = r5 + 1
            goto L18
        L33:
            r3 = r1
        L34:
            if (r3 != r1) goto Lc4
            java.lang.Boolean r4 = N5.l.f5263a
            if (r4 != 0) goto Lc4
            int r4 = w2.t.f18881a
            r5 = 35
            if (r4 < r5) goto L43
        L40:
            r1 = r0
            goto Lbb
        L43:
            t2.o r4 = new t2.o     // Catch: F2.x -> Lbb
            r4.<init>()     // Catch: F2.x -> Lbb
            java.lang.String r5 = "video/avc"
            java.lang.String r5 = t2.M.j(r5)     // Catch: F2.x -> Lbb
            r4.l = r5     // Catch: F2.x -> Lbb
            t2.p r5 = new t2.p     // Catch: F2.x -> Lbb
            r5.<init>(r4)     // Catch: F2.x -> Lbb
            java.lang.String r4 = r5.f16701m     // Catch: F2.x -> Lbb
            if (r4 == 0) goto Lbb
            F2.u r4 = F2.u.f2304p     // Catch: F2.x -> Lbb
            E4.b0 r4 = F2.A.g(r4, r5, r0, r0)     // Catch: F2.x -> Lbb
            r5 = r0
        L60:
            int r6 = r4.f1915r     // Catch: F2.x -> Lbb
            if (r5 >= r6) goto Lbb
            java.lang.Object r6 = r4.get(r5)     // Catch: F2.x -> Lbb
            F2.m r6 = (F2.m) r6     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f2228d     // Catch: F2.x -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: F2.x -> Lbb
            F2.m r6 = (F2.m) r6     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f2228d     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: F2.x -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: F2.x -> Lbb
            F2.m r6 = (F2.m) r6     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f2228d     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: F2.x -> Lbb
            java.util.List r6 = C2.C.k(r6)     // Catch: F2.x -> Lbb
            if (r6 == 0) goto Lb8
            boolean r2 = r6.isEmpty()     // Catch: F2.x -> Lbb
            if (r2 != 0) goto Lb8
            C2.C.l()     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = C2.C.c()     // Catch: F2.x -> Lbb
            r5 = r0
        L9c:
            int r2 = r6.size()     // Catch: F2.x -> Lbb
            if (r5 >= r2) goto Lb4
            java.lang.Object r2 = r6.get(r5)     // Catch: F2.x -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = C2.C.e(r2)     // Catch: F2.x -> Lbb
            boolean r2 = C2.C.t(r2, r4)     // Catch: F2.x -> Lbb
            if (r2 == 0) goto Lb1
            goto Lb5
        Lb1:
            int r5 = r5 + 1
            goto L9c
        Lb4:
            r7 = r1
        Lb5:
            if (r7 != r1) goto L40
            goto Lbb
        Lb8:
            int r5 = r5 + 1
            goto L60
        Lbb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            N5.l.f5263a = r4
            if (r1 == 0) goto Lc4
            goto Lc5
        Lc4:
            return r3
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.n.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
