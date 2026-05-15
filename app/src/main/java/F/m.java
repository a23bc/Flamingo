package F;

import A2.W;
import H.K;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.InterfaceC0878b0;
import java.util.Collection;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import yos.music.player.R;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2087o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0878b0 f2088p;

    public /* synthetic */ m(InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f2087o = i7;
        this.f2088p = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f2087o) {
            case 0:
                return new i((InterfaceC1182c) this.f2088p.getValue());
            case 1:
                return new G.g((InterfaceC1182c) this.f2088p.getValue());
            case 2:
                return (K) ((InterfaceC1180a) this.f2088p.getValue()).a();
            case 3:
                Boolean bool = (Boolean) this.f2088p.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                O0.C c7 = (O0.C) this.f2088p.getValue();
                if (c7 != null) {
                    return c7;
                }
                C.b.d("Required value was null.");
                throw new W();
            case 5:
                O0.C c8 = (O0.C) this.f2088p.getValue();
                if (c8 != null) {
                    return c8;
                }
                C.b.d("Required value was null.");
                throw new W();
            case 6:
                O0.C c9 = (O0.C) this.f2088p.getValue();
                if (c9 != null) {
                    return c9;
                }
                C.b.d("Required value was null.");
                throw new W();
            case 7:
                InterfaceC0878b0 interfaceC0878b0 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b0, "$showCornerSetDialog");
                interfaceC0878b0.setValue(Boolean.FALSE);
                return Y4.o.f8736a;
            case 8:
                InterfaceC0878b0 interfaceC0878b02 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b02, "$nowLabel");
                return (String) interfaceC0878b02.getValue();
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                InterfaceC0878b0 interfaceC0878b03 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b03, "$isPlaying");
                Boolean bool2 = (Boolean) interfaceC0878b03.getValue();
                bool2.getClass();
                return bool2;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                InterfaceC0878b0 interfaceC0878b04 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b04, "$nowPageNowPlaying");
                return (String) interfaceC0878b04.getValue();
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                InterfaceC0878b0 interfaceC0878b05 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b05, "$randomMusicList");
                return Integer.valueOf(((List) interfaceC0878b05.getValue()).size());
            case 12:
                InterfaceC0878b0 interfaceC0878b06 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b06, "$thisMusicPlaying");
                YosMediaItem yosMediaItem = (YosMediaItem) interfaceC0878b06.getValue();
                if (yosMediaItem != null) {
                    return yosMediaItem.getThumb();
                }
                return null;
            case 13:
                InterfaceC0878b0 interfaceC0878b07 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b07, "$thisMusicPlaying");
                YosMediaItem yosMediaItem2 = (YosMediaItem) interfaceC0878b07.getValue();
                if (yosMediaItem2 != null) {
                    return yosMediaItem2.getThumb();
                }
                return null;
            case 14:
                InterfaceC0878b0 interfaceC0878b08 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b08, "$thisMusicPlaying");
                YosMediaItem yosMediaItem3 = (YosMediaItem) interfaceC0878b08.getValue();
                if (yosMediaItem3 != null) {
                    return yosMediaItem3.getThumb();
                }
                return null;
            case 15:
                InterfaceC0878b0 interfaceC0878b09 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b09, "$thisMusicPlaying");
                return (YosMediaItem) interfaceC0878b09.getValue();
            case 16:
                InterfaceC0878b0 interfaceC0878b010 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b010, "$thisMusicPlaying");
                YosMediaItem yosMediaItem4 = (YosMediaItem) interfaceC0878b010.getValue();
                if (yosMediaItem4 != null) {
                    return yosMediaItem4.getThumb();
                }
                return null;
            case 17:
                InterfaceC0878b0 interfaceC0878b011 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b011, "$thisMusicPlaying");
                return (YosMediaItem) interfaceC0878b011.getValue();
            case 18:
                InterfaceC0878b0 interfaceC0878b012 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b012, "$shuffleModeEnabled");
                Boolean bool3 = (Boolean) interfaceC0878b012.getValue();
                bool3.getClass();
                return bool3;
            case 19:
                InterfaceC0878b0 interfaceC0878b013 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b013, "$thisMusicPlaying");
                return (YosMediaItem) interfaceC0878b013.getValue();
            case BuildConfig.API_VERSION /* 20 */:
                InterfaceC0878b0 interfaceC0878b014 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b014, "$translation");
                Boolean bool4 = (Boolean) interfaceC0878b014.getValue();
                bool4.getClass();
                return bool4;
            case 21:
                InterfaceC0878b0 interfaceC0878b015 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b015, "$shuffleModeEnabled");
                Boolean bool5 = (Boolean) interfaceC0878b015.getValue();
                bool5.getClass();
                return bool5;
            case 22:
                InterfaceC0878b0 interfaceC0878b016 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b016, "$thisMusicPlaying");
                return (YosMediaItem) interfaceC0878b016.getValue();
            case 23:
                InterfaceC0878b0 interfaceC0878b017 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b017, "$thisMusicPlaying");
                YosMediaItem yosMediaItem5 = (YosMediaItem) interfaceC0878b017.getValue();
                if (yosMediaItem5 != null) {
                    return yosMediaItem5.getThumb();
                }
                return null;
            case 24:
                InterfaceC0878b0 interfaceC0878b018 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b018, "$shuffleModeEnabled");
                Boolean bool6 = (Boolean) interfaceC0878b018.getValue();
                bool6.getClass();
                return bool6;
            case 25:
                InterfaceC0878b0 interfaceC0878b019 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b019, "$showControl");
                Boolean bool7 = (Boolean) interfaceC0878b019.getValue();
                bool7.getClass();
                return bool7;
            case 26:
                InterfaceC0878b0 interfaceC0878b020 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b020, "$translation");
                Boolean bool8 = (Boolean) interfaceC0878b020.getValue();
                bool8.getClass();
                return bool8;
            case 27:
                InterfaceC0878b0 interfaceC0878b021 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b021, "$musicList");
                Collection collection = (Collection) interfaceC0878b021.getValue();
                return Integer.valueOf((collection == null || collection.isEmpty()) ? R.string.playlist_unavailable_desc : R.string.playlist_shuffle_desc);
            case 28:
                InterfaceC0878b0 interfaceC0878b022 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b022, "$searchText");
                return Boolean.valueOf(((CharSequence) interfaceC0878b022.getValue()).length() > 0);
            default:
                InterfaceC0878b0 interfaceC0878b023 = this.f2088p;
                AbstractC1209k.f(interfaceC0878b023, "$expanded");
                Boolean bool9 = (Boolean) interfaceC0878b023.getValue();
                bool9.getClass();
                return bool9;
        }
    }
}
