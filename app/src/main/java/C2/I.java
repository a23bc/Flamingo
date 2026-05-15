package C2;

import A2.x0;
import E4.b0;
import E4.g0;
import androidx.lifecycle.EnumC0593p;
import java.util.LinkedHashMap;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a */
    public boolean f981a;

    /* JADX INFO: renamed from: b */
    public boolean f982b;

    /* JADX INFO: renamed from: c */
    public boolean f983c;

    /* JADX INFO: renamed from: d */
    public Object f984d;

    /* JADX INFO: renamed from: e */
    public Object f985e;

    /* JADX INFO: renamed from: f */
    public Object f986f;

    /* JADX INFO: renamed from: g */
    public Object f987g;
    public Object h;

    public I(E3.f fVar, E3.e eVar) {
        this.f984d = fVar;
        this.f985e = eVar;
        this.f986f = new x0(11);
        this.f987g = new LinkedHashMap();
        this.f983c = true;
    }

    public S a() {
        AbstractC1697a.i(!this.f983c);
        this.f983c = true;
        if (((A0.b) this.f986f) == null) {
            this.f986f = new A0.b(new u2.d[0]);
        }
        if (((V.o) this.h) == null) {
            this.h = new V.o(8, (YosPlaybackService) this.f984d);
        }
        return new S(this);
    }

    public void b() {
        E3.f fVar = (E3.f) this.f984d;
        if (fVar.h().i() != EnumC0593p.f9746p) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f981a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((E3.e) this.f985e).a();
        fVar.h().a(new G3.a(0, this));
        this.f981a = true;
    }

    public I(int i7) {
        switch (i7) {
            case 2:
                this.f986f = g0.f1938u;
                this.f982b = true;
                E4.G g6 = E4.I.f1870p;
                this.f987g = b0.f1913s;
                break;
            default:
                this.f984d = null;
                this.f985e = C0035g.f1117c;
                this.f987g = T.f1075a;
                break;
        }
    }
}
