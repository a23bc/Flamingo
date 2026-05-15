package k6;

import M.t0;
import Y4.o;
import Z4.n;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import f0.Z0;
import java.util.List;
import t5.C1522f;
import t5.j;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.MusicLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Z0 f14132o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ List f14133p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0878b0 f14134q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Z0 z02, List list, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f14132o = z02;
        this.f14133p = list;
        this.f14134q = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new b(this.f14132o, this.f14133p, this.f14134q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        return ((Boolean) this.f14132o.getValue()).booleanValue() ? j.J(new C1522f(n.m0(MusicLibrary.INSTANCE.getArtists()), true, new t0(this.f14134q, 18))) : this.f14133p;
    }
}
