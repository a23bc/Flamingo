package M4;

import java.util.Comparator;
import java.util.List;
import x4.AbstractC1942a;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosMediaItemExtraKt;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4794o;

    public /* synthetic */ j(int i7) {
        this.f4794o = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object objC;
        Object objC2;
        switch (this.f4794o) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return N5.l.r(((T5.f) obj).f6999a, ((T5.f) obj2).f6999a);
            case 2:
                YosMediaItem yosMediaItem = (YosMediaItem) obj;
                SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                int songSort = settingsLibrary.getSongSort();
                SettingsLibrary.SongSortEnum songSortEnum = SettingsLibrary.SongSortEnum.MUSIC_TITLE;
                if (songSort == songSortEnum.ordinal()) {
                    String title = yosMediaItem.getTitle();
                    if (title == null) {
                        title = "Unknown Work";
                    }
                    objC = AbstractC1942a.c(title.charAt(0));
                } else if (songSort == SettingsLibrary.SongSortEnum.MUSIC_DURATION.ordinal()) {
                    objC = Long.valueOf(yosMediaItem.getDuration());
                } else if (songSort == SettingsLibrary.SongSortEnum.ARTIST_NAME.ordinal()) {
                    List<String> artistsList = YosMediaItemExtraKt.getArtistsList(yosMediaItem);
                    if (artistsList == null) {
                        artistsList = b6.t.f10495a;
                    }
                    objC = AbstractC1942a.c(((String) Z4.n.q0(artistsList)).charAt(0));
                } else if (songSort == SettingsLibrary.SongSortEnum.MODIFIED_DATE.ordinal()) {
                    Long modifiedDate = yosMediaItem.getModifiedDate();
                    objC = Long.valueOf(modifiedDate != null ? modifiedDate.longValue() : 0L);
                } else {
                    String title2 = yosMediaItem.getTitle();
                    if (title2 == null) {
                        title2 = "Unknown Work";
                    }
                    objC = AbstractC1942a.c(title2.charAt(0));
                }
                String string = objC.toString();
                YosMediaItem yosMediaItem2 = (YosMediaItem) obj2;
                int songSort2 = settingsLibrary.getSongSort();
                if (songSort2 == songSortEnum.ordinal()) {
                    String title3 = yosMediaItem2.getTitle();
                    objC2 = AbstractC1942a.c((title3 != null ? title3 : "Unknown Work").charAt(0));
                } else if (songSort2 == SettingsLibrary.SongSortEnum.MUSIC_DURATION.ordinal()) {
                    objC2 = Long.valueOf(yosMediaItem2.getDuration());
                } else if (songSort2 == SettingsLibrary.SongSortEnum.ARTIST_NAME.ordinal()) {
                    List<String> artistsList2 = YosMediaItemExtraKt.getArtistsList(yosMediaItem2);
                    if (artistsList2 == null) {
                        artistsList2 = b6.t.f10495a;
                    }
                    objC2 = AbstractC1942a.c(((String) Z4.n.q0(artistsList2)).charAt(0));
                } else if (songSort2 == SettingsLibrary.SongSortEnum.MODIFIED_DATE.ordinal()) {
                    Long modifiedDate2 = yosMediaItem2.getModifiedDate();
                    objC2 = Long.valueOf(modifiedDate2 != null ? modifiedDate2.longValue() : 0L);
                } else {
                    String title4 = yosMediaItem2.getTitle();
                    objC2 = AbstractC1942a.c((title4 != null ? title4 : "Unknown Work").charAt(0));
                }
                return N5.l.r(string, objC2.toString());
            default:
                return N5.l.r(((PlayList) obj).getName(), ((PlayList) obj2).getName());
        }
    }
}
