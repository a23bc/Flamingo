package f6;

import A2.AbstractC0006g;
import A2.K;
import C2.C0035g;
import C2.I;
import C2.InterfaceC0050w;
import C2.S;
import C2.T;
import C2.V;
import C2.r;
import E2.h;
import L2.m;
import L2.y;
import android.content.Context;
import android.os.Handler;
import androidx.media3.decoder.ffmpeg.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import u2.d;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YosPlaybackService f12244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A.b f12245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12246c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12249f;

    public b(YosPlaybackService yosPlaybackService) {
        this.f12244a = yosPlaybackService;
        this.f12245b = new A.b(12, yosPlaybackService);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final AbstractC0006g[] a(Handler handler, K k7, K k8, K k9, K k10) {
        int i7;
        long j3;
        int i8;
        int i9;
        Constructor<?> constructor;
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = this.f12246c;
        boolean z6 = this.f12247d;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        A.b bVar = this.f12245b;
        YosPlaybackService yosPlaybackService = this.f12244a;
        arrayList.add(new m(yosPlaybackService, bVar, z6, handler, k7));
        if (i13 == 0) {
            i7 = 3;
        } else {
            int size = arrayList.size();
            if (i13 == 2) {
                size--;
            }
            try {
                try {
                    j3 = 5000;
                    try {
                        i7 = 3;
                        try {
                            i8 = size + 1;
                        } catch (ClassNotFoundException unused) {
                        }
                    } catch (ClassNotFoundException unused2) {
                        i7 = 3;
                    }
                    try {
                        arrayList.add(size, (AbstractC0006g) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, y.class, cls).newInstance(5000L, handler, k7, 50));
                        AbstractC1697a.q("Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        size = i8;
                        i8 = size;
                    }
                } catch (ClassNotFoundException unused4) {
                    i7 = 3;
                    j3 = 5000;
                }
                try {
                    try {
                        Class<?> cls3 = Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer");
                        Class<?>[] clsArr = new Class[4];
                        clsArr[0] = cls2;
                        clsArr[1] = Handler.class;
                        clsArr[2] = y.class;
                        clsArr[i7] = cls;
                        constructor = cls3.getConstructor(clsArr);
                        objArr = new Object[4];
                        objArr[0] = Long.valueOf(j3);
                        objArr[1] = handler;
                        objArr[2] = k7;
                        objArr[i7] = 50;
                        i9 = i8 + 1;
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating AV1 extension", e7);
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    arrayList.add(i8, (AbstractC0006g) constructor.newInstance(objArr));
                    AbstractC1697a.q("Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused6) {
                    i8 = i9;
                    i9 = i8;
                }
                try {
                    Class[] clsArr2 = new Class[4];
                    clsArr2[0] = cls2;
                    clsArr2[1] = Handler.class;
                    clsArr2[2] = y.class;
                    clsArr2[i7] = cls;
                    Constructor constructor2 = androidx.media3.decoder.ffmpeg.a.class.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = Long.valueOf(j3);
                    objArr2[1] = handler;
                    objArr2[2] = k7;
                    objArr2[i7] = 50;
                    arrayList.add(i9, (AbstractC0006g) constructor2.newInstance(objArr2));
                    AbstractC1697a.q("Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e8);
                }
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating VP9 extension", e9);
            }
        }
        boolean z7 = this.f12248e;
        boolean z8 = this.f12249f;
        I i14 = new I();
        i14.f984d = yosPlaybackService;
        i14.f985e = C0035g.f1117c;
        i14.f987g = T.f1075a;
        i14.f981a = z7;
        i14.f982b = z8;
        S sA = i14.a();
        int i15 = this.f12246c;
        boolean z9 = this.f12247d;
        I i16 = new I(0);
        i16.f986f = new A0.b(new d[0]);
        arrayList.add(new c(null, null, i16.a()));
        arrayList.add(new V(yosPlaybackService, this.f12245b, z9, handler, k8, sA));
        if (i15 != 0) {
            int size2 = arrayList.size();
            if (i15 == 2) {
                size2--;
            }
            try {
                try {
                    Object[] objArr3 = {yosPlaybackService};
                    i10 = size2 + 1;
                    try {
                        arrayList.add(size2, (AbstractC0006g) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(objArr3));
                        AbstractC1697a.q("Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused8) {
                        size2 = i10;
                        i10 = size2;
                    }
                } catch (ClassNotFoundException unused9) {
                }
                try {
                    try {
                        Class<?> cls4 = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer");
                        int i17 = i7;
                        Class<?>[] clsArr3 = new Class[i17];
                        clsArr3[0] = Handler.class;
                        clsArr3[1] = r.class;
                        clsArr3[2] = InterfaceC0050w.class;
                        Constructor<?> constructor3 = cls4.getConstructor(clsArr3);
                        Object[] objArr4 = new Object[i17];
                        objArr4[0] = handler;
                        objArr4[1] = k8;
                        objArr4[2] = sA;
                        i11 = i10 + 1;
                        try {
                            arrayList.add(i10, (AbstractC0006g) constructor3.newInstance(objArr4));
                            AbstractC1697a.q("Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused10) {
                            i10 = i11;
                            i11 = i10;
                        }
                    } catch (ClassNotFoundException unused11) {
                    }
                    try {
                        try {
                            i12 = i11 + 1;
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating FLAC extension", e10);
                        }
                    } catch (ClassNotFoundException unused12) {
                    }
                    try {
                        arrayList.add(i11, (AbstractC0006g) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, r.class, InterfaceC0050w.class).newInstance(handler, k8, sA));
                        AbstractC1697a.q("Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused13) {
                        i11 = i12;
                        i12 = i11;
                    }
                    try {
                        arrayList.add(i12, (AbstractC0006g) c.class.getConstructor(Handler.class, r.class, InterfaceC0050w.class).newInstance(handler, k8, sA));
                        AbstractC1697a.q("Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused14) {
                    } catch (Exception e11) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e11);
                    }
                } catch (Exception e12) {
                    throw new RuntimeException("Error instantiating Opus extension", e12);
                }
            } catch (Exception e13) {
                throw new RuntimeException("Error instantiating MIDI extension", e13);
            }
        }
        arrayList.add(new I2.d(k9, handler.getLooper()));
        arrayList.add(new G2.b(k10, handler.getLooper()));
        arrayList.add(new M2.a());
        arrayList.add(new h(E2.c.f1825c));
        return (AbstractC0006g[]) arrayList.toArray(new AbstractC0006g[0]);
    }
}
