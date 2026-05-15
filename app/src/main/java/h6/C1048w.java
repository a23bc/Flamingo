package h6;

import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0879c;
import f0.C0888g0;
import f0.C0890h0;
import l5.InterfaceC1180a;
import w3.C1760y;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: renamed from: h6.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1048w implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13257o;

    public /* synthetic */ C1048w(int i7) {
        this.f13257o = i7;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f13257o) {
            case 0:
                return Y4.o.f8736a;
            case 1:
                C1760y c1760y = b6.i.f10423c;
                return Long.valueOf(c1760y != null ? c1760y.F0() : 0L);
            case 2:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getLyricBlurEffect());
            case 3:
                C1760y c1760y2 = b6.i.f10423c;
                return Long.valueOf(c1760y2 != null ? c1760y2.F0() : 0L);
            case 4:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getLyricBlurEffect());
            case 5:
                return Boolean.FALSE;
            case 6:
                return new C0890h0(0L);
            case 7:
                return C0879c.t(Boolean.TRUE);
            case 8:
                return C0879c.t(Boolean.valueOf(SettingsLibrary.INSTANCE.getNowPlayingTranslation()));
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C1760y c1760y3 = b6.i.f10423c;
                return C0879c.t(Boolean.valueOf(c1760y3 != null ? c1760y3.r0() : false));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C1760y c1760y4 = b6.i.f10423c;
                return new C0888g0(c1760y4 != null ? c1760y4.i() : 0);
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                settingsLibrary.setSongSort(SettingsLibrary.SongSortEnum.MUSIC_TITLE.ordinal());
                settingsLibrary.getSongSort();
                System.out.getClass();
                return Y4.o.f8736a;
            case 12:
                SettingsLibrary settingsLibrary2 = SettingsLibrary.INSTANCE;
                settingsLibrary2.setSongSort(SettingsLibrary.SongSortEnum.ARTIST_NAME.ordinal());
                settingsLibrary2.getSongSort();
                System.out.getClass();
                return Y4.o.f8736a;
            case 13:
                SettingsLibrary settingsLibrary3 = SettingsLibrary.INSTANCE;
                settingsLibrary3.setSongSort(SettingsLibrary.SongSortEnum.MODIFIED_DATE.ordinal());
                settingsLibrary3.getSongSort();
                System.out.getClass();
                return Y4.o.f8736a;
            case 14:
                SettingsLibrary settingsLibrary4 = SettingsLibrary.INSTANCE;
                settingsLibrary4.setEnableDescending(false);
                settingsLibrary4.getEnableDescending();
                System.out.getClass();
                return Y4.o.f8736a;
            case 15:
                SettingsLibrary settingsLibrary5 = SettingsLibrary.INSTANCE;
                settingsLibrary5.setEnableDescending(true);
                settingsLibrary5.getEnableDescending();
                System.out.getClass();
                return Y4.o.f8736a;
            case 16:
                return C0879c.t((String) a6.a.f8880a.getValue());
            case 17:
                SettingsLibrary.INSTANCE.setSearchResultNotAsPlayList(!r0.getSearchResultNotAsPlayList());
                return Y4.o.f8736a;
            case 18:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getSearchResultNotAsPlayList());
            case 19:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getListenHistory());
            case BuildConfig.API_VERSION /* 20 */:
                return C0879c.t(Boolean.FALSE);
            case 21:
                SettingsLibrary.INSTANCE.setRefreshEveryTime(!r0.getRefreshEveryTime());
                return Y4.o.f8736a;
            case 22:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getRefreshEveryTime());
            case 23:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getFadePlay());
            case 24:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 25:
                SettingsLibrary.INSTANCE.setAudioAttributes(!r0.getAudioAttributes());
                return Y4.o.f8736a;
            case 26:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getAudioAttributes());
            case 27:
                SettingsLibrary.INSTANCE.setAudioFloatOutput(!r0.getAudioFloatOutput());
                return Y4.o.f8736a;
            case 28:
                return Boolean.valueOf(SettingsLibrary.INSTANCE.getAudioFloatOutput());
            default:
                SettingsLibrary.INSTANCE.setHardwareAudioTrackPlayBackParams(!r0.getHardwareAudioTrackPlayBackParams());
                return Y4.o.f8736a;
        }
    }
}
