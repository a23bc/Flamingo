package n6;

import Y4.o;
import androidx.compose.foundation.f;
import b6.i;
import cn.lyric.getter.api.API;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0886f0;
import f0.D;
import f0.a1;
import java.util.LinkedHashMap;
import l5.InterfaceC1180a;
import o0.AbstractC1253j;
import o0.C1249f;
import q0.AbstractC1354c;
import q0.AbstractC1356e;
import q2.AbstractC1369a;
import w3.C1760y;
import x.C1817E0;
import x.C1823J;
import x.C1876s0;
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14558o;

    public /* synthetic */ c(int i7) {
        this.f14558o = i7;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        o oVar = o.f8736a;
        switch (this.f14558o) {
            case 0:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getHardwareAudioTrackPlayBackParams());
            case 1:
                return new C1249f(new LinkedHashMap());
            case 2:
                a1 a1Var = AbstractC1253j.f14649a;
                return null;
            case 3:
                return new API();
            case 4:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getLyricGetterAPIEnabled());
            case 5:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getSuperLyricAPIEnabled());
            case 6:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getTickerLyricEnabled());
            case 7:
                a1 a1Var2 = AbstractC1354c.f15442a;
                return null;
            case 8:
                a1 a1Var3 = AbstractC1356e.f15444a;
                return null;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                D d4 = AbstractC1369a.f15525a;
                return null;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                SettingsLibrary.INSTANCE.setLyricLineBalance(!r0.getLyricLineBalance());
                return oVar;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getLyricLineBalance());
            case 12:
                SettingsLibrary.INSTANCE.setLyricPreferEmbedded(!r0.getLyricPreferEmbedded());
                return oVar;
            case 13:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getLyricPreferEmbedded());
            case 14:
                SettingsLibrary.INSTANCE.setLyricBlurEffect(!r0.getLyricBlurEffect());
                return oVar;
            case 15:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getLyricBlurEffect());
            case 16:
                SettingsLibrary.INSTANCE.setNotificationEnableIcon(!r0.getNotificationEnableIcon());
                C1760y c1760y = i.f10423c;
                if (c1760y != null) {
                    new YosPlaybackService().l(c1760y);
                }
                return oVar;
            case 17:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getNotificationEnableIcon());
            case 18:
                SettingsLibrary.INSTANCE.setNotificationSmallerIcon(!r0.getNotificationSmallerIcon());
                C1760y c1760y2 = i.f10423c;
                if (c1760y2 != null) {
                    new YosPlaybackService().l(c1760y2);
                }
                return oVar;
            case 19:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getNotificationSmallerIcon());
            case BuildConfig.API_VERSION /* 20 */:
                SettingsLibrary.INSTANCE.setBarBlurEffect(!r0.getBarBlurEffect());
                return oVar;
            case 21:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getBarBlurEffect());
            case 22:
                SettingsLibrary.INSTANCE.setNowPlayingShowVolumeBar(!r0.getNowPlayingShowVolumeBar());
                return oVar;
            case 23:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getNowPlayingShowVolumeBar());
            case 24:
                SettingsLibrary.INSTANCE.setNowplayingBackgroundEffect(!r0.getNowplayingBackgroundEffect());
                return oVar;
            case 25:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getNowplayingBackgroundEffect());
            case 26:
                return new C0886f0(0.0f);
            case 27:
                D d7 = f.f9163a;
                return C1823J.f19653a;
            case 28:
                return new C1876s0();
            default:
                return new C1817E0(0);
        }
    }
}
