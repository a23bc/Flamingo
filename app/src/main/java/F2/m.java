package F2;

import A2.C0008i;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import t2.C1480i;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a */
    public final String f2225a;

    /* JADX INFO: renamed from: b */
    public final String f2226b;

    /* JADX INFO: renamed from: c */
    public final String f2227c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f2228d;

    /* JADX INFO: renamed from: e */
    public final boolean f2229e;

    /* JADX INFO: renamed from: f */
    public final boolean f2230f;

    /* JADX INFO: renamed from: g */
    public final boolean f2231g;
    public final boolean h;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8) {
        str.getClass();
        this.f2225a = str;
        this.f2226b = str2;
        this.f2227c = str3;
        this.f2228d = codecCapabilities;
        this.f2231g = z6;
        this.f2229e = z7;
        this.f2230f = z8;
        this.h = M.i(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(w2.t.e(i7, widthAlignment) * widthAlignment, w2.t.e(i8, heightAlignment) * heightAlignment);
        int i9 = point.x;
        int i10 = point.y;
        return (d4 == -1.0d || d4 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d4));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F2.m h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        /*
            F2.m r0 = new F2.m
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r11.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = w2.t.f18881a
            r4 = 22
            if (r3 > r4) goto L37
            java.lang.String r3 = w2.t.f18884d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
        L26:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r6 = r2
            goto L3a
        L39:
            r6 = r1
        L3a:
            r3 = 21
            if (r11 == 0) goto L48
            int r4 = w2.t.f18881a
            if (r4 < r3) goto L48
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r11.isFeatureSupported(r4)
        L48:
            if (r13 != 0) goto L60
            if (r11 == 0) goto L59
            int r13 = w2.t.f18881a
            if (r13 < r3) goto L59
            java.lang.String r13 = "secure-playback"
            boolean r13 = r11.isFeatureSupported(r13)
            if (r13 == 0) goto L59
            goto L60
        L59:
            r7 = r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r8
            goto L66
        L60:
            r7 = r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r2 = r9
        L66:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.m.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):F2.m");
    }

    public final C0008i b(C1487p c1487p, C1487p c1487p2) {
        C1487p c1487p3;
        C1487p c1487p4;
        int i7 = !w2.t.a(c1487p.f16701m, c1487p2.f16701m) ? 8 : 0;
        if (this.h) {
            if (c1487p.f16710v != c1487p2.f16710v) {
                i7 |= 1024;
            }
            if (!this.f2229e && (c1487p.f16707s != c1487p2.f16707s || c1487p.f16708t != c1487p2.f16708t)) {
                i7 |= 512;
            }
            C1480i c1480i = c1487p.f16714z;
            boolean zE = C1480i.e(c1480i);
            C1480i c1480i2 = c1487p2.f16714z;
            if ((!zE || !C1480i.e(c1480i2)) && !w2.t.a(c1480i, c1480i2)) {
                i7 |= 2048;
            }
            if (w2.t.f18884d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f2225a) && !c1487p.b(c1487p2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C0008i(this.f2225a, c1487p, c1487p2, c1487p.b(c1487p2) ? 3 : 2, 0);
            }
            c1487p3 = c1487p;
            c1487p4 = c1487p2;
        } else {
            c1487p3 = c1487p;
            c1487p4 = c1487p2;
            if (c1487p3.f16680A != c1487p4.f16680A) {
                i7 |= 4096;
            }
            if (c1487p3.f16681B != c1487p4.f16681B) {
                i7 |= 8192;
            }
            if (c1487p3.f16682C != c1487p4.f16682C) {
                i7 |= 16384;
            }
            String str = this.f2226b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = A.d(c1487p3);
                Pair pairD2 = A.d(c1487p4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0008i(this.f2225a, c1487p3, c1487p4, 3, 0);
                    }
                }
            }
            if (!c1487p3.b(c1487p4)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C0008i(this.f2225a, c1487p3, c1487p4, 1, 0);
            }
        }
        return new C0008i(this.f2225a, c1487p3, c1487p4, 0, i7);
    }

    public final boolean c(C1487p c1487p, boolean z6) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = A.d(c1487p);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(c1487p.f16701m);
            int i7 = 8;
            String str = this.f2226b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2228d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (w2.t.f18881a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i7 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i7 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i7 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i7 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i7 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i7 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i7 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i7 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i7;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z6)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = w2.t.f18882b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + c1487p.f16699j + ", " + this.f2227c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(C1487p c1487p) {
        int i7;
        String str = c1487p.f16701m;
        String str2 = this.f2226b;
        if (!(str2.equals(str) || str2.equals(A.b(c1487p))) || !c(c1487p, true)) {
            return false;
        }
        if (this.h) {
            int i8 = c1487p.f16707s;
            if (i8 > 0 && (i7 = c1487p.f16708t) > 0) {
                if (w2.t.f18881a >= 21) {
                    return f(i8, i7, c1487p.f16709u);
                }
                boolean z6 = i8 * i7 <= A.j();
                if (!z6) {
                    g("legacyFrameSize, " + i8 + "x" + i7);
                }
                return z6;
            }
        } else {
            int i9 = w2.t.f18881a;
            if (i9 >= 21) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2228d;
                int i10 = c1487p.f16681B;
                if (i10 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i10)) {
                        g("sampleRate.support, " + i10);
                        return false;
                    }
                }
                int i11 = c1487p.f16680A;
                if (i11 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i9 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i12 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        AbstractC1697a.w("AssumedMaxChannelAdjustment: " + this.f2225a + ", [" + maxInputChannelCount + " to " + i12 + "]");
                        maxInputChannelCount = i12;
                    }
                    if (maxInputChannelCount < i11) {
                        g("channelCount.support, " + i11);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean e(C1487p c1487p) {
        if (this.h) {
            return this.f2229e;
        }
        Pair pairD = A.d(c1487p);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(int r9, int r10, double r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.m.f(int, int, double):boolean");
    }

    public final void g(String str) {
        StringBuilder sbU = Z1.l.u("NoSupport [", str, "] [");
        sbU.append(this.f2225a);
        sbU.append(", ");
        sbU.append(this.f2226b);
        sbU.append("] [");
        sbU.append(w2.t.f18885e);
        sbU.append("]");
        AbstractC1697a.l(sbU.toString());
    }

    public final String toString() {
        return this.f2225a;
    }
}
