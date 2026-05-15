package A2;

import java.util.Locale;

/* JADX INFO: renamed from: A2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0007h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f299g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f302k;
    public int l;

    public final String toString() {
        int i7 = this.f293a;
        int i8 = this.f294b;
        int i9 = this.f295c;
        int i10 = this.f296d;
        int i11 = this.f297e;
        int i12 = this.f298f;
        int i13 = this.f299g;
        int i14 = this.h;
        int i15 = this.f300i;
        int i16 = this.f301j;
        long j3 = this.f302k;
        int i17 = this.l;
        int i18 = w2.t.f18881a;
        Locale locale = Locale.US;
        return "DecoderCounters {\n decoderInits=" + i7 + ",\n decoderReleases=" + i8 + "\n queuedInputBuffers=" + i9 + "\n skippedInputBuffers=" + i10 + "\n renderedOutputBuffers=" + i11 + "\n skippedOutputBuffers=" + i12 + "\n droppedBuffers=" + i13 + "\n droppedInputBuffers=" + i14 + "\n maxConsecutiveDroppedBuffers=" + i15 + "\n droppedToKeyframeEvents=" + i16 + "\n totalVideoFrameProcessingOffsetUs=" + j3 + "\n videoFrameProcessingOffsetCount=" + i17 + "\n}";
    }
}
