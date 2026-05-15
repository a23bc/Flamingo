package D;

import M.AbstractC0269n;
import X.R0;
import android.os.Handler;
import android.os.Looper;
import b1.AbstractC0609E;
import cn.lyric.getter.api.API;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.AbstractC0914u;
import f0.C0879c;
import f0.C0888g0;
import f0.C0890h0;
import f0.a1;
import l5.InterfaceC1180a;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1207o;

    public /* synthetic */ A0(int i7) {
        this.f1207o = i7;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f1207o) {
            case 0:
                return new G();
            case 1:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 2:
                return new G.x(0, 0);
            case 3:
                a1 a1Var = AbstractC0269n.f4642a;
                return null;
            case 4:
                f0.D d4 = T.g.f6845a;
                return null;
            case 5:
                return new T4.a(null, 15);
            case 6:
                YosMediaItem yosMediaItem = (YosMediaItem) b6.i.f10424d.getValue();
                if (yosMediaItem != null) {
                    return yosMediaItem.getThumb();
                }
                return null;
            case 7:
                return new C0888g0(0);
            case 8:
                return C0879c.t("HomePage");
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return C0879c.t("Album");
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return 2;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return a6.d.f8892b;
            case 12:
                return C0879c.t(null);
            case 13:
                return w5.M.f19498b;
            case 14:
                return new X.u0(1L);
            case 15:
                f0.D d7 = X.v0.f8184a;
                return null;
            case 16:
                return R0.f7989b;
            case 17:
                return AbstractC0609E.f9916d;
            case 18:
                int i7 = YosPlaybackService.f20580B;
                return android.support.v4.media.session.b.f8937b;
            case 19:
                int i8 = YosPlaybackService.f20580B;
                return new API();
            case BuildConfig.API_VERSION /* 20 */:
                int i9 = YosPlaybackService.f20580B;
                return new Handler(Looper.getMainLooper());
            case 21:
                AbstractC0914u.d("Unexpected call to default provider");
                throw new A2.W();
            case 22:
                return new C0890h0(0L);
            case 23:
                return new C0890h0(0L);
            case 24:
                return C0879c.t("0:00");
            case 25:
                return C0879c.t("-0:00");
            case 26:
                return new C0890h0(0L);
            case 27:
                return new C0890h0(0L);
            default:
                return C0879c.t("0:00");
        }
    }
}
