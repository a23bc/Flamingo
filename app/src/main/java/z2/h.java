package z2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Thread {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ i f21124o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f21124o = iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (this.f21124o.k());
    }
}
