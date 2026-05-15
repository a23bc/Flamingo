package i6;

import f0.InterfaceC0878b0;
import java.util.List;
import l5.InterfaceC1180a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f13585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f13586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f13587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13588r;

    public x(InterfaceC1765B interfaceC1765B, YosMediaItem yosMediaItem, List list, InterfaceC0878b0 interfaceC0878b0) {
        this.f13585o = interfaceC1765B;
        this.f13586p = yosMediaItem;
        this.f13587q = list;
        this.f13588r = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        AbstractC1767D.t(this.f13585o, M.f19498b, new w(this.f13586p, this.f13587q, this.f13588r, null), 2);
        return Y4.o.f8736a;
    }
}
