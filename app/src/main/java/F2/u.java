package F2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f2304p = new u(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2305o;

    public /* synthetic */ u(int i7) {
        this.f2305o = i7;
    }

    @Override // F2.z
    public int g(Object obj) {
        m mVar = (m) obj;
        switch (this.f2305o) {
            case 1:
                String str = mVar.f2225a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (w2.t.f18881a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return mVar.f2225a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
