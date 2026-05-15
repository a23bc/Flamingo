package L2;

import t2.q0;
import t2.r0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4106a;

    public c(b bVar) {
        this.f4106a = bVar;
    }

    public final void a() throws q0 {
        try {
            ((c) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(r0.class).newInstance(this.f4106a)).a();
        } catch (Exception e7) {
            int i7 = q0.f16720o;
            if (!(e7 instanceof q0)) {
                throw new q0(e7);
            }
        }
    }
}
