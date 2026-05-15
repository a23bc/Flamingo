package A2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d2.C0821i;
import t2.C1476e;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: A2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0005f {

    /* JADX INFO: renamed from: a */
    public final AudioManager f268a;

    /* JADX INFO: renamed from: b */
    public final C0004e f269b;

    /* JADX INFO: renamed from: c */
    public K f270c;

    /* JADX INFO: renamed from: d */
    public C1476e f271d;

    /* JADX INFO: renamed from: e */
    public int f272e;

    /* JADX INFO: renamed from: f */
    public int f273f;

    /* JADX INFO: renamed from: g */
    public float f274g = 1.0f;
    public AudioFocusRequest h;

    public C0005f(YosPlaybackService yosPlaybackService, Handler handler, K k7) {
        AudioManager audioManager = (AudioManager) yosPlaybackService.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f268a = audioManager;
        this.f270c = k7;
        this.f269b = new C0004e(this, handler);
        this.f272e = 0;
    }

    public final void a() {
        int i7 = this.f272e;
        if (i7 == 1 || i7 == 0) {
            return;
        }
        int i8 = w2.t.f18881a;
        AudioManager audioManager = this.f268a;
        if (i8 < 26) {
            audioManager.abandonAudioFocus(this.f269b);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(t2.C1476e r6) {
        /*
            r5 = this;
            t2.e r0 = r5.f271d
            boolean r0 = w2.t.a(r0, r6)
            if (r0 != 0) goto L39
            r5.f271d = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L10
        Le:
            r2 = r0
            goto L2d
        L10:
            r2 = 3
            r3 = 2
            int r4 = r6.f16419c
            switch(r4) {
                case 0: goto L27;
                case 1: goto L25;
                case 2: goto L23;
                case 3: goto Le;
                case 4: goto L23;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L1f;
                case 12: goto L2d;
                case 13: goto L2d;
                case 14: goto L25;
                case 15: goto L17;
                case 16: goto L1d;
                default: goto L17;
            }
        L17:
            java.lang.String r6 = "Unidentified audio usage: "
            n1.c.x(r4, r6)
            goto Le
        L1d:
            r2 = 4
            goto L2d
        L1f:
            int r6 = r6.f16417a
            if (r6 != r1) goto L2d
        L23:
            r2 = r3
            goto L2d
        L25:
            r2 = r1
            goto L2d
        L27:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            w2.AbstractC1697a.w(r6)
            goto L25
        L2d:
            r5.f273f = r2
            if (r2 == r1) goto L33
            if (r2 != 0) goto L34
        L33:
            r0 = r1
        L34:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            w2.AbstractC1697a.c(r6, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.C0005f.b(t2.e):void");
    }

    public final void c(int i7) {
        if (this.f272e == i7) {
            return;
        }
        this.f272e = i7;
        float f7 = i7 == 4 ? 0.2f : 1.0f;
        if (this.f274g == f7) {
            return;
        }
        this.f274g = f7;
        K k7 = this.f270c;
        if (k7 != null) {
            N n7 = k7.f83a;
            n7.p1(1, 2, Float.valueOf(n7.f111W * n7.f91C.f274g));
        }
    }

    public final int d(int i7, boolean z6) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderL;
        int i8 = 0;
        z = false;
        boolean z7 = false;
        if (i7 == 1 || this.f273f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z6) {
            int i9 = this.f272e;
            if (i9 == 1) {
                return -1;
            }
            if (i9 == 3) {
                return 0;
            }
        } else if (this.f272e != 2) {
            int i10 = w2.t.f18881a;
            AudioManager audioManager = this.f268a;
            C0004e c0004e = this.f269b;
            if (i10 >= 26) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        AbstractC0002c.v();
                        builderL = AbstractC0002c.h(this.f273f);
                    } else {
                        AbstractC0002c.v();
                        builderL = AbstractC0002c.l(this.h);
                    }
                    C1476e c1476e = this.f271d;
                    if (c1476e != null && c1476e.f16417a == 1) {
                        z7 = true;
                    }
                    c1476e.getClass();
                    this.h = builderL.setAudioAttributes((AudioAttributes) c1476e.b().f16352a).setWillPauseWhenDucked(z7).setOnAudioFocusChangeListener(c0004e).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.h);
            } else {
                C1476e c1476e2 = this.f271d;
                c1476e2.getClass();
                int i11 = c1476e2.f16419c;
                if (i11 != 13) {
                    switch (i11) {
                        case 2:
                            break;
                        case 3:
                            i8 = 8;
                            break;
                        case 4:
                            i8 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            i8 = 5;
                            break;
                        case 6:
                            i8 = 2;
                            break;
                        default:
                            i8 = 3;
                            break;
                    }
                } else {
                    i8 = 1;
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(c0004e, i8, this.f273f);
            }
            if (iRequestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
