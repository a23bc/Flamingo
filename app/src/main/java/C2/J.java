package C2;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import d2.C0821i;
import t2.C1476e;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1487p f988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f994g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u2.a f995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f997k;
    public final boolean l;

    public J(C1487p c1487p, int i7, int i8, int i9, int i10, int i11, int i12, int i13, u2.a aVar, boolean z6, boolean z7, boolean z8) {
        this.f988a = c1487p;
        this.f989b = i7;
        this.f990c = i8;
        this.f991d = i9;
        this.f992e = i10;
        this.f993f = i11;
        this.f994g = i12;
        this.h = i13;
        this.f995i = aVar;
        this.f996j = z6;
        this.f997k = z7;
        this.l = z8;
    }

    public static AudioAttributes c(C1476e c1476e, boolean z6) {
        return z6 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c1476e.b().f16352a;
    }

    public final AudioTrack a(C1476e c1476e, int i7) {
        int i8 = this.f990c;
        try {
            AudioTrack audioTrackB = b(c1476e, i7);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new C0047t(state, this.f992e, this.f993f, this.h, this.f988a, i8 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new C0047t(0, this.f992e, this.f993f, this.h, this.f988a, i8 == 1, e7);
        }
    }

    public final AudioTrack b(C1476e c1476e, int i7) {
        int i8;
        int i9 = w2.t.f18881a;
        int i10 = 0;
        boolean z6 = this.l;
        int i11 = this.f992e;
        int i12 = this.f994g;
        int i13 = this.f993f;
        if (i9 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(c1476e, z6)).setAudioFormat(w2.t.m(i11, i13, i12)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i7).setOffloadedPlayback(this.f990c == 1).build();
        }
        if (i9 >= 21) {
            return new AudioTrack(c(c1476e, z6), w2.t.m(i11, i13, i12), this.h, 1, i7);
        }
        int i14 = c1476e.f16419c;
        if (i14 != 13) {
            switch (i14) {
                case 2:
                    break;
                case 3:
                    i10 = 8;
                    break;
                case 4:
                    i10 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    i10 = 5;
                    break;
                case 6:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
            i8 = i10;
        } else {
            i8 = 1;
        }
        if (i7 == 0) {
            return new AudioTrack(i8, this.f992e, this.f993f, this.f994g, this.h, 1);
        }
        return new AudioTrack(i8, this.f992e, this.f993f, this.f994g, this.h, 1, i7);
    }
}
