package h6;

import android.os.Parcelable;
import f0.InterfaceC0878b0;
import java.util.List;
import l5.InterfaceC1180a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f12868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Parcelable f12869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12870r;

    public /* synthetic */ I0(InterfaceC1765B interfaceC1765B, Parcelable parcelable, Object obj, int i7) {
        this.f12867o = i7;
        this.f12868p = interfaceC1765B;
        this.f12869q = parcelable;
        this.f12870r = obj;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12867o) {
            case 0:
                AbstractC1767D.t(this.f12868p, w5.M.f19498b, new H0((YosMediaItem) this.f12869q, (InterfaceC0878b0) this.f12870r, null), 2);
                break;
            case 1:
                AbstractC1767D.t(this.f12868p, w5.M.f19498b, new j6.f((YosMediaItem) this.f12869q, (List) this.f12870r, null), 2);
                break;
            default:
                AbstractC1767D.t(this.f12868p, w5.M.f19498b, new l6.e((PlayList) this.f12869q, (y3.x) this.f12870r, null), 2);
                break;
        }
        return Y4.o.f8736a;
    }
}
