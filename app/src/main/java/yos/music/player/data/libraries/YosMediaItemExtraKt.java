package yos.music.player.data.libraries;

import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class YosMediaItemExtraKt {
    public static final List<String> getArtistsList(YosMediaItem yosMediaItem) {
        AbstractC1209k.f(yosMediaItem, "<this>");
        String artists = yosMediaItem.getArtists();
        if (artists != null) {
            return MediaItemExtraKt.toMultipleArtists(artists);
        }
        return null;
    }

    public static final String getArtistsName(YosMediaItem yosMediaItem) {
        AbstractC1209k.f(yosMediaItem, "<this>");
        List<String> artistsList = getArtistsList(yosMediaItem);
        if (artistsList != null) {
            return MediaItemExtraKt.toArtistsString(artistsList);
        }
        return null;
    }
}
