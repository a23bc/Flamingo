package A2;

import N2.InterfaceC0289f;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.Looper;
import android.os.Trace;
import com.hchen.superlyricapi.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import t2.C1487p;
import yos.music.player.logic.YosPlaybackService;
import z2.InterfaceC2080a;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements A3.e, D2.q, D2.w, F2.y, F2.i, H2.W, H3.a, L2.z, M4.o, InterfaceC0289f, N2.o {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f472o;

    public /* synthetic */ x0(int i7) {
        this.f472o = i7;
    }

    public static MediaCodec M(F2.h hVar) throws IOException {
        F2.m mVar = hVar.f2219a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = mVar.f2225a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    private final /* synthetic */ void P() {
    }

    @Override // F2.y
    public boolean A(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // H2.W
    public int C(long j3) {
        return 0;
    }

    @Override // D2.w
    public InterfaceC2080a D(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // N2.o
    public N2.H E(int i7, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // M4.o
    public Object F() {
        switch (this.f472o) {
            case 19:
                return new TreeSet();
            case BuildConfig.API_VERSION /* 20 */:
                return new LinkedHashSet();
            case 21:
                return new ArrayDeque();
            case 22:
                return new ArrayList();
            case 23:
                return new ConcurrentSkipListMap();
            case 24:
                return new ConcurrentHashMap();
            case 25:
                return new TreeMap();
            case 26:
                return new LinkedHashMap();
            default:
                return new M4.n(true);
        }
    }

    @Override // D2.w
    public /* synthetic */ void G(byte[] bArr, B2.p pVar) {
    }

    @Override // N2.o
    public void H(N2.B b7) {
        throw new UnsupportedOperationException();
    }

    @Override // F2.y
    public boolean I() {
        return false;
    }

    @Override // D2.w
    public boolean J(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // D2.w
    public byte[] K() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public int N(int i7) {
        return i7 == 7 ? 6 : 3;
    }

    @Override // D2.q, D2.w
    public void a() {
        int i7 = this.f472o;
    }

    @Override // D2.q
    public /* synthetic */ void b() {
    }

    @Override // D2.q
    public int c(C1487p c1487p) {
        return c1487p.f16705q != null ? 1 : 0;
    }

    @Override // F2.y
    public MediaCodecInfo d(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // A3.e
    public void e(int i7, Serializable serializable) {
        switch (this.f472o) {
            case 2:
                break;
            default:
                if (i7 == 6 || i7 == 7 || i7 == 8) {
                }
                break;
        }
    }

    @Override // H2.W
    public int f(V.o oVar, z2.f fVar, int i7) {
        fVar.f12566p = 4;
        return -4;
    }

    @Override // D2.w
    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // D2.w
    public Map h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // N2.o
    public void k() {
        throw new UnsupportedOperationException();
    }

    @Override // D2.q
    public D2.k m(D2.n nVar, C1487p c1487p) {
        if (c1487p.f16705q == null) {
            return null;
        }
        return new D2.t(new D2.j(new D2.E(), 6001));
    }

    @Override // H3.a
    public H3.b n(D2.B b7) {
        boolean z6 = b7.f1458o;
        return new I3.e((Context) b7.f1459p, (String) b7.f1460q, (V.o) b7.f1461r, z6);
    }

    @Override // D2.w
    public byte[] o(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // F2.y
    public boolean q(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // F2.y
    public int r() {
        return MediaCodecList.getCodecCount();
    }

    @Override // D2.w
    public D2.v s() {
        throw new IllegalStateException();
    }

    @Override // D2.q
    public /* synthetic */ D2.p t(D2.n nVar, C1487p c1487p) {
        return D2.p.f1530a;
    }

    @Override // D2.w
    public void u(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // F2.i
    public F2.j v(F2.h hVar) {
        MediaCodec mediaCodecM = null;
        try {
            mediaCodecM = M(hVar);
            Trace.beginSection("configureCodec");
            mediaCodecM.configure(hVar.f2220b, hVar.f2222d, hVar.f2223e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM.start();
            Trace.endSection();
            return new A0.b(mediaCodecM);
        } catch (IOException | RuntimeException e7) {
            if (mediaCodecM != null) {
                mediaCodecM.release();
            }
            throw e7;
        }
    }

    @Override // H2.W
    public boolean w() {
        return true;
    }

    @Override // D2.w
    public D2.u x(byte[] bArr, List list, int i7, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // D2.w
    public int y() {
        return 1;
    }

    public x0(YosPlaybackService yosPlaybackService) {
        this.f472o = 1;
        yosPlaybackService.getApplicationContext();
    }

    private final void Q() {
    }

    @Override // H2.W
    public void B() {
    }

    @Override // L2.z
    public void i() {
    }

    @Override // L2.z
    public void l() {
    }

    @Override // D2.w
    public void L(D2.f fVar) {
    }

    @Override // D2.w
    public void j(byte[] bArr) {
    }

    @Override // N2.InterfaceC0289f
    public long p(long j3) {
        return j3;
    }

    private final void O(int i7, Serializable serializable) {
    }

    @Override // D2.q
    public void z(Looper looper, B2.p pVar) {
    }
}
