package yos.music.player.data.libraries;

import A0.e;
import f5.InterfaceC0932a;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import s5.InterfaceC1438c;
import w4.f;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsLibrary {
    private static final f AudioAttributes$delegate;
    private static final f AudioFloatOutput$delegate;
    private static final f BarBlurEffect$delegate;
    private static final f Codec$delegate;
    private static final f CustomTheme$delegate;
    private static final f EnableDescending$delegate;
    private static final f EnableExcludeSongsUnderOneMinute$delegate;
    private static final f FadePlay$delegate;
    private static final f HardwareAudioTrackPlayBackParams$delegate;
    private static final f ListenHistory$delegate;
    private static final f LyricBlurEffect$delegate;
    private static final f LyricFontWeight$delegate;
    private static final f LyricGetterAPIEnabled$delegate;
    private static final f LyricGetterAPIHooked$delegate;
    private static final f LyricLineBalance$delegate;
    private static final f LyricPreferEmbedded$delegate;
    private static final f NotificationEnableIcon$delegate;
    private static final f NotificationSmallerIcon$delegate;
    private static final f NowPlayingShowVolumeBar$delegate;
    private static final f NowPlayingTranslation$delegate;
    private static final f NowplayingBackgroundEffect$delegate;
    private static final f RefreshEveryTime$delegate;
    private static final f ScreenCorner$delegate;
    private static final f ScreenCornerSet$delegate;
    private static final f SearchResultNotAsPlayList$delegate;
    private static final f SongSort$delegate;
    private static final f SuperLyricAPIEnabled$delegate;
    private static final f SuperLyricAPIHooked$delegate;
    private static final f TickerLyricEnabled$delegate;
    static final /* synthetic */ InterfaceC1438c[] $$delegatedProperties = {e.E(SettingsLibrary.class, "NowPlayingShowVolumeBar", "getNowPlayingShowVolumeBar()Z", 0), e.E(SettingsLibrary.class, "CustomTheme", "getCustomTheme()Ljava/lang/String;", 0), e.E(SettingsLibrary.class, "ScreenCornerSet", "getScreenCornerSet()Z", 0), e.E(SettingsLibrary.class, "ScreenCorner", "getScreenCorner()Ljava/lang/String;", 0), e.E(SettingsLibrary.class, "SongSort", "getSongSort()I", 0), e.E(SettingsLibrary.class, "EnableDescending", "getEnableDescending()Z", 0), e.E(SettingsLibrary.class, "NowPlayingTranslation", "getNowPlayingTranslation()Z", 0), e.E(SettingsLibrary.class, "RefreshEveryTime", "getRefreshEveryTime()Z", 0), e.E(SettingsLibrary.class, "LyricFontWeight", "getLyricFontWeight()Ljava/lang/String;", 0), e.E(SettingsLibrary.class, "LyricLineBalance", "getLyricLineBalance()Z", 0), e.E(SettingsLibrary.class, "LyricBlurEffect", "getLyricBlurEffect()Z", 0), e.E(SettingsLibrary.class, "LyricPreferEmbedded", "getLyricPreferEmbedded()Z", 0), e.E(SettingsLibrary.class, "NowplayingBackgroundEffect", "getNowplayingBackgroundEffect()Z", 0), e.E(SettingsLibrary.class, "BarBlurEffect", "getBarBlurEffect()Z", 0), e.E(SettingsLibrary.class, "NotificationEnableIcon", "getNotificationEnableIcon()Z", 0), e.E(SettingsLibrary.class, "NotificationSmallerIcon", "getNotificationSmallerIcon()Z", 0), e.E(SettingsLibrary.class, "FadePlay", "getFadePlay()Z", 0), e.E(SettingsLibrary.class, "SearchResultNotAsPlayList", "getSearchResultNotAsPlayList()Z", 0), e.E(SettingsLibrary.class, "ListenHistory", "getListenHistory()Z", 0), e.E(SettingsLibrary.class, "LyricGetterAPIEnabled", "getLyricGetterAPIEnabled()Z", 0), e.E(SettingsLibrary.class, "LyricGetterAPIHooked", "getLyricGetterAPIHooked()Z", 0), e.E(SettingsLibrary.class, "SuperLyricAPIEnabled", "getSuperLyricAPIEnabled()Z", 0), e.E(SettingsLibrary.class, "SuperLyricAPIHooked", "getSuperLyricAPIHooked()Z", 0), e.E(SettingsLibrary.class, "TickerLyricEnabled", "getTickerLyricEnabled()Z", 0), e.E(SettingsLibrary.class, "AudioAttributes", "getAudioAttributes()Z", 0), e.E(SettingsLibrary.class, "Codec", "getCodec()Ljava/lang/String;", 0), e.E(SettingsLibrary.class, "HardwareAudioTrackPlayBackParams", "getHardwareAudioTrackPlayBackParams()Z", 0), e.E(SettingsLibrary.class, "AudioFloatOutput", "getAudioFloatOutput()Z", 0), e.E(SettingsLibrary.class, "EnableExcludeSongsUnderOneMinute", "getEnableExcludeSongsUnderOneMinute()Z", 0)};
    public static final SettingsLibrary INSTANCE = new SettingsLibrary();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SongSortEnum {
        private static final /* synthetic */ InterfaceC0932a $ENTRIES;
        private static final /* synthetic */ SongSortEnum[] $VALUES;
        public static final SongSortEnum MUSIC_TITLE = new SongSortEnum("MUSIC_TITLE", 0);
        public static final SongSortEnum MUSIC_DURATION = new SongSortEnum("MUSIC_DURATION", 1);
        public static final SongSortEnum ARTIST_NAME = new SongSortEnum("ARTIST_NAME", 2);
        public static final SongSortEnum MODIFIED_DATE = new SongSortEnum("MODIFIED_DATE", 3);

        private static final /* synthetic */ SongSortEnum[] $values() {
            return new SongSortEnum[]{MUSIC_TITLE, MUSIC_DURATION, ARTIST_NAME, MODIFIED_DATE};
        }

        static {
            SongSortEnum[] songSortEnumArr$values = $values();
            $VALUES = songSortEnumArr$values;
            $ENTRIES = AbstractC1267a.u(songSortEnumArr$values);
        }

        private SongSortEnum(String str, int i7) {
        }

        public static SongSortEnum valueOf(String str) {
            return (SongSortEnum) Enum.valueOf(SongSortEnum.class, str);
        }

        public static SongSortEnum[] values() {
            return (SongSortEnum[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1001:0x0a55 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1004:0x0adb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x0b61 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1010:0x0be7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x0c6d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x0cf3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1021:0x02f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x0d79 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1029:0x037a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x0dff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1037:0x0e85 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x0f0a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1043:0x040b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x0f90 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:931:0x10d5  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x10d6  */
    /* JADX WARN: Removed duplicated region for block: B:933:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:934:0x10d8  */
    /* JADX WARN: Removed duplicated region for block: B:935:0x10d9  */
    /* JADX WARN: Removed duplicated region for block: B:936:0x10da  */
    /* JADX WARN: Removed duplicated region for block: B:937:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:938:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x10dd  */
    /* JADX WARN: Removed duplicated region for block: B:940:0x10de  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x10df  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x10e0  */
    /* JADX WARN: Removed duplicated region for block: B:943:0x10e1  */
    /* JADX WARN: Removed duplicated region for block: B:944:0x10e2  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x10e3  */
    /* JADX WARN: Removed duplicated region for block: B:946:0x10e4  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x10e5  */
    /* JADX WARN: Removed duplicated region for block: B:948:0x10e6  */
    /* JADX WARN: Removed duplicated region for block: B:949:0x10e7  */
    /* JADX WARN: Removed duplicated region for block: B:950:0x10e8  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x10e9  */
    /* JADX WARN: Removed duplicated region for block: B:952:0x10ea  */
    /* JADX WARN: Removed duplicated region for block: B:953:0x10eb  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x10ec  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x10ed  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x10ee  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x10ef  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x0493 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:961:0x1016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:964:0x0519 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:967:0x109d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:968:0x059f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:973:0x0625 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:978:0x06ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:981:0x0731 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:986:0x07b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:989:0x083d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:992:0x08c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:995:0x0949 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:996:0x09cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instruction units count: 4338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yos.music.player.data.libraries.SettingsLibrary.<clinit>():void");
    }

    private SettingsLibrary() {
    }

    public final boolean getAudioAttributes() {
        return ((Boolean) AudioAttributes$delegate.c($$delegatedProperties[24])).booleanValue();
    }

    public final boolean getAudioFloatOutput() {
        return ((Boolean) AudioFloatOutput$delegate.c($$delegatedProperties[27])).booleanValue();
    }

    public final boolean getBarBlurEffect() {
        return ((Boolean) BarBlurEffect$delegate.c($$delegatedProperties[13])).booleanValue();
    }

    public final String getCodec() {
        return (String) Codec$delegate.c($$delegatedProperties[25]);
    }

    public final String getCustomTheme() {
        return (String) CustomTheme$delegate.c($$delegatedProperties[1]);
    }

    public final boolean getEnableDescending() {
        return ((Boolean) EnableDescending$delegate.c($$delegatedProperties[5])).booleanValue();
    }

    public final boolean getFadePlay() {
        return ((Boolean) FadePlay$delegate.c($$delegatedProperties[16])).booleanValue();
    }

    public final boolean getHardwareAudioTrackPlayBackParams() {
        return ((Boolean) HardwareAudioTrackPlayBackParams$delegate.c($$delegatedProperties[26])).booleanValue();
    }

    public final boolean getListenHistory() {
        return ((Boolean) ListenHistory$delegate.c($$delegatedProperties[18])).booleanValue();
    }

    public final boolean getLyricBlurEffect() {
        return ((Boolean) LyricBlurEffect$delegate.c($$delegatedProperties[10])).booleanValue();
    }

    public final String getLyricFontWeight() {
        return (String) LyricFontWeight$delegate.c($$delegatedProperties[8]);
    }

    public final boolean getLyricGetterAPIEnabled() {
        return ((Boolean) LyricGetterAPIEnabled$delegate.c($$delegatedProperties[19])).booleanValue();
    }

    public final boolean getLyricGetterAPIHooked() {
        return ((Boolean) LyricGetterAPIHooked$delegate.c($$delegatedProperties[20])).booleanValue();
    }

    public final boolean getLyricLineBalance() {
        return ((Boolean) LyricLineBalance$delegate.c($$delegatedProperties[9])).booleanValue();
    }

    public final boolean getLyricPreferEmbedded() {
        return ((Boolean) LyricPreferEmbedded$delegate.c($$delegatedProperties[11])).booleanValue();
    }

    public final boolean getNotificationEnableIcon() {
        return ((Boolean) NotificationEnableIcon$delegate.c($$delegatedProperties[14])).booleanValue();
    }

    public final boolean getNotificationSmallerIcon() {
        return ((Boolean) NotificationSmallerIcon$delegate.c($$delegatedProperties[15])).booleanValue();
    }

    public final boolean getNowPlayingShowVolumeBar() {
        return ((Boolean) NowPlayingShowVolumeBar$delegate.c($$delegatedProperties[0])).booleanValue();
    }

    public final boolean getNowPlayingTranslation() {
        return ((Boolean) NowPlayingTranslation$delegate.c($$delegatedProperties[6])).booleanValue();
    }

    public final boolean getNowplayingBackgroundEffect() {
        return ((Boolean) NowplayingBackgroundEffect$delegate.c($$delegatedProperties[12])).booleanValue();
    }

    public final boolean getRefreshEveryTime() {
        return ((Boolean) RefreshEveryTime$delegate.c($$delegatedProperties[7])).booleanValue();
    }

    public final String getScreenCorner() {
        return (String) ScreenCorner$delegate.c($$delegatedProperties[3]);
    }

    public final boolean getScreenCornerSet() {
        return ((Boolean) ScreenCornerSet$delegate.c($$delegatedProperties[2])).booleanValue();
    }

    public final boolean getSearchResultNotAsPlayList() {
        return ((Boolean) SearchResultNotAsPlayList$delegate.c($$delegatedProperties[17])).booleanValue();
    }

    public final int getSongSort() {
        return ((Number) SongSort$delegate.c($$delegatedProperties[4])).intValue();
    }

    public final boolean getSuperLyricAPIEnabled() {
        return ((Boolean) SuperLyricAPIEnabled$delegate.c($$delegatedProperties[21])).booleanValue();
    }

    public final boolean getSuperLyricAPIHooked() {
        return ((Boolean) SuperLyricAPIHooked$delegate.c($$delegatedProperties[22])).booleanValue();
    }

    public final boolean getTickerLyricEnabled() {
        return ((Boolean) TickerLyricEnabled$delegate.c($$delegatedProperties[23])).booleanValue();
    }

    public final void setAudioAttributes(boolean z6) {
        AudioAttributes$delegate.d($$delegatedProperties[24], Boolean.valueOf(z6));
    }

    public final void setAudioFloatOutput(boolean z6) {
        AudioFloatOutput$delegate.d($$delegatedProperties[27], Boolean.valueOf(z6));
    }

    public final void setBarBlurEffect(boolean z6) {
        BarBlurEffect$delegate.d($$delegatedProperties[13], Boolean.valueOf(z6));
    }

    public final void setCodec(String str) {
        AbstractC1209k.f(str, "<set-?>");
        Codec$delegate.d($$delegatedProperties[25], str);
    }

    public final void setCustomTheme(String str) {
        AbstractC1209k.f(str, "<set-?>");
        CustomTheme$delegate.d($$delegatedProperties[1], str);
    }

    public final void setEnableDescending(boolean z6) {
        EnableDescending$delegate.d($$delegatedProperties[5], Boolean.valueOf(z6));
    }

    public final void setHardwareAudioTrackPlayBackParams(boolean z6) {
        HardwareAudioTrackPlayBackParams$delegate.d($$delegatedProperties[26], Boolean.valueOf(z6));
    }

    public final void setLyricBlurEffect(boolean z6) {
        LyricBlurEffect$delegate.d($$delegatedProperties[10], Boolean.valueOf(z6));
    }

    public final void setLyricFontWeight(String str) {
        AbstractC1209k.f(str, "<set-?>");
        LyricFontWeight$delegate.d($$delegatedProperties[8], str);
    }

    public final void setLyricGetterAPIEnabled(boolean z6) {
        LyricGetterAPIEnabled$delegate.d($$delegatedProperties[19], Boolean.valueOf(z6));
    }

    public final void setLyricGetterAPIHooked(boolean z6) {
        LyricGetterAPIHooked$delegate.d($$delegatedProperties[20], Boolean.valueOf(z6));
    }

    public final void setLyricLineBalance(boolean z6) {
        LyricLineBalance$delegate.d($$delegatedProperties[9], Boolean.valueOf(z6));
    }

    public final void setLyricPreferEmbedded(boolean z6) {
        LyricPreferEmbedded$delegate.d($$delegatedProperties[11], Boolean.valueOf(z6));
    }

    public final void setNotificationEnableIcon(boolean z6) {
        NotificationEnableIcon$delegate.d($$delegatedProperties[14], Boolean.valueOf(z6));
    }

    public final void setNotificationSmallerIcon(boolean z6) {
        NotificationSmallerIcon$delegate.d($$delegatedProperties[15], Boolean.valueOf(z6));
    }

    public final void setNowPlayingShowVolumeBar(boolean z6) {
        NowPlayingShowVolumeBar$delegate.d($$delegatedProperties[0], Boolean.valueOf(z6));
    }

    public final void setNowPlayingTranslation(boolean z6) {
        NowPlayingTranslation$delegate.d($$delegatedProperties[6], Boolean.valueOf(z6));
    }

    public final void setNowplayingBackgroundEffect(boolean z6) {
        NowplayingBackgroundEffect$delegate.d($$delegatedProperties[12], Boolean.valueOf(z6));
    }

    public final void setRefreshEveryTime(boolean z6) {
        RefreshEveryTime$delegate.d($$delegatedProperties[7], Boolean.valueOf(z6));
    }

    public final void setScreenCorner(String str) {
        AbstractC1209k.f(str, "<set-?>");
        ScreenCorner$delegate.d($$delegatedProperties[3], str);
    }

    public final void setScreenCornerSet(boolean z6) {
        ScreenCornerSet$delegate.d($$delegatedProperties[2], Boolean.valueOf(z6));
    }

    public final void setSearchResultNotAsPlayList(boolean z6) {
        SearchResultNotAsPlayList$delegate.d($$delegatedProperties[17], Boolean.valueOf(z6));
    }

    public final void setSongSort(int i7) {
        SongSort$delegate.d($$delegatedProperties[4], Integer.valueOf(i7));
    }

    public final void setSuperLyricAPIEnabled(boolean z6) {
        SuperLyricAPIEnabled$delegate.d($$delegatedProperties[21], Boolean.valueOf(z6));
    }

    public final void setSuperLyricAPIHooked(boolean z6) {
        SuperLyricAPIHooked$delegate.d($$delegatedProperties[22], Boolean.valueOf(z6));
    }

    public final void setTickerLyricEnabled(boolean z6) {
        TickerLyricEnabled$delegate.d($$delegatedProperties[23], Boolean.valueOf(z6));
    }
}
